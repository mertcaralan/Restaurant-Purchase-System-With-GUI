package SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static final String URL = "jdbc:oracle:thin:@139.179.33.231:1522:orclctis"; 
    private static final String USER = "tastepo"; 
    private static final String PASSWORD = "1111"; 

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}