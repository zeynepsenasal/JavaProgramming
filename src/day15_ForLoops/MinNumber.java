package day15_ForLoops;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 21474836;

        for(int i = 10; i<=15; i++ ){
            System.out.println("enter a number");
            int num = scan.nextInt();

            if (num < min) {
                num = min;
            }

        }
        System.out.println(min);
        scan.close();
    }




}

