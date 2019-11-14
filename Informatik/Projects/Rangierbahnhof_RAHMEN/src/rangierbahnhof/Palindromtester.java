/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangierbahnhof;
import abiturklassen2017.listklassen.Stack;
/**
 *
 * @author Harri
 */
public class Palindromtester {

    private Stack<String> keller;
    private boolean istPalindrom;
    
    public Palindromtester()
    {
        keller = new Stack<String>();                                          
    }
    
      /** prüft einen übergebenen String (ein wort) ob er ein Palindrom ist */
    public boolean wortPruefen(String wort) {
        istPalindrom = true;
        //Bitte implementieren
        return istPalindrom;                          
    }
        
}
