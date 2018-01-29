package Full_house;

public class Dog extends Animals {
    private boolean crazy;
    private int amountOfFood;

    public boolean isCrazy() {
        return crazy;
    }

    public void setCrazy(boolean crazy) {
        this.crazy = crazy;
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }

    public void setAmountOfFood(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }
}
