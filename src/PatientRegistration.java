
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class PatientRegistration extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    
    public PatientRegistration() {
        initComponents();
        setLocationRelativeTo(null);
        txtPatientID.setVisible(false);
    }
private void Reset()
{
    txtPatientID.setText("");
    txtPatientName.setText("");
    txtFathername.setText("");
    txtContactNo.setText("");
    txtAddress.setText("");
    txtAge.setText("");
    txtEmailID.setText("");
    txtRemarks.setText("");
    txtDate.setText("");
    cmbBloodGroup.setSelectedIndex(-1);
    cmbGender.setSelectedIndex(-1);
    btnSave.setEnabled(true);
    btnUpdate.setEnabled(false);
    btnDelete.setEnabled(false);
    txtPatientID.requestDefaultFocus();
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtFathername = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        cmbBloodGroup = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnGetData = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Registration");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(39, 76, 80, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("Guardian's Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(39, 114, 130, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setText("Address");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(39, 149, 56, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 153));
        jLabel5.setText("Contact No.");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(39, 216, 83, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 153));
        jLabel6.setText("Email ID");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 260, 57, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 153));
        jLabel9.setText("Blood Group");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 400, 87, 17);
        jPanel1.add(txtPatientID);
        txtPatientID.setBounds(180, 30, 440, 20);
        jPanel1.add(txtPatientName);
        txtPatientName.setBounds(180, 70, 440, 20);
        jPanel1.add(txtFathername);
        txtFathername.setBounds(180, 110, 440, 20);
        jPanel1.add(txtAddress);
        txtAddress.setBounds(180, 150, 570, 50);

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });
        jPanel1.add(txtAge);
        txtAge.setBounds(180, 300, 210, 20);
        jPanel1.add(txtEmailID);
        txtEmailID.setBounds(180, 260, 207, 20);

        cmbBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        cmbBloodGroup.setSelectedIndex(-1);
        jPanel1.add(cmbBloodGroup);
        cmbBloodGroup.setBounds(180, 400, 88, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 153));
        jLabel11.setText("Gender");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 350, 50, 17);

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        cmbGender.setSelectedIndex(-1);
        jPanel1.add(cmbGender);
        cmbGender.setBounds(180, 350, 88, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 153));
        jLabel12.setText("Age");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 300, 27, 17);

        txtContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactNoKeyTyped(evt);
            }
        });
        jPanel1.add(txtContactNo);
        txtContactNo.setBounds(180, 220, 210, 20);
        jPanel1.add(txtDate);
        txtDate.setBounds(180, 450, 120, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 153));
        jLabel8.setText("Patient Reg Date");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 450, 140, 17);

        jLabel10.setText("(DD/MM/YYYY)");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(330, 450, 140, 14);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 153));
        jLabel13.setText("Remarks");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 490, 60, 17);

        txtRemarks.setColumns(20);
        txtRemarks.setRows(5);
        jScrollPane1.setViewportView(txtRemarks);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 490, 360, 96);

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNew.setBackground(java.awt.SystemColor.activeCaption);
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setBackground(java.awt.SystemColor.activeCaption);
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setBackground(java.awt.SystemColor.activeCaption);
        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(java.awt.SystemColor.activeCaption);
        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnGetData.setBackground(java.awt.SystemColor.activeCaption);
        btnGetData.setText("Get Data");
        btnGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetData, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(37, 37, 37)
                .addComponent(btnUpdate)
                .addGap(39, 39, 39)
                .addComponent(btnGetData)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(1020, 30, 130, 270);

        jLabel7.setBackground(java.awt.SystemColor.activeCaption);
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reg3.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 20, 1530, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1306, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
    Reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
     try{
            con=Connect.ConnectDB();
            /*if (txtPatientID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter patient id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }*/
            if (txtPatientName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter patient name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtFathername.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Guardian's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (txtContactNo.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter contact no.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (txtDate.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Reg Date.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
            if (txtAge.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter age","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             if (cmbGender.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please select gender","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbBloodGroup.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please select blood group","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           
          
   Statement stmt;
       stmt= con.createStatement();
       String sql1="Select PatientID from patientregistration where PatientID= '" + txtPatientID.getText() + "'";
      rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Patient ID already exists","Error", JOptionPane.ERROR_MESSAGE);
        txtPatientID.setText("");
        txtPatientID.requestDefaultFocus();
       return;
      }
            String sql= "insert into patientregistration(Patientname,FatherName,Email,ContactNo,Age,Date,Remarks,Gen,BG,Address)values('"+ txtPatientName.getText() + "','"+ txtFathername.getText() + "','"+ txtEmailID.getText() + "','"+ txtContactNo.getText() + "','" + txtAge.getText() + "','"+ txtDate.getText() + "','"+ txtRemarks.getText() + "','" + cmbGender.getSelectedItem() + "','"+ cmbBloodGroup.getSelectedItem() + "','" + txtAddress.getText() + "')";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully Registered","Patient",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    try{
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from patientregistration where PatientID = '" + txtPatientID.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                Reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDataActionPerformed
this.hide();
PatientRegistrationRecord frm=new PatientRegistrationRecord();
frm.setVisible(true);
    }//GEN-LAST:event_btnGetDataActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
 try{
            con=Connect.ConnectDB();
          
            String sql= "update patientregistration set Patientname='"+ txtPatientName.getText() + "',Fathername='"+ txtFathername.getText() + "',Email='"+ txtEmailID.getText() + "',ContactNo='"+ txtContactNo.getText() + "',Age='" + txtAge.getText() + "',Date='"+ txtDate.getText() + "',Remarks='"+ txtRemarks.getText() + "',Gen='" + cmbGender.getSelectedItem() + "',BG='"+ cmbBloodGroup.getSelectedItem() + "',Address='" + txtAddress.getText() + "' where PatientID='" + txtPatientID.getText() + "'";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","Record",JOptionPane.INFORMATION_MESSAGE);
            btnUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }  
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyTyped
     char c=evt.getKeyChar();
      if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
          getToolkit().beep();
          evt.consume();
    }          
    }//GEN-LAST:event_txtContactNoKeyTyped

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
     char c=evt.getKeyChar();
      if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
          getToolkit().beep();
          evt.consume();
    }          
    }//GEN-LAST:event_txtAgeKeyTyped

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientRegistration().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetData;
    private javax.swing.JButton btnNew;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdate;
    public javax.swing.JComboBox cmbBloodGroup;
    public javax.swing.JComboBox cmbGender;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    public javax.swing.JTextField txtAddress;
    public javax.swing.JTextField txtAge;
    public javax.swing.JTextField txtContactNo;
    public javax.swing.JTextField txtDate;
    public javax.swing.JTextField txtEmailID;
    public javax.swing.JTextField txtFathername;
    public javax.swing.JTextField txtPatientID;
    public javax.swing.JTextField txtPatientName;
    public javax.swing.JTextArea txtRemarks;
    // End of variables declaration//GEN-END:variables
}
