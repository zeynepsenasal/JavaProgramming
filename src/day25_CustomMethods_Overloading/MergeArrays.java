package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        String[] arr1 = {"Ayşe" , "Fatma"};
        String[] arr2 = {"Hayriye" , "Beriye"};

        int[] arrint1 = {1,2,4,5};
        int[] arrint2 = {3,4,5};

        char[] chars = {'a', 'b', 'c'};
        char[] chars2 = {'e','f', 'g'};

        String[] mergeString = merge(arr1,arr2);

        int[] mergeInt = merge(arrint1,arrint2);

        char[] mergeChars = merge(chars,chars2);

        System.out.println("mergeChars = " + Arrays.toString(mergeChars));
        System.out.println("mergeInt = " + Arrays.toString(mergeInt));
        System.out.println("mergeString = " + Arrays.toString(mergeString));

    }

    public static String[] merge(String[] arr1, String[] arr2) {
        String result[] = new String[arr1.length+arr2.length];
        int i =0;
        for (String each: arr1) {
            result[i++] = each;
        }
        for (String each: arr2) {
            result[i++] = each;
        }
        return result;
    }
    
    public static int[] merge(int[] arr1, int[] arr2) {
        int result[] = new int[arr1.length+arr2.length];
        int i =0;
        for (int each: arr1) {
            result[i++] += each;
        }
        for (int each: arr2) {
            result[i++] += each;
        }
        return result;
    }

    public static double[] merge(double[] arr1, double[] arr2) {
        double result[] = new double[arr1.length+arr2.length];
        int i =0;
        for (double each: arr1) {
            result[i++] += each;
        }
        for (double each: arr2) {
            result[i++] += each;
        }
        return result;
    }

    public static char[] merge(char[] arr1, char[] arr2) {
        char result[] = new char[arr1.length+arr2.length];
        int i =0;
        for (char each: arr1) {
            result[i++] += each;
        }
        for (char each: arr2) {
            result[i++] += each;
        }
        return result;
    }


}
