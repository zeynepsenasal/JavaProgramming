package day50_Collections_Map;

import java.util.*;

public class IterablePractice2 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "ahmed", "aHmeD", "John", "Eron", "Mohamed", "ahmed", "Ahmed", "Julia", "Chris"));

        names.removeIf(each-> each.equalsIgnoreCase("ahmed"));

        System.out.println("names = " + names);



        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Ahmed", "ahmed", "aHmeD", "John", "Eron", "Mohamed", "ahmed", "Ahmed", "Julia", "Chris"));

        Iterator<String> it2 = names2.iterator();

        while (it2.hasNext()){
            if(it2.next().equalsIgnoreCase("ahmed")){
                it2.remove();
            }
        }
        System.out.println("names2 = " + names2);

        System.out.println("---------------------------------------------");

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,100,90,80,5,6,7,7,8,9,10));

        Iterator<Integer> q =set.iterator();

        while(q.hasNext()){
            if(q.next()%2==0){
                q.remove();
            }
        }
        System.out.println("set = " + set);

    }
}
