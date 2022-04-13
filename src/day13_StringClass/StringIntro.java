package day13_StringClass;

public class StringIntro {
    public static void main(String[] args) {

        String name1 = "Wooden Spoon"; // there is one "Wooden Spoon" data
        String name2 = "Wooden Spoon"; // in the String Pool in the Heap
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name1 == name2); //true
        System.out.println(name3 == name4); //true

        System.out.println("-------------------------------");

        String name5 = new String("Wooden Spoon"); //there are 2 "wooden spoon" data
        String name6 = new String("Wooden Spoon"); //in the String Pool
        // we used the new string method and they are being stored in different data
        System.out.println(name5 == name6); //false

        System.out.println("-----------------------------------");

        String s1 = "Java";
        String s2 = new String("Java"); //true

        System.out.println(s1.equals(s2)); // equals method is used for comparing if the characters are the same
                                            // even if they are not stored in same data

        String s3 = "Java";
        String s4 = new String("java");

        System.out.println(s3.equals(s4)); //false, because of the lower case char




    }
}
