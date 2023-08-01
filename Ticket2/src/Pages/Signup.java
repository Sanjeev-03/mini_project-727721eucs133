package Pages;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;
    import java.util.Scanner;

    public class Signup {

        private static final String Driver = "com.mysql.cj.jdbc.Driver";
        private static final String URL = "jdbc:mysql://localhost:3306/ticket_booking";
        private static final String USER = "root";
        private static final String PASSWORD = "tiger";

        public static void insertUserData(String username, String pass) throws ClassNotFoundException {
            Class.forName(Driver);

            try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement stmt = con.prepareStatement("INSERT INTO Login (username, password) VALUES (?, ?)")) {

                stmt.setString(1, username);
                stmt.setString(2, pass);

                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("=============================================");
                    System.out.println("|             Ticket Reservation Page       |");
                    System.out.println("|            Sign Up Successful!            |");
                    System.out.println("=============================================");
                    Login.loginPage(); 
                } else {
                    System.out.println("=============================================");
                    System.out.println("|         Ticket Reservation Page           |");
                    System.out.println("|    Failed to Sign Up. Please try again.   |");
                    System.out.println("=============================================");

                    System.out.println();
                    System.out.println();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public static void SignUpPage() throws ClassNotFoundException {
            Scanner sc = new Scanner(System.in);

            System.out.println("=============================================");
            System.out.println("|            Welcome to Sign Up!            |");
            System.out.println("=============================================");

            System.out.print("Enter the User Name: ");
            String username = sc.nextLine();

            System.out.print("Enter the Password: ");
            String password = sc.nextLine();

            insertUserData(username, password);
        }
    }