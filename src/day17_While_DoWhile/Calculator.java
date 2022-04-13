package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter first number");
        int n1 = scan.nextInt();
        System.out.println("enter second number");
        int n2 = scan.nextInt();
        System.out.println("enter a math operator");
        char operator = scan.next().charAt(0);

        while(!(operator=='+' || operator=='-')){
            System.out.println("Invalid Operator, Please re-enter.");
            operator = scan.next().charAt(0);
        }

        System.out.println((operator=='+')? n1 + n2 : n1 - n2);

        scan.close();








    }
}
