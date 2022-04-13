package day20_Arrays;

public class AvarageNumbers {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 50, 80, 10};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double averageNumber = sum/numbers.length;

        System.out.println("averageNumber = " + averageNumber);


    }
}
