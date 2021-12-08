package Other;


public class Orechestra {
    private final int size;
    private final Musician musician;
    private final String instrument;
    public Orechestra(int size, Musician musician, String instrument) {
        this.size = size;
        this.musician = musician;
        this.instrument = instrument;
    }
    public void announce() {
        for (int i = 0; i < size; ++i) {
            musician.getName();
            musician.instrument(instrument);
        }
    }
}
