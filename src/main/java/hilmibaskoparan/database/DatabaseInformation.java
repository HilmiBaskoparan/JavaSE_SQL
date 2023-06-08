package hilmibaskoparan.database;

import lombok.Data;

@Data
public class DatabaseInformation {

    private String url;
    private String userName;
    private String password;
    private String forNameData;

    public DatabaseInformation() {
        this.url = "jdbc:mysql://localhost:3306/blog";
        this.userName = "root";
        this.password = "root";
        //this.forNameData = "com.mysql.jdbc.Driver";
        this.forNameData = "com.mysql.cj.jdbc.Driver";

        //POSTGRESQL
        /*this.url="jdbc:postgresql://localhost:5432/blog";
        this.user="root";
        this.password="root";
        this.forNameData="org.postgresql.Driver";*/

        //H2DB
        /* this.url="jdbc:h2:file./memory_persist/blog";
        this.user="root";
        this.password="root";
        this.forNameData="org.h2.Driver";*/
    }

    public DatabaseInformation(String url, String userName, String password, String forNameData) {
        this.url = url;
        this.userName = userName;
        this.password = password;
        this.forNameData = forNameData;
    }
}