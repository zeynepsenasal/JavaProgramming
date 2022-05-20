package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
    }
}
