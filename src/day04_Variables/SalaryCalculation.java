package day04_Variables;

public class SalaryCalculation {
    public static void main(String[] args) {
        int hourlyRate = 50;
        int weeklyHours = 40;
        int salary = hourlyRate * weeklyHours * 52;

        //System.out.println(salary);
        System.out.println("weeklyHours = $ " + weeklyHours);
        System.out.println("hourlyRate = " + hourlyRate);
        System.out.println("salary = $" + salary);

    }
}
