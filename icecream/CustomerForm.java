
package icecream;

import java.awt.Dimension;
import java.awt.Image;
import java.util.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class CustomerForm extends javax.swing.JFrame {

    LoginFrame lf = new LoginFrame();
    private Connection conn;
    private ResultSet rs;
    private Statement st;
    DefaultTableModel model;
    
    String productId;
    String userId;
    int quantity;
    String productQty;

    
    public CustomerForm() {
        initComponents();
        
        productIdField.setEditable(false);
        productNameField.setEditable(false);
        productPriceField.setEditable(false);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buyFrame = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        chartTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productIdField = new javax.swing.JTextField();
        productNameField = new javax.swing.JTextField();
        productPriceField = new javax.swing.JTextField();
        qtySpinner = new javax.swing.JSpinner();
        submitButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        accountBar = new javax.swing.JMenu();
        logoffMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        transactionMenu = new javax.swing.JMenu();
        buyMenu = new javax.swing.JMenuItem();

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Product Price", "Product Stock"
            }
        ));
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        chartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Qty"
            }
        ));
        jScrollPane2.setViewportView(chartTable);

        jLabel1.setText("Product ID");

        jLabel2.setText("Product Name");

        jLabel3.setText("Product Price");

        jLabel4.setText("Qty");

        productPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productPriceFieldActionPerformed(evt);
            }
        });

        submitButton.setText("Add to chart");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        checkoutButton.setText("Checkout");
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        image.setText("jLabel6");

        javax.swing.GroupLayout buyFrameLayout = new javax.swing.GroupLayout(buyFrame.getContentPane());
        buyFrame.getContentPane().setLayout(buyFrameLayout);
        buyFrameLayout.setHorizontalGroup(
            buyFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(buyFrameLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(image)
                .addGap(109, 109, 109)
                .addGroup(buyFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buyFrameLayout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkoutButton)
                        .addContainerGap(155, Short.MAX_VALUE))
                    .addGroup(buyFrameLayout.createSequentialGroup()
                        .addGroup(buyFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buyFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(buyFrameLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(productIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(buyFrameLayout.createSequentialGroup()
                                    .addGroup(buyFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(buyFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(productPriceField)
                                        .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(qtySpinner))))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        buyFrameLayout.setVerticalGroup(
            buyFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buyFrameLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(buyFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(buyFrameLayout.createSequentialGroup()
                        .addGroup(buyFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(productIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(buyFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(buyFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(productPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(buyFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(qtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(image)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(buyFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(removeButton)
                    .addComponent(checkoutButton))
                .addGap(22, 22, 22))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icecream/icecream.jpg"))); // NOI18N

        accountBar.setText("Account");

        logoffMenu.setText("Logoff");
        logoffMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoffMenuActionPerformed(evt);
            }
        });
        accountBar.add(logoffMenu);

        exitMenu.setText("Exit");
        accountBar.add(exitMenu);

        menuBar.add(accountBar);

        transactionMenu.setText("Transaction");

        buyMenu.setText("Buy Product");
        buyMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyMenuActionPerformed(evt);
            }
        });
        transactionMenu.add(buyMenu);

        menuBar.add(transactionMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 726, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 559, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoffMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoffMenuActionPerformed
        this.setVisible(false);
        lf.setVisible(true);
    }//GEN-LAST:event_logoffMenuActionPerformed

    private void buyMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyMenuActionPerformed
        buyFrame.setVisible(true);
        buyFrame.setSize(new Dimension(700,500));
        
        model = (DefaultTableModel) productTable.getModel();

        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/IceCreamStore";
            String username = "root";
            String dBpass = "";

            Connection conn = DriverManager.getConnection(url, username, dBpass);

            String query = "SELECT ProductID, ProductName, ProductPrice, ProductStock FROM product";
            st = conn.prepareStatement(query);
            rs = st.executeQuery(query);

            while (rs.next()) {

                productId = rs.getString("ProductID");
                String name = rs.getString("ProductName");
                String price = rs.getString("ProductPrice");
                String stock = rs.getString("ProductStock");

                model.addRow(new Object[]{productId, name, price, stock});

                productTable.setModel(model);
                
            }
            
            conn.close();
            st.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_buyMenuActionPerformed

    private void productPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productPriceFieldActionPerformed
  
    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        model = (DefaultTableModel) productTable.getModel();

        int selectedRowIndex = productTable.getSelectedRow();

        productIdField.setText(model.getValueAt(selectedRowIndex, 0).toString());
        productNameField.setText(model.getValueAt(selectedRowIndex, 1).toString());
        productPriceField.setText(model.getValueAt(selectedRowIndex, 2).toString());
        
        
        Icon img = new ImageIcon(model.getValueAt(selectedRowIndex, 3).toString());
        image.setIcon(img);
    }//GEN-LAST:event_productTableMouseClicked

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String name = productNameField.getText();
        quantity = (Integer) qtySpinner.getValue();
        model = (DefaultTableModel) chartTable.getModel();

        model.addRow(new Object[]{name, quantity});

        chartTable.setModel(model);
    }//GEN-LAST:event_submitButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        model = (DefaultTableModel) chartTable.getModel();
        int row = chartTable.getSelectedRow();
        model.removeRow(row);
        chartTable.setModel(model);
    }//GEN-LAST:event_removeButtonActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        model = (DefaultTableModel) chartTable.getModel();
        int count = model.getRowCount();
        int countId = 0;
        String generateId = "TR";

        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/IceCreamStore";
            String username = "root";
            String dBpass = "";

            Connection conn = DriverManager.getConnection(url, username, dBpass);
            
            String query = "INSERT INTO headerTransaction (TransactionID, UserID, TransactionDate) values (?,?,?)" ;
            PreparedStatement stmt = conn.prepareStatement(query);
            
            if (count == 0) {
                JOptionPane.showMessageDialog(rootPane, "Chart is empty!");
            } else {
                if (countId < 10) {
                    generateId += "00" + count;
                    count = +1;
                } else if (countId > 10) {
                    generateId += "0" + count;
                    count = +1;
                } else {
                    generateId += count;
                    count = +1;
                }
            }
            stmt.setString(1, generateId);
            System.out.println(userId);
            stmt.setString(2, userId);
  
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentDate = calendar.getTime();
            java.sql.Date sqlDate = new java.sql.Date(currentDate.getTime());
            
            stmt.setDate(3, sqlDate);
            
            stmt.execute();
            stmt.close();
            
            String query2 = "INSERT INTO detailTransaction (TransactionID, ProductID, QTY) values (?,?,?)";
            PreparedStatement st = conn.prepareStatement(query2);
            
            st.setString(1, generateId);
            st.setString(2, productId);
            String qty = Integer.toString(quantity);
            st.setString(3, qty);
            
            st.execute();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_checkoutButtonActionPerformed

   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerForm().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu accountBar;
    private javax.swing.JFrame buyFrame;
    private javax.swing.JMenuItem buyMenu;
    private javax.swing.JTable chartTable;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem logoffMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField productIdField;
    private javax.swing.JTextField productNameField;
    private javax.swing.JTextField productPriceField;
    private javax.swing.JTable productTable;
    private javax.swing.JSpinner qtySpinner;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JMenu transactionMenu;
    // End of variables declaration//GEN-END:variables
}
