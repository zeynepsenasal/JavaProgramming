package day30_CustomClasses;

import java.util.ArrayList;

public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("Zeynep", "123A", 'F', "Lawyer", 3000, true);
        employee2.setInfo("Ahmet", "12345", 'M', "Accountant", 1000, false);
        employee3.setInfo("Ayşe", "444", 'F', "Secratary", 2500, true);
        employee4.setInfo("Valerie", "505001", 'F', "Translator", 1500, false);
        employee5.setInfo("Mehmet", "88801", 'M', "Developer", 5000, true);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};

        ArrayList<Employee> fullTimeEmployees = new ArrayList<>();

        double max = employees[0].salary;
        double min = employees[0].salary;


        for(Employee each : employees){
            if(each.isFullTime){
                fullTimeEmployees.add(each);
            }

            if(each.salary>max){
                max = each.salary;
            }

            if(each.salary<min){
                min= each.salary;
            }

        }

        System.out.println("fullTimeEmployees = " + fullTimeEmployees);
        System.out.println("min = " + min);
        System.out.println("max = " + max);





    }
}
