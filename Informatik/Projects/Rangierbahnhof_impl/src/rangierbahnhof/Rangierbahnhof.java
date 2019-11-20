package rangierbahnhof;

public class Rangierbahnhof {

    private final Stack<Waggon> gleis1;
    private final Stack<Waggon> gleis2;
    private final Stack<Waggon> gleis3;
    private String protokoll;

    public Rangierbahnhof(int waggonzahl) {
        gleis1 = new Stack<>();
        gleis2 = new Stack<>();
        gleis3 = new Stack<>();

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

    @Override
    public String toString() {
        return "Gleis1: " + gleisToString(gleis1) + "\n" + "Gleis2: " + gleisToString(gleis2) + "\n" + "Gleis3: " + gleisToString(gleis3) + "\n";
    }

}
