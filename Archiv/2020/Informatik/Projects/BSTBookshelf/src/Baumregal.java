/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coafin
 */
public class Baumregal {

    BinarySearchTree<Buch> baum = new BinarySearchTree<>();

    void insert(Buch buch) {
        baum.insert(buch);
    }

    Buch search(Buch buch) {
        return baum.search(buch);
    }

}
