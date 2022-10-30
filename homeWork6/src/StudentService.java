import java.util.Arrays;

public class StudentService {

    public static Student[] addStudents() {
        Student[] students = new Student[10];
        students[0] = new Student(1, "Ivan", "Berezovskiy", "Vitaliiiovych",
                2005, "Odessa", "0678945956", "Economic",
                3, "1");
        students[1] = new Student(2, "Oleg", "Myrashko", "Olegovych",
                2008, "Odesa", "0986597321", "Economic",
                2, "1");
        students[2] = new Student(3, "Oleksandr", "Lapatko", "Bogdanovych",
                2000, "Kyiv", "0506912998", "Agronomic",
                4, "2");
        students[3] = new Student(4, "Stepan", "Golka", "Yuriiovych",
                2008, "Kyiv", "0958956321", "Agronomic",
                1, "3");
        students[4] = new Student(5, "Volodymyr", "Prykhodko", "Olegovych",
                1999, "Odessa", "0962536514", "IT",
                6, "4");
        students[5] = new Student(6, "Vitaliy", "Bogyslavskiy", "Valeriiovych",
                2000, "Kherson", "0639874595", "IT",
                5, "3");
        students[6] = new Student(7, "Anton", "Murashko", "Valentynovych",
                2003, "Kherson", "0996587935", "IT",
                6, "8");
        students[7] = new Student(8, "Petro", "Cybulia", "Anataliiovych",
                2008, "Sumy", "0956859874", "Language",
                1, "3");
        students[8] = new Student(9, "Dmytro", "Chereshnya", "Oleksandrovych",
                2004, "Sumy", "09365849865", "Language",
                4, "2");
        students[9] = new Student(10, "Anton", "Antonenko", "Antonovych",
                2000, "Odesa", "0669874265", "IT",
                2, "5");
        return students;
    }

    static void checkFaculty(Student[] students, String faculty) {
        System.out.println("Students on faculty " + faculty + ": ");
        for (Student student : students) {
            if (student.getStudentFaculty().equals(faculty)) {
                System.out.println(student);
            }
        }
        System.out.println();
    }

    static void checkFacultyAndCourse(Student[] students) {
        System.out.println("List of students on courses:");
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.println(i + 1 + " course:");
            for (Student student : students) {
                if (student.getStudentCourse() == i + 1)
                    System.out.println(student);

            }
            System.out.println();
        }
        System.out.println();

        String[] faculty = new String[students.length];
        int k = 0;
        faculty[k] = students[0].getStudentFaculty();
        k++;

        for (Student student : students) {
            boolean check = true;
            for (String s : faculty) {
                if (student.getStudentFaculty().equals(s)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                faculty[k] = student.getStudentFaculty();
                k++;
            }
        }
        if (k < students.length) {
            String[] mass = new String[k];
            for (int i = k; i < faculty.length; i++) {
                faculty[i] = "";
            }

            System.arraycopy(faculty, 0, mass, 0, k);
            faculty = mass;
        }
        Arrays.sort(faculty);

        for (String s : faculty) {
            System.out.println("Faculty " + s + ":");
            for (Student student : students) {
                if (student.getStudentFaculty().equals(s)) {
                    System.out.println(student);
                }
            }
            System.out.println();
        }
    }
    static void checkYear(Student[] students, int year) {
        System.out.println("List of students by the year " + year + ":");
        for (Student student : students) {
            if (student.getStudentYofBirth() > year) {
                System.out.println(student);
            }
        }
        System.out.println();
    }
    static void checkGroup(Student[] students, String group) {
        System.out.println("List of group " + group + ":");
        for (Student student : students) {
            if (student.getStudentGroup().equals(group)) {
                System.out.println(student);
            }
        }
    }
}
