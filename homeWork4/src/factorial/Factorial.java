package factorial;

import commands.Messages;

import java.util.Scanner;

public class Factorial {
    public static void commands(String command) {
        Messages.methodChoose();
        Scanner sc = new Scanner(System.in);
        command = sc.next();
        Messages.factorialMsg();
        if (command.equals("1") || command.equals("2") || command.equals("3")) {
            switch (command) {
                case "1":
                    factorialFor();
                    break;
                case "2":
                    factorialWhile();
                    break;
                case "3":
                    factorialDoWhile();
                    break;

            }
        } else
        Messages.errorMsg();
    }

    public static void factorialFor() {
        System.out.println("F.For");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        Messages.factorialResMsg();
        System.out.println("Factorial: " + result);
    }

    public static void factorialWhile() {
        System.out.println("F.While");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 1;
        int i = 1;
        while (i <= n) {
            result = result * i;
            i++;
        }
        Messages.factorialResMsg();
        System.out.println("Factorial: " + result);
    }

    public static void factorialDoWhile() {
        System.out.println("F.Do");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        long result = 1;
        do {
            result = result * i;
            i++;
        } while (i <= n);
        Messages.factorialResMsg();
        System.out.println("Factorial: " + result);
    }

}



