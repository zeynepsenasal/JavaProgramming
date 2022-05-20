package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,8,9,10));

        //remove elements less that 4

        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i)<4){
                list.remove(i);
            }
        }
        System.out.println(list);

        System.out.println("====================================");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,2,3,10));

        //remove elements less that 4

       Iterator<Integer> it= list2.iterator();

     /*  boolean hasNext = it.hasNext();

        System.out.println("hasNext = " + hasNext);

        System.out.println(it.next());

        boolean hasNex2 = it.hasNext();

        System.out.println("hasNex2 = " + hasNex2);

        System.out.println(it.next());
*/

        while (it.hasNext()){
            if(it.next()<4){
                it.remove();
            }
        }

        System.out.println(list2);
        System.out.println("==================================================");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,2,3,10));

        list3.removeIf(each ->each<4);

        System.out.println(list3);

    }
}
