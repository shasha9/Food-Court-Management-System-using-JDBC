/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Compaq
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        begin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 255));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel1.setText("    WELCOME TO DATABASE CONNECTIVITY");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 35, 614, 39);

        jLabel2.setFont(new java.awt.Font("AngsanaUPC", 1, 36)); // NOI18N
        jLabel2.setText("       TASTY BITES FOOD COURT MANAGEMENT SYSTEM");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 106, 856, 40);

        begin.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        begin.setText("BEGIN");
        begin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginActionPerformed(evt);
            }
        });
        getContentPane().add(begin);
        begin.setBounds(273, 304, 95, 38);

        jLabel5.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        jLabel5.setText("Developed By :-");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(451, 174, 177, 28);

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel6.setText("SHASHA SAMI");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(413, 229, 249, 41);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 740, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void beginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginActionPerformed
login in=new login();
in.setVisible(true);
this.setVisible(false);
        


// TODO add your handling code here:
    }//GEN-LAST:event_beginActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton begin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
