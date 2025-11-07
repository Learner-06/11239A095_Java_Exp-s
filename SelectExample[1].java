// File: SelectExample.java
import java.sql.*;

public class SelectExample {
    // Database connection details
    static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe"; // or @localhost:1521/orclpdb
    static final String USER = "system";   // Oracle username
    static final String PASS = "admin";    // Oracle password
    static final String QUERY = "SELECT * FROM test";

    public static void main(String[] args) {
        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Oracle JDBC Driver loaded successfully!");

            // Establish connection
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(QUERY)) {

                System.out.println("Connected to Oracle Database successfully!");
                System.out.println("Running query: " + QUERY);

                boolean hasResults = false;
                while (rs.next()) {
                    hasResults = true;
                    System.out.print("ID: " + rs.getInt("regno"));
                    System.out.print(", FN: " + rs.getString("name"));
                    //System.out.print(", LN: " + rs.getDouble("LAST"));
		//System.out.print(", AGE: " + rs.getDouble("AGE"));
		
                    System.out.println();
                }

                if (!hasResults) {
                    System.out.println("No data found in 'test' table.");
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error occurred:");
            e.printStackTrace();
        }
    }
}