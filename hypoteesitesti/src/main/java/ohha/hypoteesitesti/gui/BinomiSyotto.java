package ohha.hypoteesitesti.gui;

public class BinomiSyotto extends javax.swing.JFrame {

    public BinomiSyotto() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        otsikko = new javax.swing.JLabel();
        jakaumanMaarite = new javax.swing.JLabel();
        nKentta = new javax.swing.JTextField();
        otoskoko = new javax.swing.JLabel();
        onnistumiset = new javax.swing.JLabel();
        kKentta = new javax.swing.JTextField();
        nollahypoteesi = new javax.swing.JLabel();
        nollaHypoteesiOnYhtaKuin = new javax.swing.JLabel();
        pKentta = new javax.swing.JTextField();
        nOnYhtaKuin = new javax.swing.JLabel();
        kOnYhtaKuin = new javax.swing.JLabel();
        valmisNappi = new javax.swing.JButton();
        suuntaValikko = new javax.swing.JComboBox<>();
        takaisin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        otsikko.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        otsikko.setText("Syötä keräämäsi binomijakautunut aineisto.");

        jakaumanMaarite.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jakaumanMaarite.setText("X ~ Bin(n, k)");

        nKentta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        nKentta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nKenttaMouseClicked(evt);
            }
        });
        nKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nKenttaActionPerformed(evt);
            }
        });

        otoskoko.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        otoskoko.setText("Otoskoko");

        onnistumiset.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        onnistumiset.setText("\"Onnistumisten\" määrä");

        kKentta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        kKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kKenttaActionPerformed(evt);
            }
        });

        nollahypoteesi.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        nollahypoteesi.setText("Nollahypoteesi");

        nollaHypoteesiOnYhtaKuin.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        nollaHypoteesiOnYhtaKuin.setText("p");

        pKentta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        pKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pKenttaActionPerformed(evt);
            }
        });

        nOnYhtaKuin.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        nOnYhtaKuin.setText("n   = ");

        kOnYhtaKuin.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        kOnYhtaKuin.setText("k   = ");

        valmisNappi.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        valmisNappi.setText("Valmis!");
        valmisNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valmisNappiActionPerformed(evt);
            }
        });

        suuntaValikko.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        suuntaValikko.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "<", ">", "=" }));

        takaisin.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        takaisin.setText("Takaisin");
        takaisin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takaisinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nollahypoteesi)
                            .addComponent(onnistumiset)
                            .addComponent(otoskoko))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jakaumanMaarite)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nOnYhtaKuin, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(kOnYhtaKuin, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(kKentta, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                            .addComponent(nKentta)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(nollaHypoteesiOnYhtaKuin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(suuntaValikko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(pKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(otsikko)
                        .addGap(0, 123, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(takaisin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(valmisNappi)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otsikko)
                    .addComponent(jakaumanMaarite))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nOnYhtaKuin)
                    .addComponent(nKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otoskoko))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kOnYhtaKuin)
                    .addComponent(kKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onnistumiset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nollahypoteesi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nollaHypoteesiOnYhtaKuin)
                    .addComponent(pKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suuntaValikko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valmisNappi)
                    .addComponent(takaisin))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nKenttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nKenttaActionPerformed

    }//GEN-LAST:event_nKenttaActionPerformed

    private void valmisNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valmisNappiActionPerformed

        if (nKentta.getText().isEmpty()
                || kKentta.getText().isEmpty()
                || pKentta.getText().isEmpty()
                || Integer.parseInt(nKentta.getText()) < 1
                || Integer.parseInt(kKentta.getText()) < 0
                || Double.parseDouble(pKentta.getText()) < 0
                || Integer.parseInt(nKentta.getText()) < Integer.parseInt(kKentta.getText())
                || Double.parseDouble(pKentta.getText()) > 1
                || suuntaValikko.getSelectedItem().equals(" ")) {
            new UlinaRuutuBinomille().setVisible(true);
        } else {
            
            BinomiTulokset tulokset = new BinomiTulokset();
            
            tulokset.suunnanMaaritys(Integer.parseInt(nKentta.getText()), 
                    Integer.parseInt(kKentta.getText()), 
                    Double.parseDouble(pKentta.getText()), 
                    suuntaValikko.getSelectedItem().toString());
            
            tulokset.setVisible(true);
            
        }

    }//GEN-LAST:event_valmisNappiActionPerformed

    private void kKenttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kKenttaActionPerformed

    }//GEN-LAST:event_kKenttaActionPerformed

    private void pKenttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pKenttaActionPerformed

    }//GEN-LAST:event_pKenttaActionPerformed

    private void nKenttaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nKenttaMouseClicked

    }//GEN-LAST:event_nKenttaMouseClicked

    private void takaisinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takaisinActionPerformed
        setDefaultCloseOperation(UlinaRuutuBinomille.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_takaisinActionPerformed

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
            java.util.logging.Logger.getLogger(BinomiSyotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BinomiSyotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BinomiSyotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BinomiSyotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BinomiSyotto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jakaumanMaarite;
    private javax.swing.JTextField kKentta;
    private javax.swing.JLabel kOnYhtaKuin;
    private javax.swing.JTextField nKentta;
    private javax.swing.JLabel nOnYhtaKuin;
    private javax.swing.JLabel nollaHypoteesiOnYhtaKuin;
    private javax.swing.JLabel nollahypoteesi;
    private javax.swing.JLabel onnistumiset;
    private javax.swing.JLabel otoskoko;
    private javax.swing.JLabel otsikko;
    private javax.swing.JTextField pKentta;
    private javax.swing.JComboBox<String> suuntaValikko;
    private javax.swing.JButton takaisin;
    private javax.swing.JButton valmisNappi;
    // End of variables declaration//GEN-END:variables
}
