package week02;

import java.util.Scanner;

public class UserInputIntro {
    public static void main(String[] args) {
        //output: print or println
        String name = "Zeynep";
        System.out.println("output");
        //------------------------------

        // 1- create scanner object
        Scanner input = new Scanner(System.in);

        // 2- prompt the user for putting input
        System.out.println("Put your name:");

        // 3- get the input
        name = input.next(); // reads the data from the console and assigns to my variable

        // 4- use the value that I read
        System.out.println("input = " + input);

        // !!- step 1 and 3 are must; step 2 and 4 are depends on the situation


    }
}
