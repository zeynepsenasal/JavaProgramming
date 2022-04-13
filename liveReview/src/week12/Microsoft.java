package week12;

public class Microsoft {
    public static void main(String[] args) {
        Employee[] employees ={
                new Employee("Ahmet", "SDET", 123, 1500),
                new Employee("Zeynep", "QA", 321, 2500),
                new Employee("Dilek", "Dev", 198, 3000),
                new Employee("Ahmet", "SDET", 111, 1500)
        };

       double maxSalary = Double.MIN_VALUE;
        for (Employee each: employees) {
            if(each.salary>maxSalary){
                maxSalary= each.salary;
            }

        }

        System.out.println("maxSalary = " + maxSalary);




    }
}
