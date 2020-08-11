package rangierbahnhof;

public class Rangierbahnhof {

    private final Stack<Waggon> gleis1;
    private final Stack<Waggon> gleis2;
    private final Stack<Waggon> gleis3;
    private String protokoll;

    public Rangierbahnhof(int waggonzahl) {
        protokoll = "";
        gleis1 = new Stack<>();
        gleis2 = new Stack<>();
        gleis3 = new Stack<>();

        for (int i = 1; i <= waggonzahl; i++) {
            Waggon waggon = new Waggon(i);
            gleis1.push(waggon);
        }
    }

    public boolean umstellen(int waggonNr) {
        while (!gleis1.isEmpty() && gleis1.top().getNummer() >= waggonNr) {
            gleis2.push(gleis1.top());
            gleis1.pop();
            protokoll = protokoll.concat(gleis2.top().toString() + "\nGleis1 zu Gleis2");
        }
        if (gleis2.top().getNummer() == waggonNr) {
            gleis3.push(gleis2.top());
            gleis2.pop();
            protokoll = protokoll.concat(gleis3.top().toString() + "\nGleis2 zu Gleis3");
            return true;
        }
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
