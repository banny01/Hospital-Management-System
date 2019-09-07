
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class PatientAdmit_WardRecord_1 extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    
    public PatientAdmit_WardRecord_1() {
        initComponents();
        con= Connect.ConnectDB();
        Get_Data();
        setLocationRelativeTo(null);
    }
 private void Get_Data(){
          try{
              String sql="Select AdmitID as 'Admit ID',PatientRegistration.PatientID as 'Patient ID',PatientRegistration.PatientName as 'Patient Name',PatientRegistration.Gen as 'Gender',PatientRegistration.BG as 'Blood Group',Disease,AdmitDate as 'Admit Date',room.WardType as 'Ward Name', No as 'Ward No',Doctor.DoctorID as 'Doctor ID',DoctorName as 'Doctor Name',AdmitPatient_Ward.AP_Remarks as 'Remarks' from room,Doctor,PatientRegistration,AdmitPatient_Ward where room.WardType=AdmitPatient_Ward.WardType and Doctor.DoctorID=AdmitPatient_Ward.DoctorID and PatientRegistration.PatientID=AdmitPatient_Ward.PatientID order by admitdate";
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admit Patient Record");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1247, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    try{
            con=Connect.ConnectDB();
            int row= jTable1.getSelectedRow();
            String table_click= jTable1.getModel().getValueAt(row, 0).toString();
             String sql="Select * from room,PatientRegistration,Doctor,AdmitPatient_Ward where room.WardType=AdmitPatient_Ward.WardType and Doctor.DoctorID=AdmitPatient_Ward.DoctorID and PatientRegistration.PatientID=AdmitPatient_Ward.PatientID and AdmitID=" + table_click + "";   
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){
                this.hide();
                PatientDischarge_Ward frm = new PatientDischarge_Ward();
                frm.setVisible(true);
                String add1=rs.getString("DoctorID");
                frm.txtDoctorID.setText(add1);
                String add2=rs.getString("Doctorname");
                frm.txtDoctorName.setText(add2);
                String add3=rs.getString("PatientID");
                frm.PatientID.setText(add3);
                String add5=rs.getString("PatientName");
                frm.txtPatientName.setText(add5);
                String add6=rs.getString("Gen");
                frm.txtGender.setText(add6);
                String add7=rs.getString("BG");
                frm.txtBloodGroup.setText(add7);
                String add9=rs.getString("Disease");
                frm.txtDisease.setText(add9);
                String add11=rs.getString("AdmitDate");
                frm.txtAdmitDate.setText(add11);
                String add14=rs.getString("WardType");
                frm.txtWardname.setText(add14);
                String add15=rs.getString("AP_Remarks");
                frm.txtRemarks.setText(add15);
                int add16 = rs.getInt("AdmitID");
                String add17= Integer.toString(add16);
                frm.txtAdmitID.setText(add17);
                String add18=rs.getString("FatherName");
                //frm.txtFather.setText(add18);
                String add19=rs.getString("Email");
                frm.txtEmail.setText(add19);
                String add20=rs.getString("ContactNo");
                frm.txtContact.setText(add20);
                String add21=rs.getString("Age");
                frm.txtAge.setText(add21);
                String add22=rs.getString("Address");
                frm.txtAddress.setText(add22);
                String add23=rs.getString("DD");
                frm.txtDD1.setText(add23);
                String add24=rs.getString("MM");
                frm.txtMM1.setText(add24);
                String add25=rs.getString("YYYY");
                frm.txtYYYY1.setText(add25);
                
                //frm.btnUpdate.setEnabled(true);
                //frm.btnDelete.setEnabled(true);
                frm.btnSave.setEnabled(true);
             
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       this.hide();
       PatientDischarge_Ward frm = new PatientDischarge_Ward();
       frm.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientAdmit_WardRecord_1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
