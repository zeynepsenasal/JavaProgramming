package day39_Recap.Shape;

public class Rectangle extends Shape {
    private double length, width;

    public void setLength(double length) {
        if(length<=0){
            System.err.println("Invalid data");
            System.exit(1);
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.err.println("Invalid data");
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length*width;
    }

    @Override
    public double perimeter() {
        return (length+width)*2;
    }
}
