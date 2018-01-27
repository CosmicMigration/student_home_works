package house;

import house.Furniture;

public class Room {
    private boolean light;
    Furniture obj= new Furniture();

    public Room() {
    }


    public Room(boolean light) {
        this.light = light;
        if(light == true){
            System.out.println("Свет включен");
        }
        else{
            System.out.println("Свет выключен");
        }
    }
}
