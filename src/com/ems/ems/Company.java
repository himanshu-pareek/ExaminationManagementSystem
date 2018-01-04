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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author himanshu
 */
public class Company {
    
    private int id;
    private String companyName, address, profileLink, emailId;
    private long contactNumber;
    
    public Company(String name, String address, String profileLink, String email, long contact) {
        this.companyName = name;
        this.address = address;
        this.profileLink = profileLink;
        this.emailId = email;
        this.contactNumber = contact;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getName() {
        return this.companyName;
    }
    
    public int FirstTimeLogin(String password) {
        
        String filelocation = "companies.csv";
        
        CsvReader reader2 = null;
        try {
            reader2 = new CsvReader(new FileReader("companies.csv"));
            ArrayList<String[]> allElements = new ArrayList<>();
            reader2.readHeaders();
            while(reader2.readRecord()) {
                allElements.add(reader2.getValues());
                // JOptionPane.showMessageDialog(null, Arrays.toString(reader2.getValues()));
            }
            reader2.close();
            
            (allElements.get(this.id - 1))[7] = password;
            (allElements.get(this.id - 1))[8] = "0";
            
            CsvWriter csvOutput = new CsvWriter(new FileWriter(filelocation, false), ',');
            
            csvOutput.write("id");
            csvOutput.write("username");
            csvOutput.write("companyName");
            csvOutput.write("address");
            csvOutput.write("profileLink");
            csvOutput.write("contactNumber");
            csvOutput.write("emailId");
            csvOutput.write("password");
            csvOutput.write("isFirstTime");
            csvOutput.endRecord();
            
            for (String[] x: allElements) {
                csvOutput.writeRecord(x);
            }
            csvOutput.close();
            return 1;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            reader2.close();
        }
        return 0;
    }
    
    public int RegisterCompany(String ift) {
        
        //JOptionPane.showMessageDialog(null, firstName + lastName + emailId + password + dob +
        //        lastQualificationDegree + contactNumber );
        
        String outputFile = "companies.csv";
		
        // before we open the file check to see if it already exists
        boolean alreadyExists = new File(outputFile).exists();

        try {
                // use FileWriter constructor that specifies open for appending
                CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');

                // if the file didn't already exist then we need to write out the header line
                if (!alreadyExists)
                {
                    csvOutput.write("id");
                    csvOutput.write("username");
                    csvOutput.write("companyName");
                    csvOutput.write("address");
                    csvOutput.write("profileLink");
                    csvOutput.write("contactNumber");
                    csvOutput.write("emailId");
                    csvOutput.write("password");
                    csvOutput.write("isFirstTime");
                    csvOutput.endRecord();
                }
                // else assume that the file already has the correct header line
                
                String username = "companyEMS" + (this.id + 99999);

                // write out a few records
                csvOutput.write(String.valueOf(this.id));
                csvOutput.write(username);
                csvOutput.write(this.companyName);
                csvOutput.write(this.address);
                csvOutput.write(this.profileLink);
                csvOutput.write(String.valueOf(this.contactNumber));
                csvOutput.write(this.emailId);
                csvOutput.write(String.valueOf(this.contactNumber));
                csvOutput.write(ift);
                // csvOutput.write(this.password);
                csvOutput.endRecord();

                csvOutput.close();
                
                JOptionPane.showMessageDialog(null, "You have registered successfully.\n"
                        + " Use the following information to login first time and"
                        + " change the password\n" +
                        "Username: " + username +
                        "\nPassword: " + String.valueOf(this.contactNumber));
                
        } catch (IOException e) {
                e.printStackTrace();
                return 0;
        }
        return 1;
    }
    
    public int getNumberOfCompanies() {
        
        try {
            CsvReader companies = new CsvReader("companies.csv");
            
            companies.readHeaders();
            
            int currentId = 0;
            
            while (companies.readRecord()) {
                String email = companies.get("emailId");
                // String pass = students.get("password");
                
                
                // if the email matches
                // then it return -1
                // means student is already registered
                if (this.emailId.equalsIgnoreCase(email)) {
                    return -1;
                }
                
                String currentIdString = companies.get("id");
                
                if (!currentIdString.equals("")) {
                    currentId = Integer.parseInt(currentIdString);
                }
            
            }
            
            companies.close();
            return currentId;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public int PostJob(String jobTitle,String  aboutJob) {
        
        int jobId = getNumberOfJobs();
        if (jobId == -1) {
            return 0;
        }
        jobId++;
        String outputFile = "postedJobs.csv";
		
        // before we open the file check to see if it already exists
        boolean alreadyExists = new File(outputFile).exists();

        try {
                // use FileWriter constructor that specifies open for appending
                CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');

                // if the file didn't already exist then we need to write out the header line
                if (!alreadyExists)
                {
                    csvOutput.write("id");
                    csvOutput.write("companyId");
                    csvOutput.write("companyName");
                    csvOutput.write("profileLink");
                    csvOutput.write("jobTitle");
                    csvOutput.write("aboutJob");
                    csvOutput.endRecord();
                }
                
                // write out a few records
                csvOutput.write(String.valueOf(jobId));
                csvOutput.write(String.valueOf(this.id));
                csvOutput.write(this.companyName);
                csvOutput.write(this.profileLink);
                csvOutput.write(jobTitle);
                csvOutput.write(aboutJob);
                csvOutput.endRecord();

                csvOutput.close();
                
        } catch (IOException e) {
                e.printStackTrace();
                return 0;
        }
        return 1;
    }

    private int getNumberOfJobs() {
        try {
            CsvReader jobs = new CsvReader("postedJobs.csv");
            
            jobs.readHeaders();
            
            int currentId = 0;
            
            while (jobs.readRecord()) {
                
                String currentIdString = jobs.get("id");
                
                if (!currentIdString.equals("")) {
                    currentId = Integer.parseInt(currentIdString);
                }
            
            }
            
            jobs.close();
            return currentId;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
}
