package hw_30_01_18.robot_task;


import java.util.Objects;

public class Burito extends Robot{
    private boolean gun;

    public boolean isGun() {
        return gun;
    }

    public void setGun(boolean gun) {
        this.gun = gun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Burito burito = (Burito) o;
        return gun == burito.gun;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gun);
    }
}
