package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for (char each:chars) {
            System.out.println(each);
        }

        System.out.println("------------------------------------------");

        String str2 = "Wooden Spoon";

        String[] words = str2.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------------------");

        String email = "WoodenSpoon@gmail.com";

        String[] arr = email.split("@");

        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------------------------");

        String s1 = "Today is a good day. Today is Monday. Today we learn Java.";

        String[] s2 = s1.split("\\.");

        System.out.println(Arrays.toString(s2));



    }
}
