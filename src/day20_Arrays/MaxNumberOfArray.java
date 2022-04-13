package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1 , 0};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max){ // if there is a number greater than the current number;
                max = numbers[i];// assigning the greater variable to max value
            }

        }
        System.out.println(max);



    }
}
