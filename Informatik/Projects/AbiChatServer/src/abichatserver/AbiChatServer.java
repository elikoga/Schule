/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abichatserver;

import abiturklassen2018.Netzklassen.Server;

/**
 *
 * @author coafin
 */
public class AbiChatServer extends Server {

    ConnNameAssoc names;

    public AbiChatServer(int pPort) {
        super(pPort);
        names = new ConnNameAssoc();
    }

    @Override
    public void processNewConnection(String pClientIP, int pClientPort) {
        names.append(new ConnNamePair(pClientIP, pClientPort, null));
        System.out.println("GOT CONN " + pClientIP);
    }

    @Override
    public void processMessage(String pClientIP, int pClientPort,
            String pMessage) {
        System.out.println("GOT MSG " + pClientIP + pMessage);
        ConnNamePair pair = names.findPairByConn(pClientIP, pClientPort);
        System.out.println("HERE LL 34");
        if (pMessage.startsWith("SET_NAME ")) {
            String name = pMessage.substring("SET_NAME ".length());
            System.out.println("SETTING NAME " + name);
            if (!names.isNameSet(name)) {
                System.out.println("NAME " + name + " NOT SET, SETTING...");
                pair.setName(name);
                send(pClientIP, pClientPort, "OK SET_NAME " + name);
            } else {
                System.out.println("NAME " + name + " SET, NOT SETTING...");
                send(pClientIP, pClientPort, "ERR NAME_ALREADY_SET");
            }
        }

        if (pMessage.startsWith("SEND ")) {
            String message = pMessage.substring("SEND ".length());
            sendToAll("GOT_MESSAGE " + pair.getName() + ": " + message);
        }

        if (pMessage.startsWith("DISCONNECT")) {
            send(pClientIP, pClientPort, "OK DISCONNECTED");
        }
    }

    @Override
    public void processClosingConnection(String pClientIP, int pClientPort) {
        names.removeByConn(pClientIP, pClientPort);
    }

}
