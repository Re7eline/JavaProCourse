import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SubscriberServiceImpl implements SubscriberService {

    @Override
    public void exceedingLimitLocalCalls(Subscriber[] subscribers) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exceeding limit calls in city: ");
        System.out.println("Enter city(Kyiv, Odesa, Sumy, Kherson): ");
        String city = sc.next();
        System.out.println("Enter limit in minutes: ");
        int limit = sc.nextInt();
        System.out.println("Calls in city: " + city + "");
        SubscriberList.addSubscribers();
        Arrays.stream(SubscriberList.subscribers).filter(subscriber ->
                subscriber.getCity().equalsIgnoreCase(city) &&
                        subscriber.getCityMins() > limit).forEach(System.out::println);
        System.out.println();
    }

    @Override
    public void intercityCallsUsers(Subscriber[] subscribers) {
        System.out.println("Subscribers used INTERCITY calls: ");
        System.out.println("Enter the limit in minutes: ");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for (Subscriber subscriber : SubscriberList.subscribers) {
            if (subscriber.getIntercityMins() > limit) {
                System.out.println(subscriber);
            }
        }
        System.out.println();
    }

    @Override
    public void findSbscrByFirstLetterSurname(Subscriber[] subscribers, String firstLetter) {
        System.out.println("Subscribers info with surname on " + firstLetter + " : ");
        for (Subscriber subscriber : SubscriberList.subscribers) {
            if (subscriber.getSurname().toUpperCase(Locale.ROOT).startsWith(firstLetter)) {
                System.out.println("Full name: " + subscriber.getSurname() + "." + subscriber.getName() +
                        "." + subscriber.getPatronymic() + ". Mobile: " + subscriber.getMobNum() +
                        " Balance: " + subscriber.getBalance());
            }
        }
        System.out.println();
    }

    @Override
    public void calcTotalTrafficConsumption(Subscriber[] subscribers, String inputCity) {
        double total = 0;
        for (Subscriber subscriber : SubscriberList.subscribers) {
            if (subscriber.getTraffic() != 0 && subscriber.getCity().equalsIgnoreCase(inputCity)) {
                total += subscriber.getTraffic();
            }
        }
        System.out.println("Total traffic in city " + inputCity + " : " + total);
        System.out.println();
    }

    @Override
    public void findNegativeBalanceSubscribers(Subscriber[] subscribers) {
        System.out.println("Enter balance limit: ");
        Scanner sc = new Scanner(System.in);
        int balanceCheck = sc.nextInt();
        int counter = 0;
        System.out.println("Subscribers with balance less than: " + balanceCheck + " : ");
        for (Subscriber subscriber : SubscriberList.subscribers) {
            if (subscriber.getBalance() <= balanceCheck) {
                counter++;
                System.out.println(subscriber);
                System.out.println();
            }
        }
        System.out.println("Quantity of subscribers with such balance: " + counter);
        System.out.println();
    }
}
