package homeWork;

public class Laincher {
    public static void main(String[] args) {
        Instrument i = new Instrument();
        Flute flute = new Flute();
        Guitar g = new Guitar();

        Musician m = new Musician();

        m.play(flute);
        m.play(g);


    }

}
