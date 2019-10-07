package sortieren;

public class Sortieren {

    private Zahl[] zahlenarray;
    private int anzahlGefuellt;

    public Sortieren() {
        anzahlGefuellt = 0;
        zahlenarray = new Zahl[100];

    } // Konstruktor Sortieren

    public void fillArray(int pLaengeGefuellt) {
        int index, zufallszahl;
        anzahlGefuellt = pLaengeGefuellt - 1;
        for (index = 0; index <= anzahlGefuellt; index = index + 1) {
            zufallszahl = (int) ((Math.random() * 99) + 1);
            zahlenarray[index] = new Zahl(zufallszahl);
        }
//        for (int i = 0; i < 10; i++) {
//            zahlenarray[i] = new Zahl(i);
//            anzahlGefuellt = 11;
//        }
    } // Methode zufallsfeld

    public void bubblesort() {
        for (int n = anzahlGefuellt + 1; n > 0; n--) {
            for (int j = 0; j < n - 1; j++) {
                if (zahlenarray[j].compareTo(zahlenarray[j + 1]) > 0) {
                    Zahl temp = zahlenarray[j];
                    zahlenarray[j] = zahlenarray[j + 1];
                    zahlenarray[j + 1] = temp;
                }
            }
        }
    }

    public void selectionsort() {
        for (int srtd = 0; srtd < anzahlGefuellt + 1; srtd++) {
            int idxMin = srtd;
            for (int idx = idxMin; idx < anzahlGefuellt + 1; idx++) {
                if (zahlenarray[idx].compareTo(zahlenarray[idxMin]) < 0) {
                    idxMin = idx;
                }
            }
            Zahl temp = zahlenarray[srtd];
            zahlenarray[srtd] = zahlenarray[idxMin];
            zahlenarray[idxMin] = temp;
        }
    }

    public void insertionsort() {
        for (int srtd = 0; srtd < anzahlGefuellt + 1; srtd++) {
            Zahl zSrtd = zahlenarray[srtd];
            int idx;
            for (idx = srtd; idx > 0; idx--) {
                if (zSrtd.compareTo(zahlenarray[idx - 1]) > 0) {
                    break;
                }
                zahlenarray[idx] = zahlenarray[idx - 1];
            }
            zahlenarray[idx] = zSrtd;
        }
    }

    public String toString() {
        int index;
        String übersicht;
        übersicht = "";
        for (index = 0; index <= anzahlGefuellt; index = index + 1) {
            übersicht = übersicht + String.valueOf(zahlenarray[index].getWert()) + "  ";
        } // for
        return übersicht;
    } // Methode toString

}
