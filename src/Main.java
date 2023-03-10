import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/test";
        String username = "springStudent";
        String password = "springStudent";
        CustomDriver driverObject = CustomDriver.getDriverInstance();
        CustomDriver driverObject2 = CustomDriver.getDriverInstance();
        if(driverObject.equals(driverObject2)){
            System.out.println("Same Object is referred!");
        }
        driverObject.getConnection(url,username,password);
        driverObject.closeConnection();
    }
}