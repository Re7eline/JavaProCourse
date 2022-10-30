import java.util.Scanner;

public class StudentRun {
    public static void main(String[] args) {
        System.out.println("Choose variant:");
        System.out.println("'1' For printing all students by the course and faculty");
        System.out.println("'2'For check students on 'IT' faculty");
        System.out.println("'3' For Sort students by the year above the 2000");
        System.out.println("'4' For show students in group №3");
        Scanner sc = new Scanner(System.in);
        String question = sc.next();

        switch (question) {
            case "1":
                StudentService.checkFacultyAndCourse(StudentService.addStudents());
                break;
            case "2":
                StudentService.checkFaculty(StudentService.addStudents(), "IT");
                break;
            case "3":
                StudentService.checkYear(StudentService.addStudents(), 2000);
                break;
            case "4":
                StudentService.checkGroup(StudentService.addStudents(), "3");
                break;
        }
    }

}

