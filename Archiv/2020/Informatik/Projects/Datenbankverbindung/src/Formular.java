/**
 * @author   Vorname, Nachname 
 * @version  xx.xx.20xx
 * Programmbeschreibung: Rechenprog-Rahmen
 */
public class Formular extends javax.swing.JFrame 
{
    /** Erzeugt ein neues Formular
     */
    private Verarbeitung verarbeitung;
    
    public Formular()
    {
        verarbeitung = new Verarbeitung();
        initComponents();
    } // Konstruktor Formular

    /** Initialisierung des Formulars
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVerbinden = new javax.swing.JButton();
        lbÜberschrift = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfSQL = new javax.swing.JTextPane();
        btVerarbeiten = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btTrennen = new javax.swing.JButton();
        tfDatabase = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbLength = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfAusgabe = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rechenprogramm");

        btVerbinden.setText("Verbinden");
        btVerbinden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerbindenActionPerformed(evt);
            }
        });

        lbÜberschrift.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbÜberschrift.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbÜberschrift.setText("Datenbankverbindung");

        tfSQL.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(tfSQL);

        btVerarbeiten.setText("Verarbeiten");
        btVerarbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerarbeitenActionPerformed(evt);
            }
        });

        jLabel7.setText("Befehl:");

        btTrennen.setText("Verbindung trennen");
        btTrennen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTrennenActionPerformed(evt);
            }
        });

        jLabel8.setText("Dateipfad:");

        cbLength.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60", "75", "80", "85", "90", "95", "100" }));
        cbLength.setSelectedIndex(1);

        jLabel1.setText("Zeichenlänge:");

        tfAusgabe.setColumns(20);
        tfAusgabe.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        tfAusgabe.setRows(5);
        jScrollPane1.setViewportView(tfAusgabe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbÜberschrift, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btVerbinden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)
                                    .addComponent(btVerarbeiten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btTrennen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                    .addComponent(tfDatabase, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbÜberschrift, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(btVerbinden, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVerarbeiten, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btTrennen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVerbindenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerbindenActionPerformed
        tfAusgabe.setText(verarbeitung.verbinden(tfDatabase.getText()));
    }//GEN-LAST:event_btVerbindenActionPerformed

    private void btVerarbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerarbeitenActionPerformed
        tfAusgabe.setText(verarbeitung.verarbeiten(tfSQL.getText(), (cbLength.getSelectedIndex()+1)*5));
    }//GEN-LAST:event_btVerarbeitenActionPerformed

    private void btTrennenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTrennenActionPerformed
        verarbeitung.trennen();
        tfAusgabe.setText("Die Verbindung wurde getrennt.");
    }//GEN-LAST:event_btTrennenActionPerformed

    /** Hauptmethode, Start des Programms
     *  Erzeugung und Anzeige des Formulars
     */
    public static void main(String args[])
    {   java.awt.EventQueue.invokeLater
          (new Runnable() {   public void run() 
                              {  new Formular().setVisible(true);  }
                          });
    } // Methode main

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btTrennen;
    private javax.swing.JButton btVerarbeiten;
    private javax.swing.JButton btVerbinden;
    private javax.swing.JComboBox<String> cbLength;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbÜberschrift;
    private javax.swing.JTextArea tfAusgabe;
    private javax.swing.JTextField tfDatabase;
    private javax.swing.JTextPane tfSQL;
    // End of variables declaration//GEN-END:variables

} // Klasse Formular
