/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baumregal;

/**
 *
 * @author Finn
 */
public class baumregal {
    public BinarySearchTree<Buch> biRegal = null;
    public baumregal(){
        biRegal = new BinarySearchTree<Buch>();
    }
    
    public void buchHinzufügen(Buch pBuch){
        biRegal.insert(pBuch);
    }
    
    public void buchEntfernen(Buch pBuch){
        biRegal.remove(pBuch);
    }
    
    public String buchSuchen (Buch pBuch){
        return biRegal.search(pBuch).getTitel();
    }
}
