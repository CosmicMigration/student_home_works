package Car_Lorry;

public class Lorry extends Car {
    private double cargoCapacity;

    public Lorry() {
    }

    public Lorry(String model, double weight, double power, double cargoCapacity) {
        super(model, weight, power);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
//    public void setModell(String m){//МЕТОД ПЕРЕНАЗАНЧЕНИЯ МАРКИ???
//        super.;

   // }


    public void setModel(String model) {
        super.setModel(model);
    }
}
