package ohha.hypoteesitesti.gui;

import java.text.DecimalFormat;
import ohha.hypoteesitesti.AineistonSyottoLuokka;
import ohha.hypoteesitesti.Testaaja;
import ohha.hypoteesitesti.JakaumanTyyppi;

public class NormaalinAineistonSyotto extends javax.swing.JFrame {

    public NormaalinAineistonSyotto() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        otsikko = new javax.swing.JLabel();
        jakaumanMaarite = new javax.swing.JLabel();
        kaKentta = new javax.swing.JTextField();
        otoskoko = new javax.swing.JLabel();
        onnistumiset = new javax.swing.JLabel();
        sKentta = new javax.swing.JTextField();
        nollahypoteesi = new javax.swing.JLabel();
        nollaHypoteesiOnYhtaKuin = new javax.swing.JLabel();
        pKentta = new javax.swing.JTextField();
        nOnYhtaKuin = new javax.swing.JLabel();
        kOnYhtaKuin = new javax.swing.JLabel();
        valmisNappi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pValue1 = new javax.swing.JLabel();
        kaValue = new javax.swing.JLabel();
        nValue = new javax.swing.JLabel();
        suunta2 = new javax.swing.JLabel();
        suuntaValikko = new javax.swing.JComboBox<>();
        parvoKentta = new javax.swing.JLabel();
        parvoValue = new javax.swing.JLabel();
        tulosrivi1 = new javax.swing.JLabel();
        tulosrivi3 = new javax.swing.JLabel();
        tulosrivi4 = new javax.swing.JLabel();
        tulosrivi2 = new javax.swing.JLabel();
        nKentta = new javax.swing.JTextField();
        kOnYhtaKuin1 = new javax.swing.JLabel();
        onnistumiset1 = new javax.swing.JLabel();
        otoska = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        keskihaj = new javax.swing.JLabel();
        otosko = new javax.swing.JLabel();
        sValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        otsikko.setText("Syötä keräämäsi binomijakautunut aineisto.");

        String mu = "\u00B5";
        String sigma = "\u03C3\u00B2";
        jakaumanMaarite.setText("X ~ N(" + mu + ", " + sigma + ")");

