package ohha.hypoteesitesti.gui;

import java.util.InputMismatchException;

public class NormaalinSyottoVarianssi extends javax.swing.JFrame {

    public NormaalinSyottoVarianssi() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        suuntaValikko = new javax.swing.JComboBox<>();
        otsikko = new javax.swing.JLabel();
        jakaumanMaarite = new javax.swing.JLabel();
        keskihajonta = new javax.swing.JLabel();
        sKentta = new javax.swing.JTextField();
        nollahypoteesi = new javax.swing.JLabel();
        nollaHypoteesiOnYhtaKuin = new javax.swing.JLabel();
        pKentta = new javax.swing.JTextField();
        sOnYhtaKuin = new javax.swing.JLabel();
        valmisNappi = new javax.swing.JButton();
        nKentta = new javax.swing.JTextField();
        kOnYhtaKuin1 = new javax.swing.JLabel();
        otoskoko = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        takaisin = new javax.swing.JButton();

        suuntaValikko.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "<", ">", "=" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        otsikko.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        otsikko.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        otsikko.setText("Syötä keräämäsi normaalisti jakautunut aineisto.");

        String mu = "\u00B5";
        String sigma = "\u03C3\u00B2";
        jakaumanMaarite.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jakaumanMaarite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jakaumanMaarite.setText("X ~ N(" + mu + ", " + sigma + ")");

        keskihajonta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        keskihajonta.setText("Keskihajonta");

        sKentta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        sKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sKenttaActionPerformed(evt);
            }
        });

        nollahypoteesi.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        nollahypoteesi.setText("Nollahypoteesi");

        nollaHypoteesiOnYhtaKuin.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        nollaHypoteesiOnYhtaKuin.setText("\u03C3   = ");

        pKentta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        pKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pKenttaActionPerformed(evt);
            }
        });

        sOnYhtaKuin.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        sOnYhtaKuin.setText("s   = ");

        valmisNappi.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        valmisNappi.setText("Valmis!");
        valmisNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valmisNappiActionPerformed(evt);
            }
        });

        nKentta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        nKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nKenttaActionPerformed(evt);
            }
        });

        kOnYhtaKuin1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        kOnYhtaKuin1.setText("n   = ");

        otoskoko.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        otoskoko.setText("Otoskoko");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("\u03C7\u00B2 -testi normaalijakauman varianssille");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Varianssi tuntematon");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(takaisin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(valmisNappi)
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(otoskoko, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(keskihajonta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nollahypoteesi, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kOnYhtaKuin1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sOnYhtaKuin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nollaHypoteesiOnYhtaKuin, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jakaumanMaarite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(otsikko, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jakaumanMaarite)
                .addGap(25, 25, 25)
                .addComponent(otsikko)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kOnYhtaKuin1)
                    .addComponent(otoskoko))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sOnYhtaKuin)
                    .addComponent(sKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keskihajonta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nollaHypoteesiOnYhtaKuin)
                    .addComponent(nollahypoteesi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valmisNappi)
                    .addComponent(takaisin))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valmisNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valmisNappiActionPerformed

        try {
            double s = Double.parseDouble(sKentta.getText());
            double p = Double.parseDouble(pKentta.getText());
            int n = Integer.parseInt(nKentta.getText());
        } catch (final NumberFormatException e) {
            new UlinaRuutuNormaalille().setVisible(true);
        }

        if (sKentta.getText().isEmpty() == true
                || pKentta.getText().isEmpty() == true
                || nKentta.getText().isEmpty() == true
                || Double.parseDouble(sKentta.getText()) <= 0
                || Double.parseDouble(pKentta.getText()) <= 0
                || Integer.parseInt(nKentta.getText()) < 1) {
            new UlinaRuutuNormaalille().setVisible(true);

        } else {

            NormaaliTulokset tulokset = new NormaaliTulokset();

            tulokset.tulosta(-1,
                    Integer.parseInt(nKentta.getText()),
                    Double.parseDouble(pKentta.getText()),
                    Double.parseDouble(sKentta.getText()),
                    "",
                    "Varianssi");

            tulokset.setVisible(true);
        }

    }//GEN-LAST:event_valmisNappiActionPerformed

    private void sKenttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sKenttaActionPerformed

    }//GEN-LAST:event_sKenttaActionPerformed

    private void pKenttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pKenttaActionPerformed

    }//GEN-LAST:event_pKenttaActionPerformed

    private void nKenttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nKenttaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nKenttaActionPerformed

    private void takaisinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takaisinActionPerformed
        setDefaultCloseOperation(NormaalinSyottoVarianssi.DISPOSE_ON_CLOSE);
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
            java.util.logging.Logger.getLogger(NormaalinSyottoVarianssi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NormaalinSyottoVarianssi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NormaalinSyottoVarianssi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NormaalinSyottoVarianssi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NormaalinSyottoVarianssi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jakaumanMaarite;
    private javax.swing.JLabel kOnYhtaKuin1;
    private javax.swing.JLabel keskihajonta;
    private javax.swing.JTextField nKentta;
    private javax.swing.JLabel nollaHypoteesiOnYhtaKuin;
    private javax.swing.JLabel nollahypoteesi;
    private javax.swing.JLabel otoskoko;
    private javax.swing.JLabel otsikko;
    private javax.swing.JTextField pKentta;
    private javax.swing.JTextField sKentta;
    private javax.swing.JLabel sOnYhtaKuin;
    private javax.swing.JComboBox<String> suuntaValikko;
    private javax.swing.JButton takaisin;
    private javax.swing.JButton valmisNappi;
    // End of variables declaration//GEN-END:variables
}
