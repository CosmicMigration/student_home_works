package Music;

public class Laincher {
    public static void main(String[] args) {
        Instrument i=new Instrument();
        Flute fluet=new Flute();
        Guitar guitar=new Guitar();

        Musician m=new Musician();

        m.play(fluet);
        m.play(new Guitar());


    }
}
