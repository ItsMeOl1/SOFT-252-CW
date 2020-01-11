package soft.pkg252.cw;

public class GivePerscriptionPage extends javax.swing.JPanel {
    Controller control;
    public GivePerscriptionPage(Controller c) {
        initComponents();
        control = c;
        
        cbb_Patient.removeAllItems();
        for (User u : control.users){   //for each user
            if (u.Type == 'p'){         //if they're a patient
                cbb_Patient.addItem(u.Forename + " " + u.Surname);  //add them to the patient list
            }
        }
        updatePerscriptions();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlg_OutOfStock = new javax.swing.JDialog();
        btn_OK = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbb_Patient = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbb_Perscription = new javax.swing.JComboBox<>();
        btn_Give = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();

        dlg_OutOfStock.setTitle("Out Of Stock");
        dlg_OutOfStock.setAlwaysOnTop(true);

        btn_OK.setText("OK");
        btn_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OKActionPerformed(evt);
            }
        });

        jLabel3.setText("The requested medicine is out of stock! Please order more!");

        javax.swing.GroupLayout dlg_OutOfStockLayout = new javax.swing.GroupLayout(dlg_OutOfStock.getContentPane());
        dlg_OutOfStock.getContentPane().setLayout(dlg_OutOfStockLayout);
        dlg_OutOfStockLayout.setHorizontalGroup(
            dlg_OutOfStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlg_OutOfStockLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlg_OutOfStockLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_OK)
                .addGap(147, 147, 147))
        );
        dlg_OutOfStockLayout.setVerticalGroup(
            dlg_OutOfStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlg_OutOfStockLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btn_OK)
                .addGap(26, 26, 26))
        );

        cbb_Patient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbb_Patient.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbb_PatientItemStateChanged(evt);
            }
        });

        jLabel1.setText("Patient");

        jLabel2.setText("Perscription");

        cbb_Perscription.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_Give.setText("Give");
        btn_Give.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GiveActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btn_Cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Give))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cbb_Patient, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cbb_Perscription, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_Patient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_Perscription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Give)
                    .addComponent(btn_Cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GiveActionPerformed
        int i = cbb_Patient.getSelectedIndex();
        for (User u : control.users){   //for each user
            if (u.Type == 'p'){     //if user is a patient
                i--;
            }
            if(i == -1){    //if it is the selected patient
                Patient p = (Patient)u;
                for (Perscription m : p.getPerscriptions()){
                    if (m.Medication == cbb_Perscription.getSelectedItem()){
                        int count = -1;
                        for (String mname : Perscription.getMedications()){
                            count++;
                            if (mname == m.Medication){
                                if (Perscription.getMedStock()[count] > 0){ //if its in stock
                                    Perscription.giveMedicine(count);
                                }
                                else{
                                    dlg_OutOfStock.setVisible(true);
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_GiveActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        control.goHome();
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void cbb_PatientItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbb_PatientItemStateChanged
        updatePerscriptions();
    }//GEN-LAST:event_cbb_PatientItemStateChanged

    private void btn_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OKActionPerformed
        dlg_OutOfStock.setVisible(false);
    }//GEN-LAST:event_btn_OKActionPerformed

    private void updatePerscriptions(){
        cbb_Perscription.removeAllItems();
        int i = cbb_Patient.getSelectedIndex();
        for (User u : control.users){
            if (u.Type == 'p'){
                i--;
                if(i == -1){
                    Patient p = (Patient)u;
                    for (Perscription m : p.getPerscriptions()){
                        if (m.Given == false){
                            cbb_Perscription.addItem(m.getMedication());
                            return;
                        }
                    }
                }
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Give;
    private javax.swing.JButton btn_OK;
    private javax.swing.JComboBox<String> cbb_Patient;
    private javax.swing.JComboBox<String> cbb_Perscription;
    private javax.swing.JDialog dlg_OutOfStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
