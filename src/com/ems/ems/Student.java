/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ems.ems;

//import com.ems.ems.com.
import javax.swing.JOptionPane;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author himanshu
 */
public class Student {
    
    private String firstName, lastName, lastQualificationDegree, emailId;
    private long dob, contactNumber;
    private int marks, id;
    
    public Student(String firstName, String lastName, long dob, String lastQualificationDegree,
            int marks, long contactNumber, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.lastQualificationDegree = lastQualificationDegree;
        this.marks = marks;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setMarks(int marks) {
        this.marks = marks;
    }
    
    public void setDegree(String degree) {
        this.lastQualificationDegree = degree;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public String getDegree() {
        return this.lastQualificationDegree;
    }
    
    public String getEmailId() {
        return this.emailId;
    }
    
    public long getDOB() {
        return this.dob;
    }
    
    public long getContact() {
        return this.contactNumber;
    }
    
    public int getMarks() {
        return this.marks;
    }
    
    public int FirstTimeLogin(String password) {
        
        String filelocation = "students.csv";
        
        CsvReader reader2 = null;
        try {
            reader2 = new CsvReader(new FileReader(filelocation));
            ArrayList<String[]> allElements = new ArrayList<>();
            reader2.readHeaders();
            while(reader2.readRecord()) {
                allElements.add(reader2.getValues());
                
            }
            reader2.close();
            
            (allElements.get(this.id - 1))[9] = password;
            (allElements.get(this.id - 1))[10] = "0";
            
            CsvWriter csvOutput = new CsvWriter(new FileWriter(filelocation, false), ',');
            
            csvOutput.write("id");
            csvOutput.write("username");
            csvOutput.write("firstName");
            csvOutput.write("lastName");
            csvOutput.write("dob");
            csvOutput.write("degree");
            csvOutput.write("marks");
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
    
    public int RegisterStudent(String ift) {
        
        
        
        String outputFile = "students.csv";
		
        boolean alreadyExists = new File(outputFile).exists();

        try {
                // use FileWriter constructor that specifies open for appending
                CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');

                // if the file didn't already exist then we need to write out the header line
                if (!alreadyExists)
                {
                        csvOutput.write("id");
                        csvOutput.write("username");
                        csvOutput.write("firstName");
                        csvOutput.write("lastName");
                        csvOutput.write("dob");
                        csvOutput.write("degree");
                        csvOutput.write("marks");
                        csvOutput.write("contactNumber");
                        csvOutput.write("emailId");
                        csvOutput.write("password");
                        csvOutput.write("isFirstTime");
                        csvOutput.endRecord();
                }
                // else assume that the file already has the correct header line
                
                String username = "userEMS" + (this.id + 45653);

                // write out a few records
                csvOutput.write(String.valueOf(this.id));
                csvOutput.write(username);
                csvOutput.write(this.firstName);
                csvOutput.write(this.lastName);
                csvOutput.write(String.valueOf(this.dob));
                csvOutput.write(this.lastQualificationDegree);
                csvOutput.write(String.valueOf(this.marks));
                csvOutput.write(String.valueOf(this.contactNumber));
                csvOutput.write(this.emailId);
                csvOutput.write(String.valueOf(this.contactNumber));
                csvOutput.write(ift);
                // csvOutput.write(this.password);
                csvOutput.endRecord();

                csvOutput.close();
                
                JOptionPane.showMessageDialog(null, "You have been registered successfully.\n"
                        + " Use the following information to login first time and"
                        + " change the password\n" +
                        "Username: " + username +
                        "\nPassword: " + String.valueOf(this.contactNumber));
                
        } catch (IOException e) {
                return 0;
        }
        return 1;
    }
    
    public int getNumberOfStudents() {
        
        try {
            CsvReader students = new CsvReader("students.csv");
            
            students.readHeaders();
            
            int currentId = 0;
            
            while (students.readRecord()) {
                String email = students.get("emailId");
                // String pass = students.get("password");
                
                
                // if the email matches
                // then it return -1
                // means student is already registered
                if (this.emailId.equalsIgnoreCase(email)) {
                    return -1;
                }
                
                String currentIdString = students.get("id");
                
                if (!currentIdString.equals("")) {
                    currentId = Integer.parseInt(students.get("id"));
                }
            
            }
            
            students.close();
            return currentId;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
}
