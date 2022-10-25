package exponentiation;

import commands.Messages;

import java.util.Scanner;

public class Exponent {
    public static void calculateExponent() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        long exponent = (long) Math.pow(x, n);
        Messages.exponentResMsg();
        System.out.println(exponent);
    }
}
