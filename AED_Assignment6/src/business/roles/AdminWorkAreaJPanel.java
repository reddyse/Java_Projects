/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import lab7.Business;
import javax.swing.JPanel;

/**
 *
 * @author prane
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    public AdminWorkAreaJPanel(JPanel userProcessContainer,Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business=business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerJLabel = new javax.swing.JLabel();
        btnManageEmployee = new javax.swing.JButton();
        btnManageUserAccounts = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headerJLabel.setText("Admin Work Area");
        add(headerJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 29, -1, -1));

        btnManageEmployee.setText("Manage Market");
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });
        add(btnManageEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 102, 143, -1));

        btnManageUserAccounts.setText("Manage User Accounts");
        btnManageUserAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserAccountsActionPerformed(evt);
            }
        });
        add(btnManageUserAccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 184, 143, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed
        // TODO add your handling code here:
//        ManageEmployeesJPanel mejp = new ManageEmployeesJPanel(userProcessContainer,business);
//        userProcessContainer.add("ManageEmployeesJPanel", mejp);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnManageUserAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserAccountsActionPerformed
        // TODO add your handling code here:
//        ManageUserAccountsJPanel muajp = new ManageUserAccountsJPanel(userProcessContainer,business);
//        userProcessContainer.add("ManageUserAccountsJPanel",muajp);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageUserAccountsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageUserAccounts;
    private javax.swing.JLabel headerJLabel;
    // End of variables declaration//GEN-END:variables
}
