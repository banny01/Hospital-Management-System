
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class PatientDischargeRecord_Ward extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    
    public PatientDischargeRecord_Ward() {
        initComponents();
          con= Connect.ConnectDB();
        Get_Data();
        setLocationRelativeTo(null);
    }
 private void Get_Data(){
         try{
               String sql="Select ID as 'Discharge ID', AdmitID as 'Admit ID',PatientID as 'Patient ID',PatientName as 'Patient Name',Gen as 'Gender',BG as 'Blood Group',Disease as 'Disease',AdmitDate as 'Admit Date',WardType as 'Ward Name',Doctor.DoctorID as 'Doctor ID',Doctor.DoctorName as 'Doctor Name',DischargeDate as 'Discharge Date',DP_Remarks as 'Remarks' from Doctor,DischargePatient_Ward where Doctor.DoctorID=dischargepatient_ward.DoctorID order by Dischargedate";
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
        setTitle("Patient Discharge Record");
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      try{
            con=Connect.ConnectDB();
            int row= jTable1.getSelectedRow();
            String table_click= jTable1.getModel().getValueAt(row, 0).toString();
             String sql="Select * from Doctor,DischargePatient_Ward where Doctor.DoctorID=dischargepatient_ward.DoctorID and ID=" + table_click + "";   
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
                String add14=rs.getString("WardName");
                frm.txtWardname.setText(add14);
                int add16 = rs.getInt("AdmitID");
                String add17= Integer.toString(add16);
                frm.txtAdmitID.setText(add17);
                String add18=rs.getString("DD");
                frm.txtDD.setText(add18);
                String add23=rs.getString("MM");
                frm.txtMM.setText(add23);
                String add22=rs.getString("YYYY");
                frm.txtYYYY.setText(add22);
                String add19=rs.getString("DP_Remarks");
                 frm.txtRemarks.setText(add19);
                 int add20 = rs.getInt("ID");
                String add21= Integer.toString(add20);
                frm.txtDischargeID.setText(add21);
               
                frm.btnDelete.setEnabled(true);
                frm.btnSave.setEnabled(false);
                frm.btnUpdate.setEnabled(true);
                
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
                new PatientDischargeRecord_Ward().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
