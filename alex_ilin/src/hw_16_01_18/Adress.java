package hw_16_01_18;

public class Adress {
   private String adress;
   private String city;
   private String state;
   private int number;

    public Adress() {
    }

    public Adress(String adress, String city, String state, int number) {
        this.adress = adress;
        this.city = city;
        this.state = state;
        this.number = number;
    }



    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

public void getAdressData(){
    System.out.println("Адресные данные студента:\nГород:\n"+getCity()+"\nОбласть:\n"+getState()+"\nАдрес\n"+getAdress()+"\nКонтактный номер телефона\n"+getNumber());
}

}
