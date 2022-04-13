package Utilities;

import java.util.Arrays;

public class StringUtility {

    //print each character from given string
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }

    //reverse
    public static String reverse(String str){
        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }

    public static boolean anagram(String str1,String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch1);

        return ch1.equals(ch2);
    }


    //removes the duplicates from given string, returns String.
    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)){
                result += each;
            }

        }

        return result;
    }

}
