/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package package1;

import Struktura.*;

import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

import java.sql.*;


/**
 *
 * @author Elma
 */
public class biblJFrame extends javax.swing.JFrame {

    public boolean connected=false;
    public Connection conn=null;
    public Statement st=null;
    public ResultSet rs=null;
    public PreparedStatement pst=null;
   
    public biblJFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){

                ImageIcon im=new ImageIcon("img.jpg");
                Image i=im.getImage();
                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ADDtoTxtFile = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        response = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        ADDtoDatabase = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADD A BOOK");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("Titulli:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 65, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 159, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setText("Autori:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 65, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 159, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setText("ISBN:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 71, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setText("Publisher:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 79, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("ADD A BOOK");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        ADDtoTxtFile.setBackground(new java.awt.Color(0, 0, 0));
        ADDtoTxtFile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ADDtoTxtFile.setForeground(new java.awt.Color(0, 255, 255));
        ADDtoTxtFile.setText("ADD TO TXT FILE");
        ADDtoTxtFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDtoTxtFileActionPerformed(evt);
            }
        });
        jPanel1.add(ADDtoTxtFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 161, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 159, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 159, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 255));
        jLabel6.setText("Lloji:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 37, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 159, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 255));
        jLabel7.setText("Nr.Faqeve:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 95, -1));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 159, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setText("Rafti:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 73, 22));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 159, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 255, 255));
        jLabel9.setText("Reading Age:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 162, 20));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 159, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 255));
        jLabel10.setText("Program Type/Zhanri:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 175, -1));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 159, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 255, 255));
        jButton2.setText("CONNECT TO DATABASE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, -1, -1));

        response.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        response.setForeground(new java.awt.Color(102, 255, 255));
        response.setText("response");
        jPanel1.add(response, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, 170, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 255, 255));
        jButton3.setText("GO TO MAIN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 137, -1));

        ADDtoDatabase.setBackground(new java.awt.Color(0, 0, 0));
        ADDtoDatabase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ADDtoDatabase.setForeground(new java.awt.Color(0, 255, 255));
        ADDtoDatabase.setText("INSERT TO DATABASE");
        ADDtoDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDtoDatabaseActionPerformed(evt);
            }
        });
        jPanel1.add(ADDtoDatabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void ADDtoTxtFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDtoTxtFileActionPerformed
       //Ky frame sherben per te krijuar nje gui ku ne mund te shtojme nje liber me te dhenat perkatse
       //ne nje txt file
        Object item=ADDtoTxtFile.getText();
        
        String titulli=jTextField1.getText();
        String autori=jTextField2.getText();
        String publisher=jTextField4.getText();
        String ISBN=jTextField3.getText();
        int nrFq=Integer.parseInt(jTextField6.getText());
        int raft=Integer.parseInt(jTextField7.getText());
        int time=0;
        int readingAge=Integer.parseInt(jTextField8.getText());
        String lloji=jTextField5.getText();
        String progrType=jTextField9.getText();
     
        try{
        if(jTextField5.getText().equals("Literature Artistike")){
        
            Liber art=new LiteratureArtistike(titulli, autori, publisher, nrFq, ISBN, raft, readingAge, lloji, progrType, time);
            Llist.add(art);
        }
            try{
                String zhanri=jTextField9.getText();
                System.out.println("Trying to write to file");
               
                FileWriter writer=new FileWriter("out.txt",true);
        
                    writer.write("Literature-Artistike/"+ISBN+"/"+titulli+"/"+autori+"/"+nrFq+"/"+zhanri);
                    writer.close();
                
                   /* JOptionPane.showMessageDialog(null,"Libri eshte shtuar!");//kur shtojm liber shfaqet msg qe libri u shhtua....
                    setVisible(false);
                    new biblJFrame().setVisible(true);*/
            
            }catch(IOException e){
                   JOptionPane.showMessageDialog(null,"ERROR");
        }
        
        if(jTextField5.getText().equals("Enciklopedi")){

           Liber enc=new Enciklopedi(titulli, autori, publisher, nrFq, ISBN, raft, lloji,time);
           Llist.add(enc);
        }
           try{
                
                System.out.println("Trying to write to file");
               
                FileWriter writer=new FileWriter("out.txt",true);
        
                    writer.write("Enciklopedi/"+ISBN+"/"+titulli+"/"+autori+"/"+nrFq+"/"+lloji);
                    writer.close();
                
                   /* JOptionPane.showMessageDialog(null,"Libri eshte shtuar!");//kur shtojm liber shfaqet msg qe libri u shhtua....
                    setVisible(false);
                    new biblJFrame().setVisible(true);*/
            
            }catch(IOException e){
                    JOptionPane.showMessageDialog(null,"ERROR");
            }
           
        if(jTextField5.getText().equals("Fjalor")){

           Liber fjalor=new Fjalor(titulli, autori, publisher, nrFq, ISBN, raft, "anglisht", "spanjisht", "perkthim",time);
           Llist.add(fjalor);
           
           System.out.println(fjalor);
        }
           try{
                String tip=jTextField9.getText();
                System.out.println("Trying to write to file");
               
                FileWriter writer=new FileWriter("out.txt",true);
        
                    writer.write("Enciklopedi/"+ISBN+"/"+titulli+"/"+autori+"/"+nrFq+"/"+tip);
                    writer.close();
                
                    JOptionPane.showMessageDialog(null,"Libri eshte shtuar ne txt file!");//kur shtojm liber shfaqet msg qe libri u shhtua....
                       /* setVisible(false);
                        new biblJFrame().setVisible(true);*/
            }catch(IOException e){
                JOptionPane.showMessageDialog(null,"ERROR");
            }
           
        }catch(NumberFormatException ex){
                System.out.println("Parsing error");
        }
        
    }//GEN-LAST:event_ADDtoTxtFileActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            //connection to database
            String Query="SELECT * FROM biblioteke;";
            
            
           /* Class.forName("com.mysql.jdbc.Driver");*/
            
            conn=DriverManager.getConnection("jdbc:sqlite:bibl.db");
            response.setText("Connected!");
            connected=true;
            System.out.print(connected);
            st=conn.createStatement();
            rs=st.executeQuery(Query);
            while(rs.next()){
            //per aq koh sa skemi arritur ne fund te data te tabels ne database afishojme te dhenat qe kemi ruajtur ne database
                String blloj=rs.getString("Lloji");
                System.out.print(blloj);
            
                String btit=rs.getString("Titulli");
                System.out.print(btit);
            
                String baut=rs.getString("Autori");
                System.out.print(baut);
            
                String bisb=rs.getString("ISBN");
                System.out.print(bisb);
            
                String bnr=rs.getString("NrFq");
                System.out.println(bnr);
            }
            conn.close();
            
            /*JOptionPane.showMessageDialog(null,"Connected to DATABASE!");
            connected=true;
            setVisible(false);*/
        /*    response.setText("Connected!");
            connected=true;
            */
        if(conn != null) conn.close();

        if(st != null) st.close();
            
        }catch(SQLException e){
             response.setText("Error connecting...");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       /*JFrameMain jfMn=new JFrameMain();
        jfMn.show();
        
        dispose();*/
       
       JFrameMain jM=new JFrameMain();
       jM.setVisible(true);
       
       dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ADDtoDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDtoDatabaseActionPerformed
       InsertFunction();
    }//GEN-LAST:event_ADDtoDatabaseActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new biblJFrame().setVisible(true);
            }
        });
    }
            Liber[] Liblist = new Liber[100];
    
            ArrayList <Liber> Llist= new ArrayList<>();
    
    public void InsertFunction(){
         if(response.getText().equals("Connected!")){
            Llist.clear();
            
         try{
           conn=DriverManager.getConnection("jdbc:sqlite:bibl.db");

           String Titulli=jTextField1.getText();
           String Autori=jTextField2.getText();
           String Lloji=jTextField5.getText();
           String ISBN=jTextField3.getText();
           int NrFq=Integer.parseInt(jTextField6.getText());
           
           String insert="INSERT INTO biblioteke VALUES('"+Lloji+"', '"+Titulli+"', '"+Autori+"', '"+ISBN+"',"+NrFq+");";
           System.out.println(insert);
           Statement stmt = conn.createStatement();
           
           stmt.executeUpdate(insert);
           
           /*
           pst.setString(1, jTextField5.getText());
           pst.setString(2, jTextField1.getText());
           pst.setString(3, jTextField2.getText());
           pst.setString(4, jTextField3.getText());
           pst.setString(5, jTextField6.getText());
           pst.execute();
            */
           JOptionPane.showMessageDialog(null,"Inserted Sucesfully");

            conn.close();
    
            
        }catch(SQLException e){
             response.setText("Error connecting...");
        }
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDtoDatabase;
    private javax.swing.JButton ADDtoTxtFile;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel response;
    // End of variables declaration//GEN-END:variables
}
