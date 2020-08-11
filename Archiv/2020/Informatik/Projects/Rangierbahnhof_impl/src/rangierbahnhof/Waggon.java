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
