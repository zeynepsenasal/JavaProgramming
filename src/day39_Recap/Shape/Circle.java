package day39_Recap.Shape;

public class Circle extends Shape  {
    private double radius;
    public double pi = 3.14;

    public double getRadius(){
        return radius;
    }

    public Circle( double radius, double pi) {
        super("Circle");
        this.radius = radius;
        this.pi = pi;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.err.println("Invalid data");
            System.exit(1);
            this.radius = radius;
        }


    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
