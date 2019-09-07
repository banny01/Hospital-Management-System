

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
public class Login extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
ResultSet rs2=null;
PreparedStatement pst2=null;
ResultSet rs3=null;
PreparedStatement pst3=null;
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
                 }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel3 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Form");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("User Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserNameMouseClicked(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 170, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 110, 20));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 170, -1));

        btnOK.setText("OK");
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKMouseClicked(evt);
            }
        });
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        btnOK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnOKKeyPressed(evt);
            }
        });
        jPanel2.add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 71, -1));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log111.png"))); // NOI18N
        jLabel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel4KeyPressed(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1350, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtUserNameMouseClicked

    private void btnOKMouseClicked(java.awt.event.MouseEvent evt) {                                   
    if (txtUserName.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter user name","Error", JOptionPane.ERROR_MESSAGE);
           return;
            
            }
    String Password= String.valueOf(txtPassword.getPassword());
        if (Password.equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter password","Error", JOptionPane.ERROR_MESSAGE);
           return;
          
            }
      con=Connect.ConnectDB();
      String sql= "select * from users where UserName= '" + txtUserName.getText() + "'and user_Password ='" + txtPassword.getText() + "'";
      
      try
      {
          pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
          
          if (rs.next()){
             //this.hide();
              System.out.println(",n,");
             String sql3= "select * from users where UserName= '" + txtUserName.getText() + "' and Status ='Doctor'";
             pst=con.prepareStatement(sql3);
          rs= pst.executeQuery();
          if (rs.next()){
              this.hide();
             MainMenuDoctor frm=new MainMenuDoctor();
                frm.setVisible(true);
          }
          String sql4= "select * from users where UserName= '" + txtUserName.getText() + "' and Status ='Admin'";
             pst=con.prepareStatement(sql4);
          rs= pst.executeQuery();
          if (rs.next()){
              this.hide();
             MainMenuUser frm=new MainMenuUser();
                frm.setVisible(true);
          }
           String sql5= "select * from users where UserName= '" + txtUserName.getText() + "' and Status ='Cashier'";
             pst=con.prepareStatement(sql5);
          rs= pst.executeQuery();
          if (rs.next()){
              this.hide();
             MainMenuBill frm=new MainMenuBill();
                frm.setVisible(true);
          }
          String sql6= "select * from users where UserName= '" + txtUserName.getText() + "' and Status ='User'";
             pst=con.prepareStatement(sql6);
          rs= pst.executeQuery();
          if (rs.next()){
              this.hide();
             MainMenuU frm=new MainMenuU();
                frm.setVisible(true);
          }  
             
          }
          
          else{
              
            JOptionPane.showMessageDialog(null, "Login Failed..Try again !","Access denied",JOptionPane.ERROR_MESSAGE);
          }
      }catch(SQLException | HeadlessException e){
         JOptionPane.showMessageDialog(null, e); 
          
    }                                     
    }                                  

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
    }//GEN-LAST:event_formWindowOpened

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
     if (evt.getKeyCode()==KeyEvent.VK_ENTER){
           
     if (txtUserName.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter user name","Error", JOptionPane.ERROR_MESSAGE);
           return;
            
            }
    String Password= String.valueOf(txtPassword.getPassword());
        if (Password.equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter password","Error", JOptionPane.ERROR_MESSAGE);
           return;
          
            }
      con=Connect.ConnectDB();
      String sql= "select * from users where UserName= '" + txtUserName.getText() + "'and user_Password ='" + txtPassword.getText() + "'";
      
      try
      {
          pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
          
          if (rs.next()){
             //this.hide();
              System.out.println(",n,");
             String sql3= "select * from users where UserName= '" + txtUserName.getText() + "' and Status ='Doctor'";
             pst=con.prepareStatement(sql3);
          rs= pst.executeQuery();
          if (rs.next()){
              this.hide();
             MainMenuDoctor frm=new MainMenuDoctor();
                frm.setVisible(true);
          }
          String sql4= "select * from users where UserName= '" + txtUserName.getText() + "' and Status ='Admin'";
             pst=con.prepareStatement(sql4);
          rs= pst.executeQuery();
          if (rs.next()){
              this.hide();
             MainMenuUser frm=new MainMenuUser();
                frm.setVisible(true);
          }
           String sql5= "select * from users where UserName= '" + txtUserName.getText() + "' and Status ='Cashier'";
             pst=con.prepareStatement(sql5);
          rs= pst.executeQuery();
          if (rs.next()){
              this.hide();
             MainMenuBill frm=new MainMenuBill();
                frm.setVisible(true);
          } 
           String sql6= "select * from users where UserName= '" + txtUserName.getText() + "' and Status ='User'";
             pst=con.prepareStatement(sql6);
          rs= pst.executeQuery();
          if (rs.next()){
              this.hide();
             MainMenuU frm=new MainMenuU();
                frm.setVisible(true);
          }  
          }
          
          else{
              
            JOptionPane.showMessageDialog(null, "Login Failed..Try again !","Access denied",JOptionPane.ERROR_MESSAGE);
          }
      }catch(SQLException | HeadlessException e){
         JOptionPane.showMessageDialog(null, e); 
          
    }  
     }
     
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
      /*if (txtUserName.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter user name","Error", JOptionPane.ERROR_MESSAGE);
           return;
            
            }
    String Password= String.valueOf(txtPassword.getPassword());
        if (Password.equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter password","Error", JOptionPane.ERROR_MESSAGE);
           return;
          
            }
      con=Connect.ConnectDB();
      String sql= "select * from users where UserName= '" + txtUserName.getText() + "'and user_Password ='" + txtPassword.getText() + "'";
      
      try
      {
          pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
          
          if (rs.next()){
             //this.hide();
              System.out.println(",n,");
             String sql3= "select * from users where UserName= '" + txtUserName.getText() + "' and Status ='Doctor'";
             pst=con.prepareStatement(sql3);
          rs= pst.executeQuery();
          if (rs.next()){
              this.hide();
             MainMenuDoctor frm=new MainMenuDoctor();
                frm.setVisible(true);
          }
          String sql4= "select * from users where UserName= '" + txtUserName.getText() + "' and Status ='User'";
             pst=con.prepareStatement(sql4);
          rs= pst.executeQuery();
          if (rs.next()){
              this.hide();
             MainMenuUser frm=new MainMenuUser();
                frm.setVisible(true);
          }
            
             
          }
          
          else{
              
            JOptionPane.showMessageDialog(null, "Login Failed..Try again !","Access denied",JOptionPane.ERROR_MESSAGE);
          }
      }catch(SQLException | HeadlessException e){
         JOptionPane.showMessageDialog(null, e); 
          
    } */
    }//GEN-LAST:event_btnOKActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnOKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnOKKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOKKeyPressed

    private void jLabel4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
