
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Nurse_Wardboy extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
  
    public Nurse_Wardboy() {
        initComponents();
        setLocationRelativeTo(null);
    }
private void Reset()
{
    txtID.setText("");
    txtName.setText("");
    cmbCategory.setSelectedIndex(-1);
    txtContactNo.setText("");
    txtAddress.setText("");
    txtQualifications.setText("");
    txtEmailID.setText("");
    txtDateOfJoining.setText("");
    cmbBloodGroup.setSelectedIndex(-1);
    btnSave.setEnabled(true);
    btnUpdate.setEnabled(false);
    btnDelete.setEnabled(false);
    txtID.requestDefaultFocus();
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        txtQualifications = new javax.swing.JTextField();
        txtDateOfJoining = new javax.swing.JFormattedTextField();
        cmbBloodGroup = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnGetData = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nurse/Wardboy");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nurse/Wardboy Details"));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(39, 100, 90, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(39, 138, 110, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Category");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(39, 176, 120, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(39, 223, 120, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Contact No.");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(39, 261, 140, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email ID");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(39, 299, 120, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Qualifications");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(39, 337, 140, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Blood Group");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 400, 140, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Date Of Joining");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 450, 150, 17);
        jPanel1.add(txtID);
        txtID.setBounds(350, 97, 193, 20);
        jPanel1.add(txtName);
        txtName.setBounds(350, 135, 323, 20);
        jPanel1.add(txtAddress);
        txtAddress.setBounds(350, 220, 350, 20);

        txtContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactNoKeyTyped(evt);
            }
        });
        jPanel1.add(txtContactNo);
        txtContactNo.setBounds(350, 258, 150, 20);
        jPanel1.add(txtEmailID);
        txtEmailID.setBounds(350, 296, 350, 20);
        jPanel1.add(txtQualifications);
        txtQualifications.setBounds(350, 334, 350, 20);

        txtDateOfJoining.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jPanel1.add(txtDateOfJoining);
        txtDateOfJoining.setBounds(350, 440, 120, 20);

        cmbBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        cmbBloodGroup.setSelectedIndex(-1);
        jPanel1.add(cmbBloodGroup);
        cmbBloodGroup.setBounds(350, 390, 120, 20);

        jLabel22.setText("(DD/MM/YYYY)");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(360, 470, 90, 14);

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nurse", "Wardboy" }));
        cmbCategory.setSelectedIndex(-1);
        jPanel1.add(cmbCategory);
        cmbCategory.setBounds(350, 173, 130, 20);

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
                    .addComponent(btnGetData, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addGap(1, 1, 1)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGetData)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(850, 40, 134, 200);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nurse.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 30, 1370, 640);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(10, 10, 1500, 680);
        jPanel4.add(jLabel8);
        jLabel8.setBounds(1140, 170, 0, 0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1869, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
  try{
            con=Connect.ConnectDB();
            if (txtID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter nurse/wardboy id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (cmbCategory.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please select category","Error", JOptionPane.ERROR_MESSAGE);
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
       String sql1="Select ID from Wardboy_Nurse_tbl where ID= '" + txtID.getText() + "'";
      rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Nurse/wardboy ID already exists","Error", JOptionPane.ERROR_MESSAGE);
        txtID.setText("");
        txtID.requestDefaultFocus();
        return;
      }
            String sql= "insert into Wardboy_Nurse_tbl(ID,W_N_name,Category,Email,ContactNo,Qualifications,BloodGroup,DateOfJoining,Address)values('"+ txtID.getText() + "','"+ txtName.getText() + "','"+ cmbCategory.getSelectedItem()+ "','"+ txtEmailID.getText() + "','"+ txtContactNo.getText() + "','"+ txtQualifications.getText() + "','"+ cmbBloodGroup.getSelectedItem() + "','" + txtDateOfJoining.getText() + "','" + txtAddress.getText() + "')";
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully saved","Record",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
    Reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
   try
        {
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from Wardboy_Nurse_tbl where ID = '" + txtID.getText() + "'";
                pst=con.prepareStatement(sql);
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
            String sql= "update Wardboy_Nurse_tbl set W_N_name='"+ txtName.getText() + "',Category='"+ cmbCategory.getSelectedItem()+ "',Email='"+ txtEmailID.getText() + "',ContactNo='"+ txtContactNo.getText() + "',Qualifications='"+ txtQualifications.getText() + "',BloodGroup='"+ cmbBloodGroup.getSelectedItem() + "',DateOfJoining='" + txtDateOfJoining.getText() + "',Address='" + txtAddress.getText() + "' where ID='" + txtID.getText() + "'";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","Record",JOptionPane.INFORMATION_MESSAGE);
            btnUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }    
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDataActionPerformed
  this.hide();
  Nurse_WardBoyRecord frm= new Nurse_WardBoyRecord();
  frm.setVisible(true);
    }//GEN-LAST:event_btnGetDataActionPerformed

    private void txtContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyTyped
   char c=evt.getKeyChar();
      if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
          getToolkit().beep();
          evt.consume();
    }          
    }//GEN-LAST:event_txtContactNoKeyTyped

        public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nurse_Wardboy().setVisible(true);
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
    public javax.swing.JComboBox cmbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField txtAddress;
    public javax.swing.JTextField txtContactNo;
    public javax.swing.JFormattedTextField txtDateOfJoining;
    public javax.swing.JTextField txtEmailID;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtQualifications;
    // End of variables declaration//GEN-END:variables
}
