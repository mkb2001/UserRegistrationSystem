package org.mkbservices;

import java.util.Scanner;

public class Main {
    private static UserServiceImplementation userService = null;

    public Main(UserServiceImplementation userService) {
        Main.userService = userService;
    }

    public static void main(String[] args) {
        while (true){
            System.out.println("Welcome back, Please login to proceed");
            System.out.println("1 - Add user");
            System.out.println("2 - update User");
            System.out.println("3 - Delete user");
            System.out.println("4 - Get user by username");
            System.out.println("5 - get all");
            System.out.println("6 - Exit ");

            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();

            switch (option){
                case 1:
                    System.out.println("Soon");
                case 2:
                    System.out.println("Soon");
                case 3:
                    System.out.println("soom");
                case 4:
                    System.out.println("soon");
                case 5:
                    System.out.println("sout");
                case 6:
                    System.out.println("soon");
            }
        }
    }
}