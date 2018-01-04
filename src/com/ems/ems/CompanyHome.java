/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ems.ems;

import static javax.swing.SwingConstants.CENTER;

/**
 *
 * @author himanshu
 */
public class CompanyHome extends javax.swing.JFrame {
    
    private Company company;
    private String username;

    /**
     * Creates new form CompanyHome
     */
    public CompanyHome() {
        initComponents();
        
        titleLabel.setHorizontalAlignment(CENTER);
        companyNameLabel.setHorizontalAlignment(CENTER);
        
        operationsComboBox.removeAllItems();
        operationsComboBox.addItem("Post job");
        operationsComboBox.addItem("Interested students");
    }
    
    public CompanyHome(Company company, String username) {
        initComponents();
        this.company = company;
        this.username = username;
        
        titleLabel.setHorizontalAlignment(CENTER);
        companyNameLabel.setHorizontalAlignment(CENTER);
        
        operationsComboBox.removeAllItems();
        operationsComboBox.addItem("Post job");
        operationsComboBox.addItem("Interested students");
        
        companyNameLabel.setText(this.company.getName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        companyNameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        operationsComboBox = new javax.swing.JComboBox<>();
        helpButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        titleLabel.setText("Examination Management System");

        companyNameLabel.setFont(new java.awt.Font("Ubuntu", 2, 18)); // NOI18N
        companyNameLabel.setText("Company name");

        jLabel1.setText("Select Operation :");

        operationsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        helpButton.setText("Help");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(companyNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoutButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58)
                        .addComponent(operationsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(44, 44, 44)
                .addComponent(companyNameLabel)
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(operationsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(submitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(helpButton)
                    .addComponent(logoutButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        int index = operationsComboBox.getSelectedIndex();
        
        switch(index) {
            case 0:
                // start job post page
                PostJob postJob = new PostJob(this.company);
                postJob.setVisible(true);
                break;
            case 1:
                // start interested students page
                ViewStudents viewStudents = new ViewStudents(this.company.getId());
                viewStudents.setVisible(true);
                break;
            default:
                // show error to the user
        }
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        MainPage mainPage = new MainPage();
        mainPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CompanyHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompanyHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompanyHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompanyHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompanyHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel companyNameLabel;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JComboBox<String> operationsComboBox;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}