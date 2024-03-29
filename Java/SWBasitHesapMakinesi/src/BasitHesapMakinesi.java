/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sivri
 */
public class BasitHesapMakinesi extends javax.swing.JFrame {

    /**
     * Creates new form BasitHesapMakinesi
     */
    public BasitHesapMakinesi() {
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

        LBirinciSayi = new javax.swing.JLabel();
        LSonuc = new javax.swing.JLabel();
        LIkinciSayi = new javax.swing.JLabel();
        TFBirinciSayi = new javax.swing.JTextField();
        TFIkinciSayi = new javax.swing.JTextField();
        TFSonuc = new javax.swing.JTextField();
        BBolme = new javax.swing.JButton();
        BArti = new javax.swing.JButton();
        BEksi = new javax.swing.JButton();
        BCarpi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Basit Hesap Makinesi");
        setResizable(false);

        LBirinciSayi.setText("Birinci Sayi :");

        LSonuc.setText("Sonuc :");

        LIkinciSayi.setText("İkinci Sayi :");

        TFSonuc.setEditable(false);

        BBolme.setText("/");
        BBolme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBolmeActionPerformed(evt);
            }
        });

        BArti.setText("+");
        BArti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BArtiActionPerformed(evt);
            }
        });

        BEksi.setText("-");
        BEksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEksiActionPerformed(evt);
            }
        });

        BCarpi.setText("*");
        BCarpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCarpiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LSonuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LBirinciSayi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LIkinciSayi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BArti, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBolme, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BCarpi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BEksi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFBirinciSayi, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFIkinciSayi, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBirinciSayi)
                    .addComponent(TFBirinciSayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LIkinciSayi)
                    .addComponent(TFIkinciSayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LSonuc)
                    .addComponent(TFSonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BArti, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BEksi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BBolme, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BCarpi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BArtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BArtiActionPerformed
        
        int bSayi = Integer.valueOf(TFBirinciSayi.getText());
        int iSayi = Integer.valueOf(TFIkinciSayi.getText());
        
        TFSonuc.setText(String.valueOf(bSayi + iSayi));
        
    }//GEN-LAST:event_BArtiActionPerformed

    private void BEksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEksiActionPerformed
        int bSayi = Integer.valueOf(TFBirinciSayi.getText());
        int iSayi = Integer.valueOf(TFIkinciSayi.getText());
        
        TFSonuc.setText(String.valueOf(bSayi - iSayi));
    }//GEN-LAST:event_BEksiActionPerformed

    private void BBolmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBolmeActionPerformed
        double bSayi = Double.valueOf(TFBirinciSayi.getText());
        double iSayi = Double.valueOf(TFIkinciSayi.getText());
        
        TFSonuc.setText(String.valueOf(bSayi / iSayi));
    }//GEN-LAST:event_BBolmeActionPerformed

    private void BCarpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCarpiActionPerformed
        int bSayi = Integer.valueOf(TFBirinciSayi.getText());
        int iSayi = Integer.valueOf(TFIkinciSayi.getText());
        
        TFSonuc.setText(String.valueOf(bSayi * iSayi));
    }//GEN-LAST:event_BCarpiActionPerformed

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
            java.util.logging.Logger.getLogger(BasitHesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasitHesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasitHesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasitHesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasitHesapMakinesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BArti;
    private javax.swing.JButton BBolme;
    private javax.swing.JButton BCarpi;
    private javax.swing.JButton BEksi;
    private javax.swing.JLabel LBirinciSayi;
    private javax.swing.JLabel LIkinciSayi;
    private javax.swing.JLabel LSonuc;
    private javax.swing.JTextField TFBirinciSayi;
    private javax.swing.JTextField TFIkinciSayi;
    private javax.swing.JTextField TFSonuc;
    // End of variables declaration//GEN-END:variables
}
