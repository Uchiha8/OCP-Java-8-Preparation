package Chapter6.review;

import java.sql.SQLException;

public class Task19 {
    public static void main(String[] args) throws SQLException {
        try {
            readFromDatabase();
        } catch (SQLException | RuntimeException e) {
            throw e;
        }
    }

    private static void readFromDatabase() throws SQLException {
    }
}
