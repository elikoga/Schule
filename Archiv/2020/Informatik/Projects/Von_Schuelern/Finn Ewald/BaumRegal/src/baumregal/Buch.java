/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baumregal;

/**
 *
 * @author f.ewald
 */
public class Buch implements ComparableContent<Buch> {

    public String strTitel;
    public List<String> liSchlagwort;

    public Buch(String pTitel, List<String> pSchlagworte) {
        strTitel = pTitel;
        liSchlagwort = pSchlagworte;
    }

    public Buch(String pTitel) {
        this.liSchlagwort = null;
        this.strTitel = pTitel;
    }

    @Override
    public boolean isLess(Buch pComparableContent) {
        return strTitel.compareTo(pComparableContent.getTitel()) < 0;
    }

    @Override
    public boolean isEqual(Buch pComparableContent) {
        return strTitel.equals(pComparableContent.getTitel());
    }

    @Override
    public boolean isGreater(Buch pComparableContent) {
        return strTitel.compareTo(pComparableContent.getTitel()) > 0;
    }

    public String getTitel() {
        return strTitel;
    }
}
