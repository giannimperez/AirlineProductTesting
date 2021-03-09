import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import static java.awt.Font.BOLD;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class addCustomer extends JInternalFrame {

  /** Creates new form addCustomer */
  public addCustomer() {
    initComponents();
    autoID();
  }

  Connection con;
  PreparedStatement pst;

  String path = null;
  byte[] userImage = null;

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  private void initComponents() {

    jPanel1 = new JPanel();
    jLabel1 = new JLabel();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    jLabel4 = new JLabel();
    jLabel5 = new JLabel();
    txtlastname = new JTextField();
    txtfirstname = new JTextField();
    txtnic = new JTextField();
    txtpassport = new JTextField();
    jScrollPane1 = new JScrollPane();
    txtaddress = new JTextArea();
    jLabel6 = new JLabel();
    txtid = new JLabel();
    jPanel2 = new JPanel();
    jLabel8 = new JLabel();
    jLabel9 = new JLabel();
    jLabel10 = new JLabel();
    r1 = new JRadioButton();
    r2 = new JRadioButton();
    txtcontact = new JTextField();
    txtphoto = new JLabel();
    jButton1 = new JButton();
    jButton2 = new JButton();
    jButton3 = new JButton();
    txtdob = new JDateChooser();

    jPanel1.setBackground(new Color(51, 0, 255));

    jLabel1.setFont(new Font("Tahoma", BOLD, 11));
    jLabel1.setForeground(new Color(255, 255, 255));
    jLabel1.setText("First Name");

    jLabel2.setFont(new Font("Tahoma", BOLD, 11));
    jLabel2.setForeground(new Color(255, 255, 255));
    jLabel2.setText("Last Name");

    jLabel3.setFont(new Font("Tahoma", BOLD, 11));
    jLabel3.setForeground(new Color(255, 255, 255));
    jLabel3.setText("Nic No");

    jLabel4.setFont(new Font("Tahoma", BOLD, 11));
    jLabel4.setForeground(new Color(255, 255, 255));
    jLabel4.setText("Passport ID");

    jLabel5.setFont(new Font("Tahoma", BOLD, 11)); // NOI18N
    jLabel5.setForeground(new Color(255, 255, 255));
    jLabel5.setText("Address");

    txtlastname.addActionListener(this::txtlastnameActionPerformed);

    txtpassport.addActionListener(this::txtpassportActionPerformed);

    txtaddress.setColumns(20);
    txtaddress.setRows(5);
    jScrollPane1.setViewportView(txtaddress);

    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        jPanel1Layout
                                            .createParallelGroup(
                                                GroupLayout.Alignment.LEADING, false)
                                            .addGroup(
                                                jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addGap(47, 47, 47)
                                                    .addComponent(txtfirstname))
                                            .addGroup(
                                                jPanel1Layout
                                                    .createSequentialGroup()
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createParallelGroup(
                                                                GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel5)
                                                            .addComponent(jLabel4)
                                                            .addComponent(jLabel3))
                                                    .addGap(38, 38, 38)
                                                    .addGroup(
                                                        jPanel1Layout
                                                            .createParallelGroup(
                                                                GroupLayout.Alignment.LEADING,
                                                                false)
                                                            .addComponent(jScrollPane1)
                                                            .addComponent(txtpassport)
                                                            .addComponent(txtnic))))
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(
                                jPanel1Layout
                                    .createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(48, 48, 48)
                                    .addComponent(
                                        txtlastname,
                                        GroupLayout.PREFERRED_SIZE,
                                        166,
                                        GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(
                                txtfirstname,
                                GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(
                                txtlastname,
                                GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(
                                txtnic,
                                GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(
                                txtpassport,
                                GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(
                                jScrollPane1,
                                GroupLayout.PREFERRED_SIZE,
                                62,
                                GroupLayout.PREFERRED_SIZE))
                    .addGap(34, 34, 34)));

    jLabel6.setFont(new Font("Tahoma", BOLD, 18));
    jLabel6.setText("Customer ID");

    txtid.setFont(new Font("Tahoma", BOLD, 20));
    txtid.setForeground(new Color(255, 0, 0));
    txtid.setText("jLabel7");

    jPanel2.setBackground(new Color(51, 0, 255));

    jLabel8.setFont(new Font("Tahoma", BOLD, 11));
    jLabel8.setForeground(new Color(255, 255, 255));
    jLabel8.setText("Date of Birth");

    jLabel9.setFont(new Font("Tahoma", BOLD, 11));
    jLabel9.setForeground(new Color(255, 255, 255));
    jLabel9.setText("Gender");

    jLabel10.setFont(new Font("Tahoma", BOLD, 11));
    jLabel10.setForeground(new Color(255, 255, 255));
    jLabel10.setText("Contact");

    r1.setText("Male");

    r2.setText("Female");

    GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel2Layout
                    .createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(
                                jPanel2Layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        jPanel2Layout
                                            .createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                    .addGap(43, 43, 43)
                                    .addGroup(
                                        jPanel2Layout
                                            .createParallelGroup(
                                                GroupLayout.Alignment.LEADING, false)
                                            .addGroup(
                                                jPanel2Layout
                                                    .createParallelGroup(
                                                        GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(
                                                        txtdob,
                                                        GroupLayout.DEFAULT_SIZE,
                                                        174,
                                                        Short.MAX_VALUE))
                                            .addGroup(
                                                jPanel2Layout
                                                    .createSequentialGroup()
                                                    .addComponent(r1)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(r2))
                                            .addComponent(txtcontact))))
                    .addContainerGap(41, Short.MAX_VALUE)));
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel2Layout
                    .createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(
                                txtdob,
                                GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(r1)
                            .addComponent(r2))
                    .addGap(18, 18, 18)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(
                                txtcontact,
                                GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(108, Short.MAX_VALUE)));

    txtphoto.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

    jButton1.setText("Browse");
    jButton1.addActionListener(this::jButton1ActionPerformed);

    jButton2.setText("Add");
    jButton2.addActionListener(this::jButton2ActionPerformed);

    jButton3.setText("Cancel");
    jButton3.addActionListener(this::jButton3ActionPerformed);

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGroup(
                        layout
                            .createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel6)
                                    .addGap(50, 50, 50)
                                    .addComponent(txtid))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(
                                        jPanel1,
                                        GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                GroupLayout.Alignment.LEADING)
                                                            .addGroup(
                                                                layout
                                                                    .createSequentialGroup()
                                                                    .addComponent(
                                                                        jPanel2,
                                                                        GroupLayout.PREFERRED_SIZE,
                                                                        GroupLayout.DEFAULT_SIZE,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(
                                                                        txtphoto,
                                                                        GroupLayout.PREFERRED_SIZE,
                                                                        250,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(
                                                                layout
                                                                    .createSequentialGroup()
                                                                    .addGap(337, 337, 337)
                                                                    .addComponent(
                                                                        jButton1,
                                                                        GroupLayout.PREFERRED_SIZE,
                                                                        87,
                                                                        GroupLayout
                                                                            .PREFERRED_SIZE))))
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addGap(39, 39, 39)
                                                    .addComponent(
                                                        jButton2,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        105,
                                                        GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(
                                                        jButton3,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        100,
                                                        GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(24, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(
                GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(
                        layout
                            .createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtid))
                    .addGap(41, 41, 41)
                    .addGroup(
                        layout
                            .createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(
                                jPanel1,
                                GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                GroupLayout.Alignment.LEADING, false)
                                            .addComponent(
                                                txtphoto,
                                                GroupLayout.DEFAULT_SIZE,
                                                250,
                                                Short.MAX_VALUE)
                                            .addComponent(
                                                jPanel2,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addComponent(
                                        jButton1,
                                        GroupLayout.PREFERRED_SIZE,
                                        33,
                                        GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(
                                        LayoutStyle.ComponentPlacement.RELATED,
                                        GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(
                                                jButton2,
                                                GroupLayout.PREFERRED_SIZE,
                                                38,
                                                GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                jButton3,
                                                GroupLayout.PREFERRED_SIZE,
                                                38,
                                                GroupLayout.PREFERRED_SIZE))))
                    .addGap(49, 49, 49)));
    pack();
  }

  public void autoID() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "password");
      Statement s = con.createStatement();
      ResultSet rs = s.executeQuery("SELECT MAX(ID) FROM CUSTOMER");
      rs.next();
      rs.getString("MAX(ID)");
      if (rs.getString("MAX(ID)") == null) {
        txtid.setText("CS001");
      } else {
        long id = Long.parseLong(rs.getString("MAX(ID)").substring(2));
        id++;
        txtid.setText("CS" + String.format("%03d", id));
      }

    } catch (ClassNotFoundException | SQLException ex) {
      Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  private void txtlastnameActionPerformed(ActionEvent evt) {
    // TODO add your handling code here:
  }

  private void txtpassportActionPerformed(ActionEvent evt) {
    // TODO add your handling code here:
  }

  private void jButton1ActionPerformed(ActionEvent evt) {
    // TODO add your handling code here:

    try {
      JFileChooser picchooser = new JFileChooser();
      picchooser.showOpenDialog(null);
      File pic = picchooser.getSelectedFile();
      FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images", "png", "jpg");
      picchooser.addChoosableFileFilter(filter);
      path = pic.getAbsolutePath();
      BufferedImage img;
      img = ImageIO.read(picchooser.getSelectedFile());
      ImageIcon imageIcon =
          new ImageIcon(
              new ImageIcon(img).getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
      txtphoto.setIcon(imageIcon);

      File image = new File(path);
      FileInputStream fis = new FileInputStream(image);
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      byte[] buff = new byte[1024];
      for (int readNum; (readNum = fis.read(buff)) != -1; ) {
        baos.write(buff, 0, readNum);
      }
      userImage = baos.toByteArray();

    } catch (IOException ex) {
      Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  private void jButton2ActionPerformed(ActionEvent evt) {
    // TODO add your handling code here:

    String id = txtid.getText();
    String firstname = txtfirstname.getText();
    String lastname = txtlastname.getText();
    String nic = txtnic.getText();
    String passport = txtpassport.getText();
    String address = txtaddress.getText();

    DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
    String date = da.format(txtdob.getDate());
    String Gender;

    if (r1.isSelected()) {
      Gender = "Male";
    } else {
      Gender = "Female";
    }

    String contact = txtcontact.getText();

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "password");
      pst =
          con.prepareStatement(
              "INSERT INTO CUSTOMER(ID ,firstName, lastName, NIC, passport, address, DOB, gender, contact, photo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

      pst.setString(1, id);
      pst.setString(2, firstname);
      pst.setString(3, lastname);
      pst.setString(4, nic);
      pst.setString(5, passport);
      pst.setString(6, address);
      pst.setString(7, date);
      pst.setString(8, Gender);
      pst.setString(9, contact);
      pst.setBytes(10, userImage);
      pst.executeUpdate();

      JOptionPane.showMessageDialog(null, "Registration Created.........");
    } catch (ClassNotFoundException | SQLException ex) {
      Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  private void jButton3ActionPerformed(ActionEvent evt) {
    // TODO add your handling code here:
    this.hide();
  }

  // Variables declaration - do not modify //
  private JButton jButton1;
  private JButton jButton2;
  private JButton jButton3;
  private JLabel jLabel1;
  private JLabel jLabel10;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JLabel jLabel5;
  private JLabel jLabel6;
  private JLabel jLabel8;
  private JLabel jLabel9;
  private JPanel jPanel1;
  private JPanel jPanel2;
  private JScrollPane jScrollPane1;
  private JRadioButton r1;
  private JRadioButton r2;
  private JTextArea txtaddress;
  private JTextField txtcontact;
  private JTextField txtfirstname;
  private JLabel txtid;
  private JTextField txtlastname;
  private JTextField txtnic;
  private JTextField txtpassport;
  private JLabel txtphoto;
  private JDateChooser txtdob;
  // End of variables declaration //
}
