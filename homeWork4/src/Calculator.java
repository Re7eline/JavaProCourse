import commands.Commands;
import commands.Messages;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Messages.info();
            Commands.commands(sc.next());
        }
    }
}
