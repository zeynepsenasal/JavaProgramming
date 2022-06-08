package InterviewQuestions.Array;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        String[] group1 = {"Zeynep", "Sena", "Ayşe", "Nur", "Emine"}; //5
        String[] group2 = {"Maria", "Duygu", "Ahmet", "Mehmet", };//4

        String[] mergeGroup = new String[group1.length+group2.length];

     int x=0;

        for (String each : group1) {
            mergeGroup[x]=each;
            x++;
        }
        for (String each : group2) {
            mergeGroup[x]=each;
            x++;
        }

        System.out.println("Arrays.toString(mergeGroup) = " + Arrays.toString(mergeGroup));

    }
}
