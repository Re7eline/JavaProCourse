public class Subscriber {
    public int id;
    private String surname;
    private String name;
    private String patronymic;
    private String city;
    private String mobNum;
    private int contractNum;
    private double balance;
    private double cityMins;
    private double intercityMins;
    private double traffic;

    public Subscriber() {
        this.id = id;
        this.name = "";
        this.surname = "";
        this.patronymic = "";
        this.city = "";
        this.mobNum = "";
        this.contractNum = 0;
        this.balance = 0;
        this.cityMins = 0;
        this.intercityMins = 0;
        this.traffic = 0;
    }

    public Subscriber(int id, String surname, String name, String patronymic,
                      String city, String mobNum,
                      int contractNum, double balance, double cityMins, double intercityMins, double traffic) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.city = city;
        this.mobNum = mobNum;
        this.contractNum = contractNum;
        this.balance = balance;
        this.cityMins = cityMins;
        this.intercityMins = intercityMins;
        this.traffic = traffic;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", city='" + city + '\'' +
                ", mobNum='" + mobNum + '\'' +
                ", contractNum=" + contractNum +
                ", balance=" + balance +
                ", cityMins=" + cityMins +
                ", intercityMins=" + intercityMins +
                ", traffic=" + traffic +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobNum() {
        return mobNum;
    }

    public void setMobNum(String mobNum) {
        this.mobNum = mobNum;
    }

    public int getContractNum() {
        return contractNum;
    }

    public void setContractNum(int contractNum) {
        this.contractNum = contractNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCityMins() {
        return cityMins;
    }

    public void setCityMins(double cityMins) {
        this.cityMins = cityMins;
    }

    public double getIntercityMins() {
        return intercityMins;
    }

    public void setIntercityMins(double intercityMins) {
        this.intercityMins = intercityMins;
    }

    public double getTraffic() {
        return traffic;
    }

    public void setTraffic(double traffic) {
        this.traffic = traffic;
    }
}
