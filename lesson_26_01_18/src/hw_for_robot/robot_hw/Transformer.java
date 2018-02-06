package hw_for_robot.robot_hw;

import java.util.Objects;

public class Transformer extends Robot {
   private String transformerParam;

    public Transformer(String transformerParam) {
        this.transformerParam = transformerParam;
    }

    public String getTransformerParam() {
        return transformerParam;
    }

    public void setTransformerParam(String transformerParam) {
        this.transformerParam = transformerParam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Transformer that = (Transformer) o;
        return Objects.equals(transformerParam, that.transformerParam);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), transformerParam);
    }

    @Override
    public String
    toString() {
        return "Transformer{" +
                "transformerParam='" + transformerParam + '\'' +
                '}';
    }
}


