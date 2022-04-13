package day07_Operators.day13_StringPractiseTasks;

import java.util.Scanner;

public class SameChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word");
        String word = scan.next();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length()-1);

        if(firstChar==lastChar){
            System.out.println("same");
        }

        scan.close();










    }






}
