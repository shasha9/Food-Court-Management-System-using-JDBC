import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class order_detail extends javax.swing.JFrame {

    /**
     * Creates new form order_detail
     */
    public order_detail() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbCash = new javax.swing.JRadioButton();
        rbCard = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        rbHome = new javax.swing.JRadioButton();
        rbStore = new javax.swing.JRadioButton();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf7 = new javax.swing.JTextField();
        tf8 = new javax.swing.JTextField();
        tf9 = new javax.swing.JTextField();
        tf10 = new javax.swing.JTextField();
        generate = new javax.swing.JButton();
        totprice = new javax.swing.JButton();
        grtotal = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 60, 36, 17);

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel3.setText("Address");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 100, 49, 17);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(146, 167, 0, 0);

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel5.setText("Contact No.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 140, 72, 17);

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel6.setText("Item");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 190, 28, 17);

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel7.setText("Price");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 240, 29, 17);

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel8.setText("Quantity");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(390, 290, 54, 17);

        jLabel9.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel9.setText("MODE OF PAYMENT");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(79, 316, 139, 19);

        buttonGroup1.add(rbCash);
        rbCash.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        rbCash.setText("CASH");
        rbCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCashActionPerformed(evt);
            }
        });
        getContentPane().add(rbCash);
        rbCash.setBounds(79, 357, 63, 27);

        buttonGroup1.add(rbCard);
        rbCard.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        rbCard.setText("DEBIT/CREDIT CARD");
        rbCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCardActionPerformed(evt);
            }
        });
        getContentPane().add(rbCard);
        rbCard.setBounds(79, 408, 165, 27);

        jLabel10.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel10.setText("PICK UP");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(553, 316, 56, 19);

        buttonGroup2.add(rbHome);
        rbHome.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        rbHome.setText("HOME DELIEVERY");
        getContentPane().add(rbHome);
        rbHome.setBounds(513, 408, 151, 27);

        buttonGroup2.add(rbStore);
        rbStore.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        rbStore.setText("AT STORE");
        getContentPane().add(rbStore);
        rbStore.setBounds(513, 357, 93, 27);
        getContentPane().add(tf1);
        tf1.setBounds(480, 60, 150, 30);
        getContentPane().add(tf2);
        tf2.setBounds(480, 100, 150, 30);
        getContentPane().add(tf3);
        tf3.setBounds(480, 140, 150, 30);
        getContentPane().add(tf4);
        tf4.setBounds(480, 190, 150, 30);
        getContentPane().add(tf5);
        tf5.setBounds(480, 240, 150, 30);
        getContentPane().add(tf6);
        tf6.setBounds(480, 280, 150, 30);

        jLabel11.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel11.setText("Tax");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(149, 529, 22, 17);

        jLabel12.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel12.setText("Delievery Charge");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(113, 571, 103, 17);
        getContentPane().add(tf7);
        tf7.setBounds(260, 467, 160, 30);

        tf8.setText("30");
        getContentPane().add(tf8);
        tf8.setBounds(260, 517, 160, 30);

        tf9.setText("50");
        getContentPane().add(tf9);
        tf9.setBounds(260, 569, 160, 30);
        getContentPane().add(tf10);
        tf10.setBounds(260, 625, 160, 30);

        generate.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        generate.setText("ORDER AND GENERATE INVOICE");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        getContentPane().add(generate);
        generate.setBounds(457, 474, 415, 54);

        totprice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        totprice.setText("TOTAL PRICE");
        totprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totpriceActionPerformed(evt);
            }
        });
        getContentPane().add(totprice);
        totprice.setBounds(91, 474, 125, 25);

        grtotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        grtotal.setText("GRAND TOTAL");
        grtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grtotalActionPerformed(evt);
            }
        });
        getContentPane().add(grtotal);
        grtotal.setBounds(85, 622, 131, 25);

        back.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        back.setText("BACK TO MAIN MENU");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(573, 570, 239, 31);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setText("TASTY BITES FOOD COURT-INVOICE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(287, 12, 349, 22);

        exit.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        exit.setText("EXIT ");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(222, 674, 361, 33);

        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 60, 320, 230);

        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(670, 30, 220, 180);

        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(670, 240, 220, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
int tax=30;
int delievery=50; 
String name=tf1.getText();
String address=tf2.getText(); 
String mobile=tf3.getText();
String item=tf4.getText();
int price=Integer.parseInt(tf5.getText());
int qty=Integer.parseInt(tf6.getText());

if(rbCard.isSelected())
{
    tax=tax-30;
    tf8.setText(Integer.toString(tax));
    JOptionPane.showMessageDialog(this,"NO TAX AS YOU ARE USING CASHLESS TRANSACTION");
}
else if(rbCash.isSelected())
{
    tax=30;
   tf8.setText(Integer.toString(tax));
}
if(rbHome.isSelected())
{
    tf9.setText(Integer.toString(delievery));
}
else if(rbStore.isSelected())
{
    delievery=delievery-50;
    tf9.setText(Integer.toString(delievery));
}













// TODO add your handling code here:
    }//GEN-LAST:event_generateActionPerformed

    private void totpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totpriceActionPerformed
int x=Integer.parseInt(tf5.getText());
int y=Integer.parseInt(tf6.getText());
        tf7.setText(Integer.toString(x*y));
        

// TODO add your handling code here:
    }//GEN-LAST:event_totpriceActionPerformed

    private void grtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grtotalActionPerformed
int x=Integer.parseInt(tf7.getText());
int y=Integer.parseInt(tf8.getText());
int z=Integer.parseInt(tf9.getText());
 tf10.setText(Integer.toString(x+y+z));

// TODO add your handling code here:
    }//GEN-LAST:event_grtotalActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
options op=new options();
op.setVisible(true);
this.setVisible(false);
        

// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void rbCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCashActionPerformed

    private void rbCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCardActionPerformed

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
            java.util.logging.Logger.getLogger(order_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(order_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(order_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(order_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new order_detail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton exit;
    private javax.swing.JButton generate;
    private javax.swing.JButton grtotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbCard;
    private javax.swing.JRadioButton rbCash;
    private javax.swing.JRadioButton rbHome;
    private javax.swing.JRadioButton rbStore;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    private javax.swing.JButton totprice;
    // End of variables declaration//GEN-END:variables
}
