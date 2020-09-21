
public class Formular extends javax.swing.JFrame {

    private Caesarchiffre caesar;
    private Permutation per;

    public Formular() {
        initComponents();
        caesar = new Caesarchiffre();
        per = new Permutation();
    } // Konstruktor Formular

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfKlartext = new javax.swing.JTextField();
        btVerschlüsseln = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbÜberschrift = new javax.swing.JLabel();
        tfGeheimtext = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfSchlüssel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btEntschlüsseln = new javax.swing.JButton();
        lbÜberschrift1 = new javax.swing.JLabel();
        tfKlartext1 = new javax.swing.JTextField();
        btVerschlüsseln1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfGeheimtext1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfSchlüssel1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btEntschlüsseln1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rechenprogramm");

        btVerschlüsseln.setText("Verschlüsseln");
        btVerschlüsseln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerschlüsselnActionPerformed(evt);
            }
        });

        jLabel1.setText("Klartext");

        lbÜberschrift.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbÜberschrift.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbÜberschrift.setText("Caesar-Chiffre");

        jLabel2.setText("Geheimtext:");

        jLabel4.setText("Schlüssel:");

        btEntschlüsseln.setText("Entschlüsseln");
        btEntschlüsseln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntschlüsselnActionPerformed(evt);
            }
        });

        lbÜberschrift1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbÜberschrift1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbÜberschrift1.setText("Permutations - Verschlüsselung");

        btVerschlüsseln1.setText("Verschlüsseln");
        btVerschlüsseln1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerschlüsseln1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Klartext");

        jLabel5.setText("Geheimtext:");

        jLabel6.setText("Schlüssel:");

        btEntschlüsseln1.setText("Entschlüsseln");
        btEntschlüsseln1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntschlüsseln1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbÜberschrift, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btVerschlüsseln1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btEntschlüsseln1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfKlartext1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                        .addComponent(tfGeheimtext1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                        .addComponent(tfSchlüssel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btVerschlüsseln, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btEntschlüsseln, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfKlartext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                    .addComponent(tfGeheimtext)
                                    .addComponent(tfSchlüssel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbÜberschrift1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbÜberschrift, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKlartext, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGeheimtext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSchlüssel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btEntschlüsseln, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btVerschlüsseln, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbÜberschrift1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKlartext1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGeheimtext1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSchlüssel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btEntschlüsseln1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btVerschlüsseln1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVerschlüsselnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerschlüsselnActionPerformed
        String klartext, geheimtext;
        int schlüssel;
        schlüssel = Integer.parseInt(tfSchlüssel.getText());
        caesar.setzeSchlüssel(schlüssel);
        klartext = tfKlartext.getText().toUpperCase();
        geheimtext = caesar.verschlStr(klartext);
        tfGeheimtext.setText(geheimtext);
    }//GEN-LAST:event_btVerschlüsselnActionPerformed

    private void btEntschlüsselnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntschlüsselnActionPerformed
        String klartext, geheimtext;
        int schlüssel;
        schlüssel = Integer.parseInt(tfSchlüssel.getText());
        caesar.setzeSchlüssel(-schlüssel);
        geheimtext = tfGeheimtext.getText();
        klartext = caesar.entschlStr(geheimtext);
        tfKlartext.setText(klartext);
    }//GEN-LAST:event_btEntschlüsselnActionPerformed

    private void btVerschlüsseln1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerschlüsseln1ActionPerformed
        String klartext, geheimtext;
        String schlüssel;
        schlüssel = tfSchlüssel1.getText();
        per.setSchlüssel(schlüssel);
        klartext = tfKlartext1.getText();
        geheimtext = per.verschlüsseleString(klartext);
        tfGeheimtext1.setText(geheimtext);
    }//GEN-LAST:event_btVerschlüsseln1ActionPerformed

    private void btEntschlüsseln1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntschlüsseln1ActionPerformed
        String klartext, geheimtext;
        String schlüssel;
        schlüssel = tfSchlüssel1.getText();
        per.setSchlüssel(schlüssel);
        geheimtext = tfGeheimtext1.getText();
        klartext = per.entschlüsseleString(geheimtext);
        tfKlartext1.setText(klartext);
    }//GEN-LAST:event_btEntschlüsseln1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formular().setVisible(true);
            }
        });
    } // Methode main

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntschlüsseln;
    private javax.swing.JButton btEntschlüsseln1;
    private javax.swing.JButton btVerschlüsseln;
    private javax.swing.JButton btVerschlüsseln1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbÜberschrift;
    private javax.swing.JLabel lbÜberschrift1;
    private javax.swing.JTextField tfGeheimtext;
    private javax.swing.JTextField tfGeheimtext1;
    private javax.swing.JTextField tfKlartext;
    private javax.swing.JTextField tfKlartext1;
    private javax.swing.JTextField tfSchlüssel;
    private javax.swing.JTextField tfSchlüssel1;
    // End of variables declaration//GEN-END:variables

} // Klasse Formular
