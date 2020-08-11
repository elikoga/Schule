
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coafin
 */
public class Woerterbuch {

    Wortpaar[] woerter;
    int numWoerter;

    public Woerterbuch() {
        this.woerter = new Wortpaar[10];
        numWoerter = 0;
    }

    void addWortpaar(String pDeutsch, String pEnglisch) {
        int idx;
        Wortpaar newWortpaar = new Wortpaar(pDeutsch, pDeutsch);

        for (idx = numWoerter; idx > 0; idx--) {
            if (newWortpaar.compareToIgnoreCase(woerter[idx - 1]) > 0) {
                break;
            }
            woerter[idx] = woerter[idx - 1];
        }
        woerter[idx] = newWortpaar;
        numWoerter++;
    }

    @Override
    public String toString() {
        return "Woerterbuch{" + "woerter=" + Arrays.toString(woerter) + ", numWoerter=" + numWoerter + '}';
    }

    String getDfromE(String pE) {
        Wortpaar w = linearSearchByE(pE);
        return w.d;
    }

    private Wortpaar linearSearchByE(String pE) {
        for (Wortpaar wortpaar : woerter) {
            if (wortpaar.e.equalsIgnoreCase(pE)) {
                return wortpaar;
            }
        }
        return null;
    }

    String getEfromD(String pD) {
        Wortpaar w = recBinarySearchByD(pD, 0, numWoerter);
        return w.e;
    }

    private Wortpaar linearSearchByD(String pD) {
        for (Wortpaar wortpaar : woerter) {
            if (wortpaar.d.equalsIgnoreCase(pD)) {
                return wortpaar;
            }
        }
        return null;
    }

    private Wortpaar recBinarySearchByD(String pD, int min, int max) {
        int mid = (min + max) / 2;
        Wortpaar midWort = woerter[mid];
        if (min < max) {
            if (pD.compareTo(midWort.d) > 0) {
                return recBinarySearchByD(pD, mid + 1, max);
            } else {
                return recBinarySearchByD(pD, min, mid);
            }
        }
        if (midWort.d.equalsIgnoreCase(pD)) {
            return midWort;
        }
        return null;
    }

}
