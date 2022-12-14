package players;

public class Computer {
    private String hand;

    public Computer() {
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hand='" + hand + '\'' +
                '}';
    }
}
