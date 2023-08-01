package Pages;

import java.awt.print.Printable;
import java.util.*;

public class Premium {
	public static void premium(String username,String choice, String seattype) throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the No.of.Seats : ");
		int sea = sc.nextInt();
		sc.nextLine();
		
		
			int totcost = sea*1500;
		System.out.println("Total Cost : "+(totcost));
		
		System.out.println("Are you sure to buy the tickets (y/n) : ");
		String are = sc.nextLine();
		if(are.equals("y"))
		{
			print.printTicket(username, choice, seattype, sea, totcost);
			System.out.println("Tickets Booked Successfully !!!");
		}
		
		else
		{
			System.out.println("Thank You for Visiting !!");
		}
		
		System.out.println("Are you want to print the Ticket..? (y/n) : ");
		String a = sc.nextLine();
		System.out.println("Your Ticket is Printed..!!!");
		
		
	
		
	}

}
