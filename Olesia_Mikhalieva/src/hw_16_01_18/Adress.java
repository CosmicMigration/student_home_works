package hw_16_01_18;

public class Adress {
    private String street;
    private String city;
    private int phone;
    private String region;
    Student[] studMass;

    public Adress() {
    }

    public Adress(String region, String city, String street, int phone ) {
        this.street = street;
        this.city = city;
        this.phone = phone;
        this.region = region;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
