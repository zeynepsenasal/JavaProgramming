package day07_Operators.day13_StringPractiseTasks;

import java.util.Scanner;

public class Empty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = scan.nextLine();

        boolean empty = word.isEmpty();
        int lenght = word.length();

        if(empty){
            System.out.println("String is empty");
        }else if(lenght==3){
            System.out.println(word);
        }else if(lenght>3){
            System.out.println(word.substring(word.length()-3));
        }


    }
}
/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */