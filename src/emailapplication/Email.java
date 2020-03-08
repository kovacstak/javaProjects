/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapplication;

import java.util.Scanner;

/**
 *
 * @author enricamelissapanjaitan
 */
public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department;
    private String alternateEmail;
    private String companySuffix = "marinecompany.com";
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 8;
    
    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        
        // Call a method asking for the department
        this.department = setDepartment();
        
        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("You password is: "+ this.password);
        
        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department+"." + companySuffix;
    }
        
    
    // Ask employee for the department
    private String setDepartment(){
        System.out.print("New worker: "+ firstName+ ". DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter dept code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){return "sales";}
        else if (depChoice == 2){return "development";}
        else if (depChoice == 3){return "accounting";}
        else {return ""; }
    }
    
    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHJLKMNOPQRSTUVWXYZ123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    
    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
        
    }
    
    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
        
    }
    
    // Change the password
    public void changePassword(String password){
        this.password = password;
    }
    
    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail(){ return alternateEmail; }
    
    public String showInfo(){
        return ("DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb");
        
    
}
    
}
