
package screens;


public class AdminDashboard extends javax.swing.JFrame {

    public AdminDashboard() {
        initComponents();
        this.setLocation(200, 200);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sectionManagementBtn = new javax.swing.JButton();
        studentManagementBtn = new javax.swing.JButton();
        courseManagementBtn2 = new javax.swing.JButton();
        studentEnrollmentBtn = new javax.swing.JButton();
        teacherAssignmentBtn = new javax.swing.JButton();
        signOutBtn = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        courseEnrollmentBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        sectionManagementBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        sectionManagementBtn.setText("SECTION MANAGEMENT");
        sectionManagementBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sectionManagementBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionManagementBtnActionPerformed(evt);
            }
        });

        studentManagementBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        studentManagementBtn.setText("STUDENT MANAGEMENT");
        studentManagementBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentManagementBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentManagementBtnActionPerformed(evt);
            }
        });

        courseManagementBtn2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        courseManagementBtn2.setText("COURSE MANAGEMENT");
        courseManagementBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        courseManagementBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseManagementBtn2ActionPerformed(evt);
            }
        });

        studentEnrollmentBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        studentEnrollmentBtn.setText("STUDENT ENROLLMENT");
        studentEnrollmentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentEnrollmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentEnrollmentBtnActionPerformed(evt);
            }
        });

        teacherAssignmentBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        teacherAssignmentBtn.setText("TEACHER ASSIGNMENT");
        teacherAssignmentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teacherAssignmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherAssignmentBtnActionPerformed(evt);
            }
        });

        signOutBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        signOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        signOutBtn.setText("Signout?");
        signOutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signOutBtnMouseClicked(evt);
            }
        });

        backBtn.setText("back");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        courseEnrollmentBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        courseEnrollmentBtn.setText("COURSE ENROLLMENT");
        courseEnrollmentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        courseEnrollmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseEnrollmentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(signOutBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sectionManagementBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentManagementBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(studentEnrollmentBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teacherAssignmentBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(courseManagementBtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(courseEnrollmentBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(courseManagementBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sectionManagementBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(studentManagementBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(studentEnrollmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(teacherAssignmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(courseEnrollmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(signOutBtn)
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 580));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("ADMIN DASHBOARD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(216, 216, 216))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel1)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 810, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sectionManagementBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionManagementBtnActionPerformed
        this.setVisible(false);
        SectionManagement sm = new SectionManagement();
        sm.setVisible(true);
    }//GEN-LAST:event_sectionManagementBtnActionPerformed

    private void studentManagementBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentManagementBtnActionPerformed
        this.setVisible(false);
        this.dispose();
        StudentManagement sm = new StudentManagement();
        sm.setVisible(true);
    }//GEN-LAST:event_studentManagementBtnActionPerformed

    private void courseManagementBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseManagementBtn2ActionPerformed
        this.setVisible(false);
        this.dispose();
        CourseManagement cm  = new CourseManagement();
        cm.setVisible(true);
    }//GEN-LAST:event_courseManagementBtn2ActionPerformed

    private void studentEnrollmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentEnrollmentBtnActionPerformed
        this.setVisible(false);
        this.dispose();
        StudentEnrollment se = new StudentEnrollment();
        se.setVisible(true);
    }//GEN-LAST:event_studentEnrollmentBtnActionPerformed

    private void teacherAssignmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherAssignmentBtnActionPerformed
        this.setVisible(false);
        this.dispose();
        TeacherAssignment ta = new TeacherAssignment();
        ta.setVisible(true);
    }//GEN-LAST:event_teacherAssignmentBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void signOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutBtnMouseClicked
        this.setVisible(false);
        this.dispose();
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_signOutBtnMouseClicked

    private void courseEnrollmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseEnrollmentBtnActionPerformed
        this.setVisible(false);
        this.dispose();
        CourseEnrollment ce = new CourseEnrollment();
        ce.setVisible(true);
    }//GEN-LAST:event_courseEnrollmentBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton courseEnrollmentBtn;
    private javax.swing.JButton courseManagementBtn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton sectionManagementBtn;
    private javax.swing.JLabel signOutBtn;
    private javax.swing.JButton studentEnrollmentBtn;
    private javax.swing.JButton studentManagementBtn;
    private javax.swing.JButton teacherAssignmentBtn;
    // End of variables declaration//GEN-END:variables
}
