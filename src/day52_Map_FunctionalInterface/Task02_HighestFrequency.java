package day52_Map_FunctionalInterface;

import java.util.*;

public class Task02_HighestFrequency {
    /*
    Write a program that can find the element that has the highest frequency in an arrayList
	        Note: Must use a map

	        Ex:
	            list: [java, java, python, c#]

	        output:
	            [java=2, python=1, c#=1]
	            element java has the highest frequency
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("java", "java", "python", "python","python", "c#"));

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            map.put(each, frequency);
        }

        System.out.println(map);

        int max = Integer.MIN_VALUE;
        String maxFr ="";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if(entry.getValue()>max){
                max= entry.getValue();
                maxFr= entry.getKey();
            }
        }

        System.out.println("element " + maxFr + " has the highest frequency");

    }




}
