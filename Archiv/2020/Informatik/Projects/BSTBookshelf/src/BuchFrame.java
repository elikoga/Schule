/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coafin
 */
public class BuchFrame extends javax.swing.JPanel {

    private Buch buch;
    private static ListListModelAdapter adapter = new ListListModelAdapter<String>();

    public BuchFrame(Buch buch) {
        initComponents();
        this.buch = buch;
    }

    public BuchFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setLayout(new java.awt.GridLayout(2, 2));

        jLabel1.setText("Buchtitel:");
        add(jLabel1);
        add(jTextField1);

        jLabel2.setText("Schlagwörter:");
        add(jLabel2);

        jScrollPane1.setViewportView(jList1);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the buch
     */
    public Buch getBuch() {
        return buch;
    }

    /**
     * @param buch the buch to set
     */
    public void setBuch(Buch buch) {
        if (buch != null) {
            this.buch = buch;
            jList1.setModel(adapter.convert(buch.getSchlagwoerter()));
            jTextField1.setText(buch.getTitel());
        }
    }
}