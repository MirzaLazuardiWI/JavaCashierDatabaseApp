
package icecream;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterFrame extends javax.swing.JFrame {

    
    LoginFrame lf = new LoginFrame();
    private Connection con;
    private ResultSet rs;
    int counter = 000;

    public RegisterFrame() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup()
        ;
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        yearCombox = new javax.swing.JComboBox<>();
        monthCombox = new javax.swing.JComboBox<>();
        dateCombox = new javax.swing.JComboBox<>();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        password = new javax.swing.JPasswordField();
        confirmPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Register");

        jLabel2.setText("Email");

        jLabel3.setText("Password");

        jLabel4.setText("Confirm Password");

        jLabel5.setText("Date Of Birth");

        jLabel6.setText("Phone Number");

        jLabel7.setText("Address");

        jLabel8.setText("Gender");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        yearCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2017", "2018", " ", " " }));

        monthCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "June", "July", "August", "September", "October", "November", "December" }));

        dateCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        maleRadio.setText("Male");

        femaleRadio.setText("Female");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phone)
                                    .addComponent(address)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(yearCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(monthCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dateCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(email)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(maleRadio)
                                                .addGap(18, 18, 18)
                                                .addComponent(femaleRadio))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(submitButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(cancelButton))))
                                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confirmPassword)))))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(yearCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maleRadio)
                        .addComponent(femaleRadio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void groupButton() {
        buttonGroup1.add(maleRadio);
        buttonGroup1.add(femaleRadio);
    }
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        lf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/IceCreamStore";
            String username = "root";
            String dBpass = "";

            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, dBpass);

            String query = "INSERT INTO user (UserID, UserEmail, UserPassword, UserGender, UserDOB, UserPhone, UserAddress, Role) values (?,?,?,?,?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(query);
            
            /*UserId*/
            this.counter += 1;
            String generateID;
            if(this.counter < 10){
                generateID = "CU00" + counter;
                
            }else if(this.counter > 10){
                generateID = "CU0" + counter;
            }else{
                generateID = "CU" + counter;
            }
            
            stmt.setString(1, generateID);
            
            /*Email*/
            String userEmail = email.getText();
            
            
            Pattern letter = Pattern.compile(".com");
            Pattern special = Pattern.compile("@");

            Matcher hasLetter = letter.matcher(userEmail);
            Matcher hasSpecial = special.matcher(userEmail);

            boolean b = hasLetter.find();
            boolean c = hasSpecial.find();

            if (b == true) {
                if (c == true) {
                    stmt.setString(2, userEmail);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Doesn't contain '@'", "alert!", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Doesn't contain '@'", "alert!", JOptionPane.ERROR_MESSAGE);
            }
            
            /*Password*/
            char[] userPass = password.getPassword();
            char[] userConfirmPass = confirmPassword.getPassword();

            String pass1 = new String(password.getPassword());
            String pass2 = new String(confirmPassword.getPassword());

            String checkPass = userPass.toString();

            Pattern alphanumeric = Pattern.compile("[A-Za-z0-9]");
            Matcher isAlphanumeric = alphanumeric.matcher(checkPass);
            boolean a = isAlphanumeric.find();

            if (a == true) {
                if (pass1.equals(pass2)) {
                    stmt.setString(3, pass1);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Password Tidak Sama!", "Alert!", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Password harus dalam format alphanumeric", "Alert!", JOptionPane.ERROR_MESSAGE);
            }
            
            /*Gender*/
            String gender;
            if (maleRadio.isSelected()) {
                gender = maleRadio.getText();
                stmt.setString(4, gender);
            } else {
                gender = femaleRadio.getText();
                stmt.setString(4, gender);
            }
            
            /*Date of birth*/
            String dateOfBirth;
            dateOfBirth = String.valueOf(yearCombox.getSelectedItem()) + "-" + String.valueOf(monthCombox.getSelectedIndex()) + "-" + String.valueOf(dateCombox.getSelectedItem());
            DateFormat df = new SimpleDateFormat("yyy-MM-dd");
            Date d = df.parse(dateOfBirth);
            java.sql.Date sqlDate = new java.sql.Date(d.getTime());
            
            stmt.setDate(5, sqlDate);
            
            /*Phone Number*/
            String phoneNum = phone.getText();

            if (phoneNum.length() < 11) {
                JOptionPane.showMessageDialog(rootPane, "Phone", "Kurang dari 11 digit!", JOptionPane.ERROR_MESSAGE);
            }else{
                stmt.setString(6, phoneNum);
            }
            
            /*Address*/
            String userAddress = address.getText();
            stmt.setString(7, userAddress);
            
            stmt.setString(8, "Customer");
            
            stmt.execute();
            
            conn.close();
            stmt.close();
            
            JOptionPane.showMessageDialog(rootPane, "Register Success");
            
            this.setVisible(false);
            lf.setVisible(true);
            
        } catch (Exception e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_submitButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JComboBox<String> dateCombox;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JComboBox<String> monthCombox;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JButton submitButton;
    private javax.swing.JComboBox<String> yearCombox;
    // End of variables declaration//GEN-END:variables
}
