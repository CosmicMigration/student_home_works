package animals;

import java.util.Objects;

public class Dog extends Animals {
    private String name;

    public Dog(String name, String headForm){
        this.name = name;
        super.setHeadForm(headForm);

    }

    @Override
    protected void sayMyNameAndWhatICan() {
        super.sayMyNameAndWhatICan();
        System.out.println(murluk()+". So, I am cat and my name is "+getName());
    }

    private String murluk(){
        return "Gav";
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
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
