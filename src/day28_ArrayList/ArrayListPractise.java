package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractise {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i = 0; i < list.size() ; i++) {
            list.set(i, list.get(i)*2);
        }

        System.out.println(list);

        System.out.println("------------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Zeynep");
        employees.add("Suat");
        employees.add("Selim");
        employees.add("Ayşe");
        employees.add("Fatma");
        employees.add("Hayriye");

        System.out.println(employees);

        employees.remove(3); //removes the index
        employees.remove("Zeynep"); //removes the object

        System.out.println(employees);


    }
}
