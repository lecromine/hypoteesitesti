package ohha.hypoteesitesti.gui;

import java.text.DecimalFormat;
import ohha.hypoteesitesti.logiikka.Testaaja;

public class NormaaliTulokset extends javax.swing.JFrame {

    public NormaaliTulokset() {
        initComponents();

    }

    public void tulosta(double ka, int n, double p, double s, String suunta, String testi) {
        
        maaritaTestattavaParametri(testi);
        
        int testiNumero = 0;
        int suuntaNumero = 0;
        
        switch (testi) {
            case "Odotusarvo (varianssi tunnettu)":
                testiNumero = 1;
                break;
            case "Odotusarvo (varianssi tuntematon)":
                testiNumero = 2;
                break;
            case "Varianssi":
                testiNumero = 3;
                break;
            default:
                break;
        }
        
        switch (suunta) {
            case "<":
                suuntaNumero = 1;
                suunta1.setText("<");
                
                break;
            case ">":
                suuntaNumero = 2;
                suunta1.setText(">");
                break;
            case "=":
                suuntaNumero = 3;
                suunta1.setText("=");
                break;
            default:
                break;
        }
        

        DecimalFormat df = new DecimalFormat("##.#####");

        sValue.setText(s + "");
        nValue.setText(n + "");
        pValue.setText(p + "");
        
        if (ka != -1) {
            kaValue.setText(ka + "");
        }

        Testaaja testaaja = new Testaaja();
        double parvo = testaaja.normaaliTesti(n, ka, s, p, suuntaNumero, testiNumero);
        parvoValue.setText("" + parvo);

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
    
    public void maaritaTestattavaParametri(String testi) {
        if (testi.equals("Odotusarvo (varianssi tunnettu)")) {
            otoska.setText("Otoskeskiarvo");
            nollahypo.setText("Nollahypoteesi H\u2080: \u00B5\u2080");
            keskihaj.setText("Varianssi");
        } else if (testi.equals("Odotusarvo (varianssi tuntematon)")) {
            keskihaj.setText("Keskihajonta");
            otoska.setText("Otoskeskiarvo");
            nollahypo.setText("Nollahypoteesi H\u2080: \u00B5\u2080");
        } else if (testi.equals("Varianssi")) {
            keskihaj.setText("Keskihajonta");
            otoska.setText("");
            nollahypo.setText("Nollahypoteesi H\u2080: \u03C3\u2080");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nollahypo = new javax.swing.JLabel();
        pValue = new javax.swing.JLabel();
        kaValue = new javax.swing.JLabel();
        nValue = new javax.swing.JLabel();
        parvoKentta = new javax.swing.JLabel();
        parvoValue = new javax.swing.JLabel();
        tulosrivi1 = new javax.swing.JLabel();
        tulosrivi3 = new javax.swing.JLabel();
        tulosrivi4 = new javax.swing.JLabel();
        tulosrivi2 = new javax.swing.JLabel();
        otoska = new javax.swing.JLabel();
        keskihaj = new javax.swing.JLabel();
        otosko = new javax.swing.JLabel();
        sValue = new javax.swing.JLabel();
        uudestaan = new javax.swing.JButton();
        suunta1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nollahypo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        nollahypo.setText("Nollahypoteesi H\u2080");

        pValue.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        kaValue.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        nValue.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        parvoKentta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        parvoKentta.setText("p-arvo");

        parvoValue.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        tulosrivi1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tulosrivi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tulosrivi3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tulosrivi3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tulosrivi4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tulosrivi4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tulosrivi2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tulosrivi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        otoska.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        otoska.setText("Otoskeskiarvo");

        keskihaj.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        keskihaj.setText("Keskihajonta");

        otosko.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        otosko.setText("Otoskoko");

        sValue.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        uudestaan.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        uudestaan.setText("Tee uusi testi");
        uudestaan.setAlignmentY(0.0F);
        uudestaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uudestaanActionPerformed(evt);
            }
        });

        suunta1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tulosrivi3, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                            .addComponent(tulosrivi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tulosrivi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tulosrivi4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(parvoKentta)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nollahypo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(otoska)
                            .addComponent(keskihaj)
                            .addComponent(otosko))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kaValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(parvoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(uudestaan)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(pValue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(suunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(uudestaan)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uudestaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uudestaanActionPerformed
        setDefaultCloseOperation(NormaaliTulokset.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_uudestaanActionPerformed

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
            java.util.logging.Logger.getLogger(NormaaliTulokset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NormaaliTulokset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NormaaliTulokset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NormaaliTulokset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new NormaaliTulokset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel kaValue;
    private javax.swing.JLabel keskihaj;
    private javax.swing.JLabel nValue;
    private javax.swing.JLabel nollahypo;
    private javax.swing.JLabel otoska;
    private javax.swing.JLabel otosko;
    private javax.swing.JLabel pValue;
    private javax.swing.JLabel parvoKentta;
    private javax.swing.JLabel parvoValue;
    private javax.swing.JLabel sValue;
    private javax.swing.JLabel suunta1;
    private javax.swing.JLabel tulosrivi1;
    private javax.swing.JLabel tulosrivi2;
    private javax.swing.JLabel tulosrivi3;
    private javax.swing.JLabel tulosrivi4;
    private javax.swing.JButton uudestaan;
    // End of variables declaration//GEN-END:variables
}
