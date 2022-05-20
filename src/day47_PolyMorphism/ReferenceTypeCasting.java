package day47_PolyMorphism;

import day43_Abstraction.employeeTask.*;
import day44_Abstraction.Animal.Animal;
import day44_Abstraction.Animal.Cat;
import day44_Abstraction.Animal.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Cube;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

            Shape shape = (Shape) new Circle(4); //UPCASTING, IMPILICITLY AND AUTOMATICALLY


        Animal animal = new Dog("Max", "Husky", 'M', 2, "large", "white");

      //  Dog dog = (Dog) animal; //DOWN CASTING, REQUIRES EXPLICIT ACTION

        ((Dog) animal).bark();

        Shape shape1 =new Square(5);

        System.out.println(((Square)shape1).getName());

        System.out.println("-------------------------------------------");

        Animal animal2 = new Cat("Lucy", "British", 'F',2, "large", "grey");

      //  Cat cat = (Cat) animal2;
      //  cat.meow();

        ((Cat) animal2).meow();

        System.out.println("----------------------------------------");

        Employee employee = new Tester("Ali", 25, 'F', 12345, "SDET", 2000);

        ((Tester) employee).bugReport();

        ((Developer) employee).unitTest();

        Person person = employee;

        Teacher teacher= (Teacher) employee; // There is no IS A relation between Teacher and Employee,
        //so we have to do down casting(explicit)

        System.out.println("----------------------------------------------");

        Shape s1= new Circle(5);

        s1.area();

      //  s1.volume();
        ((Cube)s1).volume();









    }
}
