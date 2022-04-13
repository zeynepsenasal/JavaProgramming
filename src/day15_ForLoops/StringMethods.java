package day15_ForLoops;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String str = "        "; //not empty, its blank
        boolean r = str.isEmpty(); // empty : "" , blank: "" and "   "

        System.out.println(r);

        boolean r1 = str.isBlank();
        System.out.println(r1);

        String str2 = "Cydeo     ";

        System.out.println(str2.isBlank()); // false

        System.out.println("-------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); //FALSE
        System.out.println(s1.equalsIgnoreCase(s2)); //TRUE, this method ignore the words have different cases

        System.out.println("----------------------------------------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCsharp = sentence.contains("C#");

        System.out.println(hasCsharp); // false

        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");

        System.out.println(hasJava); //TRUE
        System.out.println(hasJava2);//FALSE
        System.out.println(hasJava3); //TRUE

        System.out.println("-----------------------------------------");

        String input1 = "I love jAvA";
        String input2 = "Java";

        System.out.println(input1.equalsIgnoreCase(input2));//FALSE

        System.out.println(input1.contains("Java")); //FALSE
        System.out.println(input1.toLowerCase().contains("java"));//TRUE
        System.out.println(input1.toUpperCase().contains("JAVA")); //TRUE

        System.out.println("------------------------------------");

        String w1 = "Wooden Spoon";

        boolean x = w1.startsWith("Woo");
        boolean y = w1.endsWith("Spoon");
        boolean z = w1.toLowerCase().startsWith("wooden");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);





    }
}
