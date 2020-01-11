package soft.pkg252.cw;

import javax.swing.DefaultListModel;

public class SecretaryPage extends javax.swing.JPanel {
    Controller control;
    public SecretaryPage(Controller c) {
        initComponents();
        control = c;
        updateRequests();
        updatePatients();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Requests = new javax.swing.JList<>();
        btn_CreatePatient = new javax.swing.JButton();
        btn_CreateAppointment = new javax.swing.JButton();
        btn_GivePerscription = new javax.swing.JButton();
        btn_Order = new javax.swing.JButton();
        btn_RemovePatient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_Logout = new javax.swing.JButton();
        btn_CompleteRequest = new javax.swing.JButton();
        cbb_PatientRem = new javax.swing.JComboBox<>();

        lst_Requests.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lst_Requests);

        btn_CreatePatient.setText("Create Patient Account");
        btn_CreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreatePatientActionPerformed(evt);
            }
        });

        btn_CreateAppointment.setText("Create Appointment");
        btn_CreateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateAppointmentActionPerformed(evt);
            }
        });

        btn_GivePerscription.setText("Give Perscription");
        btn_GivePerscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GivePerscriptionActionPerformed(evt);
            }
        });

        btn_Order.setText("Order Medicine");
        btn_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OrderActionPerformed(evt);
            }
        });

        btn_RemovePatient.setText("Remove Patient Account");
        btn_RemovePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemovePatientActionPerformed(evt);
            }
        });

        jLabel1.setText("Requests");

        btn_Logout.setText("Log Out");
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });

        btn_CompleteRequest.setText("Complete Request");
        btn_CompleteRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CompleteRequestActionPerformed(evt);
            }
        });

        cbb_PatientRem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_CompleteRequest, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbb_PatientRem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_RemovePatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_CreateAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_GivePerscription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Order, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_CreatePatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(btn_Logout)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_CreatePatient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_CreateAppointment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_GivePerscription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Order)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_RemovePatient)
                            .addComponent(cbb_PatientRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Logout)
                    .addComponent(btn_CompleteRequest))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateRequests(){  //refresh requets list
        DefaultListModel list = new DefaultListModel();
        lst_Requests.setModel(list);
        for (String r : Secretary.getRequests()){
            list.addElement(r);
        }
    }
    
    private void updatePatients(){  //refresh patient list
        cbb_PatientRem.removeAllItems();    
        for (User u : control.users){
            if (u.Type == 'p'){
                cbb_PatientRem.addItem(u.getForename() + " " + u.getSurname());
            }
        }
    }
    
    private void btn_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OrderActionPerformed
        control.setScreen(new OrderMedPage(control));
    }//GEN-LAST:event_btn_OrderActionPerformed

    private void btn_CompleteRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CompleteRequestActionPerformed
        Secretary.Requests.remove(lst_Requests.getSelectedIndex());
        updateRequests();
    }//GEN-LAST:event_btn_CompleteRequestActionPerformed

    private void btn_CreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreatePatientActionPerformed
        control.setScreen(new AddPatientPage(control, lst_Requests.getSelectedValue(), "Secretary"));
    }//GEN-LAST:event_btn_CreatePatientActionPerformed

    private void btn_CreateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateAppointmentActionPerformed
       control.setScreen(new AddAppointmentPage(control, 's'));
    }//GEN-LAST:event_btn_CreateAppointmentActionPerformed

    private void btn_GivePerscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GivePerscriptionActionPerformed
        control.setScreen(new GivePerscriptionPage(control));
    }//GEN-LAST:event_btn_GivePerscriptionActionPerformed

    private void btn_RemovePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemovePatientActionPerformed
        int Pos = cbb_PatientRem.getSelectedIndex();
        int count = -1;
        while (Pos > -1){
            count++;
            if (control.users.get(count).Type == 'p'){
                Pos--;
                if (Pos == -1){ //if it is the selected patient
                    System.out.println("Removing " + control.users.get(count).Forename + count);
                    control.users.remove(count);
                    updatePatients();
                    return;
                }
            }
        }
        
    }//GEN-LAST:event_btn_RemovePatientActionPerformed

    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
        control.logOut();
    }//GEN-LAST:event_btn_LogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CompleteRequest;
    private javax.swing.JButton btn_CreateAppointment;
    private javax.swing.JButton btn_CreatePatient;
    private javax.swing.JButton btn_GivePerscription;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton btn_Order;
    private javax.swing.JButton btn_RemovePatient;
    private javax.swing.JComboBox<String> cbb_PatientRem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst_Requests;
    // End of variables declaration//GEN-END:variables
}
