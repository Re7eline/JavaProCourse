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
                    service.exceedingLimitLocalCalls(SubscriberList.subscribers);
                    break;
                case 2:
                    service.intercityCallsUsers(SubscriberList.subscribers);
                    break;
                case 3:
                    System.out.println("Enter the 1st letter of surname to search...");
                    service.findSbscrByFirstLetterSurname(SubscriberList.subscribers, sc.next().toUpperCase());
                    break;
                case 4:
                    System.out.println("Enter the city(Kyiv, Odesa, Sumy, Kherson) for check traffic: ");
                    service.calcTotalTrafficConsumption(SubscriberList.subscribers, sc.next());
                    break;
                case 5:
                    service.findNegativeBalanceSubscribers(SubscriberList.subscribers);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}