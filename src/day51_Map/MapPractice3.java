package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 145000);
        map.put("Josh", 145000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        //    1.4 display the names of all the employees who has the max and min salary
        String name1="";
        int maxSalary = Integer.MIN_VALUE;

        for (Integer eachValue : map.values()) {
            if(eachValue>maxSalary){
                maxSalary=eachValue;
            }
        }
        System.out.println("maxSalary = " + maxSalary);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if(pair.getValue() == maxSalary){
                System.out.println(pair.getKey());
            }
        }

    }
}
