/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import javax.swing.JOptionPane;

public class SectionManagement extends javax.swing.JFrame {

    public SectionManagement() {
        initComponents();
        this.setLocation(200, 200);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        goBackBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sectionId = new javax.swing.JTextField();
        addCourseBtn = new javax.swing.JButton();
        selectCourseComboBox = new javax.swing.JComboBox<>();
        selectInstructorComboBox = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        goBackBtn2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        deletingSectionName = new javax.swing.JTextField();
        deleteSectionBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        goBackBtn3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        updateSectionId = new javax.swing.JTextField();
        updateSectionCourse = new javax.swing.JComboBox<>();
        updateSectionInstructor = new javax.swing.JComboBox<>();
        updateSectionBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        goBackBtn4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sectionManagementTable = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        goBackBtn1.setText("Go back");
        goBackBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtn1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Add Section");

        sectionId.setBorder(javax.swing.BorderFactory.createTitledBorder("Section Id"));

        addCourseBtn.setText("ADD");
        addCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseBtnActionPerformed(evt);
            }
        });

        selectCourseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "course1", "course2", "course3", "course4" }));
        selectCourseComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder("Select course"));

        selectInstructorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "instructor1", "instructor2", "instructor3", "instructor4" }));
        selectInstructorComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder("Select course"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(goBackBtn1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sectionId, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                            .addComponent(addCourseBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectCourseComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectInstructorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jLabel1)))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(goBackBtn1)
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(sectionId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selectCourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(selectInstructorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(addCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jTabbedPane1.addTab("Add", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        goBackBtn2.setText("Go back");
        goBackBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtn2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setText("Delete Section");

        deletingSectionName.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter course name to delete"));

        deleteSectionBtn.setText("DELETE");
        deleteSectionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSectionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(goBackBtn2)
                .addGap(0, 1010, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addGap(218, 218, 218))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(deleteSectionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deletingSectionName, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(270, 270, 270))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(goBackBtn2)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(62, 62, 62)
                .addComponent(deletingSectionName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(deleteSectionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 236, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        goBackBtn3.setText("Go back");
        goBackBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtn3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel3.setText("Update Section");

        updateSectionId.setBorder(javax.swing.BorderFactory.createTitledBorder("Section Id"));

        updateSectionCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "course1", "course2", "course3", "course4" }));
        updateSectionCourse.setBorder(javax.swing.BorderFactory.createTitledBorder("Select course"));

        updateSectionInstructor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "instructor1", "instructor2", "instructor3", "instructor4" }));
        updateSectionInstructor.setBorder(javax.swing.BorderFactory.createTitledBorder("Select instructor"));

        updateSectionBtn.setText("UPDATE");
        updateSectionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSectionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(goBackBtn3)
                .addGap(0, 1010, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(327, 327, 327)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateSectionId, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                            .addComponent(updateSectionBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateSectionCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateSectionInstructor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(jLabel3)))
                    .addContainerGap(328, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(goBackBtn3)
                .addGap(0, 507, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(jLabel3)
                    .addGap(40, 40, 40)
                    .addComponent(updateSectionId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(updateSectionCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)
                    .addComponent(updateSectionInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                    .addComponent(updateSectionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(86, 86, 86)))
        );

        jTabbedPane1.addTab("Update", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        goBackBtn4.setText("Go back");
        goBackBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtn4ActionPerformed(evt);
            }
        });

        sectionManagementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Section Id", "Course", "Instructor"
            }
        ));
        jScrollPane1.setViewportView(sectionManagementTable);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(goBackBtn4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(goBackBtn4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtn1ActionPerformed
        this.setVisible(false);
        this.dispose();
        AdminDashboard ad = new AdminDashboard();
        ad.setVisible(true);
    }//GEN-LAST:event_goBackBtn1ActionPerformed

    private void goBackBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtn2ActionPerformed
        this.setVisible(false);
        this.dispose();
        AdminDashboard ad = new AdminDashboard();
        ad.setVisible(true);
    }//GEN-LAST:event_goBackBtn2ActionPerformed

    private void goBackBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtn3ActionPerformed
        this.setVisible(false);
        this.dispose();
        AdminDashboard ad = new AdminDashboard();
        ad.setVisible(true);
    }//GEN-LAST:event_goBackBtn3ActionPerformed

    private void goBackBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtn4ActionPerformed
        this.setVisible(false);
        this.dispose();
        AdminDashboard ad = new AdminDashboard();
        ad.setVisible(true);
    }//GEN-LAST:event_goBackBtn4ActionPerformed

    private void addCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseBtnActionPerformed
         JOptionPane.showMessageDialog(this, "Section added successfully");
    }//GEN-LAST:event_addCourseBtnActionPerformed

    private void deleteSectionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSectionBtnActionPerformed
         JOptionPane.showMessageDialog(this, "Section deleted successfully");
    }//GEN-LAST:event_deleteSectionBtnActionPerformed

    private void updateSectionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSectionBtnActionPerformed
        JOptionPane.showMessageDialog(this, "Section updated successfully");
    }//GEN-LAST:event_updateSectionBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SectionManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SectionManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SectionManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SectionManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SectionManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourseBtn;
    private javax.swing.JButton deleteSectionBtn;
    private javax.swing.JTextField deletingSectionName;
    private javax.swing.JButton goBackBtn1;
    private javax.swing.JButton goBackBtn2;
    private javax.swing.JButton goBackBtn3;
    private javax.swing.JButton goBackBtn4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField sectionId;
    private javax.swing.JTable sectionManagementTable;
    private javax.swing.JComboBox<String> selectCourseComboBox;
    private javax.swing.JComboBox<String> selectInstructorComboBox;
    private javax.swing.JButton updateSectionBtn;
    private javax.swing.JComboBox<String> updateSectionCourse;
    private javax.swing.JTextField updateSectionId;
    private javax.swing.JComboBox<String> updateSectionInstructor;
    // End of variables declaration//GEN-END:variables
}
