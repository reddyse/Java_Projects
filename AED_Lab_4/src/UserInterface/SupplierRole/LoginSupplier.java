/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierRole;

import Business.Supplier;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.Supplier;

/**
 *
 * @author prane
 */
public class LoginSupplier extends javax.swing.JPanel {

    /**
     * Creates new form LoginSupplier
     */
    JPanel userProcessContainer;
    SupplierDirectory supplierDirectory;
    public LoginSupplier(JPanel upc, SupplierDirectory sd) {
        initComponents();
        userProcessContainer =upc;
        supplierDirectory =sd;
        supplierComboBox.removeAllItems();
        
        for(Supplier supplier:supplierDirectory.getSupplierDirectory())
        {
            supplierComboBox.addItem(supplier);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        supplierComboBox = new javax.swing.JComboBox();
        btnFind = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Supplier Login");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 29, -1, -1));

        jLabel2.setText("Supplier Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 152, -1, -1));

        supplierComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(supplierComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 149, 132, -1));

        btnFind.setText("GO>>");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 148, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        
        Supplier supplier=(Supplier) supplierComboBox.getSelectedItem();
        SupplierWorkAreaJPanel swaj=new SupplierWorkAreaJPanel(userProcessContainer,supplier);
        userProcessContainer.add("SupplierWorkAreaJPanel",swaj);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFindActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox supplierComboBox;
    // End of variables declaration//GEN-END:variables
}
