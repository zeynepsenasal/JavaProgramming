package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "Phyton", "Cydeo", "Car", "Level", "Civic", "radar", "kayak", "revier"));

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String each= it.next();
            String reverse= "";

            for (int i = each.length()-1; i >=0 ; i--) {
                reverse += each.charAt(i) +"";
            }

            if(reverse.equalsIgnoreCase(each)){
              it.remove();
            }

        }

        System.out.println("list = " + list);


    }

}
