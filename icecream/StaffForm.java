
package icecream;

import java.awt.Dimension;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class StaffForm extends javax.swing.JFrame {

    LoginFrame lf = new LoginFrame();
    private DefaultTableModel model;
    private Connection conn;
    private ResultSet rs;
    private Statement st;

    
    public StaffForm() {
        initComponents();
        userSubmitButton.setEnabled(false);
        userCancelButton.setEnabled(false);
        userIdField.setEnabled(false);
        roleCombox.setEnabled(false);

        productSubmitButton.setEnabled(false);
        productCancelButton.setEnabled(false);
        productIdField.setEnabled(false);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userFrame = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        userIdField = new javax.swing.JTextField();
        userEmailField = new javax.swing.JTextField();
        userPasswordField = new javax.swing.JTextField();
        monthCombox = new javax.swing.JComboBox<>();
        dateCombox = new javax.swing.JComboBox<>();
        yearCombox = new javax.swing.JComboBox<>();
        userPhoneField = new javax.swing.JTextField();
        userAddressField = new javax.swing.JTextField();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        roleCombox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        userInsertButton = new javax.swing.JButton();
        userUpdateButton = new javax.swing.JButton();
        userDeleteButton = new javax.swing.JButton();
        userSubmitButton = new javax.swing.JButton();
        userCancelButton = new javax.swing.JButton();
        productFrame = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        productIdField = new javax.swing.JTextField();
        productNameField = new javax.swing.JTextField();
        productPriceSpinner = new javax.swing.JSpinner();
        productStockSpinner = new javax.swing.JSpinner();
        productImageField = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        productInsertButton = new javax.swing.JButton();
        productDeleteButton = new javax.swing.JButton();
        productUpdateButton = new javax.swing.JButton();
        productSubmitButton = new javax.swing.JButton();
        productCancelButton = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        viewTransactionFrame = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        userTransactionTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        productTransactionTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logoffButton = new javax.swing.JMenuItem();
        exitButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        userBar = new javax.swing.JMenuItem();
        productBar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        viewTransaction = new javax.swing.JMenuItem();

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Email", "Password", "DOB", "Phone", "Address", "Gender", "Role"
            }
        ));
        jScrollPane1.setViewportView(userTable);

        monthCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "June", "July", "August", "September", "October", "November", "December" }));

        dateCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        yearCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2017", "2018", " " }));

        maleRadio.setText("Male");

        femaleRadio.setText("Female");
        femaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioActionPerformed(evt);
            }
        });

        roleCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Admin" }));

        jLabel1.setText("User ID");

        jLabel2.setText("User Email");

        jLabel3.setText("User Password");

        jLabel4.setText("Date Of Birth");

        jLabel5.setText("Phone");

        jLabel6.setText("Address");

        jLabel7.setText("Gender");

        jLabel8.setText("Role");

        userInsertButton.setText("Insert");
        userInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInsertButtonActionPerformed(evt);
            }
        });

        userUpdateButton.setText("Update");
        userUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userUpdateButtonActionPerformed(evt);
            }
        });

        userDeleteButton.setText("Delete");
        userDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDeleteButtonActionPerformed(evt);
            }
        });

        userSubmitButton.setText("Submit");
        userSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSubmitButtonActionPerformed(evt);
            }
        });

        userCancelButton.setText("Cancel");
        userCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userFrameLayout = new javax.swing.GroupLayout(userFrame.getContentPane());
        userFrame.getContentPane().setLayout(userFrameLayout);
        userFrameLayout.setHorizontalGroup(
            userFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userFrameLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(userFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(userFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(userFrameLayout.createSequentialGroup()
                        .addComponent(maleRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(femaleRadio))
                    .addGroup(userFrameLayout.createSequentialGroup()
                        .addComponent(yearCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userIdField)
                    .addComponent(userEmailField)
                    .addComponent(userPasswordField)
                    .addComponent(userPhoneField)
                    .addComponent(userAddressField)
                    .addComponent(roleCombox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(userFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userInsertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(userDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(userSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(userCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userFrameLayout.setVerticalGroup(
            userFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userFrameLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(userFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(userFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maleRadio)
                    .addComponent(femaleRadio)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(userCancelButton))
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(userFrameLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(userInsertButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userDeleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userUpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userSubmitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Product Price", "Product Stock", "Product Image"
            }
        ));
        jScrollPane2.setViewportView(productTable);

        productPriceSpinner.setModel(new javax.swing.SpinnerNumberModel(1000, 1000, null, 1000));

        productStockSpinner.setModel(new javax.swing.SpinnerNumberModel(10, 10, null, 1));

        jButton6.setText("Choose");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel9.setText("Product ID");

        jLabel10.setText("Product Name");

        jLabel11.setText("Product Price");

        jLabel12.setText("Product Stock");

        jLabel13.setText("Prouct Image");

        productInsertButton.setText("Insert");
        productInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productInsertButtonActionPerformed(evt);
            }
        });

        productDeleteButton.setText("Delete");

        productUpdateButton.setText("Update");
        productUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productUpdateButtonActionPerformed(evt);
            }
        });

        productSubmitButton.setText("Submit");
        productSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productSubmitButtonActionPerformed(evt);
            }
        });

        productCancelButton.setText("Cancel");
        productCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productFrameLayout = new javax.swing.GroupLayout(productFrame.getContentPane());
        productFrame.getContentPane().setLayout(productFrameLayout);
        productFrameLayout.setHorizontalGroup(
            productFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(productFrameLayout.createSequentialGroup()
                .addGroup(productFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productFrameLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(productFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)))
                    .addGroup(productFrameLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(image)))
                .addGap(41, 41, 41)
                .addGroup(productFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(productFrameLayout.createSequentialGroup()
                        .addComponent(productImageField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(productStockSpinner)
                    .addComponent(productPriceSpinner)
                    .addComponent(productNameField)
                    .addComponent(productIdField))
                .addGap(57, 57, 57)
                .addGroup(productFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productUpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productSubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productCancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productInsertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        productFrameLayout.setVerticalGroup(
            productFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productFrameLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(productFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(productFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(productFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productFrameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(productFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productPriceSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(productFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productStockSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(productFrameLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(image)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(productFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productImageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jLabel13))
                .addGap(0, 108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productFrameLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(productInsertButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productDeleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productUpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productSubmitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productCancelButton)
                .addGap(103, 103, 103))
        );

        userTransactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction ID", "User ID", "User Email", "Transaction Date"
            }
        ));
        jScrollPane3.setViewportView(userTransactionTable);

        productTransactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Quantity"
            }
        ));
        jScrollPane4.setViewportView(productTransactionTable);

        javax.swing.GroupLayout viewTransactionFrameLayout = new javax.swing.GroupLayout(viewTransactionFrame.getContentPane());
        viewTransactionFrame.getContentPane().setLayout(viewTransactionFrameLayout);
        viewTransactionFrameLayout.setHorizontalGroup(
            viewTransactionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
            .addComponent(jScrollPane4)
        );
        viewTransactionFrameLayout.setVerticalGroup(
            viewTransactionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewTransactionFrameLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icecream/icecream.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");

        jMenu1.setText("Account");

        logoffButton.setText("Logoff");
        logoffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoffButtonActionPerformed(evt);
            }
        });
        jMenu1.add(logoffButton);

        exitButton.setText("Exit");
        jMenu1.add(exitButton);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Manage");

        userBar.setText("User");
        userBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBarActionPerformed(evt);
            }
        });
        jMenu2.add(userBar);

        productBar.setText("Product");
        productBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productBarActionPerformed(evt);
            }
        });
        jMenu2.add(productBar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Transaction");

        viewTransaction.setText("View Transaction");
        viewTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTransactionActionPerformed(evt);
            }
        });
        jMenu3.add(viewTransaction);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 456, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBarActionPerformed
        userFrame.setVisible(true);
        userFrame.setSize(new Dimension(700, 500));

        model = (DefaultTableModel) userTable.getModel();

        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/IceCreamStore";
            String username = "root";
            String dBpass = "";

            conn = DriverManager.getConnection(url, username, dBpass);

            String query = "SELECT * FROM user";
            st = conn.prepareStatement(query);
            rs = st.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("UserID");
                String email = rs.getString("UserEmail");
                String password = rs.getString("UserPassword");
                String dob = rs.getString("UserDOB");
                String phone = rs.getString("UserPhone");
                String address = rs.getString("UserAddress");
                String gender = rs.getString("UserGender");
                String role = rs.getString("Role");

                model.addRow(new Object[]{id, email, password, dob, phone, address, gender, role});
                userTable.setModel(model);
            }

            conn.close();
            st.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_userBarActionPerformed

    private void productBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productBarActionPerformed
        productFrame.setVisible(true);
        productFrame.setSize(800, 600);

        model = (DefaultTableModel) productTable.getModel();

        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/IceCreamStore";
            String username = "root";
            String dBpass = "";

            conn = DriverManager.getConnection(url, username, dBpass);

            String query = "SELECT * FROM product";

            st = conn.prepareStatement(query);
            rs = st.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("ProductID");
                String name = rs.getString("ProductName");
                String price = rs.getString("ProductPrice");
                String stock = rs.getString("ProductStock");
                String imgsrc = rs.getString("ProductImage");

                model.addRow(new Object[]{id, name, price, stock, imgsrc});
                productTable.setModel(model);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_productBarActionPerformed

    private void viewTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTransactionActionPerformed
        viewTransactionFrame.setVisible(true);
        viewTransactionFrame.setSize(new Dimension(700, 500));

        model = (DefaultTableModel) userTransactionTable.getModel();
        DefaultTableModel model2 = (DefaultTableModel) productTransactionTable.getModel();

        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/IceCreamStore";
            String username = "root";
            String dBpass = "";

            conn = DriverManager.getConnection(url, username, dBpass);

            String query = "SELECT headerTransaction.TransactionID, headerTransaction.UserID, user.UserEmail, headerTransaction.TransactionDate FROM headerTransaction JOIN user WHERE headerTransaction.UserID = user.UserID";
            st = conn.prepareStatement(query);
            rs = st.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("headerTransaction.TransactionID");
                String userId = rs.getString("headerTransaction.UserID");
                String userEmail = rs.getString("user.UserEmail");
                String date = rs.getString("headerTransaction.TransactionDate");

                model.addRow(new Object[]{id, userId, userEmail, date});
                userTransactionTable.setModel(model);
            }
            st.close();
            rs.close();

            String query2 = "SELECT detailTransaction.ProductID, product.ProductName, detailTransaction.Qty FROM product JOIN detailTransaction WHERE product.ProductID = detailTransaction.ProductID";
            st = conn.prepareStatement(query2);
            rs = st.executeQuery(query2);

            while (rs.next()) {
                String productId = rs.getString("detailTransaction.ProductID");
                String productName = rs.getString("product.ProductName");
                String transactionQty = rs.getString("detailTransaction.Qty");

                model2.addRow(new Object[]{productId, productName, transactionQty});
                productTransactionTable.setModel(model);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_viewTransactionActionPerformed

    private void logoffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoffButtonActionPerformed
        lf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoffButtonActionPerformed

    private void femaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioActionPerformed

    }//GEN-LAST:event_femaleRadioActionPerformed

    private void userInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInsertButtonActionPerformed
        userSubmitButton.setEnabled(true);
        userCancelButton.setEnabled(true);

        String generateId = "CU";

        Object lastId = userTable.getValueAt(userTable.getModel().getRowCount() - 1, 0);
        String i = (String) lastId;
        String valueOfLastId = i.substring(4);

        int val = Integer.parseInt(valueOfLastId);
        int genId = val + 1;

        String gen = Integer.toString(genId);

        if (val < 10) {
            generateId += "00" + gen;
        } else if (val > 10) {
            generateId += "0" + gen;
        } else {
            generateId += gen;
        }

        userIdField.setText(generateId);

    }//GEN-LAST:event_userInsertButtonActionPerformed

    private void productInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productInsertButtonActionPerformed
        productSubmitButton.setEnabled(true);
        productCancelButton.setEnabled(true);

        String generateId = "PR";

        Object lastId = productTable.getValueAt(productTable.getModel().getRowCount() - 1, 0);
        String i = (String) lastId;
        String valueOfLastId = i.substring(4);

        int val = Integer.parseInt(valueOfLastId);
        int genId = val + 1;

        String gen = Integer.toString(genId);

        generateId += "00" + gen;

        productIdField.setText(generateId);

        int selectedRowIndex = productTable.getSelectedRow();

        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/IceCreamStore";
            String username = "root";
            String dBpass = "";

            conn = DriverManager.getConnection(url, username, dBpass);

            String query = "INSERT INTO product (ProductID, ProductName, ProductPrice, ProductStock, ProductImage) values (?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, generateId);

            stmt.setString(2, productNameField.getText());

            stmt.setString(3, productPriceSpinner.getValue().toString());

            stmt.setString(4, productStockSpinner.getValue().toString());

            stmt.setString(5, productImageField.getText());

            stmt.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_productInsertButtonActionPerformed

    private void userSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSubmitButtonActionPerformed
        if (userInsertButton.isEnabled() == true) {
            try {
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://127.0.0.1:3306/IceCreamStore";
                String username = "root";
                String dBpass = "";

                conn = DriverManager.getConnection(url, username, dBpass);

                String query = "INSERT INTO user (UserID, UserEmail, UserPassword, UserGender, UserDOB, UserPhone, UserAddress, Role) values (?,?,?,?,?,?,?,?)";
                PreparedStatement stmt = conn.prepareStatement(query);

                stmt.setString(1, userIdField.getText());

                /*Email*/
                String userEmail = userEmailField.getText();

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
                String userPass = userPasswordField.getText();

                stmt.setString(3, userPass);

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
                String phoneNum = userPhoneField.getText();

                if (phoneNum.length() < 11) {
                    JOptionPane.showMessageDialog(rootPane, "Phone", "Kurang dari 11 digit!", JOptionPane.ERROR_MESSAGE);
                } else {
                    stmt.setString(6, phoneNum);
                }

                /*Address*/
                String userAddress = userAddressField.getText();
                stmt.setString(7, userAddress);

                stmt.setString(8, String.valueOf(roleCombox.getSelectedIndex()));

                stmt.execute();

                conn.close();
                stmt.close();

                JOptionPane.showMessageDialog(rootPane, "Register Success");
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            try {
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://127.0.0.1:3306/IceCreamStore";
                String username = "root";
                String dBpass = "";

                conn = DriverManager.getConnection(url, username, dBpass);

                String query = "UPDATE user SET UserID = ?, UserEmail = ?, UserPassword = ?, UserGender = ?, UserDOB = ?, UserPhone = ?, UserAddress = ?, Role = ? WHERE UserID = ?";

                PreparedStatement stmt = conn.prepareStatement(query);

                stmt.setString(1, userIdField.getText());
                stmt.setString(2, userEmailField.getText());
                stmt.setString(3, userPasswordField.getText());

                String gen;
                if (maleRadio.isSelected()) {
                    gen = maleRadio.getText();
                    stmt.setString(4, gen);
                } else {
                    gen = femaleRadio.getText();
                    stmt.setString(4, gen);
                }

                String dateOfBirth;
                dateOfBirth = String.valueOf(yearCombox.getSelectedItem()) + "-" + String.valueOf(monthCombox.getSelectedIndex() + 2) + "-" + String.valueOf(dateCombox.getSelectedItem());
                DateFormat df = new SimpleDateFormat("yyy-MM-dd");
                Date d = df.parse(dateOfBirth);
                java.sql.Date sqlDate = new java.sql.Date(d.getTime());

                stmt.setDate(5, sqlDate);

                stmt.setString(6, userPhoneField.getText());
                stmt.setString(7, userAddressField.getText());
                stmt.setString(8, String.valueOf(roleCombox.getSelectedItem()));

                stmt.setString(9, userIdField.getText());

                stmt.execute();

                conn.close();
                stmt.close();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_userSubmitButtonActionPerformed

    private void userUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userUpdateButtonActionPerformed

        if (userTable.getSelectionModel().isSelectionEmpty() == false) {

            roleCombox.setEnabled(true);
            userInsertButton.setEnabled(false);
            userSubmitButton.setEnabled(true);
            userCancelButton.setEnabled(true);

            model = (DefaultTableModel) userTable.getModel();

            int selectedRowIndex = userTable.getSelectedRow();

            userIdField.setText(model.getValueAt(selectedRowIndex, 0).toString());
            userEmailField.setText(model.getValueAt(selectedRowIndex, 1).toString());
            userPasswordField.setText(model.getValueAt(selectedRowIndex, 2).toString());

            String birthdate = model.getValueAt(selectedRowIndex, 3).toString();
            String year = birthdate.substring(0, 4);
            String month = birthdate.substring(5, 7);
            int m = Integer.parseInt(month);
            int mfix = m - 2;
            String day = birthdate.substring(8);
            yearCombox.setSelectedItem(year);
            monthCombox.setSelectedIndex(mfix);
            dateCombox.setSelectedItem(day);

            userPhoneField.setText(model.getValueAt(selectedRowIndex, 4).toString());
            userAddressField.setText(model.getValueAt(selectedRowIndex, 5).toString());

            String gender = model.getValueAt(selectedRowIndex, 6).toString();
            if (gender.equals("Male")) {
                maleRadio.setSelected(true);
            } else {
                femaleRadio.setSelected(true);
            }

            roleCombox.setSelectedItem(model.getValueAt(selectedRowIndex, 7).toString());

        } else {
            JOptionPane.showMessageDialog(userFrame, "Select the data first!");
        }
    }//GEN-LAST:event_userUpdateButtonActionPerformed

    private void userDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDeleteButtonActionPerformed
        model = (DefaultTableModel) userTable.getModel();

        int selectedRowIndex = userTable.getSelectedRow();

        String id = model.getValueAt(selectedRowIndex, 0).toString();

        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/IceCreamStore";
            String username = "root";
            String dBpass = "";

            conn = DriverManager.getConnection(url, username, dBpass);

            String query = "DELETE FROM user WHERE UserID = ?";

            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, id);

            stmt.execute();

            JOptionPane.showMessageDialog(userFrame, "Deleted!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_userDeleteButtonActionPerformed

    private void productUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productUpdateButtonActionPerformed
        productSubmitButton.setEnabled(true);
        productCancelButton.setEnabled(true);

        int selectedRowIndex = productTable.getSelectedRow();

        productIdField.setText(productTable.getValueAt(selectedRowIndex, 0).toString());
        productNameField.setText(productTable.getValueAt(selectedRowIndex, 1).toString());

        int price = Integer.valueOf(productTable.getValueAt(selectedRowIndex, 2).toString());
        productPriceSpinner.setValue(price);
        int stock = Integer.valueOf(productTable.getValueAt(selectedRowIndex, 3).toString());
        productStockSpinner.setValue(stock);
        
        productImageField.setText(model.getValueAt(selectedRowIndex, 4).toString());
        
        image.setSize(new Dimension(80, 80));
        ImageIcon img = new ImageIcon(model.getValueAt(selectedRowIndex, 4).toString());
        image.setIcon(img);
        
    }//GEN-LAST:event_productUpdateButtonActionPerformed

    private void productSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productSubmitButtonActionPerformed

        if (productInsertButton.isEnabled() == true) {
            try {
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://127.0.0.1:3306/IceCreamStore";
                String username = "root";
                String dBpass = "";

                conn = DriverManager.getConnection(url, username, dBpass);
                
                String query = "INSERT INTO product (ProductID, ProductName, ProductPrice, ProductStock, ProductImage) values (?,?,?,?,?)";
                PreparedStatement stmt = conn.prepareStatement(query);
                
                stmt.setString(1, productIdField.getText());
                stmt.setString(2, productNameField.getText());
                stmt.setString(3, productPriceSpinner.getValue().toString());
                stmt.setString(4, productStockSpinner.getValue().toString());
                stmt.setString(5, productImageField.getText());

                stmt.execute();
                
                
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            try {
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://127.0.0.1:3306/IceCreamStore";
                String username = "root";
                String dBpass = "";

                conn = DriverManager.getConnection(url, username, dBpass);
                
                String query = "UPDATE product SET ProductID = ?, ProductName = ?, ProductPrice = ?, ProductStock = ?, ProductImage = ? ";
                PreparedStatement stmt = conn.prepareStatement(query);
                
                stmt.setString(1, productIdField.getText());
                stmt.setString(2, productNameField.getText());
                stmt.setString(3, productPriceSpinner.getValue().toString());
                stmt.setString(4, productStockSpinner.getValue().toString());
                stmt.setString(5, productImageField.getText());

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_productSubmitButtonActionPerformed

    private void productCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productCancelButtonActionPerformed
        productIdField.setText("");
        productNameField.setText("");
        productPriceSpinner.setValue(1000);
        productStockSpinner.setValue(10);
        productImageField.setText("");
    }//GEN-LAST:event_productCancelButtonActionPerformed

    private void userCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userCancelButtonActionPerformed
        userIdField.setText("");
        userEmailField.setText("");
        userPasswordField.setText("");
        yearCombox.setSelectedIndex(0);
        monthCombox.setSelectedIndex(0);
        dateCombox.setSelectedIndex(0);
        userPhoneField.setText("");
        userAddressField.setText("");
        maleRadio.setSelected(false);
        femaleRadio.setSelected(false);
        roleCombox.setSelectedIndex(0);
    }//GEN-LAST:event_userCancelButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            productImageField.setText(selectedFile.getName());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StaffForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dateCombox;
    private javax.swing.JMenuItem exitButton;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenuItem logoffButton;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JComboBox<String> monthCombox;
    private javax.swing.JMenuItem productBar;
    private javax.swing.JButton productCancelButton;
    private javax.swing.JButton productDeleteButton;
    private javax.swing.JFrame productFrame;
    private javax.swing.JTextField productIdField;
    private javax.swing.JTextField productImageField;
    private javax.swing.JButton productInsertButton;
    private javax.swing.JTextField productNameField;
    private javax.swing.JSpinner productPriceSpinner;
    private javax.swing.JSpinner productStockSpinner;
    private javax.swing.JButton productSubmitButton;
    private javax.swing.JTable productTable;
    private javax.swing.JTable productTransactionTable;
    private javax.swing.JButton productUpdateButton;
    private javax.swing.JComboBox<String> roleCombox;
    private javax.swing.JTextField userAddressField;
    private javax.swing.JMenuItem userBar;
    private javax.swing.JButton userCancelButton;
    private javax.swing.JButton userDeleteButton;
    private javax.swing.JTextField userEmailField;
    private javax.swing.JFrame userFrame;
    private javax.swing.JTextField userIdField;
    private javax.swing.JButton userInsertButton;
    private javax.swing.JTextField userPasswordField;
    private javax.swing.JTextField userPhoneField;
    private javax.swing.JButton userSubmitButton;
    private javax.swing.JTable userTable;
    private javax.swing.JTable userTransactionTable;
    private javax.swing.JButton userUpdateButton;
    private javax.swing.JMenuItem viewTransaction;
    private javax.swing.JFrame viewTransactionFrame;
    private javax.swing.JComboBox<String> yearCombox;
    // End of variables declaration//GEN-END:variables
}
