package Animals_Human;

public class Fish {
    private String kind;
    private boolean breatheUnderWater;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public boolean isBreatheUnderWater() {
        return breatheUnderWater;
    }

    public void setBreatheUnderWater(boolean breatheUnderWater) {
        this.breatheUnderWater = breatheUnderWater;

    }
    public void breatheO2(){
        if(breatheUnderWater==true){
            System.out.println("Может быть под водой");
        }else System.out.println("Дышит на суше");
    }
}
