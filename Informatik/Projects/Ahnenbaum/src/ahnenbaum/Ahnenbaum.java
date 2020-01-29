/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahnenbaum;

import javax.swing.JOptionPane;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public final class Ahnenbaum {

    private BinaryTree<Ahne> baum;

    public Ahnenbaum() {
        String eingabe = JOptionPane.showInputDialog(null, "Name?", "Name?",
                JOptionPane.PLAIN_MESSAGE);
        baum = interactiveCreateTree(eingabe);

    }

    public BinaryTree<Ahne> interactiveCreateTree(String rootName) {
        if (rootName.equals("")) {
            return null;
        }
        String vName = JOptionPane.showInputDialog(null,
                "Vatername von " + rootName,
                "Vatername",
                JOptionPane.PLAIN_MESSAGE);
        String mName = JOptionPane.showInputDialog(null,
                "Muttername von " + rootName,
                "Muttername",
                JOptionPane.PLAIN_MESSAGE);
        return new BinaryTree<>(
                new Ahne(rootName),
                interactiveCreateTree(vName),
                interactiveCreateTree(mName));
    }

    public String treeInOrder(BinaryTree<Ahne> baum, String indent) {
        if (baum != null && !baum.isEmpty()) {
            return treeInOrder(baum.getLeftTree(), indent + "    ")
                    + indent + baum.getContent().name + "\n"
                    + treeInOrder(baum.getRightTree(), indent + "    ");
        }
        return "";
    }

    public String toString() {
        return treeInOrder(baum, "");
    }

    public int niveau() {
        throw new NotImplementedException();
    }

    public int gibNiveau(BinaryTree baum) {
        throw new NotImplementedException();
    }

}
