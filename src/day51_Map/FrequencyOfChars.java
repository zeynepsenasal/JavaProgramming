package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChars {
    public static void main(String[] args) {

    String str = "bbcccaaaaa";

       // output:
       // {b=2, c=3, a=5}

        //Collection.frequency() method

        Map<String, Integer> result = new LinkedHashMap<>();

       String[] arr = str.split("");

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr),each);
            result.put(each, frequency);
        }

        System.out.println(result);


    }
}

/*
2. Write a program that can return the frequency of characters
        Not: MUST use map
        Ex: str = "bbcccaaaaa"
        output:
            {b=2, c=3, a=5}
 */
