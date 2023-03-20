import org.hibernate.Session;
import org.hibernate.query.Query;


public class HibernateMethods {
    public static void addStudent(Session session, Student student) {
        session.getTransaction().begin();
        session.persist(student);
        session.getTransaction().commit();
    }


    public static Student getByName(Session session, String name) {
        session.getTransaction().begin();
        Query<Student> query = session.createQuery("FROM Student  WHERE fullName = :name", Student.class);
        query.setParameter("name", name);
        Student result = query.getSingleResult();
        session.getTransaction().commit();
        return result;
    }

    public static Student getById(Session session, int id) {
        session.getTransaction().begin();
        Student student = session.createQuery("FROM Student WHERE id = :id", Student.class)
                .setParameter("id", id).getSingleResult();

        session.getTransaction().commit();
        return student;
    }

    public static void showAll(Session session) {
        session.getTransaction().begin();
        session.createQuery("from Student", Student.class)
                .list()
                .forEach(System.out::println);

        session.getTransaction().commit();
    }
}
