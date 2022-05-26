package day52_Map_FunctionalInterface;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str= "aabccdeeeef";

        String[] arr = str.split("");

        Map<String , Integer> result = new  LinkedHashMap<>(); //we are using linkedhashmap because it follows the insertion order

        for (String each : arr) {
                int frequency = Collections.frequency(Arrays.asList(arr), each);

                if(frequency==1){
                    result.put(each,1);
                }

        }

        System.out.println(result);










    }
}
