package Robot;

public class Robot {

    public static void main(String[] args) {

        Head head = new Head();
        Hands handL = new Hands();
        Hands handR = new Hands();
        Legs legL = new Legs();
        Legs legR = new Legs();

        Body body = new Body(head, handL, handR, legL, legR);
        //Body body = new Body(head, handL, handR, legL);
        //Body body = new Body(head, handL, legL, legR);
        //Body body = new Body(handL, handR, legL, legR);

    }
}
