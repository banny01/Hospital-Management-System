
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class PatientAdmit_Ward extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
   
    public PatientAdmit_Ward() {
        initComponents();
        setLocationRelativeTo(null);
        cmbWardName.setSelectedIndex(-1);
        fillcombo();
        
        cmbWardName1.setVisible(false);
        txtAdmitID.setVisible(false);
         Get_Data1();
         GetRecord();
         
    }
private void fillcombo(){
String s ="";
     try{
      
   con=Connect.ConnectDB();
      String sql= "select distinct WardType from room order by WardType";
      pst=con.prepareStatement(sql);
      rs=pst.executeQuery();
      while(rs.next()){
          String add=rs.getString("WardType");
          cmbWardName.addItem(add);
          //System.out.println(add);
         s = s+add+"\n";
         cmbWardName.setSelectedIndex(-1);
         }
      //cmbWardName.(s);
      System.out.println(s);
      
        }
     catch(HeadlessException | SQLException ex){
           JOptionPane.showMessageDialog(this,ex); 
        }
}
 private void GetRecord(){
        String sql="select DoctorID as 'Doctor ID', Doctorname as 'doctor Name', Specialization as 'Specialization' from Doctor order by Doctorname";
          try{
              con=Connect.ConnectDB();
         pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         jTable2.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
}
    }
  private void Get_Data1(){
        String sql="select PatientID as 'Patient ID', Patientname as 'Patient Name',Gen as 'Gender',BG as 'Blood Group' from patientregistration order by PatientName";
          try{
         con=Connect.ConnectDB();
         pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PatientID = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtBloodGroup = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtDisease = new javax.swing.JTextField();
        txtDoctorID = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        cmbWardName = new javax.swing.JComboBox();
        cmbWardName1 = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnGetData = new javax.swing.JButton();
        txtAdmitID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cmbWardNo = new javax.swing.JComboBox<>();
        txtMM = new javax.swing.JTextField();
        txtYYYY = new javax.swing.JTextField();
        txtDD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admit Patient");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Admit Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("Patient ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(39, 30, 100, 17);

        jLabel2.setBackground(new java.awt.Color(0, 0, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setText("Patient Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(39, 69, 93, 17);

        jLabel9.setBackground(new java.awt.Color(0, 0, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 204));
        jLabel9.setText("Blood Group");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(39, 145, 87, 17);

        jLabel10.setBackground(new java.awt.Color(0, 0, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 204));
        jLabel10.setText("Remarks");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 410, 60, 17);

        PatientID.setEditable(false);
        jPanel1.add(PatientID);
        PatientID.setBounds(165, 27, 89, 20);

        txtPatientName.setEditable(false);
        jPanel1.add(txtPatientName);
        txtPatientName.setBounds(165, 66, 193, 20);

        jLabel11.setBackground(new java.awt.Color(0, 0, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 204));
        jLabel11.setText("Gender");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(39, 107, 50, 17);

        txtGender.setEditable(false);
        jPanel1.add(txtGender);
        txtGender.setBounds(165, 104, 194, 20);

        txtBloodGroup.setEditable(false);
        jPanel1.add(txtBloodGroup);
        txtBloodGroup.setBounds(165, 142, 194, 20);

        jLabel12.setBackground(new java.awt.Color(0, 0, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 204));
        jLabel12.setText("Disease");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(39, 180, 51, 17);

        jLabel13.setBackground(new java.awt.Color(0, 0, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 0, 204));
        jLabel13.setText("Admit Date");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 230, 77, 17);

        jLabel14.setBackground(new java.awt.Color(0, 0, 204));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 0, 204));
        jLabel14.setText("Ward Name");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(40, 280, 81, 17);

        jLabel16.setBackground(new java.awt.Color(0, 0, 204));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 0, 204));
        jLabel16.setText("Doctor ID");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(40, 320, 68, 17);

        jLabel17.setBackground(new java.awt.Color(0, 0, 204));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 204));
        jLabel17.setText("Doctor Name");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(40, 360, 91, 17);
        jPanel1.add(txtDisease);
        txtDisease.setBounds(159, 180, 220, 20);

        txtDoctorID.setEditable(false);
        jPanel1.add(txtDoctorID);
        txtDoctorID.setBounds(160, 320, 75, 21);

        txtDoctorName.setEditable(false);
        jPanel1.add(txtDoctorName);
        txtDoctorName.setBounds(160, 360, 194, 20);

        txtRemarks.setColumns(20);
        txtRemarks.setRows(5);
        jScrollPane1.setViewportView(txtRemarks);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(160, 410, 166, 104);

        cmbWardName.setEditable(true);
        cmbWardName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbWardNameItemStateChanged(evt);
            }
        });
        cmbWardName.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                cmbWardNamePopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cmbWardName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbWardNameMouseClicked(evt);
            }
        });
        cmbWardName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbWardNameActionPerformed(evt);
            }
        });
        cmbWardName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbWardNamePropertyChange(evt);
            }
        });
        cmbWardName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbWardNameKeyPressed(evt);
            }
        });
        jPanel1.add(cmbWardName);
        cmbWardName.setBounds(160, 280, 89, 20);

        cmbWardName1.setEditable(true);
        jPanel1.add(cmbWardName1);
        cmbWardName1.setBounds(270, 320, 90, 20);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(540, 30, 260, 523);

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNew.setBackground(javax.swing.UIManager.getDefaults().getColor("RadioButtonMenuItem.selectionBackground"));
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnGetData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(btnNew)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGetData)
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(410, 50, 110, 220);

        txtAdmitID.setEditable(false);
        jPanel1.add(txtAdmitID);
        txtAdmitID.setBounds(430, 490, 90, 20);

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(805, 30, 390, 523);

        cmbWardNo.setEditable(true);
        cmbWardNo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmbWardNoPopupMenuWillBecomeVisible(evt);
            }
        });
        cmbWardNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbWardNoMouseClicked(evt);
            }
        });
        cmbWardNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbWardNoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbWardNo);
        cmbWardNo.setBounds(310, 280, 60, 20);

        txtMM.setText("MM");
        jPanel1.add(txtMM);
        txtMM.setBounds(210, 230, 40, 20);

        txtYYYY.setText("YYYY");
        jPanel1.add(txtYYYY);
        txtYYYY.setBounds(260, 230, 70, 20);

        txtDD.setText("DD");
        jPanel1.add(txtDD);
        txtDD.setBounds(160, 230, 40, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 204));
        jLabel4.setText("No");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 280, 30, 17);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admiss.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 20, 1330, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbWardNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbWardNameActionPerformed
