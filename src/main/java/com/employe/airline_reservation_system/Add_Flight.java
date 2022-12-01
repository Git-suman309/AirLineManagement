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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Add_Flight extends javax.swing.JInternalFrame {

    /**
     * Creates new form Add_Flight
     */
    public Add_Flight() {
        initComponents();
        FlightID();
    }
    //FLIGHT_ID_TEXTFIELD
    Connection con = null;
    PreparedStatement pre; 
    
    public void FlightID(){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Qwertyuiop7004633964"); //login connection
            System.out.println("*****Airline_DB_Connected*****");
            Statement s =con.createStatement();
            ResultSet rs=s.executeQuery("SELECT MAX(flyid) FROM flight");//getting max id customer
            rs.next();
            if(rs.getString("MAX(flyid)")==null){
                FLIGHT_ID_TEXTFIELD.setText("FID22001"); //for the first id this willl excute else another one++
            }
            else{
                long id = Long.parseLong(rs.getString("MAX(flyid)").substring(6, rs.getString("MAX(flyid)").length()));
                id++;
                //FID22001
                FLIGHT_ID_TEXTFIELD.setText("FID22" + String.format("%03d", id)); //print 0 six time then id
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
        jLabel2 = new javax.swing.JLabel();
        DeptTime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LiveDate = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        FlightPrice = new javax.swing.JTextField();
        ArrivalTime = new javax.swing.JTextField();
        FLIGHT_ID_TEXTFIELD = new javax.swing.JLabel();
        SourceName = new javax.swing.JComboBox<>();
        DeptLocation = new javax.swing.JComboBox<>();
        FlightName = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Add Flight");

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Flight ID");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Flight Name");

        DeptTime.setBackground(new java.awt.Color(0, 102, 102));
        DeptTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeptTime.setForeground(new java.awt.Color(255, 255, 0));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Flight Charge");

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Arrival Time");

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dept. Time");

        LiveDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setBackground(new java.awt.Color(0, 255, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Departure");

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Source");

        FlightPrice.setBackground(new java.awt.Color(0, 102, 102));
        FlightPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FlightPrice.setForeground(new java.awt.Color(255, 255, 0));

        ArrivalTime.setBackground(new java.awt.Color(0, 102, 102));
        ArrivalTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ArrivalTime.setForeground(new java.awt.Color(255, 255, 0));

        FLIGHT_ID_TEXTFIELD.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20)); // NOI18N
        FLIGHT_ID_TEXTFIELD.setForeground(new java.awt.Color(255, 255, 51));
        FLIGHT_ID_TEXTFIELD.setText("FLYID");

        SourceName.setBackground(new java.awt.Color(0, 102, 102));
        SourceName.setEditable(true);
        SourceName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SourceName.setForeground(new java.awt.Color(255, 255, 0));
        SourceName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "India", "United States", "China", "Ireland", "United Kingdom", "Japan", "Russia", "Turkey", "Germany", "Brazil", "Canada", " ", " " }));

        DeptLocation.setBackground(new java.awt.Color(0, 102, 102));
        DeptLocation.setEditable(true);
        DeptLocation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeptLocation.setForeground(new java.awt.Color(255, 255, 0));
        DeptLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "United States", "Germany", "Russia", "Ireland", "United Kingdom", "Japan", "China", "Canada", "Turkey", "Germany", "Brazil", "India" }));

        FlightName.setBackground(new java.awt.Color(0, 102, 102));
        FlightName.setEditable(true);
        FlightName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FlightName.setForeground(new java.awt.Color(255, 255, 0));
        FlightName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Air Asia Airlines", "Jet Airways", "Indigo Airlines", "Spicejet Airlines", "International Airlines", "Emirates Airlines", "Virgin Atlantic", "British Airways", "Qatar Airways", "Malindo Air", "Tiger Airways" }));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Add Live Flight");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FLIGHT_ID_TEXTFIELD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SourceName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeptLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FlightName, 0, 147, Short.MAX_VALUE)))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(FlightPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addComponent(LiveDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeptTime))
                .addGap(37, 37, 37))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DeptTime, FlightPrice, jLabel2, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel4});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(ArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(LiveDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(FlightPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(DeptTime, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(FLIGHT_ID_TEXTFIELD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(FlightName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SourceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(DeptLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(73, 73, 73))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ArrivalTime, DeptTime, FlightPrice, LiveDate, jLabel1, jLabel2, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 44, 750, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            //adding btn into sql
            String flight_ID=FLIGHT_ID_TEXTFIELD.getText();
            String Flight_name=FlightName.getSelectedItem().toString().trim();
            String Source_name=SourceName.getSelectedItem().toString().trim();
            String Dept_Location=DeptLocation.getSelectedItem().toString().trim();
            String arrv_Time=ArrivalTime.getText();
            String Dept_Time=DeptTime.getText();
            String Flight_Price=FlightPrice.getText();
            
            DateFormat da=new SimpleDateFormat("yyyy-MM-dd");
            String Live_Date=da.format(LiveDate.getDate());
            
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Qwertyuiop7004633964"); //login connection
            pre=con.prepareStatement("INSERT INTO flight(flyid,flightname,source,dept,date,arrvTime,deptTime,price)values(?,?,?,?,?,?,?,?)");//INSERTING INTO CUSTOMER TABLE
            pre.setString(1,flight_ID);
            pre.setString(2,Flight_name);
            pre.setString(3,Source_name);
            pre.setString(4,Dept_Location);
            pre.setString(5,Live_Date);
            pre.setString(6,arrv_Time);
            pre.setString(7,Dept_Time);
            pre.setString(8,Flight_Price);
            //UPDATE DATE
            
            pre.executeUpdate(); //SIMPLY EXCUTING QUERY
            JOptionPane.showMessageDialog(null,"Flight added Successfully.");//MSG DIALOG
            FlightID(); //AUTO UPDATE fid 
            //RESETING ALL TEXT FIELD SO USER CAN ADD ANOTHER CUSTOMER -------------HERE I CAN ADD A RESET BUTTON AS WELL......
            FlightName.setSelectedItem("Air Asia Airlines");
            SourceName.setSelectedItem("India");
            DeptLocation.setSelectedItem("United States");
            ArrivalTime.setText("");
            DeptTime.setText("");
            FlightPrice.setText("");
            
            
            
        }
         catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(Add_Flight.class.getName()).log(Level.SEVERE,null,ex); 
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ArrivalTime;
    private javax.swing.JComboBox<String> DeptLocation;
    private javax.swing.JTextField DeptTime;
    private javax.swing.JLabel FLIGHT_ID_TEXTFIELD;
    private javax.swing.JComboBox<String> FlightName;
    private javax.swing.JTextField FlightPrice;
    private com.toedter.calendar.JDateChooser LiveDate;
    private javax.swing.JComboBox<String> SourceName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
