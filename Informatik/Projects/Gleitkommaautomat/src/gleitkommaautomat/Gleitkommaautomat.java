/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gleitkommaautomat;

/**
 *
 * @author Harri
 */
public class Gleitkommaautomat extends Akzeptor {

    public void zustandsuebergang(char pEingabe) {
        setzeZustand(uebergaenge[characterizeInp(pEingabe)][gibZustand()]);
    }

    private int n = -1;

    private int[][] uebergaenge = {
        {1, n, n, n, n, 6, n, n},
        {2, 2, 2, 4, 4, 7, 7, 7},
        {n, n, 3, n, n, n, n, n},
        {n, n, 5, n, 5, n, n, n},};

    private int characterizeInp(char inp) {
        if (inp == '+' || inp == '-') {
            return 0;
        }
        if ('0' <= inp && inp <= '9') {
            return 1;
        }
        if (inp == ',') {
            return 2;
        }
        if (inp == 'E' || inp == 'e') {
            return 3;
        }
        return -1;
    }

    public boolean imEndzustand() {
        int zustand = gibZustand();
        if (zustand == 2 || zustand == 4 || zustand == 7) {
            return true;
        } else {
            return false;
        }
    }

    public boolean imAlphabet(char pEingabe) {
        return (characterizeInp(pEingabe) != -1);
    }

}
