
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sivri
 */
public class RegisterEkrani extends javax.swing.JFrame {
    
    /**
     * Creates new form RegisterEkrani
     */
    public RegisterEkrani() {
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

        PBilgi = new javax.swing.JPanel();
        LParola = new javax.swing.JLabel();
        LKullaniciAdi = new javax.swing.JLabel();
        TFKullaniciAdi = new javax.swing.JTextField();
        PFParola = new javax.swing.JPasswordField();
        PButon = new javax.swing.JPanel();
        BKayit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kayıt Alanı");

        PBilgi.setBackground(new java.awt.Color(255, 255, 153));

        LParola.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LParola.setText("Parola :");

        LKullaniciAdi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LKullaniciAdi.setText("Kullanıcı Adı :");

        javax.swing.GroupLayout PBilgiLayout = new javax.swing.GroupLayout(PBilgi);
        PBilgi.setLayout(PBilgiLayout);
        PBilgiLayout.setHorizontalGroup(
            PBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBilgiLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(PBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PBilgiLayout.createSequentialGroup()
                        .addComponent(LKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TFKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PBilgiLayout.createSequentialGroup()
                        .addComponent(LParola, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PFParola)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        PBilgiLayout.setVerticalGroup(
            PBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBilgiLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(PBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LKullaniciAdi)
                    .addComponent(TFKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LParola)
                    .addComponent(PFParola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        PButon.setBackground(new java.awt.Color(255, 153, 153));

        BKayit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BKayit.setText("Kayıt Ol");
        BKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKayitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PButonLayout = new javax.swing.GroupLayout(PButon);
        PButon.setLayout(PButonLayout);
        PButonLayout.setHorizontalGroup(
            PButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PButonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PButonLayout.setVerticalGroup(
            PButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PButonLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(BKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PBilgi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKayitActionPerformed
        
        String kullanici = TFKullaniciAdi.getText();
        String parola = new String(PFParola.getPassword());
        
        ArrayList<User> userList = LoginEkrani.getUserList();
        
        if(TFKullaniciAdi.getText().trim().equals("") && new String(PFParola.getPassword()).trim().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Kullanıcı Adı ve Parola Boş Bırakılamaz!");

        }
        else if (new String(PFParola.getPassword()).trim().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Parola Boş Bırakılamaz!");
        }
        else if (TFKullaniciAdi.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Kullanıcı Adı Boş Bırakılamaz!");
        }
        else
        {
            userList.add(new User(kullanici,parola));
        
            JOptionPane.showMessageDialog(this, "Kullanıcı Başarıyla Kaydedildi!");
        
            setVisible(false);
        
            LoginEkrani login = new LoginEkrani();
        
            login.setVisible(true);
        }
   
    }//GEN-LAST:event_BKayitActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BKayit;
    private javax.swing.JLabel LKullaniciAdi;
    private javax.swing.JLabel LParola;
    private javax.swing.JPanel PBilgi;
    private javax.swing.JPanel PButon;
    private javax.swing.JPasswordField PFParola;
    private javax.swing.JTextField TFKullaniciAdi;
    // End of variables declaration//GEN-END:variables
}
