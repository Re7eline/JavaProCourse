public interface SubscriberService {
    void exceedingLimitLocalCalls(Subscriber[] subscribers);

    void intercityCallsUsers(Subscriber[] subscriber);

    void findSbscrByFirstLetterSurname(Subscriber[] subscriber, String firstLetter);

    void calcTotalTrafficConsumption(Subscriber[] subscriber, String inputCity);

    void findNegativeBalanceSubscribers(Subscriber[] subscriber);

}
