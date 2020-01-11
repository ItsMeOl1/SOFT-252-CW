/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.pkg252.cw;

import java.text.SimpleDateFormat;
import java.text.ParseException;


/**
 *
 * @author Oli
 */
public class AddPerscriptionPage extends javax.swing.JPanel {
    Controller control;
    
    public AddPerscriptionPage(Controller c) {
        initComponents();
        control = c;
        updateMed();
        updatePatients();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        tbx_Start = new javax.swing.JFormattedTextField();
        tbx_End = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbx_Notes = new javax.swing.JTextArea();
        cbb_Med = new javax.swing.JComboBox<>();
        btn_Cancel = new javax.swing.JButton();
        btn_Apply = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbb_Patient = new javax.swing.JComboBox<>();
        btn_NewMed = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tbx_Start.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyYY"))));

        tbx_End.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabel1.setText("Start Date");

        jLabel2.setText("End Date");

        jLabel3.setText("Medication");

        jLabel4.setText("Notes");

        tbx_Notes.setColumns(20);
        tbx_Notes.setRows(5);
        jScrollPane2.setViewportView(tbx_Notes);

        cbb_Med.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_Cancel.setText("Cancel");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        btn_Apply.setText("Apply");
        btn_Apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ApplyActionPerformed(evt);
            }
        });

        jLabel5.setText("Patient");

        cbb_Patient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_NewMed.setText("Create New Medicine");
        btn_NewMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_NewMed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Apply)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Cancel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbb_Patient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cbb_Med, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbx_Start, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tbx_End, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbx_Start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbx_End, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_Med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_Patient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cancel)
                    .addComponent(btn_Apply)
                    .addComponent(btn_NewMed))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ApplyActionPerformed
        Patient pat = null;
        int patPos = cbb_Patient.getSelectedIndex();       //Convert the index of the list to the patient obj
        int count = -1;                                         
        while (patPos >-1){
            count++;
            if (control.users.get(count).Type == 'p'){
                patPos--;
            }
        }
        if (count != -1){
            try{
                control.createPerscription((Patient)control.users.get(count), 
                        cbb_Med.getSelectedItem().toString(), 
                        new SimpleDateFormat("dd/MM/yyyy").parse(tbx_Start.getText()), 
                        new SimpleDateFormat("dd/MM/yyyy").parse(tbx_End.getText()), 
                        tbx_Notes.getText());
                control.goHome();
            }
            catch(ParseException e){
            }
        }    
    }//GEN-LAST:event_btn_ApplyActionPerformed

    private void updateMed(){   //refresh the med list
        cbb_Med.removeAllItems();
        for(String med : Perscription.getMedications()){
            cbb_Med.addItem(med);
        }
    }
    
    private void updatePatients(){//refresh the patient list
        cbb_Patient.removeAllItems();
        for (User u : control.users){
            if (u.Type == 'p'){
                cbb_Patient.addItem(u.Forename + " " + u.Surname);
            }
        }
    }
        
    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        control.goHome();
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void btn_NewMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewMedActionPerformed
        control.setScreen(new AddMedicinePage(control));
    }//GEN-LAST:event_btn_NewMedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Apply;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_NewMed;
    private javax.swing.JComboBox<String> cbb_Med;
    private javax.swing.JComboBox<String> cbb_Patient;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JFormattedTextField tbx_End;
    private javax.swing.JTextArea tbx_Notes;
    private javax.swing.JFormattedTextField tbx_Start;
    // End of variables declaration//GEN-END:variables
}
