/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Product;
import javax.swing.JOptionPane;

/**
 *
 * @author Arvind
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    //Object to store and retrieve values.
    private Product productobj;
    public CreateJPanel(Product productobj) {
        initComponents();
        this.productobj = productobj;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        availnumLbl = new javax.swing.JLabel();
        descLbl = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        availnumberTextField = new javax.swing.JTextField();
        descriptionTextField = new javax.swing.JTextField();
        createheaderLbl = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        nameLbl.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        nameLbl.setText("Name");

        priceLbl.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        priceLbl.setText("Price");

        availnumLbl.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        availnumLbl.setText("Availability Number:");

        descLbl.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        descLbl.setText("Description :");

        nameTextField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        priceTextField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        availnumberTextField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        descriptionTextField.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        createheaderLbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        createheaderLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createheaderLbl.setText("Create Your Product");

        createBtn.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        createBtn.setText("Add");
        createBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descLbl)
                            .addComponent(availnumLbl)
                            .addComponent(priceLbl)
                            .addComponent(nameLbl))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameTextField)
                            .addComponent(priceTextField)
                            .addComponent(availnumberTextField)
                            .addComponent(descriptionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(createheaderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(createheaderLbl)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLbl)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availnumLbl)
                    .addComponent(availnumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descLbl)
                    .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        
        //Using abpve object created to store the values that are taken from the user input page.
         productobj.setName(nameTextField.getText());
         productobj.setPrice(priceTextField.getText());
         productobj.setAvailNum(availnumberTextField.getText());
         productobj.setDescription(descriptionTextField.getText());
         JOptionPane.showMessageDialog(null, "Product Successfully Created.");

         
    }//GEN-LAST:event_createBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availnumLbl;
    private javax.swing.JTextField availnumberTextField;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel createheaderLbl;
    private javax.swing.JLabel descLbl;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JTextField priceTextField;
    // End of variables declaration//GEN-END:variables
}
