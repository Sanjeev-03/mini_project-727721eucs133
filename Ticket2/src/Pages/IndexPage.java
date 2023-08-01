package Pages;

import java.util.Scanner;

public class IndexPage {
    public static void main(String args[]) throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================================");
        System.out.println("|       Welcome to Ticket Reservation Page         |");
        System.out.println("|                                           	   |");
        System.out.println("| 		Login (Already a user?)            |");
        System.out.println("|  		Signup (New User?)                 |");
        System.out.println("|                                           	   |");
        System.out.println("====================================================");
        System.out.print("Enter your choice (1/2): ");
        System.out.println();
        System.out.println();
        int option = sc.nextInt();
        sc.nextLine();

        if (option == 1) {
            Login.loginPage();
        } else if (option == 2) {
            Signup.SignUpPage();
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2");
        }

    }
}