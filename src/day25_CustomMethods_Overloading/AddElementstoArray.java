package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementstoArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        arr = addInteger(arr, 5);
        System.out.println(Arrays.toString(arr));

        double[] arr2 = {1.2, 2.5, 20.5};

        arr2 = addDouble(arr2, 4.5);
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = {"Cydeo", "Cybertek"};

        arr3 = addString(arr3, "Phyton");
        System.out.println(Arrays.toString(arr3));

        char[] arr4 = {'a', 'b'};
        arr4 = addChar(arr4, 'Z');
        System.out.println(Arrays.toString(arr4));

    }
//create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int[] addInteger(int[] array, int element){
        int[] result = new int[array.length+1];

        int i =0;
        for (int each:array) {
            result[i++] += each;
        }
        result[i]  = element;

        return result;
    }

//create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addDouble(double[] array, double element){
        double[] result = new double[array.length+1];

        int i =0;
        for (double each:array) {
            result[i++] += each;
        }
        result[i]  = element;

        return result;
    }

//create a return method called addString that can add a String after the last index of a String array
public static String[] addString(String[] array, String element){
    String[] result = new String[array.length+1];

    int i =0;
    for (String each:array) {
        result[i] = each;
        i++;
    }
    result[i]  = element;

    return result;
}

// create a return method called addChar that can add a char after last index of a char array
public static char[] addChar(char[] charArray, char element){
        char[] result = new char[charArray.length+1];

        int i = 0;
    for (char each:charArray) {
        result[i] += each;
        i++;
    }
    result[i] = element;
    return result;

}





}
/*
1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array
 */