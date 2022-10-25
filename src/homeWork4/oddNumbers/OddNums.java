package homeWork4.oddNumbers;

import homeWork4.commands.Messages;

import java.util.Scanner;

public class OddNums {

    public static void commands(String command) {
        Messages.methodChoose();
        Scanner sc = new Scanner(System.in);
        command = sc.next();
        Messages.oddNumsMsg();
        if (command.equals("1") || command.equals("2") || command.equals("3")) {
            switch (command) {
                case "1":
                    oddFor();
                    break;
                case "2":
                    oddWhile();
                    break;
                case "3":
                    oddDoWhile();
                    break;

            }
        } else Messages.errorMsg();
    }

    public static void oddFor() {
        System.out.println("Odd.F");
        Scanner sc = new Scanner(System.in);
        long value = sc.nextInt();

        for (int i = 0; i < value + 1; i++) {
            i++;
            System.out.print(" " + i + " ");
        }
    }

    public static void oddWhile() {
        System.out.println("Odd.W");
        Scanner sc = new Scanner(System.in);
        long value = sc.nextInt();
        int i = 1;
        while (i < value + 1) {
            System.out.print(" " + i + " ");
            i = i + 2;
        }
    }

    public static void oddDoWhile() {
        System.out.println("Odd.Do");
        Scanner sc = new Scanner(System.in);
        long value = sc.nextInt();
        int i = 1;
        do {
            System.out.print(" " + i + " ");
            i = i + 2;
        } while (i < value + 1);
    }
}
