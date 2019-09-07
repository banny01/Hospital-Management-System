
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;



public class Doctor extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
public String id;
    /**
     * Creates new form Doctor
     */
    public Doctor() {
        initComponents();
        setLocationRelativeTo(null);
        txtUserName.setVisible(false);
        
 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDoctorID = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JTextField();
        txtFathername = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        txtQualifications = new javax.swing.JTextField();
        txtSpecialisation = new javax.swing.JTextField();
        txtDateOfJoining = new javax.swing.JFormattedTextField();
        cmbBloodGroup = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Doctor");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Doctor Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(39, 46, 50, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(39, 84, 70, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Father's Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 190, 110, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 230, 80, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Contact No.");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 270, 100, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email ID");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 310, 80, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Qualifications");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 350, 100, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Specialization");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 390, 100, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Blood Group");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 470, 100, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Date Of Joining");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 510, 110, 17);
        jPanel1.add(txtDoctorID);
        txtDoctorID.setBounds(200, 40, 260, 20);
        jPanel1.add(txtDoctorName);
        txtDoctorName.setBounds(200, 80, 260, 20);
        jPanel1.add(txtFathername);
        txtFathername.setBounds(200, 180, 260, 20);
        jPanel1.add(txtAddress);
        txtAddress.setBounds(200, 220, 260, 20);

        txtContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactNoKeyTyped(evt);
            }
        });
        jPanel1.add(txtContactNo);
        txtContactNo.setBounds(200, 260, 130, 20);
        jPanel1.add(txtEmailID);
        txtEmailID.setBounds(200, 300, 210, 20);
        jPanel1.add(txtQualifications);
        txtQualifications.setBounds(200, 340, 200, 20);
        jPanel1.add(txtSpecialisation);
        txtSpecialisation.setBounds(200, 380, 200, 20);

        txtDateOfJoining.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jPanel1.add(txtDateOfJoining);
        txtDateOfJoining.setBounds(200, 500, 130, 20);

        cmbBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        cmbBloodGroup.setSelectedIndex(-1);
        jPanel1.add(cmbBloodGroup);
        cmbBloodGroup.setBounds(200, 460, 120, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Gender");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 430, 80, 17);

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        cmbGender.setSelectedIndex(-1);
        jPanel1.add(cmbGender);
        cmbGender.setBounds(200, 420, 100, 20);

        jLabel22.setText("(DD//MM/YYYY)");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(340, 500, 100, 14);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton1.setText("Get Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(520, 40, 120, 180);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(520, 260, 0, 0);

        txtUserName.setToolTipText("");
        jPanel1.add(txtUserName);
        txtUserName.setBounds(580, 290, 40, 20);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor1.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 20, 1180, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1193, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void Reset()
{
    txtDoctorID.setText("");
    txtDoctorName.setText("");
    txtFathername.setText("");
    txtContactNo.setText("");
    txtAddress.setText("");
    txtQualifications.setText("");
    txtEmailID.setText("");
    txtSpecialisation.setText("");
    txtDateOfJoining.setText("");
    cmbBloodGroup.setSelectedIndex(-1);
    cmbGender.setSelectedIndex(-1);
    btnSave.setEnabled(true);
    btnUpdate.setEnabled(false);
    btnDelete.setEnabled(false);
    txtDoctorID.requestDefaultFocus();
    

}
public String getid(){
    id=txtDoctorID.getText();
    return id;
}
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        Reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            con=Connect.ConnectDB();
            if (txtDoctorID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter doctor id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtDoctorName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter doctor name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtFathername.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Father's name","Error", JOptionPane.ERROR_MESSAGE);
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
         
            if (txtQualifications.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter qualifications","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtSpecialisation.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter specialization","Error", JOptionPane.ERROR_MESSAGE);
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
           
            if (txtDateOfJoining.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter joining date","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
   Statement stmt;
       stmt= con.createStatement();
       String sql1="Select DoctorID from Doctor where DoctorID= '" + txtDoctorID.getText() + "'";
      rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Doctor ID already exists","Error", JOptionPane.ERROR_MESSAGE);
        txtDoctorID.setText("");
        txtDoctorID.requestDefaultFocus();
       return;
      }
            String sql= "insert into Doctor(DoctorID,Doctorname,FatherName,Email,ContactNo,Qualifications,Specialization,Gender,BloodGroup,DateOfJoining,Address,username)values('"+ txtDoctorID.getText() + "','"+ txtDoctorName.getText() + "','"+ txtFathername.getText() + "','"+ txtEmailID.getText() + "','"+ txtContactNo.getText() + "','"+ txtQualifications.getText() + "','"+ txtSpecialisation.getText() + "','" + cmbGender.getSelectedItem() + "','"+ cmbBloodGroup.getSelectedItem() + "','" + txtDateOfJoining.getText() + "','" + txtAddress.getText() + "','')";
                //id=Integer.valueOf(txtDoctorID.getText());
            pst=con.prepareStatement(sql);
            pst.execute();
           /* String sql2= "insert into users(username,user_password,Status)values('" + txtUserName.getText() + "','" + Password + "','Doctor')";
            pst=con.prepareStatement(sql2);
            pst.execute();*/
            JOptionPane.showMessageDialog(this,"Successfully saved","Doctor Record",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);
            getid();
     DoctorUser frm=new DoctorUser();
     frm.setVisible(true);
     
     this.hide();

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            DoctorUser d = new DoctorUser();
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from Doctor where DoctorID = '" + txtDoctorID.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                 String sql1= "delete from Users where Username = '" + txtUserName.getText() + "'";
        pst=con.prepareStatement(sql1);
        pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                Reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try{
            con=Connect.ConnectDB();
            String sql= "update Doctor set Doctorname='"+ txtDoctorName.getText() + "',FatherName='"+ txtFathername.getText() + "',Email='"+ txtEmailID.getText() + "',ContactNo='"+ txtContactNo.getText() + "',Qualifications='"+ txtQualifications.getText() + "',Specialization='"+ txtSpecialisation.getText() + "',Gender='" + cmbGender.getSelectedItem() + "',BloodGroup='"+ cmbBloodGroup.getSelectedItem() + "',DateOfJoining='" + txtDateOfJoining.getText() + "',Address='" + txtAddress.getText() + "' where DoctorID='" + txtDoctorID.getText() + "'";

           pst=con.prepareStatement(sql);
            pst.execute();
            /*String sql2= "update users set user_password='" + Password + "' where username='" + txtUserName.getText() + "'";
      
      pst=con.prepareStatement(sql2);
      pst.execute();*/
            JOptionPane.showMessageDialog(this,"Successfully updated","Doctor Record",JOptionPane.INFORMATION_MESSAGE);
            btnUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     this.hide();
     DoctorRecord frm=new DoctorRecord();
     frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyTyped
       char c=evt.getKeyChar();
      if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
          getToolkit().beep();
          evt.consume();
    }          
    }//GEN-LAST:event_txtContactNoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdate;
    public javax.swing.JComboBox cmbBloodGroup;
    public javax.swing.JComboBox cmbGender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtAddress;
    public javax.swing.JTextField txtContactNo;
    public javax.swing.JFormattedTextField txtDateOfJoining;
    public javax.swing.JTextField txtDoctorID;
    public javax.swing.JTextField txtDoctorName;
    public javax.swing.JTextField txtEmailID;
    public javax.swing.JTextField txtFathername;
    public javax.swing.JTextField txtQualifications;
    public javax.swing.JTextField txtSpecialisation;
    public javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
