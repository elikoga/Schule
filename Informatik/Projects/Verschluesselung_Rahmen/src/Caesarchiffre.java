
public class Caesarchiffre {

    private int schlüssel;

    public Caesarchiffre() {
        schlüssel = 3;
    } // Konstruktor Caesar

    public void setzeSchlüssel(int pSchlüssel) {
        schlüssel = pSchlüssel;
    }

    private char verschlCh(char klarCh) {
        int chifCh = (int) klarCh + schlüssel;
        if (chifCh > 90) {
            chifCh -= 26;
        }
        return (char) chifCh;
    }

    private char entschlCh(char chifCh) {
        int klarChInt = (int) chifCh - schlüssel;
        if (klarChInt < 65) {
            klarChInt += 26;
        }
        return (char) klarChInt;
    }

    public String verschlStr(String klarStr) {
        String chifStr = "";
        for (int i = 0; i < klarStr.length(); i++) {
            chifStr += verschlCh(klarStr.charAt(i));
        }
        return chifStr;
    }

    public String entschlStr(String klarStr) {
        String chifStr = "";
        for (int i = 0; i < klarStr.length(); i++) {
            chifStr += entschlCh(klarStr.charAt(i));
        }
        return chifStr;
    }
} // Klasse Caesar
