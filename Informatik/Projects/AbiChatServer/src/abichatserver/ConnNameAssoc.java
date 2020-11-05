/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abichatserver;

import abiturklassen2018.linear.List;

/**
 *
 * @author coafin
 */
public class ConnNameAssoc extends List<ConnNamePair> {

    public void setNameForConn(String pClientIP, int pClientPort, String name) {
        ConnNamePair pair = findPairByConn(pClientIP, pClientPort);
        if (pair != null) {
            pair.setName(name);
        }
    }

    public ConnNamePair findPairByConn(String pClientIP, int pClientPort) {
        System.out.println("LOOKING FOR CLIENT IN LIST");
        toFirst();
        while (hasAccess()) {
            ConnNamePair currConnNamePair = getContent();
            System.out.println("ELEMENT: " + currConnNamePair.toString());

            if (currConnNamePair.reprConn(pClientIP, pClientPort)) {
                return currConnNamePair;
            }
            next();
        }
        return null;
    }

    void removeByConn(String pClientIP, int pClientPort) {
        ConnNamePair connNamePair = findPairByConn(pClientIP, pClientPort);
        toFirst();
        while (hasAccess()) {
            if (getContent() == connNamePair) {
                remove();
            }
            next();
        }
    }

    public boolean isNameSet(String name) {
        System.out.println("LOOKING FOR NAME IN LIST");
        toFirst();
        while (hasAccess()) {
            System.out.println("ELEMENT: " + getContent().toString());

            if (name.equals(getContent().getName())) {
                System.out.println("FOUND ONE");
                return true;
            }
            next();

        }
        System.out.println("FOUND NONE");
        return false;
    }
}
