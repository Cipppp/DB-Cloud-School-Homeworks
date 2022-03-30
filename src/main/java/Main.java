import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseWrapper databaseWrapper = new DatabaseWrapper();
        databaseWrapper.getAll("customers");

        databaseWrapper.getById(1);
//        databaseWrapper.insert("myUser", "xyz","abc");
//        databaseWrapper.insertOrder("2008-11-11 12:12:02", "done", 1);


    }
}
