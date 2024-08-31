
package screens;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocation(200, 200);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        role = new javax.swing.JComboBox<>();
        loginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Login");

        email.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));

        password.setBorder(javax.swing.BorderFactory.createTitledBorder("Password"));

        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "student", "teacher" }));
        role.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        loginBtn.setText("Login");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.setFocusable(false);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(email)
                            .addComponent(password)
                            .addComponent(role, 0, 440, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String studentEmail = "student@gmail.com";
        String studentPassword = "12345";
        String teacherEmail = "teacher@gmail.com";
        String teacherPassword = "12345";
        String adminEmail = "admin@gmail.com";
        String adminPassword = "12345";
        if (String.valueOf(role.getSelectedItem()).equals("admin"))
        {
            String admin_email = String.valueOf(email.getText());
            String admin_password = String.valueOf(password.getPassword());
            if (admin_email.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Admin email is required");
                return;
            }
            else if (admin_password.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Admin password is required");
                return;
            }
            if (admin_email.equals(adminEmail) && admin_password.equals(adminPassword))
            {
                this.setVisible(false);
                this.dispose();
                AdminDashboard ad = new AdminDashboard();
                ad.setVisible(true);
            }
            else if (!(admin_email.equals(adminEmail) && admin_password.equals(adminPassword)))
            {
                JOptionPane.showMessageDialog(this, "Admin email or password is incorrect");
                return;
            }
        }
        else if(String.valueOf(role.getSelectedItem()).equals("teacher"))
        {
            String teacher_email = String.valueOf(email.getText());
            String teacher_password = String.valueOf(password.getPassword());
            if (teacher_email.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Teacher email is required");
                return;
            }
            else if (teacher_password.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Teacher password is required");
                return;
            }
            if (teacher_email.equals(teacherEmail) && teacher_password.equals(teacherPassword))
            {
                this.setVisible(false);
                this.dispose();
                TakeAttendance t = new TakeAttendance();
                t.setVisible(true);
            }
            else if (!teacher_email.equals(teacherEmail) && teacher_password.equals(teacherPassword))
            {
                JOptionPane.showMessageDialog(this, "Teacher email or password is incorrect");
                return;
            }
        }
        else if (String.valueOf(role.getSelectedItem()).equals("student"))
        {
           String student_email = String.valueOf(email.getText());
            String student_password = String.valueOf(password.getPassword());
            if (student_email.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Student email is required");
                return;
            }
            else if (student_password.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Student password is required");
                return;
            }
            if (student_email.equals(studentEmail) && student_password.equals(studentPassword))
            {
                this.setVisible(false);
                this.dispose();
                StudentPortal s = new StudentPortal();
                s.setVisible(true);
                return;
            }
            else if (!student_email.equals(studentEmail) && student_password.equals(studentPassword))
            {
                JOptionPane.showMessageDialog(this, "Student email or password is incorrect");
                return;
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> role;
    // End of variables declaration//GEN-END:variables
}
