package day22_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDimentionalArraysIntro {
    public static void main(String[] args) {

        String[] group1 = {"Jon", "Joes", "Jonas"};
        String[] group2 = {"Aeron", "Shay", "Tom"};
        String[] group3 = {"Ayca", "Miley", "Tim"};

        String[][] groups = new  String[3][];

        groups[0] =group1;
        groups[1] =group2;
        groups[2] =group3;

        System.out.println(Arrays.toString(groups)); // toString method is for single-dimentional arrays

        System.out.println(Arrays.deepToString(groups)); //deepToString method is for multi-dimentional arrays

        System.out.println("----------------------------------------------------------------------------------");

    //index of elements: 0  1 2    0 1 2    0 1 2 3 4 5 6
        int[][] arr2D = {{1,2,3}, {2,3,5}, {8,9,10,11,14,15}};
        //      index:      0       1             2

        System.out.println(Arrays.deepToString(arr2D));

            // 2,3,5
        System.out.println(Arrays.toString(arr2D[1]));

            //11
        System.out.println(arr2D[2][3]);



    }
}
