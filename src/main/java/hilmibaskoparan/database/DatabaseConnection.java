package hilmibaskoparan.database;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Getter
@Setter
@Log4j2
public class DatabaseConnection extends DatabaseInformation{

    // Singleton Design Pattern
    /*
        3 ÖZELLİK OLMASI GEREKİR.
        1. Class'ı değişken olarak çağır.       private static DatabaseConnection instance;
        2. Constructor yapısını oluştur.        private DatabaseConnection(){}
        3. Bu Class'ı halka aç.                 public static DatabaseConnection getInstance(){}
    */

    private Connection connection;
    private String url = super.getUrl();
    private String userName = super.getUserName();
    private String password = super.getPassword();
    private String forNameData = super.getForNameData();


    // Singleton Design Pattern
    // Singleton Class
    private static DatabaseConnection instance;

    // Singleton Constructor: private olması instance oluşturulmaması içindir.
    private DatabaseConnection() {
        try {
            Class.forName(forNameData);
            // log.info("Driver is loaded");

            // connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog", "root", "root");
            connection = DriverManager.getConnection(url, userName, password);
            //log.info("Database Connection is Successful");
        } catch (Exception exception){
            exception.printStackTrace();
            log.error(DatabaseConnection.class + " Database Connection or Driver is Failed : " + exception);
        }
    }

    // Bu Class'ı Dış Dünyaya Bağlayan Kapı
    public static DatabaseConnection getInstance() {
        try {
            if (instance == null || instance.getConnection().isClosed()){
                instance = new DatabaseConnection();
            }
        } catch (SQLException sqlException){
            sqlException.printStackTrace();
            log.error(DatabaseConnection.class + " is not created instance "+ sqlException);
        } catch (Exception exception){
            exception.printStackTrace();
            log.error(DatabaseConnection.class + " is not created instance " + exception);
        }
        return instance;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DatabaseConnection databaseConnection = new DatabaseConnection();
    }

}
