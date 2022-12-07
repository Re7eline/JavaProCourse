package enums;

public enum RSP {
    ROCK("ROCK"),
    SCISSORS("SCISSORS"),
    PAPER("PAPER");
    private String name;

    RSP(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
