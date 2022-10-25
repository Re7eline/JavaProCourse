package homeWork4.multiplication;

import homeWork4.commands.Messages;

import java.util.Scanner;

public class MultiplicationTable {
    public static void calculateMultiplication() {
        Messages.multiplicMsg();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(n + "*" + i + "=" + (i * n) + "\t\t");
            System.out.println();

        }
    }
}

