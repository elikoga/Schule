/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortieren;

/*************************************************
 *** OOP Sortieren                             ***
 *** @author  Harald Neubeck, Paderborn        ***
 *** @version 06.09.2015                       ***
 *************************************************/
public class Sortieren {

    private Zahl [] zahlenarray;
    private int anzahl;
    
    public  Sortieren ()
    {   anzahl = 0;
        zahlenarray = new Zahl [100];
                
    } // Konstruktor Sortieren
    
    public void zufallsfeld(int pGrösse)
    {
        int index, zufallszahl;
        anzahl =pGrösse-1;
        for(index=0;index<=anzahl;index=index+1)
        {
            zufallszahl=(int) ((Math.random()*99)+1);
            zahlenarray[index]=new Zahl(zufallszahl);
        }
    } // Methode zufallsfeld
    
    public void bubblesort()
    {
        ;
    }
    
    public void selectionsort()
    {
        ;
    }
    
    public void insertionsort()
    {
        ;
    }
    
    public String  toString ()
    {   int index;
        String übersicht;
        übersicht = "";
        for (index = 0; index <= anzahl; index = index + 1)
        {   übersicht = übersicht + String.valueOf(zahlenarray[index].getWert()) + "  ";
        } // for
        return übersicht;
    } // Methode toString
    
}