/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harald Neubeck
 */

import abiturklassen2017.datenbanken.*;

public class Verarbeitung {
    
    private DatabaseConnector verbindung;
    
    public String verbinden(String pDatabase) {
        verbindung = new DatabaseConnector("",0,pDatabase,"","");
        String message = verbindung.getErrorMessage();
        if(message == null) {
            return "Die Verbindung wurde erfolgreich aufgebaut.";
        } else {
            System.out.print(message);
            return "Es gab einen Fehler beim Aufbau der Verbindung.";
        }
    }
    
    public void trennen() {
        verbindung.close();
    }
    
    public String verarbeiten(String pSQLstatement, int length) {
        verbindung.executeStatement(pSQLstatement);
        QueryResult ergebnis = verbindung.getCurrentQueryResult();
        if (ergebnis == null) {
            return "Es gab kein Ergebnis zu dieser Anfrage.";
        } else {
            String ausgabe = "";
            for (int i = 0; i < ergebnis.getColumnCount(); i++) {
                ausgabe += formatieren(ergebnis.getColumnNames()[i],length);
            }
            ausgabe += "\n";
            for (int i = 0; i < ergebnis.getColumnCount(); i++) {
                ausgabe += formatieren(ergebnis.getColumnTypes()[i], length);
            }
            for (int i = 0; i < ergebnis.getRowCount(); i++) {
                ausgabe += "\n";
                for (int x = 0; x < ergebnis.getColumnCount(); x++) {
                    ausgabe += formatieren(ergebnis.getData()[i][x], length);
                }
            }
            return ausgabe;
        }        
    }   
    
    private String formatieren(String pString, int length) {
        if (pString == null) {
            pString = "";
        }
        for (int i = pString.length(); i < length; i++) {
            pString += " ";
        }
        return pString.substring(0,length);
    }
    
    
}
