/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResumeInterface;
import Career.Resume;
import Career.ResumeHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prane
 */
public class ViewResumeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewResumeJPanel
     */
    private ResumeHistory resumehistoryobj;
    public ViewResumeJPanel(ResumeHistory resumehistoryobj) {
        initComponents();
        this.resumehistoryobj=resumehistoryobj;
        //displayProfile(resumeobj);
        populateTable();
    }
    
    private void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) resumeJTable.getModel();
        dtm.setRowCount(0);

        for (Resume resumeobj : resumehistoryobj.getResumeHistory()) 
        {
            Object row[] = new Object[2];
            row[0] = resumeobj;
            row[1] = resumeobj.getFirstname();
            dtm.addRow(row);
            
        }
    }
/*private void displayProfile(Resume resumeobj)
    {
        //Fetching data from objects and storing in the variables.
        String firstName = resumeobj.getFirstname();
        String lastName = resumeobj.getLastname();
        String address = resumeobj.getAddress();
        String contact = resumeobj.getPhonenumber();
        String linkedinprof = resumeobj.getLinkedinprof();
        String careerobjective = resumeobj.getCareerobjective();
        String gradcollegename = resumeobj.getEdugradname();
        String gradcollegedate = resumeobj.getEdugraddate();
        String undergradcollegedate = resumeobj.getEduundergraddate();
        String undergradcollegename = resumeobj.getEduundergradname();
        String skill=resumeobj.getSkill();
        String certification=resumeobj.getCertification();
        String schooldate = resumeobj.getEduhighschooldate();
        String schoolname = resumeobj.getEduhighschoolname();
        
        //displaying in the labels of the view page using the variables.
        nameLbl.setText(firstName+""+lastName);
        addressLbl.setText(address);
        phoneLbl.setText(contact);
        linkedinLbl.setText(linkedinprof);
        careerobjectiveLbl.setText(careerobjective);
        gradnameLbl.setText(gradcollegename);
        graddateLbl.setText(gradcollegedate);
        undergraddateLbl.setText(undergradcollegedate);
        schoolnameLbl.setText(undergradcollegename);
        skillsLbl.setText(skill);
        certificationsLbl.setText(certification);
        schooldateLbl.setText(schooldate);
        schoolnameLbl.setText(schoolname);
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addressLbl = new java.awt.Label();
        phoneLbl = new java.awt.Label();
        linkedinLbl = new java.awt.Label();
        label4 = new java.awt.Label();
        gradnameLbl = new java.awt.Label();
        undergraddateLbl = new java.awt.Label();
        schoolnameLbl = new java.awt.Label();
        graddateLbl = new java.awt.Label();
        label9 = new java.awt.Label();
        certificationsLbl = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        careerobjectiveLbl = new javax.swing.JLabel();
        label11 = new java.awt.Label();
        skillsLbl = new java.awt.Label();
        undergradnameLbl1 = new java.awt.Label();
        schooldateLbl = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resumeJTable = new javax.swing.JTable();
        viewdetailBtn = new javax.swing.JButton();
        deleteentryBtn = new javax.swing.JButton();

        nameLbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        nameLbl.setText("Name of the Candidate");

        jLabel2.setText("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        addressLbl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        addressLbl.setText("Address of the candidate");

        phoneLbl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        phoneLbl.setText("Phone contact");

        linkedinLbl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        linkedinLbl.setText("LinkedIn Profile");

        label4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        label4.setText("Education");

        gradnameLbl.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        gradnameLbl.setText("Grad College");

        undergraddateLbl.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        undergraddateLbl.setText("Date");

        schoolnameLbl.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        schoolnameLbl.setText("High School");

        graddateLbl.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        graddateLbl.setText("Date");

        label9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        label9.setText("Certifications");

        certificationsLbl.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        certificationsLbl.setText("List of Certifications");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Career Objective");

        careerobjectiveLbl.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        careerobjectiveLbl.setText("Career Objective Statement");

        label11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        label11.setText("Skills");

        skillsLbl.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        skillsLbl.setText("List of Skills");

        undergradnameLbl1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        undergradnameLbl1.setText("Undergrad College");

        schooldateLbl.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        schooldateLbl.setText("Date");

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Photograph");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/default_profile_picture.png"))); // NOI18N
        jLabel4.setDoubleBuffered(true);

        resumeJTable.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        resumeJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ));
        jScrollPane1.setViewportView(resumeJTable);

        viewdetailBtn.setText("View Details");
        viewdetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewdetailBtnActionPerformed(evt);
            }
        });

        deleteentryBtn.setText("Delete Entry");
        deleteentryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteentryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(careerobjectiveLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(gradnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(213, 213, 213)
                                            .addComponent(graddateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(undergradnameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(schoolnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(181, 181, 181)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(undergraddateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(schooldateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(certificationsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(skillsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(phoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(linkedinLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(viewdetailBtn)
                .addGap(87, 87, 87)
                .addComponent(deleteentryBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewdetailBtn)
                    .addComponent(deleteentryBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(linkedinLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(careerobjectiveLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(undergraddateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(schooldateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gradnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(graddateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(undergradnameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(schoolnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(skillsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(certificationsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        addressLbl.getAccessibleContext().setAccessibleName("addressLbl");
        certificationsLbl.getAccessibleContext().setAccessibleName("Certifications");
    }// </editor-fold>//GEN-END:initComponents

    private void deleteentryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteentryBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedrow = resumeJTable.getSelectedRow();

        if (selectedrow >= 0) {
            int response = JOptionPane.showConfirmDialog(null, "Are you sure if these values are to be deleted?", null, JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.YES_OPTION) 
            {
                Resume vs = (Resume) resumeJTable.getValueAt(selectedrow, 0);
                resumehistoryobj.deleteResume(vs);
                JOptionPane.showMessageDialog(null, "Resume deleted");
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select any row");
        }
        
        
    }//GEN-LAST:event_deleteentryBtnActionPerformed

    private void viewdetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewdetailBtnActionPerformed
        // TODO add your handling code here:
        int selectedrow = resumeJTable.getSelectedRow();

        if (selectedrow >= 0) {
            Resume vs = (Resume) resumeJTable.getValueAt(selectedrow, 0);
            //bloodpressureTextField.setText(String.valueOf(vs.getBloodPressure()));
            //temperatureTextField.setText(String.valueOf(vs.getTemperature()));
            //pulseTextField.setText(String.valueOf(vs.getPulse()));
            //dateTextField.setText(String.valueOf(vs.getDate()));
            
            JOptionPane.showMessageDialog(null, "Details being viewed");
            
        } else {
            JOptionPane.showMessageDialog(null, "Please select any row");
        }
    }//GEN-LAST:event_viewdetailBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label addressLbl;
    private javax.swing.JLabel careerobjectiveLbl;
    private java.awt.Label certificationsLbl;
    private javax.swing.JButton deleteentryBtn;
    private java.awt.Label graddateLbl;
    private java.awt.Label gradnameLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label11;
    private java.awt.Label label4;
    private java.awt.Label label9;
    private java.awt.Label linkedinLbl;
    private javax.swing.JLabel nameLbl;
    private java.awt.Label phoneLbl;
    private javax.swing.JTable resumeJTable;
    private java.awt.Label schooldateLbl;
    private java.awt.Label schoolnameLbl;
    private java.awt.Label skillsLbl;
    private java.awt.Label undergraddateLbl;
    private java.awt.Label undergradnameLbl1;
    private javax.swing.JButton viewdetailBtn;
    // End of variables declaration//GEN-END:variables
}
