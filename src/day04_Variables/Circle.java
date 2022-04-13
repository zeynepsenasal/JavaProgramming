package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        //Pi, radius, diameter, area,perimeter
        double pi = 3.14;
        double radius = 3.5;
        double diameter = radius * 2;
        double area = radius * radius * pi;
        double perimeter = diameter * pi;
        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }


}
