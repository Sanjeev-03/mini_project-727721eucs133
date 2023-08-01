package Pages;

import java.util.Scanner;

public class Home {
    public static void HomePage(String username) throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("|           Ticket Reservation              |");
        System.out.println("|                                           |");
        System.out.println("|    Welcome to Ticket Reservation Page!    |");
        System.out.println("|      Type 'continue' to proceed with      |");
        System.out.println("|  	booking ticket                      |");  
        System.out.println("|                                           |");
        System.out.println("=============================================");
        System.out.println();
        System.out.println();

        String str = sc.nextLine();

        if (str.equalsIgnoreCase("continue")) {
        	
//        	String choice = sc.nextLine();
        	Amount.amount(username);

        } else {
            System.out.println("Oops!! Please Re-Check & Try Again");
            HomePage(username);
        }
    }


}