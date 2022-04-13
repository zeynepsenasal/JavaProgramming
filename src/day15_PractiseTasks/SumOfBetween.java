package day15_PractiseTasks;

import java.util.Scanner;

public class SumOfBetween {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= scan.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;

        }
        System.out.println(sum);

        scan.close();
    }
}
