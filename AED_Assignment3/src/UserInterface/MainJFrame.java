/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.ComputerCollection;
import Business.HardwareCollection;
import Business.PrinterCollection;
import Business.SoftwareCollection;
import java.awt.CardLayout;
import java.awt.Dimension;

/**
 *
 * @author prane
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private ComputerCollection computerCollection;
    private PrinterCollection printerCollection;
    private SoftwareCollection softwareCollection;
    private HardwareCollection hardwareCollection;
    
    public MainJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(new Dimension(1000,850));
       
        this.computerCollection=new ComputerCollection();
        this.printerCollection=new PrinterCollection();
        this.softwareCollection=new SoftwareCollection();
        this.hardwareCollection=new HardwareCollection();
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        // TODO add your handdiling code here:
        setLocationRelativeTo(null);
        setSize(new Dimension(1000,850));
    }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPanel = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        customerjButton = new javax.swing.JButton();
        vendorjButton = new javax.swing.JButton();
        exitjButton = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel1.setText("Log in as -->");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        customerjButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        customerjButton.setText("Customer");
        customerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerjButtonActionPerformed(evt);
            }
        });
        jPanel2.add(customerjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        vendorjButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        vendorjButton.setText("Vendor");
        vendorjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorjButtonActionPerformed(evt);
            }
        });
        jPanel2.add(vendorjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 110, -1));

        exitjButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        exitjButton.setText("Exit");
        exitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitjButtonActionPerformed(evt);
            }
        });
        jPanel2.add(exitjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 110, 30));

        splitPanel.setLeftComponent(jPanel2);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPanel.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(splitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vendorjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorjButtonActionPerformed
        VendorWorkareaJPanel panel = new VendorWorkareaJPanel(userProcessContainer,computerCollection,printerCollection, softwareCollection, hardwareCollection);
        userProcessContainer.add("VendorWorkareaJPanel",panel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_vendorjButtonActionPerformed

    private void customerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerjButtonActionPerformed
       CustomerWorkareaJPanel panel=new CustomerWorkareaJPanel(userProcessContainer,computerCollection, printerCollection, softwareCollection, hardwareCollection);
        userProcessContainer.add("CustomerWorkareaJPanel",panel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_customerjButtonActionPerformed

    private void exitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitjButtonActionPerformed
        dispose();
    }//GEN-LAST:event_exitjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customerjButton;
    private javax.swing.JButton exitjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JPanel userProcessContainer;
    private javax.swing.JButton vendorjButton;
    // End of variables declaration//GEN-END:variables
}
