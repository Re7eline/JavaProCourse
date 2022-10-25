package homeWork4.arrays;

import homeWork4.commands.Messages;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysInteraction {

    public static int[] arrayNums;


    public static void arrayRandomFilling() {
        System.out.println("You've choose Random filling");
        System.out.println("Enter quantity of Array numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter final number");
        int x = sc.nextInt();
        arrayNums = new int[n];
        Random random = new Random(x);
        for (int i = 0; i < arrayNums.length; i++) {
            arrayNums[i] = random.nextInt(x);
        }

    }

    public static void arraySteppedFilling() {
        System.out.println("You've chose Stepped filling");
        System.out.println("Enter quantity of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arrayNums = new int[n];
        for (int i = 0; i < arrayNums.length; i++) {
            arrayNums[i] = 2 * i + 1;
        }
    }

    public static void arraysCalc(String command) {

        System.out.println("Choose filling method. Type '1' for basic filling, '2' for random filling");
        Scanner sc = new Scanner(System.in);
        command = sc.next();
        if (command.equals("1") || command.equals("2")) {
            switch (command) {
                case "1":
                    arraySteppedFilling();
                    break;
                case "2":
                    arrayRandomFilling();
                    break;

            }
        } else Messages.errorMsg();



        System.out.println("Numbers in Array: " + Arrays.toString(arrayNums));
        int max = Arrays.stream(arrayNums).max().getAsInt();
        int min = Arrays.stream(arrayNums).min().getAsInt();
        System.out.println("Biggest number(s): " + max);
        System.out.println("Smallest number(s): " + min);

        for (int i = 0; i < arrayNums.length; i++) {
            if (arrayNums[i] == max) {
                arrayNums[i] = min;
            } else if (arrayNums[i] == min) arrayNums[i] = max;
        }
        System.out.println("Modified Array: " + Arrays.toString(arrayNums));

        int sum = Arrays.stream(arrayNums).sum();
        int average = sum / arrayNums.length;

        System.out.println("Sum of array numbers: " + sum + "\t Quantity of numbers is: " + arrayNums.length +
                "\t Average is: " + average);
    }
}


