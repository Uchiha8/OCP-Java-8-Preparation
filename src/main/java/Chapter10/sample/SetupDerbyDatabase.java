package Chapter10.sample;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class SetupDerbyDatabase {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo;create=true";
        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate("CREATE TABLE species ("
                    + "id INTEGER PRIMARY KEY, "
                    + "name VARCHAR(255), "
                    + "num_acres DECIMAL)");
            statement.executeUpdate(
                    "CREATE TABLE animal ("
                            + "id INTEGER PRIMARY KEY, "
                            + "species_id integer, "
                            + "name VARCHAR(255), "
                            + "date_born TIMESTAMP)");
            statement.executeUpdate("INSERT INTO species VALUES (1, 'Africa Elephant', 7.5)");
            statement.executeUpdate("INSERT INTO species VALUES (2, 'Zebra', 1.2)");
            statement.executeUpdate("INSERT INTO animal VALUES (2, 2, 'Zelda', '2002−08−15 09:12')");
            statement.executeUpdate("INSERT INTO animal VALUES (3, 1, 'Ester', '2002−09−09 10:36')");
            statement.executeUpdate("INSERT INTO animal VALUES (1, 1, 'Elsa', '2001−05−06 02:15')");
            statement.executeUpdate("INSERT INTO animal VALUES (4, 1, 'Eddie', '2010−06−08 01:24')");
            statement.executeUpdate("INSERT INTO animal VALUES (5, 2, 'Zoe', '2005−11−12 03:44')");

            Map<Integer, String> idToNameMap = new HashMap<>();
            ResultSet resultSet = statement.executeQuery("select id, name from species");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                idToNameMap.put(id, name);
            }
            System.out.println(idToNameMap);
        }
    }
}
