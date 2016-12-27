/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.SystemAdminWorkArea;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import userinterface.SystemAdminWorkArea.ManageEnterpriseJPanel;
import userinterface.SystemAdminWorkArea.ManageEnterpriseAdminJPanel;
import userinterface.SystemAdminWorkArea.ManageNetworkJPanel;


/**
 *
 * @author pranee
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;

    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTree();
    }

    public void populateTree() {

        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
        ArrayList<Network> networkList = system.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;

        Network network;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();//remove All Children
        root.insert(networks, 0);//insert first node inside the root
        DefaultMutableTreeNode networkNode; //create object of network node
        DefaultMutableTreeNode enterpriseNode; //create object of enterprise node
        DefaultMutableTreeNode organizationNode; //create object of organization node

        for (int i = 0; i < networkList.size(); i++) {
            network = networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getName());//we're adding other network to the exist Network node, we need to use the existing Network node to add the next network node
            networks.insert(networkNode, i);//insert network node

            enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();

            for (int j = 0; j < enterpriseList.size(); j++) {
                enterprise = enterpriseList.get(j);
                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);//insert enterprise node

                organizationList = enterprise.getOrganizationDirectory().getOrganizationList();

                for (int k = 0; k < organizationList.size(); k++) {
                    organization = organizationList.get(k);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);//insert organization node

                    //organizationList=enterprise.getOrganizationDirectory().getOrganizationList(); we don't need it cuz our hierarchy stopped here
                }//organization
            }//enterprise
        }//network

        model.reload();//to populate jTree
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        selectedNodeJLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        manageNetworkBtn = new javax.swing.JButton();
        manageEnterpriseAdminBtn = new javax.swing.JButton();
        manageEnterpriseBtn1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        selectedNodeJLabel.setText("<view_selected_node>");

        jLabel2.setText("Selected Node:");

        manageNetworkBtn.setText("Manage Network");
        manageNetworkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkBtnActionPerformed(evt);
            }
        });

        manageEnterpriseAdminBtn.setText("Manage Enterprise Admin");
        manageEnterpriseAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseAdminBtnActionPerformed(evt);
            }
        });

        manageEnterpriseBtn1.setText("Manage Enterprise");
        manageEnterpriseBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(selectedNodeJLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageEnterpriseAdminBtn)
                            .addComponent(manageNetworkBtn)
                            .addComponent(manageEnterpriseBtn1))))
                .addContainerGap(301, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jLabel2)
                    .addContainerGap(631, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(selectedNodeJLabel)
                .addGap(91, 91, 91)
                .addComponent(manageNetworkBtn)
                .addGap(57, 57, 57)
                .addComponent(manageEnterpriseBtn1)
                .addGap(46, 46, 46)
                .addComponent(manageEnterpriseAdminBtn)
                .addContainerGap(205, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jLabel2)
                    .addContainerGap(505, Short.MAX_VALUE)))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageNetworkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkBtnActionPerformed
        // TODO add your handling code here:
        ManageNetworkJPanel panel = new ManageNetworkJPanel(userProcessContainer, system);
        userProcessContainer.add("ManageNetworkJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageNetworkBtnActionPerformed

    private void manageEnterpriseBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseBtn1ActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseJPanel panel = new ManageEnterpriseJPanel(userProcessContainer, system);
        userProcessContainer.add("ManageEnterpriseJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEnterpriseBtn1ActionPerformed

    private void manageEnterpriseAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseAdminBtnActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdminJPanel panel = new ManageEnterpriseAdminJPanel(userProcessContainer, system);
        userProcessContainer.add("ManageEnterpriseAdminJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEnterpriseAdminBtnActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
        // TODO add your handling code here:
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            selectedNodeJLabel.setText(selectedNode.toString());
        }

    }//GEN-LAST:event_jTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JButton manageEnterpriseAdminBtn;
    private javax.swing.JButton manageEnterpriseBtn1;
    private javax.swing.JButton manageNetworkBtn;
    private javax.swing.JLabel selectedNodeJLabel;
    // End of variables declaration//GEN-END:variables
}
