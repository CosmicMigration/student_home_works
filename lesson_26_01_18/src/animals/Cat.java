package animals;

public class Cat extends Animals {
    private String name;



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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
