/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abichatserver;

/**
 *
 * @author coafin
 */
public class ConnNamePair {

    String clientIP;
    int clientPort;
    String name;

    public ConnNamePair(String pClientIP, int pClientPort, String name) {
        this.clientIP = pClientIP;
        this.clientPort = pClientPort;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean reprConn(String pClientIP, int pClientPort) {
        return this.clientIP.equals(pClientIP) && this.clientPort == pClientPort;
    }
}
