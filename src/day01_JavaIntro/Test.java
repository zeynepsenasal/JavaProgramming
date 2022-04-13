package day01_JavaIntro;

import day18_NestedLoop.day24_CustomMethods_Return.ReturnMethodIntro;
import day18_NestedLoop.day24_CustomMethods_Return.ReturnMethodPractise4;

public class Test {
    public static void main(String[] args) {
        String str = "aaaabbbbccccddddeeee";

       str = ReturnMethodPractise4.removeDuplicates(str);

        System.out.println(str);

        String str2 = "zeynep";

        String reversedName = ReturnMethodIntro.reverse(str2);



    }
}
