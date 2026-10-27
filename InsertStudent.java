import java.sql.*;
import java.util.Scanner;

public class InsertStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "your_password";

        String sql =
            "INSERT INTO student (roll_no, name) VALUES (?, ?)";

        try (
            Connection con =
                DriverManager.getConnection(url, user, password);
            Scanner sc = new Scanner(System.in)
        ) {
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, roll);
            ps.setString(2, name);

            int rows = ps.executeUpdate();

            System.out.println(rows + " student record inserted.");

            ps.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}