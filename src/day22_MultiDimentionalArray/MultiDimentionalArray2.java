package day22_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDimentionalArray2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};

        int[][] arr2D = {{1,2,3},{4,5,6},{7,8,9}};

        //3 Dimentional arrays contains 2d arrays


        //                    0        1       2           0           1         2
        int[][][] arr3d = {{{1,2,3},{4,5,6},{7,8,9}}, {{10,20,30},{40,50,60},{70,80,90}}};
        //                             0                             1

        System.out.println(Arrays.deepToString(arr3d));

        System.out.println(Arrays.deepToString(arr3d[1]));

        System.out.println(Arrays.toString(arr3d[1][1]));

        System.out.println(arr3d[0][2][2]); //60

        for (int[][] each2D : arr3d) {
            for (int[] each1D : each2D) {
                for (int eachElement : each1D) {
                    System.out.println(eachElement);
                }
            }
        }
        System.out.println("----------------------------------------");

        int[][][][] arr4D = {{{{1,2,3},{4,5,6},{7,8,9}}, {{10,20,30},{40,50,60},{70,80,90}}}};
//                                                         0

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int eachElement : each1D) {
                        System.out.println(eachElement);
                    }
                }
            }
        }

    }
}
