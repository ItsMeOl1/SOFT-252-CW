package soft.pkg252.cw;

public class AddPatientPage extends javax.swing.JPanel {
    Controller control;
    String creator;
    public AddPatientPage(Controller c, String patientInfo, String user) {
        initComponents();
        control= c;
        creator = user;
        if (patientInfo == ""){ //if the box isnt going to be used, hide it
            tbx_GivenInfo.setVisible(false);
            lbl_PatientInfo.setVisible(false);
        }
        else{
            tbx_GivenInfo.setText(patientInfo);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btng_Gender = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbx_GivenInfo = new javax.swing.JTextArea();
        lbl_PatientInfo = new javax.swing.JLabel();
        tbx_Forename = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tbx_Surname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tbx_Address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdo_Male = new javax.swing.JRadioButton();
        rdo_Female = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        tbx_Username = new javax.swing.JTextField();
        tbx_Password = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        btn_Create = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();

        tbx_GivenInfo.setColumns(20);
        tbx_GivenInfo.setRows(5);
        jScrollPane1.setViewportView(tbx_GivenInfo);

        lbl_PatientInfo.setText("Patient Info");

        jLabel2.setText("Forename");

        jLabel3.setText("Surname");

        jLabel4.setText("Address");

        jLabel5.setText("Gender");

        btng_Gender.add(rdo_Male);
        rdo_Male.setSelected(true);
        rdo_Male.setText("Male");

        btng_Gender.add(rdo_Female);
        rdo_Female.setText("Female");

        jLabel6.setText("Username");

        jLabel7.setText("Password");

        btn_Create.setText("Create");
        btn_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateActionPerformed(evt);
            }
        });

        btn_Cancel.setText("Cancel");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(75, 75, 75)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tbx_Forename)
                                    .addComponent(rdo_Male)
                                    .addComponent(jLabel5)
                                    .addComponent(rdo_Female)
                                    .addComponent(jLabel6)
                                    .addComponent(tbx_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(tbx_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbx_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbx_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Create)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_PatientInfo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_PatientInfo)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbx_Forename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbx_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbx_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdo_Male)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdo_Female)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbx_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbx_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Create)
                            .addComponent(btn_Cancel))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateActionPerformed
        boolean gender = false;
        if (rdo_Male.isSelected()){     //convert the radio buttons to a bool
            gender = true;
        }
        if (creator == "Secretary"){    //password isn't hashed here as it should already be hashed when the user requests for the account to be made
            control.create_Patient(tbx_Username.getText(), Integer.parseInt(String.valueOf(tbx_Password.getPassword())), tbx_Forename.getText(), tbx_Surname.getText(), gender, tbx_Address.getText());
        }
        else if (creator == "patient"){ //asks the secretary to create the account/ approve it
            Secretary.AddRequest("Please create my account! \n" + tbx_Username.getText() + "\n " + String.valueOf(tbx_Password.getPassword()).hashCode() + "\n " + tbx_Forename.getText() + "\n " +  tbx_Surname.getText() + "\n " + gender + "\n " + tbx_Address.getText());
        }
        control.goHome();
    }//GEN-LAST:event_btn_CreateActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        control.goHome();
    }//GEN-LAST:event_btn_CancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Create;
    private javax.swing.ButtonGroup btng_Gender;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_PatientInfo;
    private javax.swing.JRadioButton rdo_Female;
    private javax.swing.JRadioButton rdo_Male;
    private javax.swing.JTextField tbx_Address;
    private javax.swing.JTextField tbx_Forename;
    private javax.swing.JTextArea tbx_GivenInfo;
    private javax.swing.JPasswordField tbx_Password;
    private javax.swing.JTextField tbx_Surname;
    private javax.swing.JTextField tbx_Username;
    // End of variables declaration//GEN-END:variables
}
