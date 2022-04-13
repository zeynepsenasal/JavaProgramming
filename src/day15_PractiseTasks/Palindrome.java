package day15_PractiseTasks;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isPalindrome;

        System.out.println("Enter a string");
        String str = scan.nextLine();

        String reverse ="";

        for (int i = str.length()-1; i>=0 ; i--) {
            String eachChar = "" + str.charAt(i);
            reverse += eachChar;
        }
        if(str.equalsIgnoreCase(reverse)){
            isPalindrome = true;
            System.out.println("isPalindrome = " + isPalindrome);
        }else{
            isPalindrome = false;
            System.out.println("isPalindrome = " + isPalindrome);
        }



        scan.close();

    }
}
