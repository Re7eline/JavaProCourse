import java.util.Locale;
import java.util.Scanner;

public class SubscriberServiceImpl implements SubscriberService {
    @Override
    public void checkCityCalls() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter city(Kyiv, Odesa, Sumy, Kherson: ");
        String city = sc.next();
        System.out.println("Enter limit in minutes: ");
        int limit = sc.nextInt();
        System.out.println("Calls in city: " + city + "");
        for (Subscriber subscriber : SubscriberList.subscribers) {
            if (subscriber.getCity().equalsIgnoreCase(city) && subscriber.getCityMins() > limit) {
                System.out.println(subscriber);
            }
        }
        System.out.println();
    }

    @Override
    public void checkIntercityCalls() {
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
    public void subscriberInfo() {
        System.out.println("Enter the 1st letter of surname to search...");
        Scanner sc = new Scanner(System.in);
        String letter = sc.next().toUpperCase();
        System.out.println("Subscribers info with surname on " + letter + " : ");
        for (Subscriber subscriber : SubscriberList.subscribers) {
            if (subscriber.getSurname().toUpperCase(Locale.ROOT).startsWith(letter)) {
                System.out.println("Full name: " + subscriber.getSurname() + "." + subscriber.getName() +
                        "." + subscriber.getPatronymic() + ". Mobile: " + subscriber.getMobNum() +
                        " Balance: " + subscriber.getBalance());
            }
        }
        System.out.println();
    }

    @Override
    public void checkTrafficInCity() {
        System.out.println("Enter the city(Kyiv, Odesa, Sumy, Kherson) for check traffic: ");
        Scanner sc = new Scanner(System.in);
        String city = sc.next();
        double total = 0;
        for (Subscriber subscriber : SubscriberList.subscribers) {
            if (subscriber.getTraffic() != 0 && subscriber.getCity().equalsIgnoreCase(city)) {
                total += subscriber.getTraffic();
            }
        }
        System.out.println("Total traffic in city " + city + " : " + total);
        System.out.println();
    }

    @Override
    public void checkNegativeBalance() {
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
