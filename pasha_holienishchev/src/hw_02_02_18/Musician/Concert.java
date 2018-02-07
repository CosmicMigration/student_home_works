package hw_02_02_18.Musician;

public class Concert {
    public static void main(String[] args) {
        Musician m = new Musician();

        Instrument i = new Instrument();
        Instrument guitar = new Guitar();
        Flute flute = new Flute();

        m.play(flute);
        m.play(guitar);
    }
}
