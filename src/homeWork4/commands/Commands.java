package homeWork4.commands;


import homeWork4.arrays.ArraysInteraction;
import homeWork4.chessboard.Chessboard;
import homeWork4.exponentiation.Exponent;
import homeWork4.factorial.Factorial;
import homeWork4.multiplication.MultiplicationTable;
import homeWork4.oddNumbers.OddNums;
import homeWork4.sequence.Sequence;

public interface Commands {
    static void commands(String command) {
        if (command.equals("1") || command.equals("2") || command.equals("3") ||
                command.equals("4") || command.equals("5") || command.equals("6") ||
                command.equals("7") || command.equals("e")) {
            switch (command) {
                case "1":
                    OddNums.commands(command);
                    break;
                case "2":
                    Factorial.commands(command);
                    break;
                case "3":
                    Messages.exponentMsg();
                    Exponent.calculateExponent();
                    break;
                case "4":
                    Sequence.calculateSequence();
                    break;
                case "5":
                    MultiplicationTable.calculateMultiplication();
                    break;
                case "6":
                    ArraysInteraction.arraysCalc(command);
                    break;
                case "7":
                    Chessboard.writeChessBoard();
                    break;
                case "e":
                    System.out.println("Exiting...");
                    System.exit(0);
            }

        }
    }


}

