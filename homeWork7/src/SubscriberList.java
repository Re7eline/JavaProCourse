public class SubscriberList {
    public static Subscriber[] subscribers = new Subscriber[11];

    public static Subscriber[] addSubscribers() {
        subscribers[0] = new Subscriber(1, "Berezovskiy", "Ivan", "Vitaliiiovych",
                "Odesa", "0678945956", 1, 100,
                3, 0, 5000);
        subscribers[1] = new Subscriber(2, "Myrashko", "Oleg", "Olegovych",
                "Odesa", "0986597321", 2, 200,
                8, 90, 4096);
        subscribers[2] = new Subscriber(3, "Lapatko", "Oleksandr", "Bogdanovych",
                "Kyiv", "0506912998", 3, 300,
                4, 15, 1024);
        subscribers[3] = new Subscriber(4, "Golka", "Stepan", "Yuriiovych",
                "Kyiv", "0958956321", 4, 50,
                150, 19, 800);
        subscribers[4] = new Subscriber(5, "Prykhodko", "Volodymyr", "Olegovych",
                "Odesa", "0962536514", 5, -30,
                60, 0, 16009);
        subscribers[5] = new Subscriber(6, "Bogyslavskiy", "Vitaliy", "Valeriiovych",
                "Kherson", "0639874595", 6, 1200,
                58, 300, 8192);
        subscribers[6] = new Subscriber(7, "Murashko", "Anton", "Valentynovych",
                "Kherson", "0996587935", 7, -18,
                6, 0, 24062);
        subscribers[7] = new Subscriber(8, "Cybulia", "Petro", "Anataliiovych",
                "Sumy", "0956859874", 8, 3,
                682, 0, 300);
        subscribers[8] = new Subscriber(9, "Chereshnya", "Dmytro", "Oleksandrovych",
                "Sumy", "09365849865", 9, 695,
                40, 0, 6589);
        subscribers[9] = new Subscriber(10, "Antonenko", "Anton", "Antonovych",
                "Odesa", "0669874265", 10, 0,
                205, 0, 60986);
        subscribers[10] = new Subscriber(11, "Prykhodko", "Volodymyr", "Vitaliiovych",
                "Kherson", "0993669879", 11, 500, 150, 90, 16985);
        return subscribers;
    }

}
