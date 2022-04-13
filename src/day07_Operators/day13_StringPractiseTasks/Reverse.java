package day07_Operators.day13_StringPractiseTasks;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String result = "";

        System.out.println("enter a string");
        String str = scan.nextLine();

        if(str.length()==5){
            for(int i = str.length()-1; i>=0; i--){
                result += str.charAt(i);
            }


        }else if(str.length()>5){
            result = "Too Long!";
        }else if(str.length()<5){
            result = "Too Short!";
        }

        System.out.println(result);

    }
}
/*
Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
 */