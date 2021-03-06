
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class PORecord extends javax.swing.JFrame {

    /**
     * Creates new form PSRecord
     */
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public PORecord() {
        initComponents();
         con= Connect.ConnectDB();
        Get_Data();
        setLocationRelativeTo(null);
    }
    
    private void Get_Data(){
       String sql="select POID as 'POID', OperationID as 'Operation ID', OperationName as 'Operation Name',OperationDate as 'Operation Date',Charge as 'Total Charge',Status as 'Status',PatientRegistration.PatientID as 'Patient ID',PatientName as 'Patient Name' from PatientRegistration,Operations where Operations.PatientID=PatientRegistration.PatientID order by PatientName";
       try{         pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         pstbl.setModel(DbUtils.resultSetToTableModel(rs));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        pstbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pstbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pstblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pstbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pstblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pstblMouseClicked
        // TODO add your handling code here:
        try{
            con=Connect.ConnectDB();
            int row= pstbl.getSelectedRow();
            String table_click= pstbl.getModel().getValueAt(row, 0).toString();
           String sql=" Select * from PatientRegistration,Operations where Operations.PatientID=PatientRegistration.PatientID and POID=" + table_click  + "";
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){

                this.hide();
                Operations frm = new Operations();
                frm.setVisible(true);
                String add1=rs.getString("OperationName");
                frm.txtServiceName.setText(add1);
                String add2=rs.getString("OperationDate");
                frm.txtServiceDate.setText(add2);
                String add3=rs.getString("PatientName");
                frm.txtPatientName.setText(add3);
                String add4=rs.getString("PatientID");
                frm.txtPatientID.setText(add4);
                int add5 = rs.getInt("OperationID");
                String add6= Integer.toString(add5);
                frm.txtServiceID.setText(add6);
                int add7 = rs.getInt("POID");
                String add8= Integer.toString(add7);
                frm.PSID.setText(add8);
                //int add9 = rs.getInt("QTY");
                //String add10= Integer.toString(add9);
                //frm.txtQty.setText(add10);
                
                
                frm.btnSave.setEnabled(false);
                frm.btnDelete.setEnabled(true);
                frm.btnUpdate.setEnabled(true);
               
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_pstblMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.hide();
        Operations frm = new Operations();
                frm.setVisible(true);
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
            java.util.logging.Logger.getLogger(PSRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PSRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PSRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PSRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PORecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pstbl;
    // End of variables declaration//GEN-END:variables
}
