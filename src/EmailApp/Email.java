package EmailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int  defaultPasswordLength = 10;
    private String department;
    private String email;
    private int     mailBoxCapacity=500;
    private String alternativeEmail;
    private String companysSuffix = "nextpayday.com";

    // create a constructor that will recieve firstName and lastName
        public Email (String firstName, String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
            System.out.println("EMAIL CREATED: " +this.firstName + " " +this.lastName);

// method that returns your department
            this.department = setdepartment();
           // System.out.println("Department: " + this.department);

//method that generates a random default password
            this.password=randomPassword(defaultPasswordLength);
            System.out.println("Your Password is: " + this.password);
//method that generates email address for users
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companysSuffix;
          //  System.out.println("Your Email is:" + email);
        }

    // Ask for your department
    private String setdepartment() {
        System.out.print("DEPARTMENT CODES; \n1 for Sales\n2 for Developement\n3 for Accounting\n0 for None\n Enter your Dept. Code:");
        Scanner in = new Scanner(System.in);
        int deptCode = in.nextInt();
        if (deptCode == 1) { return "Sales"; }
        else if (deptCode == 2) { return "Dev"; }
        else if (deptCode == 3) { return "Acct"; }
        else { return " "; }
    }
            // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKFMNOPQRSTUVWXYZ1234567890@#$@%$^&()";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // Set mailbox capacity
    public void setMailBoxCapacity (int capacity){
            this.mailBoxCapacity = capacity;
    }

    //set alternative email
    public void setAlternativeEmail (String altEmail){
            this.alternativeEmail = altEmail;
    }

    //change your password
    public void changePassword( String password){
            this.password = password;
    }
    public int getMailBoxCapacity(){return mailBoxCapacity;}
    public String getAlternativeEmail(){return alternativeEmail;}
    public String getPassword(){return  password;}

    public String showInfo(){
            return "Display Name: " + firstName + " " + lastName +
                    "\nCompanies Email: " + email +
                    "\nMailbox Capacity: " + mailBoxCapacity + "mb";


    }
        }
