
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coafin
 */
public class Buch implements Comparable<Buch>, ComparableContent<Buch> {

    private String titel;
    private List<String> schlagwoerter;

    public Buch(String titel, List<String> schlagwoerter) {
        this.titel = titel;
        this.schlagwoerter = schlagwoerter;
    }

    public Buch(String titel) {
        this.titel = titel;
        this.schlagwoerter = new List<>();
    }

    public Buch() {
        this.titel = "";
        this.schlagwoerter = new List<>();
    }

    @Override
    public boolean isGreater(Buch pContent) {
        return compareTo(pContent) > 0;
    }

    @Override
    public boolean isEqual(Buch pContent) {
        return compareTo(pContent) == 0;
    }

    @Override
    public boolean isLess(Buch pContent) {
        return compareTo(pContent) < 0;
    }

    @Override
    public int compareTo(Buch o) {
        int titelDiff = getTitel().compareTo(o.getTitel());
        if (titelDiff != 0) {
            return titelDiff;
        }
        return 0;
    }

    /**
     * @return the titel
     */
    public String getTitel() {
        return titel;
    }

    /**
     * @return the schlagwoerter
     */
    public List<String> getSchlagwoerter() {
        return schlagwoerter;
    }

    /**
     * @param titel the titel to set
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * @param schlagwoerter the schlagwoerter to set
     */
    public void setSchlagwoerter(List<String> schlagwoerter) {
        this.schlagwoerter = schlagwoerter;
    }

}
