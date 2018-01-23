package shop2.goods;

public class Booots {
    private int size;
    private String brand;
    private int price;
    private int count;
    private Developer developer = new Developer();

    public void setDeveloper(String adressOfMainOffice, int index, String city ){
        this.developer.setAdressOfMainOffice(adressOfMainOffice);
        this.developer.setCity(city);
        this.developer.setIndex(index);
    }

    public Booots() {
    }

    public Booots(int size, String brand, int price) {
        this.size = size;
        this.brand = brand;
        this.price = price;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
