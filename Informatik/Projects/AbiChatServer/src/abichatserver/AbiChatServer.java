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

    public AbiChatServer(int pPort) {
        super(pPort);
    }

    @Override
    public void processNewConnection(String pClientIP, int pClientPort) {

    }

    @Override
    public void processMessage(String pClientIP, int pClientPort,
            String pMessage) {

    }

    @Override
    public void processClosingConnection(String pClientIP, int pClientPort) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
