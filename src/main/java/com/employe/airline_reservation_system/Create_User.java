/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.employe.airline_reservation_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Create_User extends javax.swing.JInternalFrame {

    
    public Create_User() {
        initComponents();
        autoUserId();
    }
    
        Connection con = null;
        PreparedStatement pre; 
    
    public void autoUserId(){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Qwertyuiop7004633964"); //login connection
            System.out.println("*****Airline_DB_Connected*****");
            Statement s =con.createStatement();
            ResultSet rs=s.executeQuery("SELECT MAX(UserID) FROM USER");//getting max id MAX FROM USER TABLE
            rs.next();
            if(rs.getString("MAX(UserID)")==null){
                userID_TextField.setText("AIRUSER001"); //for the first id this willl excute else another one++
            }
            else{
                long id = Long.parseLong(rs.getString("MAX(UserID)").substring(7, rs.getString("MAX(UserID)").length()));
                id++;
                //AIRUSER001
                userID_TextField.setText("AIRUSER" + String.format("%03d", id)); //print 0 six time then id
            }
            }
        catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(Add_Customer.class.getName()).log(Level.SEVERE,null,ex); 
            
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userID_TextField = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        ADD_BTN = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        LastName = new javax.swing.JTextField();
        Password_textField = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        Emailid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Add New User !");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User ID");

        userID_TextField.setBackground(new java.awt.Color(255, 255, 255));
        userID_TextField.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        userID_TextField.setForeground(new java.awt.Color(255, 204, 51));
        userID_TextField.setText("001");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");

        FirstName.setBackground(new java.awt.Color(0, 102, 102));
        FirstName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FirstName.setForeground(new java.awt.Color(255, 255, 0));

        ADD_BTN.setBackground(new java.awt.Color(255, 153, 0));
        ADD_BTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ADD_BTN.setForeground(new java.awt.Color(255, 255, 255));
        ADD_BTN.setText("Add");
        ADD_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_BTNActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        LastName.setBackground(new java.awt.Color(0, 102, 102));
        LastName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LastName.setForeground(new java.awt.Color(255, 255, 0));

        Password_textField.setBackground(new java.awt.Color(0, 102, 102));
        Password_textField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Password_textField.setForeground(new java.awt.Color(255, 255, 0));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail");

        Emailid.setBackground(new java.awt.Color(0, 102, 102));
        Emailid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Emailid.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ADD_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(FirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LastName, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Emailid, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Password_textField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(userID_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton2)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel3, jLabel4, jLabel5, jLabel7});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Emailid, FirstName, LastName, Password_textField});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(userID_TextField))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(Emailid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Password_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADD_BTN)
                    .addComponent(jButton2))
                .addGap(52, 52, 52))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel3, jLabel4, jLabel5, jLabel7});

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\AirLine_Reservation_System\\imz\\ADDD.png")); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("User");

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("+Add");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel2)
                .addGap(72, 72, 72)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ADD_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD_BTNActionPerformed
        try {
            // TODO add your handling code here:
//sql var(can take any just to store) =  text field var
            String u = userID_TextField.getText();
            String p = Password_textField.getText();
            String e = Emailid.getText();
            String f = FirstName.getText();
            String l =LastName.getText();
            
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Qwertyuiop7004633964"); //login connection
            pre=con.prepareStatement("INSERT INTO user(UserID,Password,Email,fname,lname)values(?,?,?,?,?)");//INSERTING INTO user TABLE
            
            pre.setString(1, u);
            pre.setString(2, p);
            pre.setString(3, e);
            pre.setString(4, f);
            pre.setString(5, l);
            
            pre.execute();
            JOptionPane.showMessageDialog(null,"User Added Successfully.");//MSG DIALOG
            autoUserId();
            
            //RESETING ALL TEXT FIELD SO USER CAN ADD ANOTHER CUSTOMER -------------HERE I CAN ADD A RESET BUTTON AS WELL......
            Password_textField.setText("");
            Emailid.setText("");
            FirstName.setText("");
            LastName.setText("");
          
            
        } catch (ClassNotFoundException | SQLException ex) { //multi catch ..
            Logger.getLogger(Create_User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ADD_BTNActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD_BTN;
    private javax.swing.JTextField Emailid;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JPasswordField Password_textField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel userID_TextField;
    // End of variables declaration//GEN-END:variables
}
