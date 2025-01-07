package Chapter10.sample;

import java.sql.*;

public class MyFirstDatabaseConnection {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo";
        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select name from animal")) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        }
    }
}
