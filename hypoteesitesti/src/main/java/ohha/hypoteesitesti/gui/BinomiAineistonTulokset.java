package ohha.hypoteesitesti.gui;

import java.text.DecimalFormat;
import ohha.hypoteesitesti.logiikka.Testaaja;

public class BinomiAineistonTulokset extends javax.swing.JFrame {

    public BinomiAineistonTulokset() {
        initComponents();

    }

    public void suunnanMaaritys(int n, int k, double p, String suunta) {
        DecimalFormat df = new DecimalFormat("##.###");
        int suuntaNumero = 0;
        
        nValue.setText(n + "");
        kValue.setText(k + "");
        pValue0.setText(p + "");
        
        if (suunta.equals("<")) {
            suuntaNumero = 1;
            suunta1.setText("<");
            suunta2.setText(">");
            pValue1.setText(p + "");
        } else if (suunta.equals(">")) {
            suuntaNumero = 2;
            suunta1.setText(">");
            suunta2.setText("<");
            pValue1.setText(p + "");
        } else if (suunta.equals("=")) {
            suuntaNumero = 3;
            suunta1.setText("=");
            suunta2.setText("");
            pValue1.setText("");

        }
        
        Testaaja testaaja = new Testaaja();
        double parvo = testaaja.teeBinomiTesti(n, k, p, suuntaNumero);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nValue = new javax.swing.JLabel();
        pValue1 = new javax.swing.JLabel();
        kValue = new javax.swing.JLabel();
        pValue0 = new javax.swing.JLabel();
        suunta1 = new javax.swing.JLabel();
        suunta2 = new javax.swing.JLabel();
        parvoKentta = new javax.swing.JLabel();
        parvoValue = new javax.swing.JLabel();
        tulosrivi1 = new javax.swing.JLabel();
        tulosrivi3 = new javax.swing.JLabel();
        tulosrivi4 = new javax.swing.JLabel();
        tulosrivi2 = new javax.swing.JLabel();
        uudestaan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Otoskoko n   = ");

        jLabel2.setText("Onnistumisten määrä k   = ");

        jLabel3.setText("Nollahypoteesi H0: p");

        jLabel4.setText("Vastahypoteesi H1: p");

        parvoKentta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        parvoKentta.setText("p-arvo");

        parvoValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        uudestaan.setText("Tee uusi testi");
        uudestaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uudestaanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(parvoKentta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(suunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pValue0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(suunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(pValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(parvoValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kValue, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nValue, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tulosrivi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tulosrivi4, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tulosrivi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(54, 54, 54))
                                    .addComponent(tulosrivi3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(uudestaan)))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kValue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suunta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pValue0, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parvoKentta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parvoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tulosrivi1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tulosrivi2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(tulosrivi3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tulosrivi4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(uudestaan)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uudestaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uudestaanActionPerformed
        setDefaultCloseOperation(BinomiAineistonTulokset.DISPOSE_ON_CLOSE);
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
            java.util.logging.Logger.getLogger(BinomiAineistonTulokset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BinomiAineistonTulokset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BinomiAineistonTulokset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BinomiAineistonTulokset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BinomiAineistonTulokset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel kValue;
    private javax.swing.JLabel nValue;
    private javax.swing.JLabel pValue0;
    private javax.swing.JLabel pValue1;
    private javax.swing.JLabel parvoKentta;
    private javax.swing.JLabel parvoValue;
    private javax.swing.JLabel suunta1;
    private javax.swing.JLabel suunta2;
    private javax.swing.JLabel tulosrivi1;
    private javax.swing.JLabel tulosrivi2;
    private javax.swing.JLabel tulosrivi3;
    private javax.swing.JLabel tulosrivi4;
    private javax.swing.JButton uudestaan;
    // End of variables declaration//GEN-END:variables
}
