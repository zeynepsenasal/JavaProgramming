package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        String[] group1 = {"Zeynep", "Sena", "Ayşe", "Nur", "Emine"}; //5
        String[] group2 = {"Maria", "Duygu", "Ahmet", "Mehmet", };//4

        String[] students = new String[group1.length + group2.length];

        int i = 0;

        for (String each:group1) {
            students[i] = each;
            i++;
            
        }
        for (String each:group2) {
            students[i] = each;
            i++;
        }

        System.out.println(Arrays.toString(students));

        System.out.println("-------------------------------------------------");

        char[] ch = {'A', 'B', 'C', 'D', 'E'};
        char[] ch2 = {'A', 'B', 'C'};

        char[] characters = new char[ch.length + ch2.length];

        int j =0;

        for (char each: ch) {
            characters[j++] = each;
        }

        for (char each: ch2) {
            characters[j++] = each;
        }

        System.out.println(Arrays.toString(characters));


    }
}
