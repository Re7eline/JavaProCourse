import java.sql.SQLException;
import java.util.List;

public interface DataBaseController {
    List<Student> getAll() throws SQLException;

    List<Student> getByName(String name) throws SQLException;

    List<Student> getByIds(List<Integer> ids) throws SQLException;
}
