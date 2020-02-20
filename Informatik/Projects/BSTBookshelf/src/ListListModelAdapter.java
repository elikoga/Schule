
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coafin
 */
public class ListListModelAdapter<T> {

    public DefaultListModel<T> convert(List<T> list) {
        DefaultListModel<T> listModel = new DefaultListModel<T>();
        list.toFirst();
        while (list.hasAccess()) {
            listModel.addElement(list.getContent());
            list.next();
        }
        return listModel;
    }

    public List<T> convert(ListModel<T> listModel) {
        List<T> list = new List<>();
        for (int i = 0; i < listModel.getSize(); i++) {
            list.append(listModel.getElementAt(i));
        }
        return list;
    }
}
