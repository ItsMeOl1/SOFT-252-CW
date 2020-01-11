package soft.pkg252.cw;

import java.time.LocalDateTime;
import javax.swing.DefaultListModel;
import java.time.format.DateTimeFormatter;

public class AddAppointmentPage extends javax.swing.JPanel {
    javax.swing.JPanel page;
    Controller control;
    char creator;   //what kind of account created the appointment

    public AddAppointmentPage(Controller c, char u) {
        initComponents();
        control = c;
        creator = u;
        updateDoctors();
        updatePatients();
        
        if (creator == 'p'){    //if its not a secretary then there wont be any info here anyway
            lbl_Patient.setVisible(false);
            lst_Patients.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Patients = new javax.swing.JList<>();
        lbl_Patient = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_Doctors = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        tbx_Time = new javax.swing.JFormattedTextField();
        tbx_Date = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_Cancel = new javax.swing.JButton();
        btn_Create = new javax.swing.JButton();

        lst_Patients.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lst_Patients.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(lst_Patients);

        lbl_Patient.setText("Patient");

        lst_Doctors.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lst_Doctors);

        jLabel2.setText("Doctor");

        tbx_Time.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        tbx_Time.setText("12:00");

        tbx_Date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabel3.setText("Time");

        jLabel4.setText("Date");

        btn_Cancel.setText("Cancel");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        btn_Create.setText("Create");
        btn_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Patient)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(tbx_Time)
                    .addComponent(tbx_Date)
                    .addComponent(jLabel4)
                    .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Create, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbx_Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbx_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Cancel)
                            .addComponent(btn_Create)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Patient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateDoctors()
    {
        DefaultListModel list = new DefaultListModel();
        lst_Doctors.setModel(list);
        control.users.forEach(                          //For each user
            (u) -> {                                             
                if (u.Type == 'd'){                 //If the user is a doctor
                    list.addElement(u.Forename + " " + u.Surname);            //add them to the doctor list
                } 
            }
        );        
    }
    
    private void updatePatients()
    {
        DefaultListModel list = new DefaultListModel();
        lst_Patients.setModel(list);
        control.users.forEach(                          //For each user
            (u) -> {                                             
                if (u.Type == 'p'){                 //If the user is a patient
                    list.addElement(u.Forename + " " + u.Surname);            //add them to the patient list
                } 
            }
        ); 
    }
    
    private void btn_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateActionPerformed
        Doctor doc = null;                                  
        Patient pat = null;
        int docPos = lst_Doctors.getSelectedIndex();        //Convert the index of the list to the doctor obj
        int count = -1;
        while (docPos >-1){
            count++;
            if (control.users.get(count).Type == 'd'){
                docPos--;
            }
        }
        if (count != -1){
            doc = (Doctor) control.users.get(count);        //Convert the index of the list to the doctor obj
        }
        
        int patPos = lst_Patients.getSelectedIndex();       //Convert the index of the list to the patient obj
        count = -1;                                         
        while (patPos >-1){
            count++;
            if (control.users.get(count).Type == 'p'){
                patPos--;
            }
        }
        if (count != -1){
             pat = (Patient)control.users.get(count);
        }                                                   //Convert the index of the list to the patient obj
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");  //get the time date from the string
        System.out.println(tbx_Date.getText() + " " + tbx_Time.getText());
        LocalDateTime dateTime = LocalDateTime.parse(tbx_Date.getText() + " " + tbx_Time.getText(), formatter);
        if (doc != null && pat != null){        
            if (creator != 'p'){
                control.createAppointment(doc, pat, dateTime);  
            }
            else{
                Secretary.AddRequest("Please schedule an appointment between me (" + control.current_user.Forename + " " + control.current_user.Surname + ") and Dr" + doc.Surname + " for " + dateTime.toString());
            }
        control.goHome();
        }
    }//GEN-LAST:event_btn_CreateActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        control.goHome();
    }//GEN-LAST:event_btn_CancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Create;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Patient;
    private javax.swing.JList<String> lst_Doctors;
    private javax.swing.JList<String> lst_Patients;
    private javax.swing.JFormattedTextField tbx_Date;
    private javax.swing.JFormattedTextField tbx_Time;
    // End of variables declaration//GEN-END:variables
}
