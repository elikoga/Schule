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
public class Baumregal {

    public BinarySearchTree<Buch> tree;

    public Baumregal() {
        tree = new BinarySearchTree<>();
    }

    public void insert(Buch pBuch) {
        tree.insert(pBuch);
    }

    public void remove(Buch pBuch) {
        tree.remove(pBuch);
    }

    public String search(Buch pBuch) {
        return tree.search(pBuch).getTitel();
    }
}
