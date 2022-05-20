package day49_Collections;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        String[] arr = {"wodeen spoon", "book", "phone","wodeen spoon","wodeen spoon" };

        Set<String> set1 = new HashSet<>(Arrays.asList(arr));

        System.out.println(set1); //removed the duplications

     arr= set1.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,100,100,200,100,30,10,20,100,200,200,100,20,10));

        list = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println(list);

        String[] array = {"A", "B", "C", "D"};

        Set<String> s = new LinkedHashSet<>(Arrays.asList(array)); //accepts the collection type

        System.out.println("--------------------------------------------");

        Integer[] nums = {1,1,1,1,1,1,2,2,2,2,2,3,3,3,3,4,4,4,5,5,5,6,6,6,7,8,8};

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));

        System.out.println("-----------------------------------------");
        String str = "aaabbbbcccdddeeeeeeeffff";

        String result="";

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
           result += each+Collections.frequency(Arrays.asList(str.split("")), each);;
        }

        System.out.println(result);


        System.out.println("-----------------------------------");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Ahmet", "Zeynep"));

        System.out.println(names.toArray(new String[0])[2]);





    }
}
