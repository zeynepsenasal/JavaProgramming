package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class WarmUpTasks {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers, 0, numbers.size()-1);

        System.out.println(numbers);

        System.out.println("-----------------------------------------");
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,8,0,0,0,9,8));
        System.out.println(list);

        int size = list.size();

        list.removeAll(Arrays.asList(0));
        System.out.println(list);

        int newSize = list.size();

        int totalNumberOfZero = size-newSize;

        System.out.println("totalNumberOfZero = " + totalNumberOfZero);

        for (int i = 0; i < totalNumberOfZero; i++) {
            list.add(0);
        }
        System.out.println(list);

        System.out.println("-----------------------------------------");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,8,0,0,0,9,8));

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each: list2) {
            if(each!=0){
                result.add(each);
            }
        }

        for (Integer each: list2) {
            if(each==0){
                result.add(each);
            }
        }

        System.out.println(result);

     int number = 5;




    }
}
