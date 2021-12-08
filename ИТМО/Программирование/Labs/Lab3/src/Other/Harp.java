package Other;

public enum Harp {
    SMALL("Маленькая"), MEDIUM("Побольше"), BIG("Большая"), HUGE("Огромная");
    private final String state;

    Harp(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return ("Появилась арфа " + "'" + state + "'");
    }
}
