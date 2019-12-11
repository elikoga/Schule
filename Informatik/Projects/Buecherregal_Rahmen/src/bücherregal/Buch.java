/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bücherregal;

/**
 *
 * @author Harri
 */
public class Buch {
    
    String name;
    
    public Buch(String pName)
    {
        name=pName;
    }
    
    public String gibName()
    {
        return name;
    }
}

