package commands;

import colours.Colours;

public abstract class Messages implements Commands {
    public static void info() {
        System.out.println("\nType " +
                "\n'1' to calculate ODD numbers, " +
                "\n'2' to calculate FACTORIAL, " +
                "\n'3' to calculate EXPONENT, " +
                "\n'4' to calculate SEQUENCE," +
                "\n'5' to MULTIPLICATION, " +
                "\n'6' to fill Array with even numbers, " +
                "\n'7' to create CHESSBOARD, " +
                "\n'e' to EXIT");
    }

    public static void methodChoose() {
        System.out.println("Choose method. Type '1' - Method FOR, '2' - Method WHILE, '3' - Method DO WHILE");
    }

    public static void oddNumsMsg() {
        System.out.println("Enter value:");
    }

    public static void factorialMsg() {
        System.out.println("Enter the number for calculate factorial:");
    }

    public static void factorialResMsg() {
        System.out.println("Factorial is: ");
    }

    public static void exponentMsg() {
        System.out.println("Enter the number and desired exponentiation for calculate: ");
    }

    public static void exponentResMsg() {
        System.out.println("Exponentiation is: ");
    }

    public static void multiplicMsg() {
        System.out.println("Enter the number");
    }

    public static void errorMsg() {
        System.out.println(Colours.ANSI_RED + "AZAZA.ERROR)))))" + Colours.ANSI_RESET);
    }
}

