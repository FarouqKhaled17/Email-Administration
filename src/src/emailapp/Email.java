package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String companySuffix="iSchool.com";
    private String password;
    private int passwordDefaultSize=8;
    private String department;
    private String alternateEmail;
    private int mailCapacity=900;

//    Constructor for first name and last name
    public Email(String firstName, String lastName,String department){
        this.firstName = firstName;
        this.lastName = lastName;
        email = firstName.toLowerCase()+lastName.toLowerCase()+"@"+companySuffix;


//        Calling a method to ask the user for the department
        this.department=setDepartment();
        System.out.println("Email Created Successfully : "+this.firstName.toLowerCase()+this.lastName.toLowerCase()+"@"+companySuffix+"\nDepartment: "+this.department);

        this.password=randomPassword(passwordDefaultSize);
        System.out.println("Password Created Successfully : "+this.password );

    }

//   Asking for department
    private String setDepartment() {
        System.out.print("Please enter department\n 1 For sales\n 2 For Development\n 3 For Accounting\n 0 For none\n Enter your department Code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
//        if (depChoice == 1) {
//            return "Sales";
//        }
//        else if (depChoice == 2) {
//            return "Development";
//        }
//        else if (depChoice == 3){
//            return "Accounting";
//        }
//        else
//            return "None";
//    }
        switch (depChoice) {
        case 1: return "Sales";
        case 2: return "Development";
        case 3: return "Accounting";
        default: return "None";
        }
    }

    //        Generate a random Password
    private String randomPassword(int length){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        char [] password=new char[length];
        for (int i=0 ;i< length;i++){
            int rand=(int)(Math.random()*characters.length());
            password[i] = characters.charAt(rand);
        }
        return new String(password);
    }

    public void setMailCapacity(int capacity){
        this.mailCapacity = capacity;
    }

    public void setAlternateEmail(String altMail){
        this.alternateEmail=altMail;
    }

    public void changePass(String pass){
        this.password=pass;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPass() {
        return alternateEmail;
    }

    public int getMailCap(){
        return mailCapacity;
    }

    public String getInfo(){
        return "Name: " + firstName+" "+lastName+"\n"+
        "Company Mail: "+email+"\n"+
                "mailCapacity: "+mailCapacity;

    }

}
