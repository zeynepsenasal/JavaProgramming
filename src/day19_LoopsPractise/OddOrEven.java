package day19_LoopsPractise;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd Number");
            }

            System.out.println("Would you like to enter another number?");
            String a = scan.next();

            if (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                System.err.println("Invalid entry");
                System.exit(0);
            }

            if (a.equalsIgnoreCase("no")) {
                System.out.println("thank you!");
                break;


            }


        }
    }
}