        kaKentta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kaKenttaMouseClicked(evt);
            }
        });
        kaKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaKenttaActionPerformed(evt);
            }
        });

        otoskoko.setText("Otoskeskiarvo");

        onnistumiset.setText("Keskihajonta");

        sKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sKenttaActionPerformed(evt);
            }
        });

        nollahypoteesi.setText("Nollahypoteesi");

        nollaHypoteesiOnYhtaKuin.setText("p");

        pKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pKenttaActionPerformed(evt);
            }
        });

        nOnYhtaKuin.setText("ka   = ");

        kOnYhtaKuin.setText("s   = ");

        valmisNappi.setText("Valmis!");
        valmisNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valmisNappiActionPerformed(evt);
            }
        });

        jLabel3.setText("Nollahypoteesi H0: p");

        jLabel4.setText("Vastahypoteesi H1: p");

        suuntaValikko.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "<", ">", "=" }));

        parvoKentta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        parvoKentta.setText("p-arvo");

        parvoValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        nKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nKenttaActionPerformed(evt);
            }
        });

        kOnYhtaKuin1.setText("n   = ");

        onnistumiset1.setText("Otoskoko");

        otoska.setText("Otoskeskiarvo");

        keskihaj.setText("Keskihajonta");

        otosko.setText("Otoskoko");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tulosrivi1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addComponent(tulosrivi3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tulosrivi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tulosrivi4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(otoskoko, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(onnistumiset, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nOnYhtaKuin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kOnYhtaKuin, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(kaKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(parvoKentta)
                            .addComponent(jLabel3)
                            .addComponent(otoska)
                            .addComponent(keskihaj)
                            .addComponent(otosko)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(parvoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(kaValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                    .addComponent(pValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(suunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(otsikko)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jakaumanMaarite)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nollahypoteesi)
                    .addComponent(onnistumiset1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nollaHypoteesiOnYhtaKuin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(suuntaValikko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valmisNappi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(kOnYhtaKuin1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
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
                    .addComponent(kaKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otoskoko))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kOnYhtaKuin)
                    .addComponent(sKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onnistumiset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kOnYhtaKuin1)
                    .addComponent(onnistumiset1))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suuntaValikko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nollaHypoteesiOnYhtaKuin)
                    .addComponent(nollahypoteesi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(valmisNappi)
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(otoska, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keskihaj, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sValue, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otosko, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nValue, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parvoKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parvoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(tulosrivi1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tulosrivi2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tulosrivi3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tulosrivi4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kaKenttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaKenttaActionPerformed

    }//GEN-LAST:event_kaKenttaActionPerformed

    private void valmisNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valmisNappiActionPerformed

        if (kaKentta.getText().isEmpty()
                || sKentta.getText().isEmpty()
                || pKentta.getText().isEmpty()
                || Integer.parseInt(kaKentta.getText()) < 1
                || Integer.parseInt(sKentta.getText()) < 0
                || Double.parseDouble(pKentta.getText()) < 0
                || Integer.parseInt(kaKentta.getText()) < Integer.parseInt(sKentta.getText())
                || Double.parseDouble(pKentta.getText()) > 1
                || suuntaValikko.getSelectedItem().equals(" ")) {
            new UlinaRuutu().setVisible(true);
        } else {

            DecimalFormat df = new DecimalFormat("##.###");

            kaValue.setText(kaKentta.getText());
            sValue.setText(sKentta.getText());
            nValue.setText(nKentta.getText());

            int suunta = 0;
            int n = 0;
            int k = 0;
            double p = 0;

            if (suuntaValikko.getSelectedItem().equals("<")) {
                suunta = 1;
                nValue.setText("<");
                suunta2.setText(">");
                pValue1.setText(pKentta.getText());
            } else if (suuntaValikko.getSelectedItem().equals(">")) {
                suunta = 2;
                nValue.setText(">");
                suunta2.setText("<");
                pValue1.setText(pKentta.getText());
            } else if (suuntaValikko.getSelectedItem().equals("=")) {
                suunta = 3;
                nValue.setText("=");
                suunta2.setText("");
                pValue1.setText("");

            }

            n = Integer.parseInt(kaKentta.getText());
            k = Integer.parseInt(sKentta.getText());
            p = Double.parseDouble(pKentta.getText());

            JakaumanTyyppi jakaumantyyppi = new JakaumanTyyppi(1);
            Testaaja testaaja = new Testaaja(jakaumantyyppi);
            double parvo = testaaja.teeTesti(n, k, p, suunta);
            parvoValue.setText("" + df.format(parvo));

            if (parvo < 0.1) {
                if (parvo < 0.05) {
                    if (parvo < 0.01) {

                        tulosrivi1.setText("Todennäköisyys saada oheinen aineisto");
                        tulosrivi2.setText("nollahypoteesin pätiessä on " + df.format(parvo * 100) + "%.");
                        tulosrivi3.setText("Nollahypoteesi hylätään");
                        tulosrivi4.setText("1% merkitsevyystasolla ");

                    } else if (parvo > 0.01) {
                        tulosrivi1.setText("Todennäköisyys saada oheinen aineisto");
                        tulosrivi2.setText("nollahypoteesin pätiessä on " + df.format(parvo * 100) + "%.");
                        tulosrivi3.setText("Nollahypoteesi hyväksytään");
                        tulosrivi4.setText("5% merkitsevyystasolla mutta hylätään 1% tasolla.");
                    }
                } else {

                    tulosrivi1.setText("Todennäköisyys saada oheinen aineisto");
                    tulosrivi2.setText("nollahypoteesin pätiessä on " + df.format(parvo * 100) + "%.");
                    tulosrivi3.setText("Nollahypoteesi hylätään");
                    tulosrivi4.setText("10% merkitsevyystasolla mutta hyväksytään 5% tasolla");

                }
            } else if (parvo > 0.1) {

                tulosrivi1.setText("Todennäköisyys saada oheinen aineisto");
                tulosrivi2.setText("nollahypoteesin pätiessä on " + df.format(parvo * 100) + "%.");
                tulosrivi3.setText("Nollahypoteesi hyväksytään");
                tulosrivi4.setText("10% merkitsevyystasolla");

            }
        }

    }//GEN-LAST:event_valmisNappiActionPerformed

    private void sKenttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sKenttaActionPerformed

    }//GEN-LAST:event_sKenttaActionPerformed

    private void pKenttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pKenttaActionPerformed

    }//GEN-LAST:event_pKenttaActionPerformed

    private void kaKenttaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaKenttaMouseClicked

    }//GEN-LAST:event_kaKenttaMouseClicked

    private void nKenttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nKenttaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nKenttaActionPerformed

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
            java.util.logging.Logger.getLogger(NormaalinAineistonSyotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NormaalinAineistonSyotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NormaalinAineistonSyotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NormaalinAineistonSyotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NormaalinAineistonSyotto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jakaumanMaarite;
    private javax.swing.JLabel kOnYhtaKuin;
    private javax.swing.JLabel kOnYhtaKuin1;
    private javax.swing.JTextField kaKentta;
    private javax.swing.JLabel kaValue;
    private javax.swing.JLabel keskihaj;
    private javax.swing.JTextField nKentta;
    private javax.swing.JLabel nOnYhtaKuin;
    private javax.swing.JLabel nValue;
    private javax.swing.JLabel nollaHypoteesiOnYhtaKuin;
    private javax.swing.JLabel nollahypoteesi;
    private javax.swing.JLabel onnistumiset;
    private javax.swing.JLabel onnistumiset1;
    private javax.swing.JLabel otoska;
    private javax.swing.JLabel otosko;
    private javax.swing.JLabel otoskoko;
    private javax.swing.JLabel otsikko;
    private javax.swing.JTextField pKentta;
    private javax.swing.JLabel pValue1;
    private javax.swing.JLabel parvoKentta;
    private javax.swing.JLabel parvoValue;
    private javax.swing.JTextField sKentta;
    private javax.swing.JLabel sValue;
    private javax.swing.JLabel suunta2;
    private javax.swing.JComboBox<String> suuntaValikko;
    private javax.swing.JLabel tulosrivi1;
    private javax.swing.JLabel tulosrivi2;
    private javax.swing.JLabel tulosrivi3;
    private javax.swing.JLabel tulosrivi4;
    private javax.swing.JButton valmisNappi;
    // End of variables declaration//GEN-END:variables
}
