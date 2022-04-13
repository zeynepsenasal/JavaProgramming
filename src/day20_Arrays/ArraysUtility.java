package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] numbers = {20, 2, 4, 0, 1, 10, 9};

        System.out.println(numbers); //hashcode

        System.out.println(Arrays.toString(numbers)); //prints

        Arrays.sort(numbers); //sorts the array to ascending order

        System.out.println(Arrays.toString(numbers));


    }
}
