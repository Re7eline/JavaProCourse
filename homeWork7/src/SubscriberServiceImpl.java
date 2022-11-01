import java.util.Locale;

public class SubscriberServiceImpl implements SubscriberService {
    public void execute() {
        SubscriberList.addSubscribers();
        checkCityCalls();
        checkIntercityCalls();
        subscriberInfo();
        checkTrafficInCity();
        checkNegativeBalance();
    }

    @Override
    public void checkCityCalls() {
        System.out.println("Calls more than 60 mins in city: ");
        for (Subscriber subscriber : SubscriberList.subscribers) {
            if (subscriber.getCityMins() > 60) {
                System.out.println(subscriber);
            }
        }
        System.out.println();
    }

    @Override
    public void checkIntercityCalls() {
        System.out.println("Subscribers used INTERCITY calls: ");
        for (Subscriber subscriber : SubscriberList.subscribers) {
            if (subscriber.getIntercityMins() > 0) {
                System.out.println(subscriber);

            }
        }
        System.out.println();
    }

    @Override
    public void subscriberInfo() {
        System.out.println("Subscribers info with surname on 'M': ");
        for (Subscriber subscriber : SubscriberList.subscribers) {
            if (subscriber.getSurname().toUpperCase(Locale.ROOT).startsWith("M")) {
                System.out.println("Full name: " + subscriber.getSurname() + "." + subscriber.getName() +
                        "." + subscriber.getPatronymic() + ". Mobile: " + subscriber.getMobNum() +
                        " Balance: " + subscriber.getBalance());
            }
        }
        System.out.println();
    }

    @Override
    public void checkTrafficInCity() {
        double total = 0;
        for (Subscriber subscriber : SubscriberList.subscribers) {
            if (subscriber.getTraffic() != 0 && subscriber.getCity().equals("Kyiv")) {
                total += subscriber.getTraffic();
            }
        }
        System.out.println("Total traffic in city Kyiv: " + total);
        System.out.println();
    }

    @Override
    public void checkNegativeBalance() {
        int counter = 0;
        System.out.println("Subscribers with negative or zero balance: ");
        for (Subscriber subscriber : SubscriberList.subscribers) {
            if (subscriber.getBalance() <= 0) {
                counter++;
                System.out.println(subscriber);
                System.out.println();
            }
        }
        System.out.println("Quantity of subscribers with negative balance: " + counter);

    }
}
