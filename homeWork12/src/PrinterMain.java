import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

public class PrinterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digits without space and press Enter: ");
        String userDigits = sc.next();


        boolean isOnlyDigits = true;
        for (int i = 0; i < userDigits.length() && isOnlyDigits; i++) {
            if (!Character.isDigit(userDigits.charAt(i))) {
                isOnlyDigits = false;
            }
        }


        if (isOnlyDigits) {
            String[] s = userDigits.split("");
            int[] number = Arrays.stream(s)
                    .mapToInt(Integer::parseInt)
                    .toArray();
            Digit[] digits = Digit.createDigits(
                    " @@@@@    @@    @@@@@    @@@@@    @@@@  @@@@@@   @@@@@  @@@@@@   @@@@@   @@@@@  ",
                    "@@   @@  @@@        @@       @@  @@  @  @@      @@           @@ @@   @@ @@   @@ ",
                    "@@   @@   @@       @@     @@@@  @@@@@@  @@@@@   @@@@@@     @@    @@@@@   @@@@@  ",
                    "@@   @@   @@     @@          @@     @@      @@  @@   @@   @@    @@   @@     @@  ",
                    " @@@@@   @@@@@  @@@@@@   @@@@@   @@@@@@ @@@@@    @@@@@  @@       @@@@@   @@@@   ");
            int height = digits[0].lines.length;
            for (int i = 0; i < height; i++) {
                for (int digit : number) {
                    System.out.print(MessageFormat.format("{0} ", digits[digit].lines[i]));
                }
                System.out.println();
            }
        } else System.err.println("Error, not possible to print non-numbers.");
    }
}


