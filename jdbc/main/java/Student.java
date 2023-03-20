import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "Id", unique = true)
    private int id;
    @Basic
    @Column(name = "FullName")
    private String fullName;

    public Student() {}

    public Student(String fullName) {
        this.fullName = fullName;
    }

    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", FullName='" + fullName + '\'' + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && fullName.equals(student.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName);
    }
}
