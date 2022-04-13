package day20_Arrays;

import java.util.Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {
        int[] numbers = {100, 200, 50, 500, 80, 80};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] < min){
                min = numbers[i];
            }

        }
        System.out.println(min);


    }
}
