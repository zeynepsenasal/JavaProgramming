package day34_GarbageCollections_AccessModifiers;
//import static day34_GarbageCollections_AccessModifiers.Circle.pi;
//imports the static member to this class

import static day34_GarbageCollections_AccessModifiers.Circle.*;
//imports all of the static members
public class StaticImport {
    public static void main(String[] args) {
        System.out.println(pi); //do not have to call the other class name like "Circle.pi"
        System.out.println(name);
        System.out.println(numbers);
    }

}
