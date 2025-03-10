/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Kaua
 */
public class Login_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Login_GUI
     */
    public Login_GUI() {
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

        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cadastro_BTN = new javax.swing.JButton();
        login_BTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        senha_txt = new javax.swing.JTextField();
        entrar_BTN = new javax.swing.JButton();
        criarconta_BTN = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/os p.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-350, -10, 740, 450);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/email1.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 140, 60, 70);

        cadastro_BTN.setBackground(new java.awt.Color(0, 0, 0));
        cadastro_BTN.setForeground(new java.awt.Color(255, 255, 255));
        cadastro_BTN.setText("CADASTRO");
        cadastro_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastro_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(cadastro_BTN);
        cadastro_BTN.setBounds(550, 0, 160, 50);

        login_BTN.setBackground(new java.awt.Color(255, 255, 51));
        login_BTN.setForeground(new java.awt.Color(0, 0, 0));
        login_BTN.setText("LOGIN");
        login_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(login_BTN);
        login_BTN.setBounds(390, 0, 160, 50);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(470, 140, 31, 16);
        jPanel1.add(email_txt);
        email_txt.setBounds(470, 160, 170, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(400, 230, 60, 70);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Senha");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(470, 230, 50, 16);
        jPanel1.add(senha_txt);
        senha_txt.setBounds(470, 250, 170, 30);

        entrar_BTN.setBackground(new java.awt.Color(255, 255, 51));
        entrar_BTN.setForeground(new java.awt.Color(0, 0, 0));
        entrar_BTN.setText("ENTRAR");
        entrar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrar_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(entrar_BTN);
        entrar_BTN.setBounds(470, 350, 160, 50);

        criarconta_BTN.setBackground(new java.awt.Color(103, 103, 103));
        criarconta_BTN.setForeground(new java.awt.Color(0, 0, 204));
        criarconta_BTN.setText("Criar Conta");
        criarconta_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarconta_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(criarconta_BTN);
        criarconta_BTN.setBounds(540, 300, 140, 20);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Não tem conta?");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(450, 300, 90, 16);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 430);

        setSize(new java.awt.Dimension(718, 432));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void criarconta_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarconta_BTNActionPerformed
        new Cadastro_GUI().setVisible(true);
    }//GEN-LAST:event_criarconta_BTNActionPerformed

    private void login_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_BTNActionPerformed
         new Login_GUI().setVisible(true);
    }//GEN-LAST:event_login_BTNActionPerformed

    private void cadastro_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastro_BTNActionPerformed
         new Cadastro_GUI().setVisible(true);
    }//GEN-LAST:event_cadastro_BTNActionPerformed

    private void entrar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrar_BTNActionPerformed
        new Inicio_GUI().setVisible(true);
    }//GEN-LAST:event_entrar_BTNActionPerformed

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
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastro_BTN;
    private javax.swing.JButton criarconta_BTN;
    private javax.swing.JTextField email_txt;
    private javax.swing.JButton entrar_BTN;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_BTN;
    private javax.swing.JTextField senha_txt;
    // End of variables declaration//GEN-END:variables
}
