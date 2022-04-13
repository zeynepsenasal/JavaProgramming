package day22_MultiDimentionalArray;

public class IteratingMultiDimentionalArray2 {
    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        for (int i = arr2D.length - 1; i >= 0; i--) { //index number of arrays starting from the last index

            for (int j = 0; j < arr2D[i].length; j++) { //index number of elements starting from zero
                System.out.print(arr2D[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < arr2D.length; i++) { //index number of arrays starting from the last index

            for (int j = arr2D[i].length - 1; j >= 0; j--) { //index number of elements starting from zero
                System.out.print(arr2D[i][j] + " ");

            }
            System.out.println();

        }

        System.out.println("--------------------------------------------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) { //index number of arrays starting from the last index

            for (int j = arr2D[i].length - 1; j >= 0; j--) { //index number of elements starting from zero
                System.out.print(arr2D[i][j] + " ");

            }
            System.out.println();


        }
    }
}
/*
task1:
9 10 11 12 13
4 5 6 7 8
1  2 3

task2:
3 2 1
8 7 6 5 4
13 12 11 10 9

task3:
13 12 11 10 9
8 7 6 5 4
3 2 1
 */