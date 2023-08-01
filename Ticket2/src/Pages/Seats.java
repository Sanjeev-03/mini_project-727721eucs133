package Pages;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class Seats {
	
	static String Driver = "com.mysql.cj.jdbc.Driver";
    static String URL = "jdbc:mysql://localhost:3306/ticket_booking";
    static String USER = "root";
    static String PASSWORD = "tiger";
	
	 private static void insertUsernameIntoPrintTable(String seattype) throws ClassNotFoundException {
	        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
	             PreparedStatement stmt = con.prepareStatement("INSERT INTO edetails (seat_type) VALUES (?)")) {

	            stmt.setString(1, seattype);
	            stmt.executeUpdate();
	            
	           
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	public static void seat(String username, String choice) throws ClassNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the type of seat (Premium/Normal) : ");
		String seattype = sc.nextLine();
		if(seattype.equals("Premium"))
		{
			Premium.premium(username, choice, seattype);
			
		}
		
		else if(seattype.equals("Normal"))
		
		{
			Normal.normal(username,choice, seattype);
		}
		
		else
		{
			System.out.println("Invalid");
			sports.sport(username, choice);
			
		}
	}

}
