package day14_StringPractiseTasks2;

import java.util.Scanner;

public class NeverMind {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.nextLine();
        String lastTwoChars = word.substring(word.length()-2);

        if(lastTwoChars.equalsIgnoreCase("ly")){
            System.out.println("really???");
        }else {
            System.out.println("Never Mind");
        }

        scan.close();


    }
}
/*
ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */