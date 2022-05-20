package day45_Abstraction.shape;

public abstract class Shape{
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();



    @Override
    public String toString() {
        return "Shape{" +
                "name='" + getName() + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + getName() + '\'' +
                '}';
    }
}
