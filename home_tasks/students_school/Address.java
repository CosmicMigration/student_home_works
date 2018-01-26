public class Address {
    private String region;
    private  String city;
    private String street;
    private int numHouse;
    private int zipCode;

    public Address(String region, String city, String street, int numHouse, int zipCode) {
        this.region = region;
        this.city = city;
        this.street = street;
        this.numHouse = numHouse;
        this.zipCode = zipCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumHouse() {
        return numHouse;
    }

    public void setNumHouse(int numHouse) {
        this.numHouse = numHouse;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
