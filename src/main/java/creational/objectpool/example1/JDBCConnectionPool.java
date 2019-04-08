package creational.objectpool.example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Ramin Pakzad
 */
public class JDBCConnectionPool extends ObjectPool<Connection> {

    private String url, username, password;

    public JDBCConnectionPool(String url, String username, String password) {
        super();
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public Connection create() {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public boolean validate(Connection connection) {
        try {
            return !connection.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }

    @Override
    public void expire(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
