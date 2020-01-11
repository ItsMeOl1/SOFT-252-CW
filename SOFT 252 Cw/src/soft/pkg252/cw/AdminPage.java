package soft.pkg252.cw;

import javax.swing.DefaultListModel;

public class AdminPage extends javax.swing.JPanel {
    Controller control;
    public AdminPage(Controller c) {
        initComponents();
        control = c;
        updateStaff();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Users = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        btn_DeleteUser = new javax.swing.JButton();
        btn_CreateUser = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_Comments = new javax.swing.JList<>();
        btn_SumbitFeedback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_Stars = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbx_Feedback = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btn_LogOut = new javax.swing.JButton();

        lst_Users.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lst_Users.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lst_UsersValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lst_Users);

        jLabel4.setText("/5 stars");

        btn_DeleteUser.setText("Delete User");
        btn_DeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteUserActionPerformed(evt);
            }
        });

        btn_CreateUser.setText("Create User");
        btn_CreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateUserActionPerformed(evt);
            }
        });

        lst_Comments.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lst_Comments);

        btn_SumbitFeedback.setText("Sumbit Feedback");
        btn_SumbitFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SumbitFeedbackActionPerformed(evt);
            }
        });

        jLabel1.setText("Staff");

        lbl_Stars.setText("0");

        tbx_Feedback.setColumns(20);
        tbx_Feedback.setRows(5);
        jScrollPane3.setViewportView(tbx_Feedback);

        jLabel3.setText("Feedback");

        btn_LogOut.setText("Log Out");
        btn_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogOutActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_Stars)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_DeleteUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_CreateUser)
                        .addGap(18, 18, 18)
                        .addComponent(btn_SumbitFeedback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(btn_LogOut)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lbl_Stars))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addComponent(jScrollPane1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_DeleteUser)
                    .addComponent(btn_CreateUser)
                    .addComponent(btn_SumbitFeedback)
                    .addComponent(btn_LogOut))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogOutActionPerformed
        control.logOut();
    }//GEN-LAST:event_btn_LogOutActionPerformed

    private void btn_SumbitFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SumbitFeedbackActionPerformed
        int pos = lst_Users.getSelectedIndex();
        for (User u : control.users){
            if (u.Type != 'p'){     //if user is not a patient
                pos--;
                if (pos < 0){
                    if (u.Type == 'd'){ //if user is a doctor
                        Doctor d = (Doctor) u;
                        d.GiveFeedback(tbx_Feedback.getText());
                        return;
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_SumbitFeedbackActionPerformed

    private void btn_CreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateUserActionPerformed
        control.setScreen(new AddStaffPage(control));
        updateStaff();
    }//GEN-LAST:event_btn_CreateUserActionPerformed

    private void btn_DeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteUserActionPerformed
        int pos = lst_Users.getSelectedIndex();
        for (User u : control.users){
            if (u.Type != 'p'){ //if user is not a patient
                pos--;
                if (pos < 0){
                    control.users.remove(u);
                    updateStaff();
                    return;
                }
            }
        }
    }//GEN-LAST:event_btn_DeleteUserActionPerformed

    private void lst_UsersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lst_UsersValueChanged
        updateStats();
    }//GEN-LAST:event_lst_UsersValueChanged

    private void updateStaff(){     //refresh staff list
        DefaultListModel list = new DefaultListModel();
        lst_Users.setModel(list);
        for (User u : control.users){
            if (u.Type != 'p'){
                list.addElement(u.Type + ": " + u.Forename + " " + u.Surname);
            }
        }
        updateStats();
    }
    
    private void updateStats(){ //refresh info about staff
        int pos = lst_Users.getSelectedIndex();
        for (User u : control.users){
            if (u.Type != 'p'){
                pos--;
                if (pos < 0){
                    if (u.Type == 'd'){
                        Doctor d = (Doctor) u;
                        lbl_Stars.setText(String.valueOf(d.getRating()));
                        DefaultListModel list = new DefaultListModel();
                        lst_Comments.setModel(list);
                        for (String c : d.getFeedback()){
                            list.addElement(c);
                        return;
                        }
                    }
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CreateUser;
    private javax.swing.JButton btn_DeleteUser;
    private javax.swing.JButton btn_LogOut;
    private javax.swing.JButton btn_SumbitFeedback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_Stars;
    private javax.swing.JList<String> lst_Comments;
    private javax.swing.JList<String> lst_Users;
    private javax.swing.JTextArea tbx_Feedback;
    // End of variables declaration//GEN-END:variables
}
