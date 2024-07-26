import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/";
    static final String USER = "root";
    static final String PASS = "1234";
    static final String dbName = "jdbctest";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL + dbName, USER, PASS);
            System.out.println("Connected database successfully...");
            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();

            String sql = "INSERT INTO employees VALUES ('5001', '30', 'Surendra', 'K', 'Coimbatore')";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO employees VALUES ('5002', '21', 'Athul', 'K', 'Wayanad')";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO employees VALUES ('5003', '20', 'Yadhu', 'K T', 'Palakkad')";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO employees VALUES ('5004', '23', 'Pravin', 'K P', 'Thrissur')";
            stmt.executeUpdate(sql);

            sql = "UPDATE employees SET age = 21 WHERE id in (5003, 5004)";
            stmt.executeUpdate(sql);

            System.out.println("Inserted records into the table...");

            String sql2 = "DELETE FROM employees where id=5004";
            stmt.executeUpdate(sql2);
            System.out.println("Deleted records in the table where id is 5004...");

            ResultSet rs = stmt.executeQuery("select * from employees");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " ");
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) conn.close();
            } catch (SQLException se) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
