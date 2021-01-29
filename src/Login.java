import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Login extends javax.swing.JFrame {

  /** Creates new form Login */
  public Login() {
    initComponents();
  }

  Connection connection;
  PreparedStatement preparedStatement;

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  // <editor-fold default state="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    JPanel jPanel1 = new JPanel();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    txtUsername = new javax.swing.JTextField();
    txtPassword = new javax.swing.JPasswordField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBorder(
        javax.swing.BorderFactory.createTitledBorder(
            null,
            "Login",
            javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
            javax.swing.border.TitledBorder.DEFAULT_POSITION,
            new java.awt.Font("Tahoma", Font.BOLD, 18))); // NOI18N

    jLabel1.setText("Username");

    jLabel2.setText("Password");

    jButton1.setText("Login");
    jButton1.addActionListener(this::jButton1ActionPerformed);

    jButton2.setText("Cancel");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                    .addGap(52, 52, 52)
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUsername)
                                            .addComponent(
                                                txtPassword,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                177,
                                                Short.MAX_VALUE)))
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addGap(136, 136, 136)
                                    .addComponent(
                                        jButton1,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        97,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(
                                        jButton2,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        116,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(25, Short.MAX_VALUE)));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(
                                txtUsername,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(43, 43, 43)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(
                                txtPassword,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                jButton1,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                39,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                jButton2,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                36,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(45, 45, 45)));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(
                        jPanel1,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(44, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(
                        jPanel1,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)));

    pack();
    setLocationRelativeTo(null);
  } // </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:

    String username = txtUsername.getText();
    String password = txtPassword.getText();

    if (username.isEmpty() || password.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Username or Password Blank");
    } else {
      try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection =
            DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "password");
        preparedStatement =
            connection.prepareStatement("SELECT * FROM USER WHERE username = ? AND password = ?");
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
          Main main = new Main();
          this.dispose();
          main.setVisible(true);

        } else {
          JOptionPane.showMessageDialog(this, "Username or Password do not match");
          txtUsername.setText("");
          txtPassword.setText("");
          txtUsername.requestFocus();
        }

      } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  } // GEN-LAST:event_jButton1ActionPerformed

  /** @param args the command line arguments */
  public static void main(String[] args) {
    /* Set the Nimbus look and feel */
    // <editor-fold default state="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info :
          javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException
        | InstantiationException
        | IllegalAccessException
        | UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    // </editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
  }

  private javax.swing.JPasswordField txtPassword;
  private javax.swing.JTextField txtUsername;
  // End of variables declaration//GEN-END:variables
}
