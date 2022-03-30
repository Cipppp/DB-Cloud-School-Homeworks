import java.sql.*;

public class DatabaseWrapper {

    // Change "sys" to the name of your database
    String connectionUrl = "jdbc:mysql://127.0.0.1:3306/orders";
    String username = "root";
    String password = "password";
    Connection connection;

    public DatabaseWrapper() {
        try {
            connection = DriverManager.getConnection(connectionUrl, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getPeople(String date) {

    }

    public void executeSampleQuery() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getById(int id) throws SQLException {

        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM customers WHERE id =" + id);
        while(rs.next()) {
            System.out.println("id: " + rs.getInt("id"));
            System.out.println("username: " + rs.getString("username"));
            System.out.println("last_name: " + rs.getString("last_name"));
            System.out.println("first_name: " + rs.getString("first_name"));
        }
    }

    public void insert(String user, String last, String first) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO customers (username, last_name, first_name) VALUES (?,?,?)");
        ps.setString(1,user);
        ps.setString(2,last);
        ps.setString(3,first);
        ps.execute();
    }

    public int delete(int id) {
        // DELETE FROM table_name WHERE condition;

        try {
            Statement statement = connection.createStatement();
            int rs = statement.executeUpdate("DELETE FROM customers WHERE id = " + id);

            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public void getAll(String tableName) throws SQLException
    {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName);

        while(resultSet.next())
        {
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            for(int i = 1; i < resultSetMetaData.getColumnCount(); i++)
            {
                if(resultSetMetaData.getColumnName(i).equals("INT"))
                {
                    System.out.println(resultSet.getInt(i));
                }
                else
                {
                    System.out.println(resultSet.getString(i));
                }
            }
        }

    }
}
