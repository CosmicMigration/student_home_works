package robotics;

import java.util.Objects;

public class Transformer extends Robot {

    private String name = "vasia";
    private boolean sword;
    protected String transformerField;

    public void fight(){
        if(sword==true){
            System.out.println(getName()+" i can fight, my serial number is "+super.getSerialNumber());
        }
    }

    public boolean isSword() {
        return sword;
    }

    public void setSword(boolean sword) {
        this.sword = sword;
    }


    public String getName() {
        System.out.println("getName from Transformer");
        return name;
    }


    public void setName(String aName) {
//        System.out.println("It is transformer's nsme");
        name = aName;
    }


    @Override
    public void thinking() {
        super.thinking();
        System.out.println("But I am transformer, so I am very smart");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transformer that = (Transformer) o;
        return sword == that.sword &&
                Objects.equals(name, that.name) &&
                Objects.equals(transformerField, that.transformerField);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, sword, transformerField);
    }
}
