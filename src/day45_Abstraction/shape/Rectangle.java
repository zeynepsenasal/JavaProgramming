package day45_Abstraction.shape;

public class Rectangle extends Shape implements Perimeter{
    private double width;
    private double length;

    public Rectangle(String name, double width, double length) {
        super(name);
        setLength(length);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }
}
