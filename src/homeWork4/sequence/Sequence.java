package homeWork4.sequence;

import java.util.Scanner;

public class Sequence {
    public static void calculateSequence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of numbers");
        int quantityOfNums = sc.nextInt();
        System.out.println("Enter the step for sequence. For Negative add '-'");
        String stepOfNums = sc.next();
        boolean result = stepOfNums.contains("-");
        int step = Integer.parseInt(stepOfNums);
        int counter = 0;
        if (result) {
            System.out.println("Negative sequence");
            for (int i = 0; counter < quantityOfNums; i -= step) {
                System.out.println(-i);
                counter++;
            }
        } else {
            System.out.println("Positive sequence");
            for (int i = 0; counter < quantityOfNums; i += step) {
                System.out.println(i);
                counter++;
            }
        }
    }
}

