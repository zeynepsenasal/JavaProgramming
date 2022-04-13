package day16_PractiseTasks;

import java.util.Scanner;

public class Multipilaction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two positive numbers");
        int n = scan.nextInt();
        int n2 = scan.nextInt();

        int result = 0;


        if(n<0 || n2<0){
            System.out.println("Invalid");
        }else{
            for (int i = 1; i<=n2; i++) {
                result += n;
            }
        }
        System.out.println(result);

        scan.close();

    }
}
/*

3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200
 */