package homeWork3;

public class DepositCalc {
    public static void main(String[] args) {


        double depositAmount = Double.valueOf(args[0]);
        double depositPercentage = Double.valueOf(args[1]) / 12;
        int depositYears = Integer.valueOf(args[2]);

        System.out.println("Deposit amount: " + depositAmount + " UAN" +
                "\n percentage per year: " +
                Double.valueOf(args[1]) +
                " %" + "\n Years: " + depositYears);

        double monthlyPercentage = depositAmount * depositPercentage / 100;
        double countedAmount = depositAmount;

        for (int i = 1; i <= depositYears * 12; i++) {
            countedAmount += monthlyPercentage;
            System.out.printf("\n Counted for %d month: %.2f UAN." +
                    "\n Deposit sum is: %.2f UAN.", i, monthlyPercentage, countedAmount);

            if (i % 12 == 0){
                System.out.printf("\n Funds amount for %d months is: %.2f UAN.", i, countedAmount);
            }
            monthlyPercentage = countedAmount * depositPercentage / 100;
        }
    }

}

