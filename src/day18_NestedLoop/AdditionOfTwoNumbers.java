package day18_NestedLoop;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("enter a number");
            int n1 = scan.nextInt();
            System.out.println("enter second number");
            int n2 = scan.nextInt();

            System.out.println("Addition: " + n1+n2);

            System.out.println("would you like to continue?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid answer, re-enter");
                answer = scan.next().toLowerCase();
            }

            if(answer.equals("no")){
                break;
            }



        }

    }
}
