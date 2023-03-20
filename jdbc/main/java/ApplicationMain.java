import org.hibernate.Session;

public class ApplicationMain {

    public static void main(String[] args) {
        /**Hibernate realization */
        Session session = HibernateUtil.getSessionFactory().openSession();
        HibernateMethods.addStudent(session, new Student(1, "Test1 Testovych1"));
        HibernateMethods.addStudent(session, new Student(2, "Test2 Testovych2"));
        HibernateMethods.addStudent(session, new Student(3, "Test3 Testovych3"));
        System.out.println(HibernateMethods.getByName(session, "Test1 Testovych1"));
        System.out.println(HibernateMethods.getById(session, 1));
        HibernateMethods.showAll(session);
        session.close();
        HibernateUtil.shutdown();

        /** JBDC old realization */
        //        ConnectionConfig connection = new ConnectionConfig();
        //        DataBaseController dbc = new DataBaseControllerImpl();
        //
        //        try {
        //            connection.addConnection();
        //        } catch (SQLException e) {
        //            throw new RuntimeException(e);
        //        }
        //
        //        try {
        //            dbc.getAll().forEach(System.out::println);
        //            System.out.println("-".repeat(50));
        //        } catch (SQLException e) {
        //            throw new RuntimeException(e);
        //        }
        //
        //        try {
        //            dbc.getByName("Boot Sturdy").forEach(System.out::println);
        //            System.out.println("-".repeat(50));
        //        } catch (SQLException e) {
        //            throw new RuntimeException(e);
        //        }
        //
        //        try {
        //            dbc.getByIds(Arrays.asList(2, 3, 4, 9, 200)).forEach(System.out::println);
        //            System.out.println("-".repeat(50));
        //        } catch (SQLException e) {
        //            throw new RuntimeException(e);
        //        }
        //
        //        try {
        //            connection.closeConnection();
        //        } catch (SQLException e) {
        //            throw new RuntimeException(e);
        //        }
    }
}
