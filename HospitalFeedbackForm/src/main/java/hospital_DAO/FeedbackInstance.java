package hospital_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FeedbackInstance {

    private static Connection conn = null;

    public static Connection getInstance() {
        try {
            if (conn == null || conn.isClosed()) {

                System.out.println("Attempting MySQL connection...");

                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("MySQL Driver Loaded Successfully!");

                String url = "jdbc:mysql://127.0.0.1:3306/hospital_feed?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
                String username = "root";
                String password = "root";

                conn = DriverManager.getConnection(url, username, password);
                System.out.println(" Database Connected Successfully: " + conn);
            }
        } 
        catch (ClassNotFoundException e) {
            System.out.println(" JDBC Driver Not Found!");
            e.printStackTrace(System.out);
        } 
        catch (SQLException e) {
            System.out.println(" SQL Connection Failed!");
            e.printStackTrace(System.out); 
        }

        return conn;
    }
}
