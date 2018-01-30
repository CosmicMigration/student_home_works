package Robots.robotTypes;

import Robots.Hand;
import Robots.Head;
import Robots.Leg;
import Robots.Robot;

public class Transformer extends Robot {
    private int height;

    public Transformer(int height) {
        this.height = height;
    }

    public Transformer(Hand[] hands, Leg[] legs, Head head, String name, int height) {
        super(hands, legs, head, name);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transformer that = (Transformer) o;

        return height == that.height;
    }

    @Override
    public int hashCode() {
        return height;
    }
}
