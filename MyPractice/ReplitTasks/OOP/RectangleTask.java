package ReplitTasks.OOP;

import java.util.Scanner;

public class RectangleTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle c = new Circle(in.nextDouble());
        System.out.println(c.area());
        System.out.println(c.perimeter());

        Rectangle r = new Rectangle(in.nextDouble(), in.nextDouble());
        System.out.println(r.area());
        System.out.println(r.perimeter());
        in.close();
    }
    public abstract static class Shape{
        public abstract double area();
        public abstract double perimeter();
    }

    public static class Rectangle extends Shape{
private double width, length;

        public Rectangle(double width, double length) {
            setWidth(width);
            setLength(length);
        }

        @Override
        public double area() {
           return width*length;
        }

        @Override
        public double perimeter() {
            return 2*(width+length);
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }
    }

    public static class Circle extends Shape{
      private   double radius;
       public static final double pi=3.14;

        public Circle(double radius) {
            setRadius(radius);
        }

        @Override
        public double area() {
            return 2*pi*getRadius();
        }

        @Override
        public double perimeter() {
            return pi*getRadius()*getRadius();
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
    }

}
