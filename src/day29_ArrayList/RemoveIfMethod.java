package day29_ArrayList;

import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

         /*
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %2 != 0 ){
                list.remove(i);
            }
        }
*/
        System.out.println(list);

        list.removeIf(p -> p < 5); //Lambda Expression

        System.out.println(list);

        System.out.println("------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list2.removeIf(each -> each%2==0);

        System.out.println(list2);

        System.out.println("------------------------------------");

        ArrayList<String> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList("Java", "Phyton", "Java Script", "C#", "Java", "Java"));

        list3.removeIf(each -> each.startsWith("J"));

        System.out.println(list3);

        System.out.println("------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Anna", "level", "Eye", "Java", "Cydeo", "Phyton"));

        names.removeIf(name -> StringUtility.isPalindrome(name)); //removes if its palindrome

        System.out.println(names);

    }
}
