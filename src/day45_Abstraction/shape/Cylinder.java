package day45_Abstraction.shape;

public class Cylinder extends Shape implements Volume{
    private double height;
    private double radius;
    private static final double pi = 3.14;

    public Cylinder(double height, double radius) {
        super("Cylinder");
        setHeight(height);
        setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 0;
    }

    public double volume(){
        double areaOfCircle= radius*radius*pi;
        return areaOfCircle*height;
    }

}
