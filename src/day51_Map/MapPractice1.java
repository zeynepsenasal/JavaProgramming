package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {
        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        //update the 'M' to male and 'F' to female
     /*
        for (String key : employeeMap.keySet()) {
            if(employeeMap.get(key).equalsIgnoreCase("m")){
                employeeMap.replace(key,"Male");
            }
            if(employeeMap.get(key).equalsIgnoreCase("f")){
                employeeMap.replace(key, "Female");
            }
        }

      */

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if(entry.getValue().equalsIgnoreCase("m")){
                entry.setValue("Male");
            }else if(entry.getValue().equalsIgnoreCase("f")){
                entry.setValue("Female");
            }
        }

        System.out.println(employeeMap);


        System.out.println("-------------------------------------------------------");

        //Display the name of female employees

        for (Map.Entry<String, String> eachPair : employeeMap.entrySet()) {
            if(eachPair.getValue().equalsIgnoreCase("female")){
                System.out.println(eachPair.getKey());
            }
        }

    }
}
