package Car;

public class Lorry extends Car {

    protected float capacity;


    public Lorry() {
    }
    public float getCapacity() {
        return capacity;
    }
    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float changeCapacity(float newCapacity){
        return capacity + newCapacity;
    }

    public String changeBrand(String newBrand){
     return setBrand(newBrand);
    }

    public Lorry(float power) {
        super(power);
    }

}

