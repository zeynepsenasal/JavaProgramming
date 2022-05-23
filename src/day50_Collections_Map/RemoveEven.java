package day50_Collections_Map;

import java.util.*;

public class RemoveEven {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,30,400,200,5,6,8,7,3,1,89,77,45,35));

       // set.removeIf(each->each%2==0);

     Iterator<Integer> it= set.iterator();

     while (it.hasNext()){
         if(it.next()%2==0){
             it.remove();
         }
     }

        System.out.println("set = " + set);

    }

}
