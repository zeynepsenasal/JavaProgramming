package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,3,3,4,5,6,4,5));

        System.out.println(set);

    //   Integer[] array= set.toArray(new Integer[0]);

        List<Integer> list= new ArrayList<>(set); //CONVERTING SET TO THE LIST

        System.out.println(list);

        System.out.println("-----------------------------------");

        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A','B', 'C', 'D'));

        System.out.println("chars = " + chars);

        ((Stack)chars).pop();

        System.out.println("chars = " + chars);



    }
}
