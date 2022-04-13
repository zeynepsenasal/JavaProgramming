package day07_Operators.day13_StringPractiseTasks;

import java.util.Scanner;

public class SameLenght {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word1 = scan.next();
        System.out.println("Enter a word");
        String word2 = scan.next();
        System.out.println("Enter a word");
        String word3 = scan.next();

        int n1 = word1.length();
        int n2 = word2.length();
        int n3 = word3.length();


        if(n1==n2 && n1==n3){
            System.out.println("All words are same lenght");
        }else if((n1==n2 && n1!=n3) || n1==n3 && n1!=n2){
            System.out.println("Not Same nor Different lengths");
        }else{
            System.out.println("All different lenght");
        }



    }
}
/*
Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */