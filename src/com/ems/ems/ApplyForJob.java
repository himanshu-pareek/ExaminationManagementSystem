/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ems.ems;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author himanshu
 */
public class ApplyForJob extends javax.swing.JFrame {
    
    private DefaultTableModel myModel;
    private ArrayList<Integer> jobIds;
    private ArrayList<Integer> companyIds;
    private ArrayList<String> profileLinks;
    private Student student;

    /**
     * Creates new form ApplyForJob
     */
    public ApplyForJob() {
        initComponents();
        
        titleLabel.setHorizontalAlignment(CENTER);
        
        profileLinkTextArea.setEditable(false);
        aboutJobTextArea.setEditable(false);
        
        jobIds = new ArrayList<>();
        companyIds = new ArrayList<>();
        profileLinks = new ArrayList<>();
        
        myModel = (DefaultTableModel) jobTable.getModel();
        
        jobTable.getColumnModel().getColumn(0).setMaxWidth(50);
        jobTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        
        // 1. Show the jobs in the table
        showJobs();
    }
    
    public ApplyForJob(Student student) {
        initComponents();
        
        this.student = student;
        
        titleLabel.setHorizontalAlignment(CENTER);
        
        profileLinkTextArea.setEditable(false);
        aboutJobTextArea.setEditable(false);
        
        jobIds = new ArrayList<>();
        companyIds = new ArrayList<>();
        profileLinks = new ArrayList<>();
        
        myModel = (DefaultTableModel) jobTable.getModel();
        
        jobTable.getColumnModel().getColumn(0).setMaxWidth(50);
        jobTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        
        // 1. Show the jobs in the table
        showJobs();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jobTable = new javax.swing.JTable();
        applyForJobButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jobTitleLabel = new javax.swing.JLabel();
        companyNameLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        aboutJobTextArea = new javax.swing.JTextArea();
        cancelButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        profileLinkTextArea = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jobTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No.", "Job title", "Company", "About job"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jobTable.getTableHeader().setReorderingAllowed(false);
        jobTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jobTableMouseClicked(evt);
            }
        });
        jobTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jobTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jobTable);
        if (jobTable.getColumnModel().getColumnCount() > 0) {
            jobTable.getColumnModel().getColumn(0).setResizable(false);
            jobTable.getColumnModel().getColumn(1).setResizable(false);
            jobTable.getColumnModel().getColumn(2).setResizable(false);
            jobTable.getColumnModel().getColumn(3).setResizable(false);
        }

        applyForJobButton.setText("Apply for job");
        applyForJobButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyForJobButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Job title");

        jLabel2.setText("Company");

        jLabel3.setText("About job");

        aboutJobTextArea.setColumns(20);
        aboutJobTextArea.setRows(5);
        aboutJobTextArea.setText("Description of the job will be here");
        jScrollPane2.setViewportView(aboutJobTextArea);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Ubuntu", 2, 24)); // NOI18N
        titleLabel.setText("Job vacancies");

        jLabel4.setText("Profile Link");

        profileLinkTextArea.setText("Url of company profile will be here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(applyForJobButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(companyNameLabel)
                                    .addComponent(jobTitleLabel))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(profileLinkTextArea))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jobTitleLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(companyNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(profileLinkTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applyForJobButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void applyForJobButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyForJobButtonActionPerformed
        int index = jobTable.getSelectedRow();
        if (index >= 0) {
            //JOptionPane.showMessageDialog(null, jobIds.get(index));
            int currentId = getNumberOfApplications(index);
            switch (currentId) {
                case -1:
                    // already applied
                    JOptionPane.showMessageDialog(null, "You have already applied to this job");
                    break;
                case -2:
                    // file not found
                    JOptionPane.showMessageDialog(null, "Unable to access database", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
                case -3:
                    // unable to read file
                    JOptionPane.showMessageDialog(null, "Unable to apply for the job", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
                default:
                    // go ahead
                    String jobTitle = jobTable.getValueAt(index, 1).toString();
                    int result = setApplication(
                            currentId + 1, 
                            jobIds.get(index),
                            companyIds.get(index),
                            jobTitle
                    );
                    if (result == 1) {
                        JOptionPane.showMessageDialog(null, "You have successfully applied for the job");
                    } else {
                        JOptionPane.showMessageDialog(null, "Unable to apply for the job, try again", "Error", JOptionPane.ERROR_MESSAGE);
                    }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a job, then click here");
        }
    }//GEN-LAST:event_applyForJobButtonActionPerformed

    private void jobTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jobTableMouseClicked
        int index = jobTable.getSelectedRow();
        if (index >= 0) {
            // row is selected
            jobTitleLabel.setText(myModel.getValueAt(index, 1).toString());
            companyNameLabel.setText(myModel.getValueAt(index, 2).toString());
            profileLinkTextArea.setText(profileLinks.get(index));
            aboutJobTextArea.setText(myModel.getValueAt(index, 3).toString());
        } else {
            // row not selected
        }
    }//GEN-LAST:event_jobTableMouseClicked

    private void jobTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jobTableKeyReleased
        int index = jobTable.getSelectedRow();
        if (index >= 0) {
            // row is selected
            jobTitleLabel.setText(myModel.getValueAt(index, 1).toString());
            companyNameLabel.setText(myModel.getValueAt(index, 2).toString());
            profileLinkTextArea.setText(profileLinks.get(index));
            aboutJobTextArea.setText(myModel.getValueAt(index, 3).toString());
        } else {
            // row not selected
        }
    }//GEN-LAST:event_jobTableKeyReleased

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplyForJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ApplyForJob().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aboutJobTextArea;
    private javax.swing.JButton applyForJobButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel companyNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jobTable;
    private javax.swing.JLabel jobTitleLabel;
    private javax.swing.JTextField profileLinkTextArea;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    private void showJobs() {
        try {
            CsvReader jobs = new CsvReader("postedJobs.csv");
            
            jobs.readHeaders();
            
            int sn = 0;
            
            while (jobs.readRecord()) {
                jobIds.add(Integer.parseInt(jobs.get("id")));
                companyIds.add(Integer.parseInt(jobs.get("companyId")));
                profileLinks.add(jobs.get("profileLink"));
                String jT = jobs.get("jobTitle");
                String cN = jobs.get("companyName");
                String aJ = jobs.get("aboutJob");
                myModel.addRow(new String[]{String.valueOf(sn + 1), jT, cN, aJ});
                sn++;
            }
            
            jobs.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error displaying jobs", "Error", JOptionPane.ERROR_MESSAGE);
            dispose();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error reding database", "Error", JOptionPane.ERROR_MESSAGE);
            dispose();
        }
    }

    private int getNumberOfApplications(int index) {
        try {
            CsvReader applications = new CsvReader("applications.csv");
            
            applications.readHeaders();
            
            int currentId = 0;
            
            while (applications.readRecord()) {
                
                int jobId = Integer.parseInt(applications.get("jobId"));
                int studentId = Integer.parseInt(applications.get("studentId"));
                
                if (studentId == this.student.getId() && jobId == jobIds.get(index)) {
                    return -1;
                }
                
                String currentIdString = applications.get("id");
                
                if (!currentIdString.equals("")) {
                    currentId = Integer.parseInt(currentIdString);
                }
            
            }
            
            applications.close();
            
            return currentId;
            
        } catch (FileNotFoundException ex) {
            return -2;
        } catch (IOException ex) {
            return -3;
        }
    }

    private int setApplication(int id, int jobId, int companyId, String jobTitle) {
        /*
        Database
        |id|jobId|studentId|companyId|firstName|lastName|dob|degree|marks|contactNumber|email
        */
        String outputFile = "applications.csv";
		
        // before we open the file check to see if it already exists
        boolean alreadyExists = new File(outputFile).exists();

        try {
                // use FileWriter constructor that specifies open for appending
                CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');

                // if the file didn't already exist then we need to write out the header line
                if (!alreadyExists)
                {
                        csvOutput.write("id");
                        csvOutput.write("jobId");
                        csvOutput.write("studentId");
                        csvOutput.write("companyId");
                        csvOutput.write("jobTitle");
                        csvOutput.write("studentName");
                        csvOutput.endRecord();
                }

                // write out a few records
                csvOutput.write(String.valueOf(id));
                csvOutput.write(String.valueOf(jobId));
                csvOutput.write(String.valueOf(this.student.getId()));
                csvOutput.write(String.valueOf(companyId));
                csvOutput.write(jobTitle);
                csvOutput.write(this.student.getFirstName() + " " + this.student.getLastName());
                
                csvOutput.endRecord();

                csvOutput.close();
                
                return 1;
                
        } catch (IOException e) {
                return 0;
        }
    }
}

