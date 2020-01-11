package soft.pkg252.cw;

public class AddStaffPage extends javax.swing.JPanel {
    Controller control;
    public AddStaffPage(Controller c) {
        initComponents();
        control= c;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btng_Gender = new javax.swing.ButtonGroup();
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
        cbb_StaffType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

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

        cbb_StaffType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Doctor", "Secretary" }));

        jLabel1.setText("Staff Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Create))
                    .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(tbx_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cbb_StaffType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbb_StaffType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Create)
                    .addComponent(btn_Cancel))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateActionPerformed
        boolean gender = false;
        if (rdo_Male.isSelected()){ //convert radio buttons to a bool
            gender = true;
        }
        if (cbb_StaffType.getSelectedItem() == "Administrator"){
            control.create_Admin(tbx_Username.getText(), String.valueOf(tbx_Password.getPassword()).hashCode(), tbx_Forename.getText(), tbx_Surname.getText(), gender, tbx_Address.getText());
        }
        else if (cbb_StaffType.getSelectedItem() == "Doctor"){
            control.create_Doctor(tbx_Username.getText(), String.valueOf(tbx_Password.getPassword()).hashCode(), tbx_Forename.getText(), tbx_Surname.getText(), gender, tbx_Address.getText());
        }
        else if (cbb_StaffType.getSelectedItem() == "Secretary"){
            control.create_Secretary(tbx_Username.getText(), String.valueOf(tbx_Password.getPassword()).hashCode(), tbx_Forename.getText(), tbx_Surname.getText(), gender, tbx_Address.getText());
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
    private javax.swing.JComboBox<String> cbb_StaffType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rdo_Female;
    private javax.swing.JRadioButton rdo_Male;
    private javax.swing.JTextField tbx_Address;
    private javax.swing.JTextField tbx_Forename;
    private javax.swing.JPasswordField tbx_Password;
    private javax.swing.JTextField tbx_Surname;
    private javax.swing.JTextField tbx_Username;
    // End of variables declaration//GEN-END:variables
}
