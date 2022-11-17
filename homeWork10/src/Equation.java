import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("For solving Equation: ax ^ 2 + bx + c = 0. " +
                "\nEnter 'a','b','c'");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c  = sc.nextInt();
        System.out.println(Equation.calculate(a, b, c));
    }

    static String calculate(int a, int b, int c) {
        double d = Math.sqrt((b * b) - (4 * a * c));
        if (d == 0) {
            double x = -b / (2 * a);
            return "D=0, the equation has 1 root: " + x;
        } else if (d > 0) {
            double x1, x2;
            x1 = (-b + d) / (2 * a);
            x2 = (-b - d) / (2 * a);
            return "D=" + d + " x1=" + x1 + " x2=" + x2;
        } else return "The discriminant is less than zero, the equation has no real solutions.";
    }
}
