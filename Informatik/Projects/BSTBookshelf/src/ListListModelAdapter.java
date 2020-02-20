
import javax.swing.DefaultListModel;

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
        DefaultListModel listModel = new DefaultListModel<T>();
        list.toFirst();
        while (list.hasAccess()) {
            listModel.addElement(list.getContent());
            list.next();
        }
        return listModel;
    }

}
