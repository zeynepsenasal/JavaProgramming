package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        if(age<0){
            throw new InputMismatchException("Age cannot be negative:" + age);

            /*
            System.err.println("Invalid age: " + age);
            System.exit(1);
             */
        }

        if(age>21){
            System.out.println("You are eligible");
        }else{
            throw new RuntimeException("You must be at least 21 years old");
        }


    }
}
