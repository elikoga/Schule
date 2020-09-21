/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Permutation {

    private char[] sl;

    public Permutation() {
        setSchlüssel("QWERTZUIOPASDFGHJKLYXCVBNM");
    } // Konstruktor

    public void setSchlüssel(String schlüssel) {
        if (schlüssel.length() == 26) {
            sl = schlüssel.toCharArray();
            for (int i = 0; i < 26; i++) {
                int ascii = (int) sl[i];
                if (97 <= ascii && ascii <= 122) {
                    sl[i] = (char) (ascii - 32);
                }
            }
        }
    }

    private char verschlüsseleZeichen(char klarZeichen) {
        return 's';
    } // Methode verschlüsseleZeichen

    public String verschlüsseleString(String klarText) {
        String ausgabe = "";
        for (int i = 0; i < klarText.length(); i++) {
            ausgabe += verschlüsseleZeichen(klarText.charAt(i));
        }
        return ausgabe;
    }

    private char entschlüsseleZeichen(char klarZeichen) {
        return 'a';
    } // Methode verschlüsseleZeichen

    public String entschlüsseleString(String klarText) {
        String ausgabe = "";
        for (int i = 0; i < klarText.length(); i++) {
            ausgabe += entschlüsseleZeichen(klarText.charAt(i));
        }
        return ausgabe;
    }

}
