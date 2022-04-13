package day21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 50, 80, 2, 3, 5};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = sum/numbers.length;

        System.out.println(average);

    }
}
