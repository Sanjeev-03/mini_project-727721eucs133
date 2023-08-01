package Pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    @Override
    public String toString() {
        return "Username: " + username;
    }
    public String toString1() {
    	return "Password: " + password;
    }

}

public class Login {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/ticket_booking";
    private static final String USER = "root";
    private static final String PASSWORD = "tiger";

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static boolean authenticate(String username, String password) throws ClassNotFoundException {
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement("SELECT * FROM Login WHERE username = ?")) {

            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String db_Password = rs.getString("password");
                return db_Password.equals(password);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static void loginPage() throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("|               Ticket Reservation         |");
        System.out.println("|                 Login Page               |");
        System.out.println("============================================");

        System.out.print("User Name: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        if (authenticate(username, password)) {
            System.out.println("Login Successful");
            Home.HomePage(username);
        } else {
            System.out.println("Invalid Credentials");
            System.out.println("Options:");
            System.out.println(" Retry Login");
            System.out.println("Signup");
            System.out.print("Enter your option (1/2): ");
            System.out.println();
            System.out.println();

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    loginPage();
                    break;
                case 2:
                    Signup.SignUpPage();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}
