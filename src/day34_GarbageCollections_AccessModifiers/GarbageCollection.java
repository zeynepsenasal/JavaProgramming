package day34_GarbageCollections_AccessModifiers;

import day31_Constructions.Student;
import day23_CustomMethods_Void.day32_Constructions.Car;
import day30_CustomClasses.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {
        //String str = null; //null is a value, can be initilaze to any primitive type
       //  String str = ""; is not the same

        /*
        System.out.println(str.toUpperCase());
         */

        String str = "Wooden Spoon";
        str= null;//after this line, str is eligible for garbage collection
        System.out.println(str);


        Car car1 = new Car("Toyota");

        car1=null;
        System.out.println(car1);

        System.out.println("-------------------------------");

        Dog dog1 = new Dog();
        dog1.name="Lucy";

        Dog dog2= new Dog();
        dog1.name="Max";

        System.out.println(dog1);

        String language="Phyton";
        language="Java";

        System.out.println(language);

        System.out.println("------------------------------");

        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(100);

        ArrayList<Integer> list2=list1;

        list2.addAll(Arrays.asList(100,200,500));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println("------------------------------");

        Student student1 = new Student("Zeynep", 24, 'F', 'A', 123);
        Student student2=student1;

        student2.name="Ahmet";

        System.out.println(student1);
        System.out.println(student2);



    }
}
