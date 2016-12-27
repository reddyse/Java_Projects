
//Relevant import statements for the code written below.
package ResumeInterface;
import Career.DataValidation;
import Career.Resume;
import Career.ResumeHistory;
import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CreateResumeJPanel extends javax.swing.JPanel 
{
    private ResumeHistory resumeobj;
    public CreateResumeJPanel(ResumeHistory resumeobj) 
    {
        initComponents();
        this.resumeobj = resumeobj;
    }//parameterized constructor to handle the object that will be passed.

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label5 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label13 = new java.awt.Label();
        undergradnameTextField = new java.awt.TextField();
        graddateTextField = new java.awt.TextField();
        gradnameTextField = new java.awt.TextField();
        undergraddateTextField = new java.awt.TextField();
        label6 = new java.awt.Label();
        affiliationTextField = new java.awt.TextField();
        highshoolLbl = new java.awt.Label();
        schoolnameTextField = new java.awt.TextField();
        schooldateTextField = new java.awt.TextField();
        label17 = new java.awt.Label();
        careerobjectiveTextArea = new java.awt.TextArea();
        addressTextArea = new java.awt.TextArea();
        contactTextField = new java.awt.TextField();
        emailidTextField = new java.awt.TextField();
        label12 = new java.awt.Label();
        lnameTextField = new java.awt.TextField();
        attachBtn = new java.awt.Button();
        label14 = new java.awt.Label();
        linkedinTextField = new java.awt.TextField();
        submitBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        MalejRadioButton = new javax.swing.JRadioButton();
        FemalejRadioButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        MasteryjRadioButton = new javax.swing.JRadioButton();
        AdvancedjRadioButton = new javax.swing.JRadioButton();
        NotsogoodjRadioButton = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        label15 = new java.awt.Label();
        CplusjCheckBox = new javax.swing.JCheckBox();
        JavajCheckBox = new javax.swing.JCheckBox();
        NetjCheckBox = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        JavacertificationjCheckBox = new javax.swing.JCheckBox();
        NetcertificationjCheckBox = new javax.swing.JCheckBox();
        OraclecertificationjCheckBox = new javax.swing.JCheckBox();
        label16 = new java.awt.Label();
        jPanel6 = new javax.swing.JPanel();
        label18 = new java.awt.Label();
        WithinUSjRadioButton = new javax.swing.JRadioButton();
        OutsideusjRadioButton = new javax.swing.JRadioButton();
        DoesntmatterjRadioButton = new javax.swing.JRadioButton();
        profilepictureLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fnameTextField = new java.awt.TextField();
        clearBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label1.setText("First Name");
        add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        label2.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        label2.setText("Please provide below details");
        add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 339, -1));

        label3.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label3.setText("Last Name");
        add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        label5.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label5.setText("Address");
        add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        label7.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label7.setText("Career Objective");
        add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        label8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        label8.setText("Education");
        add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 74, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label9.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label9.setText("Date");

        label10.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label10.setText("Undergrad College Name");

        label11.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label11.setText("Date");

        label13.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label13.setText("Grad College Name");

        label6.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label6.setText("Affiliation");

        highshoolLbl.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        highshoolLbl.setText("High School Name");

        label17.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label17.setText("Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(highshoolLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(undergradnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gradnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(affiliationTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(schoolnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(schooldateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(graddateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(undergraddateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addGap(237, 237, 237))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(undergradnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(undergraddateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graddateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(highshoolLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schoolnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schooldateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(affiliationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 800, -1));
        add(careerobjectiveTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 279, 344, 70));
        add(addressTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 344, 50));
        add(contactTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 160, -1));
        add(emailidTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 160, -1));

        label12.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label12.setText("Contact Number");
        add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        add(lnameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 160, -1));

        attachBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        attachBtn.setLabel("Attach");
        attachBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachBtnActionPerformed(evt);
            }
        });
        add(attachBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 91, -1));

        label14.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        label14.setText("Linkedin Hyperlink");
        add(label14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        add(linkedinTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 160, -1));

        submitBtn.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 735, 190, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup3.add(MalejRadioButton);
        MalejRadioButton.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        MalejRadioButton.setSelected(true);
        MalejRadioButton.setText("Male");

        buttonGroup3.add(FemalejRadioButton);
        FemalejRadioButton.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        FemalejRadioButton.setText("Female");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Sex");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FemalejRadioButton)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MalejRadioButton))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MalejRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FemalejRadioButton)
                .addGap(13, 13, 13))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("English Proficiency");

        buttonGroup1.add(MasteryjRadioButton);
        MasteryjRadioButton.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        MasteryjRadioButton.setSelected(true);
        MasteryjRadioButton.setText("Mastery");

        buttonGroup1.add(AdvancedjRadioButton);
        AdvancedjRadioButton.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        AdvancedjRadioButton.setText("Advanced");

        buttonGroup1.add(NotsogoodjRadioButton);
        NotsogoodjRadioButton.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        NotsogoodjRadioButton.setText("Not so good");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NotsogoodjRadioButton)
                    .addComponent(AdvancedjRadioButton)
                    .addComponent(jLabel3)
                    .addComponent(MasteryjRadioButton))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MasteryjRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdvancedjRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NotsogoodjRadioButton)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, -1, 127));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label15.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        label15.setText("Programming skills");

        CplusjCheckBox.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        CplusjCheckBox.setText("C++");

        JavajCheckBox.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        JavajCheckBox.setText("Java");

        NetjCheckBox.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        NetjCheckBox.setText(".Net");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CplusjCheckBox)
                    .addComponent(JavajCheckBox)
                    .addComponent(NetjCheckBox)
                    .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CplusjCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JavajCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NetjCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JavacertificationjCheckBox.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        JavacertificationjCheckBox.setText("Java Certified");

        NetcertificationjCheckBox.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        NetcertificationjCheckBox.setText(".Net Certified");

        OraclecertificationjCheckBox.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        OraclecertificationjCheckBox.setText("Oracle Certified");

        label16.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        label16.setText("Certifications");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JavacertificationjCheckBox)
                    .addComponent(NetcertificationjCheckBox)
                    .addComponent(OraclecertificationjCheckBox)
                    .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JavacertificationjCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NetcertificationjCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OraclecertificationjCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, -1, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label18.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        label18.setText("Job location preference");

        buttonGroup2.add(WithinUSjRadioButton);
        WithinUSjRadioButton.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        WithinUSjRadioButton.setSelected(true);
        WithinUSjRadioButton.setText("Within US");
        WithinUSjRadioButton.setToolTipText("");

        buttonGroup2.add(OutsideusjRadioButton);
        OutsideusjRadioButton.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        OutsideusjRadioButton.setText("Outside US");

        buttonGroup2.add(DoesntmatterjRadioButton);
        DoesntmatterjRadioButton.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        DoesntmatterjRadioButton.setText("Doesnt Matter");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DoesntmatterjRadioButton)
                    .addComponent(OutsideusjRadioButton)
                    .addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WithinUSjRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WithinUSjRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OutsideusjRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DoesntmatterjRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 580, -1, -1));

        profilepictureLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(profilepictureLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 130, 120));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        jLabel1.setText("Email ID:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        add(fnameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 160, -1));

        clearBtn.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 735, 190, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed

    try
    {
        //On click of submit the below code will run to save the picture uploaded to the project folder and assign the input values to the object.
    String certification="";
    String programmingskill="";
        

// TODO add your handling code here:
//Linking the object values to the input values from the user interface
    DataValidation dv = new DataValidation();
    
    String flag="true";
    String tempphone="";
    String tempfname="";
    String templname="";
    String tempemail="";
         if(dv.numberWithSizeCheck(contactTextField.getText(),10))
        {
            tempphone= contactTextField.getText();
        }
        else
        {
           contactTextField.setBackground(Color.red);   
           flag="false";
        }
         
          if(dv.alphabetCheck(fnameTextField.getText()))
        {
            fnameTextField.setBackground(Color.white);
            tempfname= fnameTextField.getText();
            
        }
        else
        {
           fnameTextField.setBackground(Color.red);
           flag="false";
        }
        
        if(dv.alphabetCheck(lnameTextField.getText()))
        {
            lnameTextField.setBackground(Color.white);
            templname= lnameTextField.getText();
            
        }
        else
        {
           lnameTextField.setBackground(Color.red);
           flag="false";
        }
        if(dv.checkEmail(emailidTextField.getText()))
        {
            emailidTextField.setBackground(Color.white);
            tempemail= emailidTextField.getText();
        }
        else
        {
           emailidTextField.setBackground(Color.red);
           flag="false";
        }
        
        
        //Communication to the user.
        if(flag=="true")
        {
        JOptionPane.showMessageDialog(null, "Information is saved and profile picture is uploaded.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Resume was not successfully created. Please review your input and correct items marked in Red.");
            throw new Exception();
        }
        
        Resume r = resumeobj.addResume();
        r.setLinkedinprof(linkedinTextField.getText());
        r.setAddress(addressTextArea.getText());
        r.setCareerobjective(careerobjectiveTextArea.getText());
        r.setEduundergradname(undergradnameTextField.getText());
        r.setEduundergraddate(undergraddateTextField.getText());
        r.setEdugradname(gradnameTextField.getText());
        r.setEdugraddate(graddateTextField.getText());
        r.setAffiliation(affiliationTextField.getText());
        r.setEduhighschoolname(schoolnameTextField.getText());
        r.setEduhighschooldate(schooldateTextField.getText());
        r.setImage((ImageIcon) profilepictureLbl.getIcon());
        r.setPhonenumber(tempphone);
        r.setFirstname(tempfname);
        r.setLastname(templname);
        r.setEmailid(tempemail);
        
          if(MalejRadioButton.isSelected())
          {
            r.setGender("Male");
          }
          if(FemalejRadioButton.isSelected())
          {
            r.setGender("Female");
          }
          if(MasteryjRadioButton.isSelected())
          {
            r.setEnglishproficiency("Mastery");
          }
          if(AdvancedjRadioButton.isSelected())
          {
            r.setEnglishproficiency("Advanced");
          }
          if(NotsogoodjRadioButton.isSelected())
          {
             r.setEnglishproficiency("Not so good");
          }
           if(WithinUSjRadioButton.isSelected())
          {
             r.setLocationpreference("United States");
          }
          if(OutsideusjRadioButton.isSelected())
          {
             r.setLocationpreference(" Anywhere but United States");
          }
          if(DoesntmatterjRadioButton.isSelected())
          {
              r.setLocationpreference("Doesn't really matter");
          }
          if(JavajCheckBox.isSelected()==true)
          {
              programmingskill+="Java";
          }
          if(NetcertificationjCheckBox.isSelected()==true)
          {
              programmingskill+=", .Net";
          }
          if(CplusjCheckBox.isSelected()==true)
          {
              programmingskill+=", C++";
          }
          if(JavacertificationjCheckBox.isSelected()==true)
          {
              certification+="Sun Certified";
          }
          if(NetcertificationjCheckBox.isSelected()==true)
          {
              certification+=", .Net Certified";
          }
          if(OraclecertificationjCheckBox.isSelected()==true)
          {
              certification+=", Oracle Certified";
          }
          r.setCertification(certification);
          r.setProgrammingskill(programmingskill);
        
}
catch(Exception e)
{
    //JOptionPane.showMessageDialog(null, "Resume was not successfully created. Please review your input."); //if User doesn't use JPG files
}
    }//GEN-LAST:event_submitBtnActionPerformed

    private void attachBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachBtnActionPerformed
       JFileChooser chooser = new JFileChooser(); //gives user the option of choosing from his System
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg"); //filter to allow only JPG files
        chooser.setFileFilter(filter);

        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();

            ImageIcon image = new ImageIcon(file.getAbsolutePath());

            Rectangle rect = profilepictureLbl.getBounds(); //Scaling image in the right height, and width

            Image scaledImage = image.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);

            image = new ImageIcon(scaledImage);

            profilepictureLbl.setIcon(image);


        } else {
            JOptionPane.showMessageDialog(null, "Please use JPG files only"); //if User is not using JPG files
        }
       
    }//GEN-LAST:event_attachBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        fnameTextField.setText(" ");
        lnameTextField.setText(" ");
        contactTextField.setText(" ");
        emailidTextField.setText(" ");
        addressTextArea.setText(" ");
        careerobjectiveTextArea.setText(" ");
        linkedinTextField.setText(" ");
        undergraddateTextField.setText(" ");
        undergradnameTextField.setText(" ");
        graddateTextField.setText(" ");
        gradnameTextField.setText(" ");
        schooldateTextField.setText(" ");
        schoolnameTextField.setText(" ");
        affiliationTextField.setText(" ");
    }//GEN-LAST:event_clearBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdvancedjRadioButton;
    private javax.swing.JCheckBox CplusjCheckBox;
    private javax.swing.JRadioButton DoesntmatterjRadioButton;
    private javax.swing.JRadioButton FemalejRadioButton;
    private javax.swing.JCheckBox JavacertificationjCheckBox;
    private javax.swing.JCheckBox JavajCheckBox;
    private javax.swing.JRadioButton MalejRadioButton;
    private javax.swing.JRadioButton MasteryjRadioButton;
    private javax.swing.JCheckBox NetcertificationjCheckBox;
    private javax.swing.JCheckBox NetjCheckBox;
    private javax.swing.JRadioButton NotsogoodjRadioButton;
    private javax.swing.JCheckBox OraclecertificationjCheckBox;
    private javax.swing.JRadioButton OutsideusjRadioButton;
    private javax.swing.JRadioButton WithinUSjRadioButton;
    private java.awt.TextArea addressTextArea;
    private java.awt.TextField affiliationTextField;
    private java.awt.Button attachBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private java.awt.TextArea careerobjectiveTextArea;
    private javax.swing.JButton clearBtn;
    private java.awt.TextField contactTextField;
    private java.awt.TextField emailidTextField;
    private java.awt.TextField fnameTextField;
    private java.awt.TextField graddateTextField;
    private java.awt.TextField gradnameTextField;
    private java.awt.Label highshoolLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label18;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.TextField linkedinTextField;
    private java.awt.TextField lnameTextField;
    private javax.swing.JLabel profilepictureLbl;
    private java.awt.TextField schooldateTextField;
    private java.awt.TextField schoolnameTextField;
    private javax.swing.JButton submitBtn;
    private java.awt.TextField undergraddateTextField;
    private java.awt.TextField undergradnameTextField;
    // End of variables declaration//GEN-END:variables

}

