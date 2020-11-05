package abichatclient;

import abiturklassen2018.Netzklassen.Client;
import java.util.function.Consumer;

/**
 *
 * @author coafin
 */
public class AbiChatClient extends Client {

    private String name;
    private String chatlog;
    private Consumer<String> callback;

    public AbiChatClient(String pServerIP, int pServerPort,
            Consumer<String> callback) {
        super(pServerIP, pServerPort);
        chatlog = "";
        this.callback = callback;
    }

    public void setName(String name) {
        this.name = name;
        send("SET_NAME " + name);
    }

    public void sendMessage(String message) {
        send("SEND " + message);
    }

    public void disconnect() {
        send("DISCONNECT");
    }

    public void addToLog(String line) {
        this.chatlog += '\n';
        this.chatlog += line;
        callback.accept(chatlog);
        System.out.print(chatlog);
    }

    @Override
    public void processMessage(String pMessage) {
        System.out.append("GOT MSG " + pMessage);
        if (pMessage.startsWith("OK SET_NAME ")) {
            String name_set = pMessage.substring("OK SET_NAME ".length());
            if (!name_set.equals(name)) {
                addToLog("ERROR: SERVER THINKS YOU'RE " + name_set
                        + " INSTEAD OF " + name);
            }
        }
        if (pMessage.startsWith("ERR NAME_ALREADY_SET")) {
            addToLog("CAN'T SET NAME TO " + name + " NAME ALREADY SET");
        }
        if (pMessage.startsWith("GOT_MESSAGE ")) {
            String message = pMessage.substring("GOT_MESSAGE ".length());
            addToLog(message);
        }
        if (pMessage.startsWith("OK DISCONNECTED")) {
            addToLog("Disconnected.");
            close();
        }
    }

}
