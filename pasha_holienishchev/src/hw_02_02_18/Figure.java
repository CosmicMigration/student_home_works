package hw_02_02_18;

public abstract class Figure {
    // ВМЕСТО ПЛОЩАДИ Я ВЗЯЛ ПЕРИМЕТР
    private String name;
    private int sideCount;
    private int sideSize;

    public Figure() {
    }


    public int perimeter(){
        int perim = 0;
        for (int i = 0; i < sideCount; ++i)
        {
            perim = perim + sideSize;
        }
        return perim;
    }
    public void canPaint()
    {
        System.out.println("I can print: " + name + ". ");
    }

    public double area(){
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSideCount() {
        return sideCount;
    }

    public void setSideCount(int sideCount) {
        this.sideCount = sideCount;
    }

    public int getSideSize() {
        return sideSize;
    }

    public void setSideSize(int sideSize) {
        this.sideSize = sideSize;
    }
}
