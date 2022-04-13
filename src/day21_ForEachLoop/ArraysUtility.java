package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] scores = {80, 90, 55, 65, 75, 100};

        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores); //sorting

        System.out.println(Arrays.toString(scores));
        System.out.println("Max score: " + scores[0]);
        System.out.println("Min score: " + scores[scores.length-1]);

        String[] names = {"Anna", "Ahmet", "Zuhal", "Zeynep", "Yasemin", "Maria", "Ebru"};

        Arrays.sort(names); //sorts according to the alphabetic order (in ascii table)

        System.out.println(Arrays.toString(names));

        System.out.println("------------------------------------------------------");

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);

        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1,arr2); //checking if its anagram

        System.out.println("------------------------------------------------------");

        char[] ch1 = {'a', 'b', 'c'};
        char[] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean isAnagram = Arrays.equals(ch1, ch2);

        System.out.println("isAnagram = " + isAnagram);







    }
}
