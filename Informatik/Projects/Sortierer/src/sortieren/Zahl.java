package sortieren;

public class Zahl {

    private int wert;

    public Zahl(int pWert) {
        wert = pWert;
    }

    public int getWert() {
        return wert;
    }

    int compareTo(Zahl other) {
        return wert - other.getWert();
    }

}
