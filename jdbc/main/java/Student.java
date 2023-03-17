public class Student {
    private int id;
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
        return "Student{" + "id=" + id + ", fullName='" + fullName + '\'' + '}';
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
}
