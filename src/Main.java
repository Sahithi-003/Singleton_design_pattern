import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/test";
        String username = "springStudent";
        String password = "springStudent";
        CustomDriver driverObject = CustomDriver.getDriverInstance();
        driverObject.getConnection(url,username,password);
        driverObject.closeConnection();
    }
}