import java.sql.*;
import java.util.Scanner;

public class DeleteData {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "ace123");
             Statement t = con.createStatement()) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Delete Data from student table:");
            System.out.println("________________________________________");

            System.out.print("Enter student id: ");
            int sid = sc.nextInt();

            String deleteQuery = "DELETE FROM student WHERE s_id=" + sid;
            t.executeUpdate(deleteQuery);

            System.out.println("Data deleted successfully");

        } catch (SQLException err) {
            System.out.println("ERROR: " + err);
        }
    }
}
  
