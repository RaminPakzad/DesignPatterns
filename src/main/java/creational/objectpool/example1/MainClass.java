package creational.objectpool.example1;

import java.sql.Connection;

/**
 * @author Ramin Pakzad
 */
public class MainClass {
    public static void main(String[] args) {
        JDBCConnectionPool jdbcConnectionPool=new JDBCConnectionPool("","","");
        Connection connection = jdbcConnectionPool.getObject();



        jdbcConnectionPool.releaseObject(connection);
    }
}
