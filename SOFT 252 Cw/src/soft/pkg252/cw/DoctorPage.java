package soft.pkg252.cw;

import javax.swing.DefaultListModel;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;

public class DoctorPage extends javax.swing.JPanel {
    Controller control;
    Doctor doc;
    
    public DoctorPage(Controller c, Doctor d) {
        initComponents();
        tbx_Notes.getDocument().addDocumentListener(new DocumentListener() {    //used to save notes without a button

            @Override
            public void removeUpdate(DocumentEvent e) {
                doc.getAppointments().get(lst_Appointments.getLeadSelectionIndex()).Notes = tbx_Notes.getText(); //save the text when it is changed
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                doc.getAppointments().get(lst_Appointments.getLeadSelectionIndex()).Notes = tbx_Notes.getText();//save the text when it is changed
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        control = c;
        doc = d;
        updateAppointments();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Appointments = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btn_NewAppointment = new javax.swing.JButton();
        btn_Perscribe = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_LogOut = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbx_Patient = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbx_Notes = new javax.swing.JTextPane();
        btn_Inspect = new javax.swing.JButton();

        jScrollPane4.setViewportView(jTextPane1);

        lst_Appointments.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lst_Appointments.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lst_AppointmentsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lst_Appointments);

        jLabel1.setText("Your Appointments");

        btn_NewAppointment.setText("New Appointment");
        btn_NewAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewAppointmentActionPerformed(evt);
            }
        });

        btn_Perscribe.setText("Perscribe Patient");
        btn_Perscribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PerscribeActionPerformed(evt);
            }
        });

        jLabel2.setText("Notes");

        jLabel3.setText("Patient details");

        btn_LogOut.setText("Log Out");
        btn_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogOutActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(tbx_Patient);

        jScrollPane6.setViewportView(tbx_Notes);

        btn_Inspect.setText("Inspect Patient");
        btn_Inspect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InspectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(btn_NewAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Perscribe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Inspect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_LogOut))
                    .addComponent(jScrollPane5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_LogOut)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_NewAppointment)
                        .addComponent(btn_Perscribe)
                        .addComponent(btn_Inspect)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NewAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewAppointmentActionPerformed
        control.setScreen(new AddAppointmentPage(control, 's'));
    }//GEN-LAST:event_btn_NewAppointmentActionPerformed

    private void lst_AppointmentsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lst_AppointmentsValueChanged
        int Pos = lst_Appointments.getLeadSelectionIndex();  
        updatePatient(doc.getAppointments().get(Pos).Patient);
        updateNotes(doc.getAppointments().get(Pos).Notes);
    }//GEN-LAST:event_lst_AppointmentsValueChanged

    private void updateAppointments(){
        DefaultListModel list = new DefaultListModel();
        lst_Appointments.setModel(list);
        doc.Appointments.forEach(                          //For each appointment
            (u) -> {                                             
                list.addElement(u.Patient.getSurname() + "@" + u.getTime().toString());     //add them to the appointment list
            }
        ); 
    }
    
    private void updatePatient(Patient pat){    //refresh patient info
        String gender = "Male";
        String perscriptions;
        if (pat.getGender() == false){ gender = "Female"; }
        if (pat.getPerscriptions().isEmpty()) {perscriptions = "None"; }
        else{
            perscriptions = "";
            for(Perscription p : pat.getPerscriptions()){
                perscriptions += p.getMedication() + " till " + p.getEnd() + ", ";
            }
            perscriptions = perscriptions.substring(0, perscriptions.length()-2);
        }
        tbx_Patient.setText(pat.getForename() + " " + pat.getSurname() + '\n' + pat.getAddress() + '\n' + gender + '\n' + "Perscriptions: " + perscriptions);
    }
    
    private void updateNotes(String notes){
        tbx_Notes.setText(notes);
    }
    
    private void btn_PerscribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PerscribeActionPerformed
        control.setScreen(new AddPerscriptionPage(control));
    }//GEN-LAST:event_btn_PerscribeActionPerformed

    private void btn_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogOutActionPerformed
        control.logOut();
    }//GEN-LAST:event_btn_LogOutActionPerformed

    private void btn_InspectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InspectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_InspectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Inspect;
    private javax.swing.JButton btn_LogOut;
    private javax.swing.JButton btn_NewAppointment;
    private javax.swing.JButton btn_Perscribe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JList<String> lst_Appointments;
    private javax.swing.JTextPane tbx_Notes;
    private javax.swing.JTextPane tbx_Patient;
    // End of variables declaration//GEN-END:variables
}
