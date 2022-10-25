import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Average {
    public static void getAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers quantity for count average");
        int quantity = scanner.nextInt();
        int counter = quantity;
        ArrayList<Double> userNumList = new ArrayList<>(quantity);
        System.out.println("Enter the number: ");

        for (int i = 0; i < quantity; i++) {
            System.out.println(counter + " numbers left");
            double inputNum = scanner.nextDouble();
            userNumList.add(inputNum);
            counter--;
        }

        OptionalDouble average = userNumList.stream().mapToDouble(e -> e).average();
        if (average.isPresent()) {
            System.out.print("homeWork2.Average is: " + average.getAsDouble());
        }


    }
}
