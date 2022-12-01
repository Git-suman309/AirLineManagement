/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.employe.airline_reservation_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Book_Flight extends javax.swing.JInternalFrame {

    /**
     * Creates new form Book_Flight
     */
    public Book_Flight() {
        initComponents();
        autoTicketid();
    }
    Connection con = null;
    PreparedStatement pre; 
    
    public void autoTicketid(){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Qwertyuiop7004633964"); //login connection
            System.out.println("*****Airline_DB_Connected*****");
            Statement s =con.createStatement();
            ResultSet rs=s.executeQuery("SELECT MAX(Ticket_id) FROM ticketbooking");//getting max id customer
            rs.next();
            if(rs.getString("MAX(Ticket_id)")==null){
                ticket_ID_TextField.setText("22DX001"); //for the first id this willl excute else another one++
            }
            else{
                long id = Long.parseLong(rs.getString("MAX(Ticket_id)").substring(4, rs.getString("MAX(Ticket_id)").length()));
                id++;
                //22DX001
                ticket_ID_TextField.setText("22DX" + String.format("%03d", id)); //print 0 six time then id
            }
            }
        catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(Book_Flight.class.getName()).log(Level.SEVERE,null,ex); 
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        ticket_ID_TextField = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cid_textField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        L_Name = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        FNO = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SelectCombo2 = new javax.swing.JComboBox<>();
        SelectCombo1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        DateText_field = new com.toedter.calendar.JDateChooser();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        CLASS = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        no_of_SEATS = new javax.swing.JSpinner();
        jLabel40 = new javax.swing.JLabel();
        final_price = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        Pass_id = new javax.swing.JLabel();
        F_name = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        DTIME = new javax.swing.JLabel();
        FNAME = new javax.swing.JLabel();
        PRICE = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Ticket Booking");

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\AirLine_Reservation_System\\imz\\WHERETOWHERE.png")); // NOI18N

        jTable1.setBackground(new java.awt.Color(0, 51, 51));
        jTable1.setForeground(new java.awt.Color(255, 255, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight No", "Name", "Source", "Dept.", "Date", "D Time", "A Time", "Price"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTable1.setSelectionForeground(new java.awt.Color(0, 255, 51));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("|");

        ticket_ID_TextField.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        ticket_ID_TextField.setForeground(new java.awt.Color(255, 255, 51));
        ticket_ID_TextField.setText("22DX001");

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("|");

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("-------------------------");

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("|");

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("|");

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("|");

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ticket NO");

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Customer ID");

        cid_textField.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        cid_textField.setText("CID22N000001");
        cid_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cid_textFieldActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        L_Name.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        L_Name.setForeground(new java.awt.Color(204, 204, 204));
        L_Name.setText("_____________");

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Passport NO");

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("|");

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("|");

        FNO.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        FNO.setForeground(new java.awt.Color(255, 255, 51));
        FNO.setText("__________");

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("-------------------------");

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("-------------------------");

        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("|");

        jLabel22.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("|");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("From Where ");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("To Where ");

        SelectCombo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "United States", "Germany", "Russia", "Ireland", "United Kingdom", "Japan", "China", "Canada", "Turkey", "Germany", "Brazil", "India" }));

        SelectCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "India", "United States", "China", "Ireland", "United Kingdom", "Japan", "Russia", "Turkey", "Germany", "Brazil", "Canada", " " }));

        jButton2.setBackground(new java.awt.Color(0, 204, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search Flight");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("-------------------------");

        jLabel24.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("------------------------------");

        jLabel25.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("--------------------------------------");

        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("|");

        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("|");

        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("|");

        jLabel29.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("|");

        jLabel30.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("|");

        jLabel31.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("|");

        jLabel32.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("|");

        jLabel33.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("|");

        jLabel34.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("|");

        jLabel35.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Date");

        jLabel36.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Class");

        jLabel37.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Depart. Time");

        CLASS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Business", "First" }));

        jLabel38.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Price");

        jLabel39.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Seats");

        no_of_SEATS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                no_of_SEATSStateChanged(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Final Price");

        final_price.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        final_price.setForeground(new java.awt.Color(255, 255, 51));
        final_price.setText("24000");

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 204, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Book Tickets");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("--------------------------------------");

        jLabel44.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("------------------------------");

        jLabel45.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("|");

        jLabel46.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("|");

        jLabel47.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("|");

        jLabel48.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("|");

        jLabel49.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("|");

        jLabel50.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("|");

        jLabel51.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("|");

        jLabel52.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("|");

        jLabel53.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Name");

        Pass_id.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        Pass_id.setForeground(new java.awt.Color(204, 204, 204));
        Pass_id.setText("_____________");

        F_name.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        F_name.setForeground(new java.awt.Color(204, 204, 204));
        F_name.setText("_____________");

        jLabel56.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Flight No");

        jLabel59.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Flight Name");

        DTIME.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        DTIME.setForeground(new java.awt.Color(255, 255, 51));
        DTIME.setText("__________");

        FNAME.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        FNAME.setForeground(new java.awt.Color(255, 255, 51));
        FNAME.setText("__________");

        PRICE.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        PRICE.setForeground(new java.awt.Color(255, 255, 51));
        PRICE.setText("__________");

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(74, 93, 74));
        jLabel17.setText("ir");

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(196, 55, 55));
        jLabel18.setText("A");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DTIME, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(18, 18, 18)
                        .addComponent(FNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel36)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(FNO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(no_of_SEATS, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(CLASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DateText_field, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(150, 150, 150)
                                    .addComponent(final_price))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel40))
                                .addComponent(jLabel44)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(120, 120, 120)
                                    .addComponent(jButton3))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton4))
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel17)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel41)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel42)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel3))
                    .addComponent(jLabel25)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel1))
                                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(SelectCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(30, 30, 30)
                                        .addComponent(SelectCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel43)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(270, 270, 270)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(270, 270, 270)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel11))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(ticket_ID_TextField))
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(610, 610, 610)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel53)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(F_name, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(L_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Pass_id, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cid_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel56, jLabel59});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DTIME, jLabel37});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel1))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel31)))
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel32))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(SelectCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(SelectCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel26)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel27)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel28))
                            .addComponent(jLabel43))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel29))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel11))
                                            .addComponent(jLabel9))
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel21))
                                            .addComponent(jLabel19)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel22))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel20))))
                                    .addComponent(jLabel23)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(ticket_ID_TextField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel7))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel8))
                                .addGap(15, 15, 15)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel14)
                                    .addComponent(Pass_id))))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel56)
                                    .addComponent(FNO))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel59)
                                    .addComponent(FNAME))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel37)
                                    .addComponent(DTIME))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel36)
                                    .addComponent(CLASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(PRICE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(no_of_SEATS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel39))))
                            .addComponent(jLabel35)
                            .addComponent(DateText_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel53))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cid_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(F_name)
                                    .addComponent(L_Name))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel49)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel50)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel51)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(final_price))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel40))
                            .addComponent(jLabel44)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel45))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel46)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel48))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton4))
                            .addComponent(jLabel47)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel24)))))
                .addGap(50, 50, 50))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DTIME, FNAME, FNO, jLabel37, jLabel56, jLabel59});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CLASS, jLabel36});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {PRICE, jLabel38});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel39, no_of_SEATS});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        try {
            String source = SelectCombo1.getSelectedItem().toString().trim(); //trim just remove spaces
            String dept = SelectCombo2.getSelectedItem().toString().trim();
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Qwertyuiop7004633964"); //login connection
            pre=con.prepareStatement("SELECT * FROM airline.flight where source = ? and dept = ?");//getting from flight TABLE
            pre.setString(1,source );
            pre.setString(2,dept );
            ResultSet rs = pre.executeQuery();

            ResultSetMetaData rsm =rs.getMetaData();  //this will display into table
            int c;
            c = rsm.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);

            while(rs.next()){
                Vector v2= new Vector();
                for(int i=1; i<=c; i++){
                    v2.add(rs.getString("flyid"));
                    v2.add(rs.getString("flightname"));
                    v2.add(rs.getString("source"));
                    v2.add(rs.getString("dept"));
                    v2.add(rs.getString("date"));
                    v2.add(rs.getString("arrvTime"));
                    v2.add(rs.getString("deptTime"));
                    v2.add(rs.getString("price"));
                }
                df.addRow(v2); //SHOW RESULT
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Book_Flight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        //getting details with cid
        //txtfieldname
        String id=cid_textField.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Qwertyuiop7004633964"); //login connection
            pre=con.prepareStatement("SELECT * FROM airline.customer WHERE idcustomer = ?");//searching INTO CUSTOMER TABLE
            System.out.println("table connected");
            pre.setString(1,id);
            ResultSet rs = pre.executeQuery();

            if(rs.next()==false){ //if not present show user not found
                JOptionPane.showMessageDialog(this,"User not found.");//MSG DIALOG
            }
            else{//getting data from db

                //    unknown var
                String first =rs.getString("fname") ;
                String last =rs.getString("lname") ;
                String pass =rs.getString("pid") ;

                //text field var   unknown var
                F_name.setText(first);
                L_Name.setText(last);
                Pass_id.setText(pass);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Book_Flight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cid_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cid_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cid_textFieldActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel)jTable1.getModel(); //this will show after clicked in table
        int selectIndex = jTable1.getSelectedRow();

        FNO.setText(df.getValueAt(selectIndex, 0).toString());
        FNAME.setText(df.getValueAt(selectIndex, 1).toString());
        DTIME.setText(df.getValueAt(selectIndex, 5).toString());
        PRICE.setText(df.getValueAt(selectIndex, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void no_of_SEATSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_no_of_SEATSStateChanged
        // TODO add your handling code here:
        int price = Integer.parseInt(PRICE.getText());
        int qty = Integer.parseInt(no_of_SEATS.getValue().toString());
        
        int total_price = Math.abs(price*qty);
        
        final_price.setText(String.valueOf(total_price));
        
        
    }//GEN-LAST:event_no_of_SEATSStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
           try{
            //adding btn into sql
            String flight_ID=FNO.getText();  
            String ticket_ID=ticket_ID_TextField.getText();
            String cid=cid_textField.getText();
            String Flight_class=CLASS.getSelectedItem().toString().trim();
            String total_price=final_price.getText();
            String total_seats=no_of_SEATS.getValue().toString();
            
            DateFormat da=new SimpleDateFormat("yyyy-MM-dd");
            String Live_Date=da.format(DateText_field.getDate());
            
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Qwertyuiop7004633964"); //login connection
            pre=con.prepareStatement("INSERT INTO ticketbooking(Ticket_id,flightid,cid,class,price,seats,date)values(?,?,?,?,?,?,?)");//INSERTING INTO CUSTOMER TABLE
            pre.setString(1,ticket_ID);
            pre.setString(2,flight_ID);
            pre.setString(3,cid);
            pre.setString(4,Flight_class);
            pre.setString(5,total_price);
            pre.setString(6,total_seats);
            pre.setString(7,Live_Date);
           
            
            
            pre.executeUpdate(); //SIMPLY EXCUTING QUERY
            JOptionPane.showMessageDialog(null,"Ticket Booked Successfully.");//MSG DIALOG
            autoTicketid(); //AUTO UPDATE fid 
//            //RESETING ALL TEXT FIELD SO USER CAN ADD ANOTHER CUSTOMER -------------HERE I CAN ADD A RESET BUTTON AS WELL......
//            FlightName.setSelectedItem("Air Asia Airlines");
//            SourceName.setSelectedItem("India");
//            DeptLocation.setSelectedItem("United States");
//            ArrivalTime.setText("");
//            DeptTime.setText("");
//            FlightPrice.setText("");
            
            
            
        }
         catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(Add_Flight.class.getName()).log(Level.SEVERE,null,ex); 
            
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CLASS;
    private javax.swing.JLabel DTIME;
    private com.toedter.calendar.JDateChooser DateText_field;
    private javax.swing.JLabel FNAME;
    private javax.swing.JLabel FNO;
    private javax.swing.JLabel F_name;
    private javax.swing.JLabel L_Name;
    private javax.swing.JLabel PRICE;
    private javax.swing.JLabel Pass_id;
    private javax.swing.JComboBox<String> SelectCombo1;
    private javax.swing.JComboBox<String> SelectCombo2;
    private javax.swing.JTextField cid_textField;
    private javax.swing.JLabel final_price;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner no_of_SEATS;
    private javax.swing.JLabel ticket_ID_TextField;
    // End of variables declaration//GEN-END:variables
}
