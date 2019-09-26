/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coafin
 */
public class Wortpaar {

    String d;
    String e;

    public Wortpaar(String pD, String pE) {
        this.d = pD;
        this.e = pE;
    }

    int compareTo(Wortpaar anotherWortpaar) {
        return d.compareTo(anotherWortpaar.d);
    }

    int compareToIgnoreCase(Wortpaar anotherWortpaar) {
        return d.compareToIgnoreCase(anotherWortpaar.d);
    }

    @Override
    public String toString() {
        return "Wortpaar{" + "d=" + d + ", e=" + e + '}';
    }
}
