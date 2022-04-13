package day22_MultiDimentionalArray;

import java.util.Arrays;

public class IteratingMultiDimentionalArray {
    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3}, {2,3,5}, {8,9,10,11,14,15}};

        for (int i = 0; i < arr2D.length; i++) { // i: index numbers of single dimentional array
            // System.out.println(Arrays.toString(arr2D[i]));

            for (int j = 0; j < arr2D[i].length ; j++) { j: //index of the elements
                System.out.println(arr2D[i][j]);
            }
        }


        
    }
}
