package day15_ForLoops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -2147483648; //minimum integer

        for(int i = 1; i<=5; i++){
            System.out.println("Enter a number");
            int number = scan.nextInt();

            if(number>max){
                max = number; // RE-ASSIGNING CONSTANTLY!!
            }


        }
        System.out.println(max);


    }
}
