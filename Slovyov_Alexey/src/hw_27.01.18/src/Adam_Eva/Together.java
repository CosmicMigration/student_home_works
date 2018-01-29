package Adam_Eva;

public class Together {
    public static void main(String[] args) {
        Adam adam=new Adam();
        adam.setName("ADAM");
        System.out.println(adam.getName());

        Eva eva=new Eva();
        eva.setName("EVA");
        eva.setSex("woman");
        System.out.println(eva.getName()+" is "+eva.getSex());

    }
}
