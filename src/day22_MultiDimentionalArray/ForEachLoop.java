package day22_MultiDimentionalArray;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        /*
        for (int[] Each1DArray : arr2D) {

            for (int eachElement:Each1DArray) {
                System.out.println(eachElement);
            }

        }

         */

        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.print(eachElement + " ");
            }
        }













    }
}
