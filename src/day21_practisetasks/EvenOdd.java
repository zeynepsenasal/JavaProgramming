package day21_practisetasks;

import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] num = {2,3,4,5,6,7,8,10};

        int even =0;
        int odd = 0;

        for (int each:num) {

            if(each%2==0){
                even++;
            }else{
                odd++;
            }

        }
        System.out.println(Arrays.toString(num));
        System.out.println("There are " + even +  " even numbers and " + odd + " odd numbers in this array");
    }
}
/*
Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */