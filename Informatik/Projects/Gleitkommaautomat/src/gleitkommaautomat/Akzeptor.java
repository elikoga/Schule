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
public abstract class Akzeptor {

    private int zustand;

    public Akzeptor() {
        zustand = 0;
    }

    public int gibZustand() {
        return zustand;
    }

    public void setzeInAnfangszustand() {
        zustand = 0;
    }

    public void setzeZustand(int pZustand) {
        zustand = pZustand;
    }

    public boolean teste(String pEingabeString) {
        char zeichen;

        setzeInAnfangszustand();
        /*index = 1;
        while (index <= pEingabeString.length() && (zustand != -1)) {
            zeichen = pEingabeString.charAt(index);
            if (!imAlphabet(zeichen)) {
                zustand = -1;
            } else {
                zustandsuebergang(zeichen);
            }
            index = index + 1;
        }*/
        for (int i = 0; i < pEingabeString.length(); i++) {
            zeichen = pEingabeString.charAt(i);
            if (!imAlphabet(zeichen)) {
                zustand = -1;
            } else {
                zustandsuebergang(zeichen);
            }
            if (zustand == -1) {
                break;
            }
        }
        return imEndzustand();
    }

    public abstract void zustandsuebergang(char pEingabe);

    public abstract boolean imEndzustand();

    public abstract boolean imAlphabet(char pEingabe);
}
