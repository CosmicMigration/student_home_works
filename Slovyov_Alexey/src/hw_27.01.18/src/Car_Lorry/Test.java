package Car_Lorry;

public class Test {
    public static void main(String[] args) {
        Lorry lary=new Lorry();
        Car car=new Car();
        car.setModel("Lexus");
        lary.setModel("Mersedes");
        System.out.println("= "+lary.getModel());
        System.out.println("="+car.getModel());
    }
}
