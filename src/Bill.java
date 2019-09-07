
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BANNY
 */
public class Bill extends javax.swing.JFrame {

    /**
     * Creates new form Bill
     */
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public Bill() {
        initComponents();
        txtWardType.setVisible(false);
        GetRecord();
        
        /*txtAdmitDate.setEditable(false);
        txtBedCharge.setEditable(false);
        txtDischargeDate.setEditable(false);
        txtMediCharge.setEditable(false);
        txtName.setEditable(false);
        txtTotal.setEditable(false);*/
    }
    public float bedcharge(){
        float bed = 0;
        String sql2= "select * from room,dischargepatient_ward where room.WardType= '" + txtWardType.getText() + "' and dischargepatient_ward.PatientID= '" + txtPatientID.getText() + "'";
        
        try
      {
          pst=con.prepareStatement(sql2);
          rs= pst.executeQuery();
          //pst2=con.prepareStatement(sql2);
          //rs2=pst.executeQuery();
          //String s = String.valueOf(rs2);
          //pst3=con.prepareStatement(sql3);
          //rs3=pst.executeQuery();
          if (rs.next()){
             //this.hide();
             /*MainMenuDoctor frm=new MainMenuDoctor();
                frm.setVisible(true);*/
             float x = Float.valueOf(rs.getString("WardCharges"));
             int d1 = Integer.valueOf(rs.getString("DD1"));
             int m1 = Integer.valueOf(rs.getString("MM1"));
             int y1 = Integer.valueOf(rs.getString("YYYY1"));
             int d = Integer.valueOf(rs.getString("DD"));
             int m = Integer.valueOf(rs.getString("MM"));
             int y = Integer.valueOf(rs.getString("YYYY"));
             int DD,MM,YYYY = 0;
             int days = 0;
             
             /*if(m==1||m==3|m==5|m==7|m==8|m==10|m==12) {
                 if(d1>d){
                     DD = 31+d-d1;
                     if(m1>m){
                         MM = 12+m-m1;
                         YYYY = y-y1-1;
                     }
                     else{
                         MM = m-m1;
                         YYYY = y-y1;
                     }
                 }
                 else{
                     DD = d-d1;
                     if(m1>m){
                         MM = 12+m-m1;
                         YYYY = y-y1-1;
                     }
                     else{
                         MM = m-m1;
                         YYYY = y-y1;
                     }
                 }
             }  
             if(m==2) {
                 if(d1>d){
                     DD = 28+d-d1;
                     if(m1>m){
                         MM = 12+m-m1;
                         YYYY = y-y1-1;
                     }
                     else{
                         MM = m-m1;
                         YYYY = y-y1;
                     }
                 }
                 else{
                     DD = d-d1;
                     if(m1>m){
                         MM = 12+m-m1;
                         YYYY = y-y1-1;
                     }
                     else{
                         MM = m-m1;
                         YYYY = y-y1;
                     }
                 }
             }  
             else {
                 if(d1>d){
                     DD = 30+d-d1;
                     if(m1>m){
                         MM = 12+m-m1;
                         YYYY = y-y1-1;
                     }
                     else{
                         MM = m-m1;
                         YYYY = y-y1;
                     }
                 }
                 else{
                     DD = d-d1;
                     if(m1>m){
                         MM = 12+m-m1;
                         YYYY = y-y1-1;
                     }
                     else{
                         MM = m-m1;
                         YYYY = y-y1;
                     }
                 }
             }*/ 
             if(d1>d){
                     DD = 30+d-d1;
                     if(m1>m){
                         MM = 12+m-m1;
                         YYYY = y-y1-1;
                     }
                     else{
                         MM = m-m1;
                         YYYY = y-y1;
                     }
                 }
                 else{
                     DD = d-d1;
                     if(m1>m){
                         MM = 12+m-m1;
                         YYYY = y-y1-1;
                     }
                     else{
                         MM = m-m1;
                         YYYY = y-y1;
                     }
                 }
             days = DD+(MM*30)+(YYYY*365);
             bed = days*x;
          }
          
          else{
              
            JOptionPane.showMessageDialog(null, "Invalid Patient ID..Try again !","Error",JOptionPane.ERROR_MESSAGE);
          }
      }catch(SQLException | HeadlessException e){
         JOptionPane.showMessageDialog(null, e); 
         
          
    } 
        return bed;
    }
private void GetRecord(){
        String sql="select PatientID as 'Patient ID', Status as 'Status' from dischargepatient_ward where Status='Not Paid'";
          try{
              con=Connect.ConnectDB();
         pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
}
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtAdmitDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDischargeDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBedCharge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMediCharge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtWardType = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtServiceCharge = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtOperation = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        radCash = new javax.swing.JRadioButton();
        radCard = new javax.swing.JRadioButton();
        btnOk = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnGetData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Billing"));

        jLabel1.setText("Patient ID :");

        jLabel2.setText("Patient Name :");

        txtPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIDActionPerformed(evt);
            }
        });

        txtName.setEnabled(false);

        btnFind.setText("Find");
        btnFind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFindMouseClicked(evt);
            }
        });
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        jLabel3.setText("Admitted Date :");

        txtAdmitDate.setEnabled(false);

        jLabel4.setText("Discharged Date :");

        txtDischargeDate.setEnabled(false);

        jLabel5.setText("Bed Charges(Rs.) :");

        txtBedCharge.setEnabled(false);

        jLabel6.setText("Medicine Charges(Rs.) :");

        txtMediCharge.setEnabled(false);

        jLabel7.setText("Total (Rs.) :");

        txtTotal.setEnabled(false);

        jLabel9.setText("Service Charge(Rs.) :");

        txtServiceCharge.setEnabled(false);

        jLabel10.setText("Operation Charge :");

        txtOperation.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtServiceCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBedCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMediCharge, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(txtOperation)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFind))
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtAdmitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(txtWardType, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDischargeDate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAdmitDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWardType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDischargeDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBedCharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtMediCharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtServiceCharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Payment"));

        jLabel8.setText("Payment Method :");

        buttonGroup2.add(radCash);
        radCash.setText("Cash");

        buttonGroup2.add(radCard);
        radCard.setText("Credit/Debit Card");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radCard)
                            .addComponent(radCash)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnReset)
                        .addGap(74, 74, 74)
                        .addComponent(btnCancel)))
                .addContainerGap(448, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radCash)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnCancel)
                    .addComponent(btnReset))
                .addContainerGap())
        );

        btnGetData.setText("History");
        btnGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDataActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btnGetData))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnGetData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIDActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtAdmitDate.setText("");
        txtBedCharge.setText("");
        txtDischargeDate.setText("");
        txtMediCharge.setText("");
        txtName.setText("");
        txtPatientID.setText("");
        txtTotal.setText("");
        buttonGroup2.clearSelection();
        txtTotal.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDataActionPerformed
        this.hide();
        PSRecord frm= new PSRecord();
        frm.setVisible(true);
    }//GEN-LAST:event_btnGetDataActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
               

    }//GEN-LAST:event_btnFindActionPerformed

    private void btnFindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindMouseClicked
        // TODO add your handling code here:
        if (txtPatientID.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter Patient ID","Error", JOptionPane.ERROR_MESSAGE);
           return;
            
            }
        con=Connect.ConnectDB();
        String sql= "select * from dischargepatient_ward where PatientID= '" + txtPatientID.getText() + "'";
        //String sql2= "select * from patientregistration where PatientID= '" + txtPatientID.getText() + "'";
        
        try
      {
          pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
          //pst2=con.prepareStatement(sql2);
          //rs2=pst.executeQuery();
          //String s = String.valueOf(rs2);
          //pst3=con.prepareStatement(sql3);
          //rs3=pst.executeQuery();
          if (rs.next()){
             //this.hide();
             /*MainMenuDoctor frm=new MainMenuDoctor();
                frm.setVisible(true);*/
             txtName.setText(rs.getString("Patientname"));
             txtAdmitDate.setText(rs.getString("AdmitDate"));
             txtDischargeDate.setText(rs.getString("DischargeDate"));
             txtWardType.setText(rs.getString("WardType"));
             txtBedCharge.setText(String.valueOf(bedcharge()));
             
             
             String sql2= "select SUM(Charge) from medipa where PatientID= '" + txtPatientID.getText() + "'";
             pst=con.prepareStatement(sql2);
          rs= pst.executeQuery();  
          float x = 0;
          float medi = 0;
          float ser = 0;
          float ope = 0;
          
          if (rs.next()){
              
                      //medi = medi+Float.valueOf(rs.getString("Charge"));
                      if(rs.getString(1)==null){
                          medi = 0;
                      }
                      else
                            medi = Float.valueOf(rs.getString(1));
          }
          txtMediCharge.setText(String.valueOf(medi));
                      
          //String sql3= "select * from services where PatientID= '" + txtPatientID.getText() + "'";
          String sql3= "select SUM(Charge) from services where PatientID= '" + txtPatientID.getText() + "'";
             pst=con.prepareStatement(sql3);
          rs= pst.executeQuery();  
          if (rs.next()){
              
                      //ser = ser+Float.valueOf(rs.getString("Charge"));
                      if(rs.getString(1)==null){
                          ser = 0;
                      }
                      else
                        ser = Float.valueOf(rs.getString(1));
          }
          txtServiceCharge.setText(String.valueOf(ser));
          
          String sql4= "select SUM(Charge) from operations where PatientID= '" + txtPatientID.getText() + "'";
             pst=con.prepareStatement(sql4);
          rs= pst.executeQuery();  
          if (rs.next()){
              
                      //ser = ser+Float.valueOf(rs.getString("Charge"));
                      if(rs.getString(1)==null){
                          ope = 0;
                      }
                      else
                        ope = Float.valueOf(rs.getString(1));
          }
          
              //System.out.println(ser);
              txtOperation.setText(String.valueOf(ope));
          
          x = medi+ser+ope+bedcharge();
          txtTotal.setText(String.valueOf(x));
          }
          
          else{
              
            JOptionPane.showMessageDialog(null, "Invalid Patient ID..Try again !","Error",JOptionPane.ERROR_MESSAGE);
          }
      }catch(SQLException | HeadlessException e){
         JOptionPane.showMessageDialog(null, e); 
         
          
    }          
        
                               
    }//GEN-LAST:event_btnFindMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.hide();
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        if(radCash.isSelected()){
        if(txtPatientID.getText()==""||txtName.getText()==""){
            JOptionPane.showMessageDialog(this,"Please Enter Valid Informations","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
        
            Cash frm = new Cash();
            frm.setVisible(true);
            frm.txtPatientID.setText(txtPatientID.getText());
            frm.txtTotal.setText(txtTotal.getText());
            this.hide();
        }
        
        }
        else if(radCard.isSelected()){
            if(txtPatientID.getText()==""||txtName.getText()==""){
            JOptionPane.showMessageDialog(this,"Please Enter Valid Informations","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
        
            Card frm = new Card();
            frm.setVisible(true);
            frm.txtPatientID.setText(txtPatientID.getText());
            frm.txtTotal.setText(txtTotal.getText());
            this.hide();
        }
        }
        else
            JOptionPane.showMessageDialog(this,"Please Select Payment Method","Error",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnOkActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.hide();
        //this.setVisible(false);
        
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnGetData;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnReset;
    private javax.swing.ButtonGroup buttonGroup2;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radCard;
    private javax.swing.JRadioButton radCash;
    private javax.swing.JTextField txtAdmitDate;
    private javax.swing.JTextField txtBedCharge;
    private javax.swing.JTextField txtDischargeDate;
    private javax.swing.JTextField txtMediCharge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOperation;
    private javax.swing.JTextField txtPatientID;
    public javax.swing.JTextField txtServiceCharge;
    private javax.swing.JTextField txtTotal;
    public javax.swing.JTextField txtWardType;
    // End of variables declaration//GEN-END:variables
}
