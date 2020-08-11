/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arztpraxis;

/**
 *
 * @author coafin
 */
public class Patient {

    private final String name;
    private final int kundennummer;
    private final String geschlecht;
    private final boolean prio; // Constructors

    public Patient(String pName, int pKundennummer, String pGeschlecht, boolean pPrio) {
        name = pName;
        kundennummer = pKundennummer;
        geschlecht = pGeschlecht;
        prio = pPrio;
    }

    public String getName() {
        return name;
    }

    public int getKundennummer() {
        return kundennummer;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public boolean isPrio() {
        return prio;
    }

    @Override
    public String toString() {
        return "Patient(Name: " + name
                + ", Kundennummer: " + Integer.toString(kundennummer)
                + ", Geschlecht: " + geschlecht
                + ", Prioritaet: " + Boolean.toString(prio) + ")";
    }
}
