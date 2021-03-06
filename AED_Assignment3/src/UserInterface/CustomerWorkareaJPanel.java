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
import javax.swing.JPanel;

/**
 *
 * @author prane
 */


public class CustomerWorkareaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkareaJPanel
     */
private JPanel userProcessContainer;
private ComputerCollection computerCollection;
private PrinterCollection printerCollection;
private HardwareCollection hardwareCollection;
private SoftwareCollection softwareCollection;
    

public CustomerWorkareaJPanel(JPanel userProcessJpanel, ComputerCollection computerCollection, PrinterCollection printerCollection, SoftwareCollection softwareCollection, HardwareCollection hardwareCollection) {
        initComponents();
         this.userProcessContainer = userProcessJpanel;
        this.computerCollection = computerCollection;
        this.printerCollection  = printerCollection;
        this.softwareCollection=softwareCollection;
        this.hardwareCollection=hardwareCollection;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrintersjButton = new javax.swing.JButton();
        ComputersjButton = new javax.swing.JButton();
        HardwaresjButton = new javax.swing.JButton();
        SoftwaresjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PrintersjButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        PrintersjButton.setText("Printers");
        PrintersjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintersjButtonActionPerformed(evt);
            }
        });
        add(PrintersjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 150, 90));

        ComputersjButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ComputersjButton.setText("Computers");
        ComputersjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputersjButtonActionPerformed(evt);
            }
        });
        add(ComputersjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 150, 90));

        HardwaresjButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        HardwaresjButton.setText("Hardwares");
        HardwaresjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HardwaresjButtonActionPerformed(evt);
            }
        });
        add(HardwaresjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 150, 90));

        SoftwaresjButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        SoftwaresjButton.setText("Softwares");
        SoftwaresjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoftwaresjButtonActionPerformed(evt);
            }
        });
        add(SoftwaresjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 150, 90));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel1.setText("What are you looking for?");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 300, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void PrintersjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintersjButtonActionPerformed
        
        SearchPrintersJPanel panel = new SearchPrintersJPanel(userProcessContainer,printerCollection);
        userProcessContainer.add("SearchPrintersJPanel", panel);
        CardLayout layout =  (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_PrintersjButtonActionPerformed

    private void ComputersjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputersjButtonActionPerformed
        
        SearchComputersJPanel panel = new SearchComputersJPanel(userProcessContainer,computerCollection);
        userProcessContainer.add("SearchComputersJPanel", panel);
        CardLayout layout =  (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_ComputersjButtonActionPerformed

    private void SoftwaresjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoftwaresjButtonActionPerformed
        SearchSoftwaresJPanel panel = new SearchSoftwaresJPanel(userProcessContainer,softwareCollection);
        userProcessContainer.add("SearchSoftwaresJPanel", panel);
        CardLayout layout =  (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_SoftwaresjButtonActionPerformed

    private void HardwaresjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HardwaresjButtonActionPerformed
        SearchHardwareJPanel panel = new SearchHardwareJPanel(userProcessContainer,hardwareCollection);
        userProcessContainer.add("SearchHardwaresJPanel", panel);
        CardLayout layout =  (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_HardwaresjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComputersjButton;
    private javax.swing.JButton HardwaresjButton;
    private javax.swing.JButton PrintersjButton;
    private javax.swing.JButton SoftwaresjButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
