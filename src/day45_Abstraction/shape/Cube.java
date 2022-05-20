package day45_Abstraction.shape;

public class Cube extends Shape implements Volume{
    private double side;

    public Cube(double side) {
        super("Cube");
        setSide(side);
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return 6*side*side;
    }

  public double volume(){
        return side*side*side;
  }


}
