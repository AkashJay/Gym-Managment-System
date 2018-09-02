/*
 * addPackage.java
 *
 * Created on January 5, 2017, 6:57 PM
 */

package mansa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  User
 */
public class addPackage extends javax.swing.JFrame {
    String selectedpackage;
    /** Creates new form addPackage */
    public addPackage() {
        initComponents();
        txtname.setText("");
        txtduration.setText("");
        txtprice.setText("");
        
      
        updateTable();
        
        
    }
    public void  updateTable() {
        try {
        
        Connection c=DB.mycon();
        Statement s=c.createStatement();
        ResultSet rs= s.executeQuery("SELECT * FROM `package` WHERE 1");
        
       while(rs.next()){
             
                DefaultTableModel a=(DefaultTableModel)table1.getModel();
                a.addRow(new Object[] {rs.getString("name"),rs.getString("duration"),rs.getString("price")});
               
              
             }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    }
    public void  clearTable() {
    
               DefaultTableModel aj=(DefaultTableModel)table1.getModel();
    
                 while(aj.getRowCount() > 0){
    
                         for(int i=0;i<aj.getRowCount();i++){
                        aj.removeRow(i);
                        }
                  }
    
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtduration = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Package Name : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtname.setForeground(new java.awt.Color(204, 0, 0));
        txtname.setText("jTextField1");
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 220, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Duration : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtduration.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtduration.setForeground(new java.awt.Color(204, 0, 0));
        txtduration.setText("jTextField1");
        txtduration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdurationActionPerformed(evt);
            }
        });
        jPanel1.add(txtduration, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 220, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Price : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtprice.setForeground(new java.awt.Color(204, 0, 0));
        txtprice.setText("jTextField1");
        txtprice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpriceMouseClicked(evt);
            }
        });
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 220, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 130, 60));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 130, 60));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 130, 60));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 204));
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 130, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 440, 380));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table1.setForeground(new java.awt.Color(0, 0, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Package Name", "Duration", "Price"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 420, 300));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel1.setText("Current Packages");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 440, 380));

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add New Packages");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 0, 0));
        jButton5.setText("HOME");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 130, 70));

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("MANSA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 50));

        jLabel14.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fittness");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backg.jpg"))); // NOI18N
        jLabel7.setText("hjjh");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        setSize(new java.awt.Dimension(1036, 682));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
// TODO add your handling code here:
    txtduration.grabFocus();
    
  
}//GEN-LAST:event_txtnameActionPerformed

private void txtdurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdurationActionPerformed
// TODO add your handling code here:
    txtprice.grabFocus();
}//GEN-LAST:event_txtdurationActionPerformed

private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
// TODO add your handling code here:
   
}//GEN-LAST:event_txtpriceActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    
    try {
        
        int x=JOptionPane.showConfirmDialog(rootPane, "DO you Want To Add this new Package");
        
        if(x==0){
        
            Connection c=DB.mycon();
            Statement s=c.createStatement();
            s.executeUpdate(" INSERT INTO `package`( `name`, `duration`, `price`) VALUES ('"+txtname.getText()+"','"+txtduration.getText()+"','"+txtprice.getText()+"')  ");
        
            JOptionPane.showMessageDialog(rootPane, "New Package Added Sucsessfully..");
                clearTable();   
                updateTable();
            
            
        txtname.setText("");
        txtduration.setText("");
        txtprice.setText("");
        }
        else if(x==1){
        
            txtname.setText("");
            txtduration.setText("");
            txtprice.setText("");
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
   
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
    try {
        
        Connection c=DB.mycon();
        Statement s=c.createStatement();
        ResultSet rs= s.executeQuery("SELECT * FROM `package` WHERE name='"+txtname.getText()+"'");
        
        while(rs.next()){
            selectedpackage=rs.getString("id");
            txtduration.setText(rs.getString("duration"));
            txtname.setText(rs.getString("name"));
            txtprice.setText(rs.getString("price"));
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
    
    try {
        
        int x=JOptionPane.showConfirmDialog(rootPane, "Do you want to update this data??");
        
        if(x==0){
        Connection c=DB.mycon();
        Statement s=c.createStatement();
        s.executeUpdate(" UPDATE `package` SET `name`='"+txtname.getText()+"',`duration`='"+txtduration.getText()+"',`price`='"+txtprice.getText()+"' WHERE name='"+selectedpackage+"' ");
       
        JOptionPane.showMessageDialog(rootPane, "Data successfully Updated..");
        txtname.setText("");
        txtduration.setText("");
        txtprice.setText("");
                clearTable();   
                updateTable();
        
        }
        else if(x==1){
              txtname.setText("");
        txtduration.setText("");
        txtprice.setText("");
        }
        
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    try {
        int x=JOptionPane.showConfirmDialog(rootPane, "Do yo want to DELETE this package??");
        if(x==0){
                Connection c=DB.mycon();
                Statement s=c.createStatement();
                s.executeUpdate("DELETE FROM `package` WHERE name='"+selectedpackage+"'");
                clearTable();   
                updateTable();
                JOptionPane.showMessageDialog(rootPane, "Package Deleted...");
              txtname.setText("");
              txtduration.setText("");
              txtprice.setText("");
                
               
        }
          else if(x==1){
              txtname.setText("");
              txtduration.setText("");
              txtprice.setText("");
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here:
       new home().setVisible(true);
    this.dispose();
}//GEN-LAST:event_jButton5ActionPerformed

private void txtpriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpriceMouseClicked
// TODO add your handling code here:
    
        
    
    
}//GEN-LAST:event_txtpriceMouseClicked

private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
// TODO add your handling code here:
    DefaultTableModel model=(DefaultTableModel)table1.getModel();
    int x=table1.getSelectedRow();
    txtname.setText(model.getValueAt(x, 0).toString());
    selectedpackage=txtname.getText();
     txtduration.setText(model.getValueAt(x, 1).toString());
      txtprice.setText(model.getValueAt(x, 2).toString());
}//GEN-LAST:event_table1MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addPackage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtduration;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables

}