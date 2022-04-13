package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementstoArray_Overloading {
    public static void main(String[] args) {

        int[] numbers = {2,3,4,5};

        numbers = addElement(numbers, 7);
        System.out.println(Arrays.toString(numbers));

        String[] names = {"ZEYNEP", "SENA", "ESRA"};

        names = addElement(names, "ELİF");
        System.out.println(Arrays.toString(names));

        char[] chars = {'a', 'b'};
        chars= addElement(chars, 'c');

        System.out.println(Arrays.toString(chars));








    }

    //create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length+1];

        int i =0;
        for (int each:array) {
            result[i++] += each;
        }
        result[i]  = element;

        return result;
    }

    //create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length+1];

        int i =0;
        for (double each:array) {
            result[i++] += each;
        }
        result[i]  = element;

        return result;
    }

    //create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array, String element){
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
    public static char[] addElement(char[] charArray, char element){
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
