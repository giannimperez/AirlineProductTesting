import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class userCreation extends javax.swing.JInternalFrame {

  /** Creates new form userCreation */
  public userCreation() {
    initComponents();
    autoID();
  }

  Connection connection;
  PreparedStatement preparedStatement;

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  // <editor-fold default state="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
    javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
    javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
    javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
    javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
    txtUserID = new javax.swing.JLabel();
    txtFirstName = new javax.swing.JTextField();
    txtLastName = new javax.swing.JTextField();
    txtUsername = new javax.swing.JTextField();
    javax.swing.JButton jButton1 = new javax.swing.JButton();
    javax.swing.JButton jButton2 = new javax.swing.JButton();
    txtPassword = new javax.swing.JPasswordField();

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("User Creation"));

    jLabel1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
    jLabel1.setText("User ID");

    jLabel2.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
    jLabel2.setText("First Name");

    jLabel3.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
    jLabel3.setText("Last Name");

    jLabel4.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
    jLabel4.setText("Username");

    jLabel5.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
    jLabel5.setText("Password");

    txtUserID.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18)); // NOI18N
    txtUserID.setForeground(new java.awt.Color(255, 0, 0));
    txtUserID.setText("jLabel6");

    jButton1.setText("Add");
    jButton1.addActionListener(evt -> jButton1ActionPerformed());

    jButton2.setText("Cancel");
    jButton2.addActionListener(evt -> jButton2ActionPerformed());

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                    .addGap(55, 55, 55)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserID)
                            .addComponent(txtFirstName)
                            .addComponent(txtLastName)
                            .addComponent(txtUsername)
                            .addComponent(
                                txtPassword,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                140,
                                Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel1Layout
                    .createSequentialGroup()
                    .addContainerGap(208, Short.MAX_VALUE)
                    .addComponent(
                        jButton1,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        109,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(
                        jButton2,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        107,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(
                                                jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .BASELINE)
                                                            .addComponent(jLabel1)
                                                            .addComponent(txtUserID))
                                                    .addGap(37, 37, 37)
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .BASELINE)
                                                            .addComponent(jLabel2)
                                                            .addComponent(
                                                                txtFirstName,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                javax.swing.GroupLayout
                                                                    .DEFAULT_SIZE,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE))
                                                    .addGap(44, 44, 44)
                                                    .addComponent(jLabel3))
                                            .addComponent(
                                                txtLastName,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(49, 49, 49)
                                    .addComponent(jLabel4))
                            .addComponent(
                                txtUsername,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(46, 46, 46)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(
                                txtPassword,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                jButton1,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                48,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                jButton2,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                44,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(
                        jPanel1,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(
                        jPanel1,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed() { // GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:

    String ID = txtUserID.getText();
    String firstName = txtFirstName.getText();
    String lastName = txtLastName.getText();
    String username = txtUsername.getText();
    String password = txtPassword.getText();

    try {
      Class.forName("com.mysql.jdbc.Driver");
      connection =
          DriverManager.getConnection("jdbc:mysql://localhost/airline", "andrew", "password");
      preparedStatement =
          connection.prepareStatement(
              "INSERT INTO USER (ID, firstName, lastName, username, password) VALUES (?, ?, ?, ?, ?)");

      preparedStatement.setString(1, ID);
      preparedStatement.setString(2, firstName);
      preparedStatement.setString(3, lastName);
      preparedStatement.setString(4, username);
      preparedStatement.setString(5, password);
      preparedStatement.executeUpdate();

      JOptionPane.showMessageDialog(null, "User Created.........");
    } catch (ClassNotFoundException | SQLException ex) {
      Logger.getLogger(addFlight.class.getName()).log(Level.SEVERE, null, ex);
    }
  } // GEN-LAST:event_jButton1ActionPerformed

  private void jButton2ActionPerformed() { // GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    this.hide();
  } // GEN-LAST:event_jButton2ActionPerformed

  public void autoID() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      connection =
          DriverManager.getConnection("jdbc:mysql://localhost/airline", "andrew", "password");
      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery("SELECT MAX(ID) FROM USER");
      resultSet.next();
      resultSet.getString("MAX(id)");
      if (resultSet.getString("MAX(id)") == null) {
        txtUserID.setText("UO001");
      } else {
        long ID = Long.parseLong(resultSet.getString("MAX(id)").substring(2));
        ID++;
        txtUserID.setText("UO" + String.format("%03d", ID));
      }

    } catch (ClassNotFoundException | SQLException ex) {
      Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  private javax.swing.JTextField txtFirstName;
  private javax.swing.JTextField txtLastName;
  private javax.swing.JPasswordField txtPassword;
  private javax.swing.JLabel txtUserID;
  private javax.swing.JTextField txtUsername;
  // End of variables declaration//GEN-END:variables
}
