/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.employe.airline_reservation_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Login_win extends javax.swing.JFrame {

    /**
     * Creates new form Login_win
     */
    public Login_win() {
        initComponents();
    }
        Connection con = null;
        PreparedStatement pre; 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        email_textField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        password_textField = new javax.swing.JPasswordField();
        email = new javax.swing.JLabel();
        emailset = new javax.swing.JLabel();
        passset = new javax.swing.JLabel();
        checkbox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login | AirLine");

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 610));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email - ID");

        email_textField.setBackground(new java.awt.Color(0, 102, 102));
        email_textField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email_textField.setForeground(new java.awt.Color(0, 255, 0));
        email_textField.setCaretColor(new java.awt.Color(255, 255, 255));
        email_textField.setDisabledTextColor(new java.awt.Color(0, 255, 0));
        email_textField.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        email_textField.setSelectionColor(new java.awt.Color(102, 102, 102));
        email_textField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                email_textFieldMouseClicked(evt);
            }
        });
        email_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 51));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        password_textField.setBackground(new java.awt.Color(0, 102, 102));
        password_textField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        password_textField.setForeground(new java.awt.Color(0, 255, 0));

        email.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));

        emailset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        emailset.setForeground(new java.awt.Color(255, 255, 0));
        emailset.setText(" ");
        emailset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emailsetMouseEntered(evt);
            }
        });

        passset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passset.setForeground(new java.awt.Color(255, 255, 0));
        passset.setText(" ");
        passset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passsetMouseEntered(evt);
            }
        });

        checkbox1.setForeground(new java.awt.Color(153, 255, 153));
        checkbox1.setText("Show Password");
        checkbox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkbox1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jButton1)))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(password_textField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(email_textField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkbox1, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jButton2))))
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailset, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passset, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {email_textField, password_textField});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {emailset, passset});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(email_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailset, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(password_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passset, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(checkbox1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(42, 42, 42))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {email_textField, password_textField});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {emailset, passset});

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\AirLine_Reservation_System\\imz\\login.png")); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("L");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("ogin");

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(196, 55, 55));
        jLabel18.setText("A");

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(74, 93, 74));
        jLabel17.setText("ir");

        jLabel41.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(196, 55, 55));
        jLabel41.setText("L");

        jLabel42.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(74, 93, 74));
        jLabel42.setText("ine");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel9)
                        .addGap(143, 143, 143)
                        .addComponent(jLabel18)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel17)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel41)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel42))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addGap(90, 367, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String email = email_textField.getText();
        String pass = password_textField.getText();
        
        if(email.isEmpty() || pass.isEmpty()){
            JOptionPane.showMessageDialog(this,"Why Hurry! PLZ Fill Both Field");//MSG DIALOG
        }
        else{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Qwertyuiop7004633964"); //login connection 
                pre=con.prepareStatement("select * from user where Email = ? AND Password = ?");
                pre.setString(1, email);
                pre.setString(2, pass);
                
                ResultSet rs = pre.executeQuery();
                if(rs.next()){
                    MainWindow mw =new MainWindow();
                    this.hide();
                    mw.setVisible(true);
                    
                }
                else{
                   JOptionPane.showMessageDialog(this,"Id Or Password do not Match !");//MSG DIALOG 
                   email_textField.setText("");
                   password_textField.setText("");
                   email_textField.requestFocus();
                }
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Login_win.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void email_textFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_textFieldMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_email_textFieldMouseClicked

    private void emailsetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailsetMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_emailsetMouseEntered

    private void email_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_textFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_email_textFieldActionPerformed

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
        emailset.setText("*");
        passset.setText("*");
    }//GEN-LAST:event_jPanel2MouseEntered

    private void passsetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passsetMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_passsetMouseEntered

    private void checkbox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkbox1MouseClicked
        // TODO add your handling code here:
        if(checkbox1.isSelected()){
            password_textField.setEchoChar((char)0);
        }
        else{
            password_textField.setEchoChar('*');
        }
        
        
    }//GEN-LAST:event_checkbox1MouseClicked

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
            java.util.logging.Logger.getLogger(Login_win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_win.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_win().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkbox1;
    private javax.swing.JLabel email;
    private javax.swing.JTextField email_textField;
    private javax.swing.JLabel emailset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel passset;
    private javax.swing.JPasswordField password_textField;
    // End of variables declaration//GEN-END:variables
}
