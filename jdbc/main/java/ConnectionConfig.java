import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.SQLException;

public class ConnectionConfig {
    public static final String serverTimeZone = "UTC";
    public static final String serverName = "localhost";
    public static final String databaseName = "students";
    public static final int portNumber = 3306;
    public static final String user = "root";
    public static final String password = "rootroot";
    public static java.sql.Connection connection;

    public java.sql.Connection addConnection() throws SQLException {

        MysqlDataSource dataSource = new MysqlDataSource();

        dataSource.setUseSSL(true);

        dataSource.setServerTimezone(serverTimeZone);

        dataSource.setServerName(serverName);
        dataSource.setDatabaseName(databaseName);
        dataSource.setPortNumber(portNumber);
        dataSource.setUser(user);
        dataSource.setPassword(password);

        connection = dataSource.getConnection();
        return connection;
    }

    public void closeConnection() throws SQLException {
        connection.close();
    }
}
