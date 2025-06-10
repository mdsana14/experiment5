import java.sql.*;
import java.util.Scanner;

public class UpdateData {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "ace123101");
             Statement t = con.createStatement()) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Update Data in student table:");
            System.out.println("________________________________________");

            System.out.print("Enter student id: ");
            int sid = sc.nextInt();
            System.out.print("Enter student name: ");
            String sname = sc.next();
            System.out.print("Enter student address: ");
            String saddr = sc.next();

            String updateQuery = "UPDATE student SET s_name='" + sname + "', s_address='" + saddr + "' WHERE s_id=" + sid;
            t.executeUpdate(updateQuery);

            System.out.println("Data updated successfully");

        } catch (SQLException err) {
            System.out.println("ERROR: " + err);
        }
    }
}

  