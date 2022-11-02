import java.util.Scanner;

public class SubscriberMain {
    public static void main(String[] args) {
        SubscriberList.addSubscribers();
        SubscriberServiceImpl service = new SubscriberServiceImpl();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose variant: '1' for check city calls, " + "'2' for check intercity calls, " +
                    "'3' for print subscribers, '4' for check traffic in city, '5' for check balance," +
                    "'6' for exit");
            int check = sc.nextInt();
            switch (check) {
                case 1:
                    service.checkCityCalls();
                    break;
                case 2:
                    service.checkIntercityCalls();
                    break;
                case 3:
                    service.subscriberInfo();
                    break;
                case 4:
                    service.checkTrafficInCity();
                    break;
                case 5:
                    service.checkNegativeBalance();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}