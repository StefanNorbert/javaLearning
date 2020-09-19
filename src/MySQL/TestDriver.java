package MySQL;

import java.sql.*;

// testing Driver class needed for MySQL connection
public class TestDriver {
    public static void main(String[] args) {
        try {
            Driver d = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Connection works");
        } catch(Exception e) {

            System.out.println("Connection failed.");
        }
    }
}
