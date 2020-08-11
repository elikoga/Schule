package rangierbahnhof;

public class Palindromtester {

    public boolean wortPruefen(String wort) {
        Stack<Character> lifo = new Stack<>();
        for (int i = 0; i < wort.length(); i++) {
            lifo.push(wort.charAt(i));
        }
        for (int i = 0; i < wort.length(); i++) {
            if (!lifo.top().equals(wort.charAt(i))) {
                return false;
            }
            lifo.pop();
        }
        return true;
    }

}
