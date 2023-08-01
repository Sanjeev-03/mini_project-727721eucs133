package Pages;

import java.util.Scanner;

public class concerts {
	
	public static void concert(String username, String choice) throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("            Cost for Seats      ");
		System.out.println("For Premium : Rs 2500");
		System.out.println("For Normal : Rs 1800");
		System.out.print("Are you sure to buy Tickets (y/n) : ");
		String ans = sc.nextLine();
		if(ans.equals("y"))
		{
			Seats.seat(username, choice);
		}
		
		else
		{
			System.out.println("Thank You For Visiting");
		}
	
	
	
	}
}
