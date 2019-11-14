/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangierbahnhof;

import abiturklassen2017.listklassen.Stack;
/**
 *
 * @author Harri
 */
public class Rangierbahnhof {

    private Stack<Waggon> gleis1;
    private Stack<Waggon> gleis2;
    private Stack<Waggon> gleis3;
    private String protokoll;
    
    public Rangierbahnhof(int waggonzahl) 
    {
	;
    }
    
    public Boolean umstellen(int waggonNr)
    {
        ;
    }
    
    public String getProtokoll()
    {
        return protokoll;
    }
    
    public String gleisToString(Stack<Waggon> gleis)
    {
        ;
    }
    
    public String toString()
    {
        return "Gleis1: "+gleisToString(gleis1)+"\n"+"Gleis2: "+gleisToString(gleis2)+"\n"+"Gleis3: "+gleisToString(gleis3)+"\n";
    }

    
}
