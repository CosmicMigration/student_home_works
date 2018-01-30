package animals;

public class Animals {

    private String headForm;

    private String breath(){
        return "i am breath";
    }

    protected void sayMyNameAndWhatICan(){
        System.out.print("My haed form is "+this.headForm+", "+breath()+". ");
    }


    public Animals() {

    }

    public String getHeadForm() {
        return headForm;
    }

    public void setHeadForm(String headForm) {
        this.headForm = headForm;
    }
}
