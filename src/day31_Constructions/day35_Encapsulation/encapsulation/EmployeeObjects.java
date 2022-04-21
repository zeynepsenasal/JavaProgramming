package day31_Constructions.day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tatiana", 'F', 30, 2000);

        System.out.println(employee1);

        employee1.setAge(32);

        System.out.println(employee1);


        Employee employee2 = new Employee("Zeynep", 'F', 24, 2000);

        employee2.setSalary(employee2.getSalary() +1500);

        System.out.println(employee1);




    }
}
