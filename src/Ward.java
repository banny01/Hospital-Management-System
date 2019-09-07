
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Ward extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
ResultSet rs2=null;
PreparedStatement pst=null;
    
    public Ward() {
        initComponents();
        con= Connect.ConnectDB();
        Get_Data();
        setLocationRelativeTo(null);
    }
private void Reset()
{
    txtNoofBeds.setText("");
    txtRoomCharges.setText("");
    cmbRoomType.setSelectedIndex(-1);
    btnSave.setEnabled(true);
    btnDelete.setEnabled(false);
    btnUpdate.setEnabled(false);
    txtNoofBeds.requestDefaultFocus();
    txtRoomNo1.setText("");
    txtWardNo.setText("");
    Get_Data();
}
  private void Get_Data(){
     String sql="select WardNo as 'Ward ID.',No as 'Ward No',WardType as 'Ward Type',NoofBeds as 'No of Beds', WardCharges as 'Ward Charges',WardStatus as 'Ward Status' from Room";
     try{
         pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         Room_table.setModel(DbUtils.resultSetToTableModel(rs));
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
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNoofBeds = new javax.swing.JTextField();
        cmbRoomType = new javax.swing.JComboBox();
        txtRoomCharges = new javax.swing.JTextField();
        txtRoomNo1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtWardNo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnGetData = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Room_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Room");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Room Info"));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 0, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText("Ward ID.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 40, 80, 17);

        jLabel2.setBackground(new java.awt.Color(255, 0, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 255));
        jLabel2.setText("Ward Type");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 120, 90, 17);

        jLabel3.setBackground(new java.awt.Color(255, 0, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 255));
        jLabel3.setText("No of Beds");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 160, 76, 17);

        jLabel6.setBackground(new java.awt.Color(255, 0, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 255));
        jLabel6.setText("Ward Charges");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 190, 98, 17);
        jPanel1.add(txtNoofBeds);
        txtNoofBeds.setBounds(140, 160, 50, 20);

        cmbRoomType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General", "Deluxe", "Room (AC)", "Room (Non-AC)" }));
        jPanel1.add(cmbRoomType);
        cmbRoomType.setBounds(140, 120, 120, 20);

        txtRoomCharges.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRoomChargesKeyTyped(evt);
            }
        });
        jPanel1.add(txtRoomCharges);
        txtRoomCharges.setBounds(140, 200, 130, 20);
        jPanel1.add(txtRoomNo1);
        txtRoomNo1.setBounds(140, 40, 100, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 255));
        jLabel7.setText("Ward NO");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 80, 80, 17);

        jLabel4.setBackground(new java.awt.Color(167, 25, 25));
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("(Per day)");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 210, 70, 14);
        jPanel1.add(txtWardNo);
        txtWardNo.setBounds(140, 80, 80, 20);

        jPanel3.setBackground(java.awt.SystemColor.activeCaptionText);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setForeground(new java.awt.Color(0, 51, 204));

        btnNew.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnGetData.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnGetData.setText("Get Data");
        btnGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGetData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(610, 40, 110, 156);

        jLabel5.setBackground(new java.awt.Color(255, 0, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\BANNY\\Desktop\\Hospital Management System\\src\\room 2.png")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, -10, 730, 300);

        Room_table.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        Room_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No.", "Room Type", "Room Charges", "Room Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Room_table.getTableHeader().setReorderingAllowed(false);
        Room_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Room_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Room_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Room_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Room_tableMouseClicked
       try{
            con=Connect.ConnectDB();
            int row= Room_table.getSelectedRow();
            String table_click= Room_table.getModel().getValueAt(row, 0).toString();
            String sql= "select * from Room where WardNo = '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){
              
                String add1=rs.getString("WardNo");
                txtRoomNo1.setText(add1);
                String add5=rs.getString("No");
                txtWardNo.setText(add5);
                String add6=rs.getString("NoofBeds");
                txtNoofBeds.setText(add6);
                String add2=rs.getString("WardType");
                cmbRoomType.setSelectedItem(add2);
                int add3 = rs.getInt("WardCharges");
                String add4= Integer.toString(add3);
                txtRoomCharges.setText(add4);
                btnUpdate.setEnabled(true);
                btnDelete.setEnabled(true);
                btnSave.setEnabled(false);
             
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_Room_tableMouseClicked

    private void txtRoomChargesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRoomChargesKeyTyped
     char c=evt.getKeyChar();
      if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
          getToolkit().beep();
          evt.consume();
    }          
    }//GEN-LAST:event_txtRoomChargesKeyTyped

    private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDataActionPerformed
        Get_Data();
    }//GEN-LAST:event_btnGetDataActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try
        {
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();

                String sql= "delete from Room where WardNo = '" + txtRoomNo1.getText() + "'";
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
            String sql= "update Room set No='"+ txtWardNo.getText() +"',Wardtype='"+ cmbRoomType.getSelectedItem() + "',NoofBeds='" + txtNoofBeds.getText() + "',WardCharges='" + txtRoomCharges.getText() + "'where WardNo='" + txtRoomNo1.getText() + "'";
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","Ward Record",JOptionPane.INFORMATION_MESSAGE);
            btnUpdate.setEnabled(false);
            Get_Data();
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            con=Connect.ConnectDB();
            if (txtRoomNo1.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Ward ID.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtWardNo.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Ward No.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbRoomType.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please select Ward type","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtRoomCharges.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Ward Charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Statement stmt;
            stmt= con.createStatement();
            String sql1="Select WardNo from Room where WardNo= '" + txtRoomNo1.getText() + "'";
            rs=stmt.executeQuery(sql1);
           
            if(rs.next()){
                JOptionPane.showMessageDialog( this, "Ward ID. already exists","Error", JOptionPane.ERROR_MESSAGE);
                txtRoomNo1.setText("");
                txtRoomNo1.requestDefaultFocus();
                return;
            }
            
            Statement stmt1;
            stmt1= con.createStatement();
            Statement stmt2 = con.createStatement();
            String sql2="Select No from Room where No= '" + txtWardNo.getText() + "'";
            //rs=stmt1.executeQuery(sql2);
            String sql3="Select No from Room where WardType= '" + cmbRoomType.getSelectedItem()+ "' and No='"+txtWardNo.getText()+"'";
            rs2=stmt2.executeQuery(sql3);
            pst=con.prepareStatement(sql3);
            rs=pst.executeQuery();
            
            if(rs2.next()){
                //rs.next();
                //String add1=rs.getString("No");
                //if(rs.next()){
                    
                JOptionPane.showMessageDialog( this, "This Ward is already exists","Error", JOptionPane.ERROR_MESSAGE);
                txtWardNo.setText(null);
                    //txtWardNo.requestDefaultFocus();
                cmbRoomType.setSelectedIndex(-1);
                //return;
                //}
                return;
            }

            else{
            String sql= "insert into room(WardNo,No,WardType,NoofBeds,WardCharges,WardStatus)values('"+ txtRoomNo1.getText() + "','"+ txtWardNo.getText()+"','"+ cmbRoomType.getSelectedItem() +"','"+ txtNoofBeds.getText() + "','"+ txtRoomCharges.getText() + "','Vacant')";
            pst=con.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(this,"Successfully saved","Ward Record",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);
            Get_Data();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        Reset();
    }//GEN-LAST:event_btnNewActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ward().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Room_table;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetData;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    public javax.swing.JComboBox cmbRoomType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNoofBeds;
    private javax.swing.JTextField txtRoomCharges;
    private javax.swing.JTextField txtRoomNo1;
    private javax.swing.JTextField txtWardNo;
    // End of variables declaration//GEN-END:variables
}
