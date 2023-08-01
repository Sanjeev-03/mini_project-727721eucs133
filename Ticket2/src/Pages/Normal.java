package Pages;

import java.util.*;
import java.awt.print.Printable;
import java.util.*;

public class Normal {
	public static void normal(String username,String choice, String seattype) throws ClassNotFoundException
	{
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the No.of.Seats : ");
		int sea = x.nextInt();
		x.nextLine();
		
		int totcost = sea*800;
		System.out.println("Total Cost : "+(totcost));
		System.out.println("Are you sure to buy the tickets (y/n) : ");
		String are = x.nextLine();
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
		String a = x.nextLine();
		System.out.println("Your Ticket is Printed..!!!");
		
	}

}
