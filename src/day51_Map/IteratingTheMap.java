package day51_Map;

import java.util.*;

public class IteratingTheMap {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",70);

      /*
       Set<String> keys= students.keySet();
        for (String eachKey : keys) {
         //   System.out.println(eachKey +" : " + students.get(eachKey));
          //  students.replace(eachKey, students.get(eachKey)+5);
          Integer eachValue= students.get(eachKey);
          if(eachValue<90){
              students.remove(eachKey);
          }
        }

        System.out.println(students);

*/

        System.out.println(students);

        Map<String, Integer> earlyBirds = new HashMap<>();
        Map<String, Integer> angryBirds = new HashMap<>();

        for (String key : students.keySet()) {
            Integer value =students.get(key);
            if(value>=90){
                earlyBirds.put(key,value);
            }else{
                angryBirds.put(key,value);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        Set<String> names = students.keySet();

        System.out.println("-----------------------------------------------");

        List<Integer> scores= new ArrayList<>(students.values());
        System.out.println(scores);
        for (Integer value : scores) {
            System.out.println(value);
        }

        System.out.println("-----------------------------------------------");

        int maxScore = Collections.max(students.values());
        int minScore = Collections.min(students.values());


    /*
    int maxScore= Integer.MIN_VALUE;
        int minScore =Integer.MAX_VALUE;
        for (Integer score : students.values()) {
            if(score>maxScore){
                maxScore=score;
            }

            if(score<minScore){
                minScore=score;
            }

        }
     */

        System.out.println("minScore = " + minScore);
        System.out.println("maxScore = " + maxScore);

       for (Map.Entry<String, Integer> entry: students.entrySet()){

       }

    }
}
