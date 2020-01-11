package soft.pkg252.cw;

import javax.swing.DefaultListModel;

public class ViewDoctorPage extends javax.swing.JPanel {
    Controller control;
    public ViewDoctorPage(Controller c) {
        initComponents();
        control = c;
        updateDoctors();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Doctors = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        sld_Rate = new javax.swing.JSlider();
        lbl_Rating = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbx_Feedback = new javax.swing.JTextArea();
        btn_Cancel = new javax.swing.JButton();
        btn_Sumbit = new javax.swing.JButton();
        lbl_Stars = new javax.swing.JLabel();

        lst_Doctors.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lst_Doctors.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lst_DoctorsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lst_Doctors);

        jLabel1.setText("Doctors");

        sld_Rate.setMajorTickSpacing(1);
        sld_Rate.setMaximum(5);
        sld_Rate.setMinimum(1);
        sld_Rate.setMinorTickSpacing(1);
        sld_Rate.setPaintTicks(true);
        sld_Rate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                sld_RatePropertyChange(evt);
            }
        });

        lbl_Rating.setText("5");

        tbx_Feedback.setColumns(20);
        tbx_Feedback.setRows(5);
        tbx_Feedback.setText("Enter feedback here");
        jScrollPane2.setViewportView(tbx_Feedback);

        btn_Cancel.setText("Cancel");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        btn_Sumbit.setText("Submit");
        btn_Sumbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SumbitActionPerformed(evt);
            }
        });

        lbl_Stars.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_Stars.setText("Rated 5/5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Stars)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn_Cancel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Sumbit))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(sld_Rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_Rating)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Stars)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_Rating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sld_Rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Cancel)
                            .addComponent(btn_Sumbit))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sld_RatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sld_RatePropertyChange
        lbl_Rating.setText(String.valueOf(sld_Rate.getValue()));
    }//GEN-LAST:event_sld_RatePropertyChange

    //sumbit the feedback
    private void btn_SumbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SumbitActionPerformed
        int pos = lst_Doctors.getSelectedIndex();
        for (User u : control.users){
            if (u.Type != 'p'){
                pos--;
                if (pos < 0){
                    if (u.Type == 'd'){
                        Doctor d = (Doctor) u;
                        if  (tbx_Feedback.getText() != "Enter feedback here" && tbx_Feedback.getText() != ""){  //if feedback was given
                            d.GiveFeedback(tbx_Feedback.getText());
                        }
                        d.Rate(sld_Rate.getValue());
                        return;
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_SumbitActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        control.goHome();
    }//GEN-LAST:event_btn_CancelActionPerformed
    
    //update the doctor info
    private void lst_DoctorsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lst_DoctorsValueChanged
        int pos = lst_Doctors.getSelectedIndex();
        for (User u : control.users){
            if (u.Type != 'p'){
                pos--;
                if (pos < 0){
                    if (u.Type == 'd'){
                        Doctor d = (Doctor) u;
                        lbl_Stars.setText("Rated " + d.getRating() + "/5");
                        return;
                    }
                }
            }
        }
    }//GEN-LAST:event_lst_DoctorsValueChanged

    private void updateDoctors(){   //refresh doctor list
        DefaultListModel list = new DefaultListModel();
        lst_Doctors.setModel(list);
        for (User u : control.users){
            if (u.Type == 'd'){
                list.addElement(u.Forename + " " + u.Surname);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Sumbit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Rating;
    private javax.swing.JLabel lbl_Stars;
    private javax.swing.JList<String> lst_Doctors;
    private javax.swing.JSlider sld_Rate;
    private javax.swing.JTextArea tbx_Feedback;
    // End of variables declaration//GEN-END:variables
}
