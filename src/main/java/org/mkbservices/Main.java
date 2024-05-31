package org.mkbservices;

import java.util.Scanner;

//
public class Main {


    // this is my entry point
    public static void main(String[] args) {
        UserModel userModel = new UserModel();
        UserServiceImplementation userService = new UserServiceImplementation(userModel);


        while (true) {
            // this is the menu.
            System.out.println("Welcome back, Please login to proceed");
            System.out.println("1 - Add user");
            System.out.println("2 - update User");
            System.out.println("3 - Delete user");
            System.out.println("4 - Get user by username");
            System.out.println("5 - get all");
            System.out.println("6 - Exit ");


            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();
            // this is the switch statement which will help us to navigate through the menu
            switch (option) {
                case 1:
                    System.out.println("Enter the first name of the user");
                    String fn = scan.next();
                    System.out.println("Enter the last name of the user");
                    String ln = scan.next();
                    System.out.println("Enter the dob of the user");
                    String dob = scan.next();
                    System.out.println("Enter the username of the user");
                    String username = scan.next();
                    userService.addUser(ln,fn,dob,username);
                    break;
                case 2:

                    System.out.println("Soon");
                    break;
                case 3:
                    System.out.println("soom");
                    break;
                case 4:
                    System.out.println("soon");
                    break;
                case 5:
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("----------------------");
                    System.out.println("See you soon");
                    System.exit(0);
                    break;
            }
        }
    }
}