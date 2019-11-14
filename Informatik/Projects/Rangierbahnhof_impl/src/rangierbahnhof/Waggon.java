/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangierbahnhof;

public class Waggon {

    int nummer;

    public Waggon(int pNummer) {
        this.nummer = pNummer;
    }

    public int getNummer() {
        return nummer;
    }

    @Override
    public String toString() {
        return "W" + Integer.toString(nummer) + "";
    }
}