/*String sql1="Select No from Room where WardType= '" + cmbWardName.getSelectedItem() + "'";
        cmbWardNo.setToolTipText(sql1);  */
        //con=Connect.ConnectDB();
        //String s1="Select No from Room where WardType= '" + cmbWardName.getSelectedItem() + "'";
       /* cmbWardNo.removeAllItems();
        
        try{
      
    con=Connect.ConnectDB();
    String sq2= "select No from room where WardType='"+cmbWardName.getSelectedItem() +"' order by No";
    pst=con.prepareStatement(sq2);
    rs=pst.executeQuery();
      while(rs.next()){
          String add1=rs.getString("No");
          cmbWardNo.addItem(add1);
          
         }
        }catch(HeadlessException | SQLException ex){
           JOptionPane.showMessageDialog(this,ex); 
        }*/
    }//GEN-LAST:event_cmbWardNameActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          try{
            con=Connect.ConnectDB();
            int row= jTable1.getSelectedRow();
            String table_click= jTable1.getModel().getValueAt(row, 0).toString();
            String sql= "select * from patientregistration where PatientID = '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){
       
                String add1=rs.getString("PatientID");
                PatientID.setText(add1);
                String add2=rs.getString("Patientname");
                txtPatientName.setText(add2);
                String add9=rs.getString("BG");
                txtBloodGroup.setText(add9);
                String add11=rs.getString("Gen");
                txtGender.setText(add11);
                         
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try{
            con=Connect.ConnectDB();
            int row= jTable2.getSelectedRow();
            String table_click= jTable2.getModel().getValueAt(row, 0).toString();
            String sql= "select * from Doctor where DoctorID = '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("DoctorID");
                txtDoctorID.setText(add1);
                String add2=rs.getString("Doctorname");
                txtDoctorName.setText(add2);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
    Reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
      try{
            con=Connect.ConnectDB();
              if (PatientID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve Patient ID","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtPatientName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve Patient Name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (txtGender.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve Gender","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
            if (txtBloodGroup.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve blood group","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDisease.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter disease","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             if (txtDD.getText().equals("")||txtMM.getText().equals("")||txtYYYY.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter admit date","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbWardName.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please select ward name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
  
            if (txtDoctorID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve doctor id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtDoctorName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter retrieve doctor name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
             Statement stmt1;
       stmt1= con.createStatement();
       String sql2="Select WardType from room where WardType= '" + cmbWardName.getSelectedItem()+ "' and NoofBeds<=0";
      rs=stmt1.executeQuery(sql2);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Beds are not available","Error", JOptionPane.ERROR_MESSAGE);
        cmbWardName.setSelectedItem("");
        cmbWardName.requestDefaultFocus();
       return;
      }
       Statement stmt;
       stmt= con.createStatement();
       String sql1="Select PatientID,AdmitDate from admitpatient_ward where PatientID= '" + PatientID.getText() + "' and AdmitDate='" + txtDD + "'";
      rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Record already exists","Error", JOptionPane.ERROR_MESSAGE);
        return;
      }
        String Date = ""+txtDD.getText()+"/"+txtMM.getText()+"/"+txtYYYY.getText();
            String sql= "insert into admitPatient_Ward(PatientID,Disease,AdmitDate,WardType,DoctorID,AP_Remarks,DD,MM,YYYY)values('"+ PatientID.getText() + "','"+ txtDisease.getText() + "','"+ Date + "','"+ cmbWardName.getSelectedItem()+ "','" + txtDoctorID.getText() + "','"+ txtRemarks.getText() + "','"+ txtDD.getText() + "','"+ txtMM.getText() + "','"+ txtYYYY.getText() + "')";

            pst=con.prepareStatement(sql);
            pst.execute();
            String sql3= "update room set NoOfBeds=NoOfBeds - 1 where WardType='" + cmbWardName.getSelectedItem() + "'";
            pst=con.prepareStatement(sql3);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully admitted","Patient",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbWardNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbWardNameItemStateChanged
/*cmbWardNo.removeAllItems();
        
        try{
      
    con=Connect.ConnectDB();
    String sq2= "select No from room where WardType='"+cmbWardName.getSelectedItem() +"' order by No";
    pst=con.prepareStatement(sq2);
    rs=pst.executeQuery();
      while(rs.next()){
          String add1=rs.getString("No");
          cmbWardNo.addItem(add1);
          
         }
        }catch(HeadlessException | SQLException ex){
           JOptionPane.showMessageDialog(this,ex); 
        }*/
    }//GEN-LAST:event_cmbWardNameItemStateChanged

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       try{
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from admitpatient_ward where AdmitID = " + txtAdmitID.getText() + "";
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
  PatientAdmit_WardRecord frm= new PatientAdmit_WardRecord();
  frm.setVisible(true);
    }//GEN-LAST:event_btnGetDataActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    try{
       
            con=Connect.ConnectDB();
      
       Statement stmt1;
       stmt1= con.createStatement();
       String s= cmbWardName.getSelectedItem().toString();
       String t= cmbWardName1.getSelectedItem().toString();
       if (!t.equals(s))
       {
       String sql2="Select WardType from room where WardType= '" + cmbWardName.getSelectedItem()+ "' and NoOfbeds<=0";
       rs=stmt1.executeQuery(sql2);
       if(rs.next()){
        JOptionPane.showMessageDialog( this, "beds are not available","Error", JOptionPane.ERROR_MESSAGE);
        cmbWardName.setSelectedItem("");
        cmbWardName.requestDefaultFocus();
       return;
      }
      }
      String Date = txtDD.getText()+"/"+txtMM.getText()+"/"+txtYYYY;
            String sql= " update admitpatient_ward set PatientID='"+ PatientID.getText() + "',Disease='"+ txtDisease.getText() + "',AdmitDate='"+ Date + "',Wardname='"+ cmbWardName.getSelectedItem()+ "',DoctorID='" + txtDoctorID.getText() + "',AP_Remarks='"+ txtRemarks.getText() + "',DD='"+ txtDD.getText() + "',MM='"+ txtMM.getText() + "',YYYY='"+ txtYYYY.getText() + "' where AdmitID= " + txtAdmitID.getText() + "";
            pst=con.prepareStatement(sql);
            pst.execute();
           if (!t.equals(s))
       {
             String sql3= "update room set NoOfBeds=NoOfBeds - 1 where Wardname='" + cmbWardName.getSelectedItem() + "'";
           pst=con.prepareStatement(sql3);
            pst.execute();
       }
            if (!t.equals(s))
       {
             String sql4= "update room set NoOfBeds=NoOfBeds + 1 where Wardname='" + cmbWardName1.getSelectedItem() + "'";
             pst=con.prepareStatement(sql4);
            pst.execute();
       }
            JOptionPane.showMessageDialog(this,"Successfully updated","Patient Record",JOptionPane.INFORMATION_MESSAGE);
            btnUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cmbWardNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbWardNamePropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbWardNamePropertyChange

    private void cmbWardNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbWardNoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbWardNoMouseClicked

    private void cmbWardNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbWardNameMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbWardNameMouseClicked

    private void cmbWardNamePopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbWardNamePopupMenuCanceled
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbWardNamePopupMenuCanceled

    private void cmbWardNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbWardNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbWardNameKeyPressed

    private void cmbWardNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbWardNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbWardNoActionPerformed

    private void cmbWardNoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbWardNoPopupMenuWillBecomeVisible
cmbWardNo.removeAllItems();
        
        try{
      
    con=Connect.ConnectDB();
    String sq2= "select No from room where WardType='"+cmbWardName.getSelectedItem() +"' order by No";
    pst=con.prepareStatement(sq2);
    rs=pst.executeQuery();
      while(rs.next()){
          String add1=rs.getString("No");
          cmbWardNo.addItem(add1);
          
         }
        }catch(HeadlessException | SQLException ex){
           JOptionPane.showMessageDialog(this,ex); 
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cmbWardNoPopupMenuWillBecomeVisible
private void Reset()
{
    txtDoctorID.setText("");
    txtDoctorName.setText("");
    PatientID.setText("");
    txtPatientName.setText("");
    txtBloodGroup.setText("");
    txtGender.setText("");
    txtDisease.setText("");
    txtDD.setText("DD");
    txtMM.setText("MM");
    txtYYYY.setText("YYYY");
    txtRemarks.setText("");
    cmbWardName.setSelectedIndex(-1);
    btnSave.setEnabled(true);
    btnUpdate.setEnabled(false);
    btnDelete.setEnabled(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientAdmit_Ward().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField PatientID;
    public javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetData;
    private javax.swing.JButton btnNew;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdate;
    public javax.swing.JComboBox cmbWardName;
    public javax.swing.JComboBox cmbWardName1;
    private javax.swing.JComboBox<String> cmbWardNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public javax.swing.JTextField txtAdmitID;
    public javax.swing.JTextField txtBloodGroup;
    public javax.swing.JTextField txtDD;
    public javax.swing.JTextField txtDisease;
    public javax.swing.JTextField txtDoctorID;
    public javax.swing.JTextField txtDoctorName;
    public javax.swing.JTextField txtGender;
    public javax.swing.JTextField txtMM;
    public javax.swing.JTextField txtPatientName;
    public javax.swing.JTextArea txtRemarks;
    public javax.swing.JTextField txtYYYY;
    // End of variables declaration//GEN-END:variables
}
