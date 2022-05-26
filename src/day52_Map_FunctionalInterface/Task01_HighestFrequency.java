package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task01_HighestFrequency {
    public static void main(String[] args) {
        /*
        	Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map

        Ex:
            str = "eeeeeaaabbbbccccdd"

        Output:
            {e=5, a=3, b=4, c=4, d=2 }
            character e has the highest frequency
         */
        String str = "eeeeeaaabbbbbbbbbbbbbbbbbbbbbccccdd";

        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String eachChar : arr) {
            int frequecny = Collections.frequency(Arrays.asList(arr), eachChar);
            result.put(eachChar,frequecny);
        }

        Integer max = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            if(entry.getValue()>max){
                max= entry.getValue();
            }

        }
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            if(entry.getValue()==max){
                System.out.println("Highest frequency: " + entry.getKey());
            }

        }



    }
}
