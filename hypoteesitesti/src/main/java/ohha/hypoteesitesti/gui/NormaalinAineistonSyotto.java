package ohha.hypoteesitesti.gui;

import java.text.DecimalFormat;
import ohha.hypoteesitesti.Testaaja;
import ohha.hypoteesitesti.Jakaumantyyppi;

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
        otoskeskiarvo = new javax.swing.JLabel();
        keskihajonta = new javax.swing.JLabel();
        sKentta = new javax.swing.JTextField();
        nollahypoteesi = new javax.swing.JLabel();
        nollaHypoteesiOnYhtaKuin = new javax.swing.JLabel();
        pKentta = new javax.swing.JTextField();
        kaOnYhtaKuin = new javax.swing.JLabel();
        sOnYhtaKuin = new javax.swing.JLabel();
        valmisNappi = new javax.swing.JButton();
        nollahypo = new javax.swing.JLabel();
        pValue = new javax.swing.JLabel();
        kaValue = new javax.swing.JLabel();
        nValue = new javax.swing.JLabel();
        suunta2 = new javax.swing.JLabel();
        parvoKentta = new javax.swing.JLabel();
        parvoValue = new javax.swing.JLabel();
        tulosrivi1 = new javax.swing.JLabel();
        tulosrivi3 = new javax.swing.JLabel();
        tulosrivi4 = new javax.swing.JLabel();
        tulosrivi2 = new javax.swing.JLabel();
        nKentta = new javax.swing.JTextField();
        kOnYhtaKuin1 = new javax.swing.JLabel();
        otoskoko = new javax.swing.JLabel();
        otoska = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        keskihaj = new javax.swing.JLabel();
        otosko = new javax.swing.JLabel();
        sValue = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        testiValikko = new javax.swing.JComboBox<>();
        testi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        otsikko.setText("Syötä keräämäsi normaalijakautunut aineisto.");

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

        otoskeskiarvo.setText("Otoskeskiarvo");

        keskihajonta.setText("Keskihajonta");

        sKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sKenttaActionPerformed(evt);
            }
        });

        nollahypoteesi.setText("Nollahypoteesi");

        nollaHypoteesiOnYhtaKuin.setText("\u00B5\u2080 = ");

        pKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pKenttaActionPerformed(evt);
            }
        });

        kaOnYhtaKuin.setText("Y\u0305   = ");

        sOnYhtaKuin.setText("s   = ");

        valmisNappi.setText("Valmis!");
        valmisNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valmisNappiActionPerformed(evt);
            }
        });

        nollahypo.setText("Nollahypoteesi H\u2080: \u00B5\u2080 = ");

        parvoKentta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        parvoKentta.setText("p-arvo");

        parvoValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        nKentta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nKenttaActionPerformed(evt);
            }
        });

        kOnYhtaKuin1.setText("n   = ");

        otoskoko.setText("Otoskoko");

        otoska.setText("Otoskeskiarvo");

        keskihaj.setText("Keskihajonta");

        otosko.setText("Otoskoko");

        jLabel1.setText("Valitse, mitä normaalimallin parametriä testataan.");

        testiValikko.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Odotusarvo (varianssi tuntematon)", "Odotusarvo (varianssi tunnettu)", "Varianssi" }));
        testiValikko.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                testiValikkoItemStateChanged(evt);
            }
        });

        testi.setText("testi");
        testi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(otsikko)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jakaumanMaarite)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(valmisNappi))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(otoskoko, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(keskihajonta, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nollahypoteesi, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(otoskeskiarvo, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kaOnYhtaKuin, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(kOnYhtaKuin1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sOnYhtaKuin, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nollaHypoteesiOnYhtaKuin, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(testiValikko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kaKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tulosrivi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tulosrivi3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tulosrivi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tulosrivi4, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(parvoKentta)
                                    .addComponent(nollahypo)
                                    .addComponent(otoska)
                                    .addComponent(keskihaj)
                                    .addComponent(otosko))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(parvoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(kaValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pValue, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(suunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(testi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otsikko)
                    .addComponent(jakaumanMaarite))
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(testiValikko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otoskoko)
                    .addComponent(nKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kOnYhtaKuin1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kaOnYhtaKuin)
                    .addComponent(kaKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otoskeskiarvo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sOnYhtaKuin)
                    .addComponent(sKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keskihajonta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nollahypoteesi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pKentta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nollaHypoteesiOnYhtaKuin))
                .addGap(18, 18, 18)
                .addComponent(valmisNappi)
                .addGap(32, 32, 32)
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
                    .addComponent(nollahypo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pValue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parvoKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parvoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tulosrivi1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tulosrivi2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tulosrivi3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tulosrivi4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(testi)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kaKenttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaKenttaActionPerformed

    }//GEN-LAST:event_kaKenttaActionPerformed

    private void valmisNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valmisNappiActionPerformed

        if (Double.parseDouble(sKentta.getText()) < 0
                || Double.parseDouble(pKentta.getText()) < 0
                || Integer.parseInt(nKentta.getText()) < 1) {
            new UlinaRuutu().setVisible(true);
        } else {

            double ka = 0;
            int n = 0;
            double p = 0;
            double s = 0;
            int testi = 0;

            if (testiValikko.getSelectedItem().equals("Odotusarvo (varianssi tunnettu)")) {
                testi = 1;
            } else if (testiValikko.getSelectedItem().equals("Odotusarvo (varianssi tuntematon)")) {
                testi = 2;
            } else if (testiValikko.getSelectedItem().equals("Varianssi")) {
                testi = 3;
            }

            DecimalFormat df = new DecimalFormat("##.#####");

            if (kaKentta.isEnabled()) {
                if (Double.parseDouble(kaKentta.getText()) >= 0) {
                    kaValue.setText(kaKentta.getText());
                    ka = Double.parseDouble(kaKentta.getText());
                }
            }

            sValue.setText(sKentta.getText());
            nValue.setText(nKentta.getText());
            pValue.setText(pKentta.getText());

            
            s = Double.parseDouble(sKentta.getText());
            p = Double.parseDouble(pKentta.getText());
            n = Integer.parseInt(nKentta.getText());

            Jakaumantyyppi jakaumantyyppi = new Jakaumantyyppi(2);
            Testaaja testaaja = new Testaaja(jakaumantyyppi);
            double parvo = testaaja.teeJatkuvaTesti(n, ka, s, p, testi);
            parvoValue.setText("" + df.format(parvo));

            if (parvo < 0.1) {
                if (parvo < 0.05) {
                    if (parvo < 0.01) {

                        tulosrivi1.setText("Todennäköisyys saada oheinen aineisto");
                        tulosrivi2.setText("nollahypoteesin pätiessä on " + df.format(parvo * 100) + "%.");
                        tulosrivi3.setText("Nollahypoteesin todennäköisyys on vähemmän kuin 1%");
                        tulosrivi4.setText("joten se hylätään tasolla 1%");

                    } else if (parvo > 0.01) {
                        tulosrivi1.setText("Todennäköisyys saada oheinen aineisto");
                        tulosrivi2.setText("nollahypoteesin pätiessä on " + df.format(parvo * 100) + "%.");
                        tulosrivi3.setText("Nollahypoteesi hylätään");
                        tulosrivi4.setText("5% merkitsevyystasolla mutta hyväksytään 1% tasolla.");
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

    private void testiValikkoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_testiValikkoItemStateChanged
        if (testiValikko.getSelectedItem().equals("Odotusarvo (varianssi tunnettu)")) {
            kaKentta.enable();
            nollaHypoteesiOnYhtaKuin.setText("\u00B5\u2080 = ");
            otoska.setText("Otoskeskiarvo");
            nollahypo.setText("Nollahypoteesi H\u2080: \u00B5\u2080 = ");
            sOnYhtaKuin.setText("\u03C3\u00B2 = ");
            keskihaj.setText("Varianssi");
            keskihajonta.setText("Varianssi");
        } else if (testiValikko.getSelectedItem().equals("Odotusarvo (varianssi tuntematon)")) {
            kaKentta.enable();
            sKentta.enable();
            sOnYhtaKuin.setText("s  = ");
            keskihaj.setText("Keskihajonta");
            keskihajonta.setText("Keskihajonta");
            nollaHypoteesiOnYhtaKuin.setText("\u00B5\u2080 = ");
            otoska.setText("Otoskeskiarvo");
            nollahypo.setText("Nollahypoteesi H\u2080: \u00B5\u2080 = ");
        } else if (testiValikko.getSelectedItem().equals("Varianssi")) {
            kaKentta.disable();

            sKentta.enable();
            keskihaj.setText("Keskihajonta");
            nollaHypoteesiOnYhtaKuin.setText("\u03C3\u2080 = ");
            otoska.setText("");
            nollahypo.setText("Nollahypoteesi H\u2080: \u03C3\u2080 = ");
        }
    }//GEN-LAST:event_testiValikkoItemStateChanged

    private void testiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testiActionPerformed
        new Vikailmoitus().setVisible(true);
    }//GEN-LAST:event_testiActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jakaumanMaarite;
    private javax.swing.JLabel kOnYhtaKuin1;
    private javax.swing.JTextField kaKentta;
    private javax.swing.JLabel kaOnYhtaKuin;
    private javax.swing.JLabel kaValue;
    private javax.swing.JLabel keskihaj;
    private javax.swing.JLabel keskihajonta;
    private javax.swing.JTextField nKentta;
    private javax.swing.JLabel nValue;
    private javax.swing.JLabel nollaHypoteesiOnYhtaKuin;
    private javax.swing.JLabel nollahypo;
    private javax.swing.JLabel nollahypoteesi;
    private javax.swing.JLabel otoska;
    private javax.swing.JLabel otoskeskiarvo;
    private javax.swing.JLabel otosko;
    private javax.swing.JLabel otoskoko;
    private javax.swing.JLabel otsikko;
    private javax.swing.JTextField pKentta;
    private javax.swing.JLabel pValue;
    private javax.swing.JLabel parvoKentta;
    private javax.swing.JLabel parvoValue;
    private javax.swing.JTextField sKentta;
    private javax.swing.JLabel sOnYhtaKuin;
    private javax.swing.JLabel sValue;
    private javax.swing.JLabel suunta2;
    private javax.swing.JButton testi;
    private javax.swing.JComboBox<String> testiValikko;
    private javax.swing.JLabel tulosrivi1;
    private javax.swing.JLabel tulosrivi2;
    private javax.swing.JLabel tulosrivi3;
    private javax.swing.JLabel tulosrivi4;
    private javax.swing.JButton valmisNappi;
    // End of variables declaration//GEN-END:variables
}
