/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointmentsystem;

/**
 *
 * @author USER
 */
public class Home_Page extends javax.swing.JFrame {

    /**
     * Creates new form Home_Page
     */
    public Home_Page() {
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

        RegisterButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RegisterButton1 = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        Admin = new javax.swing.JButton();

        RegisterButton.setBackground(new java.awt.Color(255, 255, 255,80));
        RegisterButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        RegisterButton.setText("Don't Have Account? Register Now!!");
        RegisterButton.setBorderPainted(false);
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Karibu Tiba Clinic");

        RegisterButton1.setBackground(new java.awt.Color(255, 255, 255,80));
        RegisterButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        RegisterButton1.setText("Register");
        RegisterButton1.setBorderPainted(false);
        RegisterButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButton1ActionPerformed(evt);
            }
        });

        Login.setBackground(new java.awt.Color(255, 255, 255,80));
        Login.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Login.setText("Login");
        Login.setBorderPainted(false);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        Admin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Admin.setText("Admin");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(Login)
                        .addGap(18, 18, 18)
                        .addComponent(RegisterButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(Admin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterButton1)
                    .addComponent(Login))
                .addGap(26, 26, 26)
                .addComponent(Admin)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        UserLogin login = new UserLogin();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LoginActionPerformed

    private void RegisterButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButton1ActionPerformed
        Register_Page reg = new Register_Page();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegisterButton1ActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        LoginPage alogin = new LoginPage();
        alogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AdminActionPerformed

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
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JButton Login;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton RegisterButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}