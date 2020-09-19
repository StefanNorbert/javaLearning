package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToDB {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            String userName = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:8889/test";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Database connection successful.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot connect to the database.");
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Database connection closed");
                } catch (Exception e) {
                    System.out.println("Database connection cannot be closed.");
                }
            }
        }
    }
}
