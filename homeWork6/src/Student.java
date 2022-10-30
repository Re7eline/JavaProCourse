public class Student {
    private int id;
    private String studentName;
    private String studentSurname;
    private String studentPatronymic;
    private int studentYofBirth;
    private String studentAddress;
    private String studentMobNum;
    private String studentFaculty;
    private int studentCourse;
    private String studentGroup;

    public Student() {
    }

    public Student(int id, String studentName, String studentSurname, String studentPatronymic,
                   int studentYofBirth, String studentAddress, String studentMobNum,
                   String studentFaculty, int studentCourse, String studentGroup) {
        this.id = id;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentPatronymic = studentPatronymic;
        this.studentYofBirth = studentYofBirth;
        this.studentAddress = studentAddress;
        this.studentMobNum = studentMobNum;
        this.studentFaculty = studentFaculty;
        this.studentCourse = studentCourse;
        this.studentGroup = studentGroup;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", studentPatronymic='" + studentPatronymic + '\'' +
                ", studentYofBirth='" + studentYofBirth + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentMobNum='" + studentMobNum + '\'' +
                ", studentFaculty='" + studentFaculty + '\'' +
                ", studentCourse='" + studentCourse + '\'' +
                ", studentGroup='" + studentGroup + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getStudentPatronymic() {
        return studentPatronymic;
    }

    public void setStudentPatronymic(String studentPatronymic) {
        this.studentPatronymic = studentPatronymic;
    }

    public int getStudentYofBirth() {
        return studentYofBirth;
    }

    public void setStudentYofBirth(int studentYofBirth) {
        this.studentYofBirth = studentYofBirth;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentMobNum() {
        return studentMobNum;
    }

    public void setStudentMobNum(String studentMobNum) {
        this.studentMobNum = studentMobNum;
    }

    public String getStudentFaculty() {
        return studentFaculty;
    }

    public void setStudentFaculty(String studentFaculty) {
        this.studentFaculty = studentFaculty;
    }

    public int getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(int studentCourse) {
        this.studentCourse = studentCourse;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }
}
