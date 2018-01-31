package animals;

import java.util.Objects;

public class Cat extends Animals {
    private String name;
    private int age;
    private int cost;



    public Cat(String name, String headForm){
        this.name = name;
        super.setHeadForm(headForm);

    }

    @Override
    protected void sayMyNameAndWhatICan() {
        super.sayMyNameAndWhatICan();
        System.out.println(murluk()+". So, I am cat and my name is "+getName());
    }

    private String murluk(){
        return "Murrr";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
