package hilmibaskoparan.dao;

import hilmibaskoparan.database.DatabaseConnection;

import java.sql.Connection;
import java.util.ArrayList;

public interface IDaoConnection <T> {

    // CRUD OPERATIONS
    public void create(T t);
    public void update(T t);
    public void delete(T t);
    public ArrayList<T> list();

    // Interface'de Default ile Gövdeli Fonksiyon yazabiliriz.
    default Connection getInterfaceConnection() {
        return DatabaseConnection.getInstance().getConnection();
    }
}
