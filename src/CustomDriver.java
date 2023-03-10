import java.sql.Connection;
import java.sql.SQLException;

public class CustomDriver {
    private static CustomDriver driverInstance;
    private Connection connection;

    private CustomDriver() {
    }

    public static CustomDriver getDriverInstance() {
        if(driverInstance==null){
            synchronized (CustomDriver.class){
                if(driverInstance==null){
                    driverInstance = new CustomDriver();
                }
            }
        }
        return driverInstance;
    }

    public Connection getConnection(String url,String username,String password){
        connection = driverInstance.createConnection(url, username, password);
        return connection;
    }

    private Connection createConnection(String url, String username, String password){
        //Logic for creating database connection
        System.out.println("Created connection successfully!");
        return connection;
    }
    public void closeConnection() throws SQLException {
        connection.close();
        System.out.println("Disconnected connection!!!");
    }
}