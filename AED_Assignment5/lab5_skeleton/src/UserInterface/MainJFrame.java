package UserInterface;

import Business.Business;
import Business.MasterOrderCatalog;
import Business.SupplierDirectory;
import UserInterface.AdminstrativeRole.AdminWorkAreaJPanel;
import UserInterface.CustomerRole.CustomerWorkAreaJPanel;
import UserInterface.SupplierRole.LoginSupplier;
import java.awt.CardLayout;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class MainJFrame extends javax.swing.JFrame {
    
    /** Creates new form MainJFrame */
    private SupplierDirectory supplierDirectory;
    private MasterOrderCatalog masterOrderCatalog; 
    public MainJFrame() {
        initComponents();
        Business business=new Business();
        supplierDirectory=business.getSupplierDirectory();
        masterOrderCatalog=business.getMasterOrderCatalog();
        setSize(1000, 800);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        btnSupplierManager = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(150);

        btnAdmin.setText("Administrator");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnSupplierManager.setText("Supplier Manager");
        btnSupplierManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierManagerActionPerformed(evt);
            }
        });

        btnCustomer.setText("Customer Role");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSupplierManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnSupplierManager)
                .addGap(18, 18, 18)
                .addComponent(btnCustomer)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed

        AdminWorkAreaJPanel awajp = new AdminWorkAreaJPanel(userProcessContainer, supplierDirectory);
        userProcessContainer.add("AdminWorkAreaJPanel",awajp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnSupplierManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierManagerActionPerformed

        LoginSupplier ls = new LoginSupplier(userProcessContainer, supplierDirectory);
        userProcessContainer.add("LoginSupplierJPanel", ls);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSupplierManagerActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        CustomerWorkAreaJPanel cwajp = new CustomerWorkAreaJPanel(userProcessContainer, supplierDirectory, masterOrderCatalog);
        userProcessContainer.add("CustomerWorkAreaJPanel", cwajp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        
    }//GEN-LAST:event_btnCustomerActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnSupplierManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables

}
