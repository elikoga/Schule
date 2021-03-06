/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coafin
 */
public class Formular extends javax.swing.JFrame {

    Woerterbuch woerterbuch = new Woerterbuch();

    /**
     * Creates new form Formular
     */
    public Formular() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        lUeberschrift = new javax.swing.JLabel();
        pInput = new javax.swing.JPanel();
        lEnglisch = new javax.swing.JLabel();
        tfEnglisch = new javax.swing.JTextField();
        lDeutsch = new javax.swing.JLabel();
        tfDeutsch = new javax.swing.JTextField();
        pButtons = new javax.swing.JPanel();
        jAddWP = new javax.swing.JButton();
        jEDTranslate = new javax.swing.JButton();
        jDETranslate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAusgabe = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lUeberschrift.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lUeberschrift.setText("Woerterbuch");

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0};
        pInput.setLayout(jPanel1Layout);

        lEnglisch.setText("Englisch:");
        pInput.add(lEnglisch, new java.awt.GridBagConstraints());

        tfEnglisch.setColumns(12);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        pInput.add(tfEnglisch, gridBagConstraints);

        lDeutsch.setText("Deutsch:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        pInput.add(lDeutsch, gridBagConstraints);

        tfDeutsch.setColumns(1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        pInput.add(tfDeutsch, gridBagConstraints);

        pButtons.setLayout(new java.awt.GridBagLayout());

        jAddWP.setText("Wortpaar hinzufuegen");
        jAddWP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddWPActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pButtons.add(jAddWP, gridBagConstraints);

        jEDTranslate.setText("Englisch -> Deutsch");
        jEDTranslate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEDTranslateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pButtons.add(jEDTranslate, gridBagConstraints);

        jDETranslate.setText("Deutsch -> Englisch");
        jDETranslate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDETranslateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pButtons.add(jDETranslate, gridBagConstraints);

        taAusgabe.setEditable(false);
        taAusgabe.setColumns(20);
        taAusgabe.setLineWrap(true);
        taAusgabe.setRows(5);
        jScrollPane1.setViewportView(taAusgabe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lUeberschrift)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pButtons, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lUeberschrift)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAddWPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddWPActionPerformed
        String d = tfDeutsch.getText();
        String e = tfEnglisch.getText();
        woerterbuch.addWortpaar(d, e);
        taAusgabe.setText(woerterbuch.toString());
    }//GEN-LAST:event_jAddWPActionPerformed

    private void jEDTranslateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEDTranslateActionPerformed
        String e = tfEnglisch.getText();
        String d = woerterbuch.getDfromE(e);
        tfDeutsch.setText(d);
        taAusgabe.setText(woerterbuch.toString());
    }//GEN-LAST:event_jEDTranslateActionPerformed

    private void jDETranslateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDETranslateActionPerformed
        String d = tfDeutsch.getText();
        String e = woerterbuch.getEfromD(d);
        tfEnglisch.setText(e);
        taAusgabe.setText(woerterbuch.toString());
    }//GEN-LAST:event_jDETranslateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddWP;
    private javax.swing.JButton jDETranslate;
    private javax.swing.JButton jEDTranslate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lDeutsch;
    private javax.swing.JLabel lEnglisch;
    private javax.swing.JLabel lUeberschrift;
    private javax.swing.JPanel pButtons;
    private javax.swing.JPanel pInput;
    private javax.swing.JTextArea taAusgabe;
    private javax.swing.JTextField tfDeutsch;
    private javax.swing.JTextField tfEnglisch;
    // End of variables declaration//GEN-END:variables
}
