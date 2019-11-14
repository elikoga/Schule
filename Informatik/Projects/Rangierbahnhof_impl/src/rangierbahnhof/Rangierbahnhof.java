/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangierbahnhof;

/**
 *
 * @author Harri
 */
public class Rangierbahnhof {

    private Stack<Waggon> gleis1;
    private Stack<Waggon> gleis2;
    private Stack<Waggon> gleis3;
    private String protokoll;

    public Rangierbahnhof(int waggonzahl) {
        gleis1 = new Stack<Waggon>();
        gleis2 = new Stack<Waggon>();
        gleis3 = new Stack<Waggon>();

        for (int i = 1; i <= waggonzahl; i++) {
            Waggon waggon = new Waggon(i);
            gleis1.push(waggon);
        }
    }

    public boolean umstellen(int waggonNr) {
        return false;
    }

    public String getProtokoll() {
        return protokoll;
    }

    public String gleisToString(Stack<Waggon> gleis) {
        return gleis.toString();
    }

    public String toString() {
        return "Gleis1: " + gleisToString(gleis1) + "\n" + "Gleis2: " + gleisToString(gleis2) + "\n" + "Gleis3: " + gleisToString(gleis3) + "\n";
    }

}
