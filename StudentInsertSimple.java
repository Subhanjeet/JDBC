import java.sql.*;

public class StudentInsertSimple {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "your_password";

        String sql =
            "INSERT INTO student (roll_no, name) VALUES (?, ?)";

        try (
            Connection con =
                DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setInt(1, 101);
            ps.setString(2, "Asha");

            ps.executeUpdate();

            System.out.println("Student inserted successfully!");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}