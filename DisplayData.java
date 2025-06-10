import java.sql.*;

public class DisplayData {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "ace123");
             Statement t = con.createStatement()) {

            ResultSet rs = t.executeQuery("SELECT * FROM student");
            if (rs != null) {
                System.out.println("SID \t STU_NAME \t ADDRESS");
                System.out.println("________________________________________");

                while (rs.next()) {
                    System.out.println(rs.getString("s_id") + " \t " + rs.getString("s_name") + " \t " + rs.getString("s_address"));
                    System.out.println("________________________________________");
                }
            }

        } catch (SQLException err) {
            System.out.println("ERROR: " + err);
        }
    }
}
  