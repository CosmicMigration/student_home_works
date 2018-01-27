package hw_26_01_18.task_1;

public class Eva extends Adam {
   private boolean dress;

    public boolean isDress() {
        return dress;
    }

    public void setDress(boolean dress) {
        this.dress = dress;
    }

    @Override
    public String toString() {
        return "Eva{" +
                "dress=" + isDress() +", "+
                "name="+getName()+", age="+getAge()+'}';
    }
}
