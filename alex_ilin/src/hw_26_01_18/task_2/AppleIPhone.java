package hw_26_01_18.task_2;

public class AppleIPhone {
   private String developer;
   private String company;
   private int cost;

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "AppleIPhone{" +
                "developer='" + developer + '\'' +
                ", company='" + company + '\'' +
                ", cost=" + cost +
                '}';
    }
}
