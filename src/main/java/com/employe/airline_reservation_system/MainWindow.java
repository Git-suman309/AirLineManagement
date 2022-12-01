/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.employe.airline_reservation_system;

public class MainWindow extends javax.swing.JFrame {

//   boolean isLogin= false;
    public MainWindow() {
        initComponents();
//      setExtendedState(MainWindow.MAXIMIZED_BOTH); //-----full screen mode --------------
       
    }
//    if(isLogin == false){
//    this.setVisible(false);
//}
//    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        Desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Customerx = new javax.swing.JMenu();
        Add_Customer = new javax.swing.JMenuItem();
        Search_Customer = new javax.swing.JMenuItem();
        Add_Flight_Menu = new javax.swing.JMenu();
        Add_Flight = new javax.swing.JMenuItem();
        Book_Flight = new javax.swing.JMenuItem();
        Report = new javax.swing.JMenuItem();
        User = new javax.swing.JMenu();
        Create_User = new javax.swing.JMenuItem();
        parkingArea = new javax.swing.JMenu();
        ParkingArea = new javax.swing.JMenuItem();
        AirportMap = new javax.swing.JMenuItem();
        About_Menu = new javax.swing.JMenu();
        Connect_us = new javax.swing.JMenuItem();
        About = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Airline");
        setBackground(new java.awt.Color(255, 102, 102));
        setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Desktop.setBackground(new java.awt.Color(0, 153, 153));
        Desktop.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                DesktopAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("Welcome To Airline ");

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 946, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(196, 55, 55));
        jLabel11.setText("A");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(74, 93, 74));
        jLabel9.setText("ir");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(196, 55, 55));
        jLabel10.setText("L");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 93, 74));
        jLabel8.setText("ine");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(2, 2, 2)
                .addComponent(jLabel9)
                .addGap(1, 1, 1)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addComponent(jLabel8)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel1)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );

        Desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(Desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 610));

        jMenuBar1.setToolTipText("AirLine Management System");

        Customerx.setText("Customer");
        Customerx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerxActionPerformed(evt);
            }
        });

        Add_Customer.setText("Add Customers");
        Add_Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_CustomerActionPerformed(evt);
            }
        });
        Customerx.add(Add_Customer);

        Search_Customer.setText("Search Customer");
        Search_Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_CustomerActionPerformed(evt);
            }
        });
        Customerx.add(Search_Customer);

        jMenuBar1.add(Customerx);

        Add_Flight_Menu.setText("Flight");

        Add_Flight.setText("Add Flight");
        Add_Flight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_FlightActionPerformed(evt);
            }
        });
        Add_Flight_Menu.add(Add_Flight);

        Book_Flight.setText("Book Flight");
        Book_Flight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_FlightActionPerformed(evt);
            }
        });
        Add_Flight_Menu.add(Book_Flight);

        Report.setText("Report");
        Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportActionPerformed(evt);
            }
        });
        Add_Flight_Menu.add(Report);

        jMenuBar1.add(Add_Flight_Menu);

        User.setText("User");

        Create_User.setText("Create User");
        Create_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_UserActionPerformed(evt);
            }
        });
        User.add(Create_User);

        jMenuBar1.add(User);

        parkingArea.setText("Upcoming");
        parkingArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parkingAreaActionPerformed(evt);
            }
        });

        ParkingArea.setText("Parking Area");
        ParkingArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParkingAreaActionPerformed(evt);
            }
        });
        parkingArea.add(ParkingArea);

        AirportMap.setText("Airport Map");
        AirportMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirportMapActionPerformed(evt);
            }
        });
        parkingArea.add(AirportMap);

        jMenuBar1.add(parkingArea);

        About_Menu.setText("Help");

        Connect_us.setText("Connect Us");
        Connect_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Connect_usActionPerformed(evt);
            }
        });
        About_Menu.add(Connect_us);

        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        About_Menu.add(About);

        jMenuBar1.add(About_Menu);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerxActionPerformed
        // TODO add your handling code here:
        
        
      
    }//GEN-LAST:event_CustomerxActionPerformed

    private void Add_CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_CustomerActionPerformed
        // TODO add your handling code here:
       Add_Customer customer=new Add_Customer();
       Desktop.add(customer); 
       customer.setVisible(true);
       
             
    }//GEN-LAST:event_Add_CustomerActionPerformed

    private void Search_CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_CustomerActionPerformed
        // TODO add your handling code here:
        Search_Customer search=new Search_Customer();
        Desktop.add(search); 
       search.setVisible(true);

    }//GEN-LAST:event_Search_CustomerActionPerformed

    private void ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportActionPerformed
        // TODO add your handling code here:
        Report freport=new Report(); 
        Desktop.add(freport); 
       freport.setVisible(true);
        
    }//GEN-LAST:event_ReportActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        // TODO add your handling code here:
        About aboutapp =new About();
         Desktop.add(aboutapp); 
       aboutapp.setVisible(true);
    }//GEN-LAST:event_AboutActionPerformed

    private void Add_FlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_FlightActionPerformed
        // TODO add your handling code here:
        Add_Flight flight= new Add_Flight();
        Desktop.add(flight); 
       flight.setVisible(true);
    }//GEN-LAST:event_Add_FlightActionPerformed

    private void Book_FlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_FlightActionPerformed
        // TODO add your handling code here:
        Book_Flight bookflight =new Book_Flight();
         Desktop.add(bookflight); 
       bookflight.setVisible(true);
        
    }//GEN-LAST:event_Book_FlightActionPerformed

    private void Create_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_UserActionPerformed
        // TODO add your handling code here:
        Create_User newuser =new Create_User();
        Desktop.add(newuser); 
       newuser.setVisible(true);
    }//GEN-LAST:event_Create_UserActionPerformed

    private void Connect_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Connect_usActionPerformed
        // TODO add your handling code here:
        Connect_us connect=new Connect_us();
        Desktop.add(connect); 
       connect.setVisible(true);
        
    }//GEN-LAST:event_Connect_usActionPerformed

    private void DesktopAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_DesktopAncestorAdded
        // TODO add your handling code here:
        //        setExtendedState(MainWindow.MAXIMIZED_BOTH);
    }//GEN-LAST:event_DesktopAncestorAdded

    private void parkingAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parkingAreaActionPerformed
        // TODO add your handling code here:
        
    
      
    }//GEN-LAST:event_parkingAreaActionPerformed

    private void ParkingAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParkingAreaActionPerformed
        // TODO add your handling code here:
        ParkingArea pa =new ParkingArea();
        Desktop.add(pa); 
        pa.setVisible(true);
    }//GEN-LAST:event_ParkingAreaActionPerformed

    private void AirportMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AirportMapActionPerformed
        // TODO add your handling code here:
        AirportMap map =new AirportMap();
        Desktop.add(map); 
        map.setVisible(true);
    }//GEN-LAST:event_AirportMapActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenu About_Menu;
    private javax.swing.JMenuItem Add_Customer;
    private javax.swing.JMenuItem Add_Flight;
    private javax.swing.JMenu Add_Flight_Menu;
    private javax.swing.JMenuItem AirportMap;
    private javax.swing.JMenuItem Book_Flight;
    private javax.swing.JMenuItem Connect_us;
    private javax.swing.JMenuItem Create_User;
    private javax.swing.JMenu Customerx;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem ParkingArea;
    private javax.swing.JMenuItem Report;
    private javax.swing.JMenuItem Search_Customer;
    private javax.swing.JMenu User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenu parkingArea;
    // End of variables declaration//GEN-END:variables
}
