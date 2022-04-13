package day25_CustomMethods_Overloading;


import Utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str = "Java Programming language";

        StringUtility.printEachChar(str);

        String s1 = "Wooden Spoon";
        String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);

        String s2 = "Level";
        boolean palindrome = StringUtility.isPalindrome(s2);
        System.out.println("palindrome = " + palindrome);

        System.out.println("------------------------------------------");
//      How many palindromes in this array?
        String[] names = {"Anna", "Java", "Ahmet", "Mom"};
        int count = 0;

        for (String each: names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count + " palindrom");

        System.out.println("------------------------------------------");
        String str1 = "abc";
        String str2 = "bca";

        boolean anagram = StringUtility.anagram(str1, str2);
        System.out.println(anagram);

    }

}
