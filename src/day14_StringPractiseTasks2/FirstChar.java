package day14_StringPractiseTasks2;

import java.util.Scanner;

public class FirstChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter two words");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        String word1 = str1.substring(1);
        String word2 = str2.substring(1);

        System.out.println(word1+word2);
        scan.close();


    }
}
/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */