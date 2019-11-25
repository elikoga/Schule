package rangierbahnhof;

public class Palindromtester {

    private final Stack<Character> keller;
    private boolean istPalindrom;

    public Palindromtester() {
        keller = new Stack<>();
    }

    public boolean wortPruefen(String wort) {
        for (char chara : wort.toCharArray()) {
            keller.push(chara);
        }
        for (char chara : wort.toCharArray()) {
            if (chara != keller.top()) {
                return false;
            }
            keller.pop();
        }
        return true;
    }

}
