package soft.pkg252.cw;

import javax.swing.DefaultListModel;

public class InspectPatientPage extends javax.swing.JPanel {
    Controller control;
    Patient patient;
    public InspectPatientPage(Controller c, Patient p) {
        initComponents();
        control = c;
        patient = p;
        updateHistory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Name = new javax.swing.JLabel();
        lbl_Gender = new javax.swing.JLabel();
        lbl_Address = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_History = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbx_AppointmentNotes = new javax.swing.JTextPane();
        btn_OK = new javax.swing.JButton();

        lbl_Name.setText("Name");

        lbl_Gender.setText("Gender");

        lbl_Address.setText("Address");

        lst_History.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lst_History.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lst_HistoryValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lst_History);

        jLabel1.setText("History");

        jScrollPane2.setViewportView(tbx_AppointmentNotes);

        btn_OK.setText("OK");
        btn_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OKActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_OK))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Gender)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Name)
                                .addGap(141, 141, 141)
                                .addComponent(lbl_Address)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Name)
                    .addComponent(lbl_Address))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Gender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_OK)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateHistory(){
        DefaultListModel list = new DefaultListModel();
        lst_History.setModel(list);
        patient.UpdateAppointments();
        for(Appointment a : patient.History){   // add history ro the history list
            list.addElement(a.Time.toString() + "with Dr " + a.Doctor.Surname);
        }
    }
    
    private void lst_HistoryValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lst_HistoryValueChanged
        tbx_AppointmentNotes.setText(patient.History.get(lst_History.getSelectedIndex()).Notes);
    }//GEN-LAST:event_lst_HistoryValueChanged

    private void btn_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OKActionPerformed
        control.goHome();
    }//GEN-LAST:event_btn_OKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_OK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Address;
    private javax.swing.JLabel lbl_Gender;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JList<String> lst_History;
    private javax.swing.JTextPane tbx_AppointmentNotes;
    // End of variables declaration//GEN-END:variables
}
