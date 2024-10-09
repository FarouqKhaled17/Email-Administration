package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private int mailCapacity;

//    Constructor for first name and last name
    public Email(String firstName, String lastName,String department){
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email Created Successfully : "+this.firstName+this.lastName+"@blackmart.com"+"\nDepartment: "+this.department);

//        Calling a method to ask the user for the department
        this.department=setDepartment();
        System.out.println("Department : "+this.department);

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

//        Generate a random Password
        
    }
}
