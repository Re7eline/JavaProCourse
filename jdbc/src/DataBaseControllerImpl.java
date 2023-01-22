import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DataBaseControllerImpl implements DataBaseController {
    List<Student> studentsList;

    @Override
    public List<Student> getAll() throws SQLException {
        studentsList = new ArrayList<>();
        String query = "select * from student";
        System.out.println("Query: " + query);
        Statement statement = ConnectionConfig.connection.createStatement();
        ResultSet rs = statement.executeQuery(query);

        while (rs.next()) {
            int id = rs.getInt("id");
            String fullName = rs.getString("fullName");
            studentsList.add(new Student(id, fullName));
        }
        return studentsList;
    }

    @Override
    public List<Student> getByName(String name) throws SQLException {
        studentsList = new ArrayList<>();
        String query = "select * from student where FullName = " + "'" + name + "'";
        System.out.println("Query: " + query);

        Statement statement = ConnectionConfig.connection.createStatement();

        ResultSet rs = statement.executeQuery(query);

        while (rs.next()) {
            int id = rs.getInt("id");
            String fullName = rs.getString("fullName");
            studentsList.add(new Student(id, fullName));
        }
        return studentsList;
    }

    @Override
    public List<Student> getByIds(List<Integer> ids) throws SQLException {
        studentsList = new ArrayList<>();
        Statement statement = ConnectionConfig.connection.createStatement();

        for (int i = 0; i < ids.size(); i++) {
            String query = "select * from student where id = " + ids.get(i);
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                System.out.println("Query: " + query);
                int id = rs.getInt("id");
                String fullName = rs.getString("fullName");
                studentsList.add(new Student(id, fullName));
            }
        }
        return studentsList;
    }
}
