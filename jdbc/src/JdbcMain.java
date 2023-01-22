import java.sql.SQLException;
import java.util.Arrays;

public class JdbcMain {

    public static void main(String[] args) {

        ConnectionConfig connection = new ConnectionConfig();
        DataBaseController dbc = new DataBaseControllerImpl();

        try {
            connection.addConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            dbc.getAll().forEach(System.out::println);
            System.out.println("-".repeat(50));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            dbc.getByName("Boot Sturdy").forEach(System.out::println);
            System.out.println("-".repeat(50));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            dbc.getByIds(Arrays.asList(2, 3, 4, 9, 200)).forEach(System.out::println);
            System.out.println("-".repeat(50));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            connection.closeConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
