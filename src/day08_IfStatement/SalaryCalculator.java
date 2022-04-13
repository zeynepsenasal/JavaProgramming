package day08_IfStatement;

import org.w3c.dom.ls.LSOutput;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 50,
                weeklyRate = 45;
        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;

        int salaryBeforeTax = hourlyRate * weeklyRate * 52;
        double stateTax = salaryBeforeTax * stateTaxRate /100;
        double federalTax = salaryBeforeTax * federalTaxRate /100;
        double  totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("state Tax is: $" + stateTax);
        System.out.println("Federal Tax is: $" + federalTax);
        System.out.println("Total Tax is:. $" + totalTax);
        System.out.println("salary After Tax is: $" + salaryAfterTax);
    }


}
