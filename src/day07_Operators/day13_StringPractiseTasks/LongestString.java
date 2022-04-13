package day07_Operators.day13_StringPractiseTasks;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first sentence");
        String sentence = scan.nextLine();
        System.out.println("Enter the second");
        String sentence2 = scan.nextLine();

        int lenght1 = sentence.length();
        int lenght2 = sentence2.length();

        if(lenght1>lenght2){
            System.out.println(sentence);
        }else{
            System.out.println(sentence2);
        }


    }
}
