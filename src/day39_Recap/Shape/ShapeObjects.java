package day39_Recap.Shape;

public class ShapeObjects {
    public static void main(String[] args) {
        Square square = new Square(10);

        System.out.println(square);

        square.setSide(15);
        System.out.println(square);

        System.out.println("-------------------------------------");

        Rectangle rectangle = new Rectangle(15,5);

        System.out.println(rectangle);

        rectangle.setLength(10);

        System.out.println(rectangle.getLength());

        System.out.println(rectangle.getName());

        System.out.println("------------------------------------------");

        




    }
}
