package day06_PrimitiveTypeCastings.day10_nestedIf;

public class Loans {
    public static void main(String[] args) {
        int salary = 2500;
        int creditScore = 650;

        String result = (creditScore>=650 && salary>=60000)? "Loan Approved" : "Loan Denied";

        System.out.println(result);








    }
}
/*
Create a class called Loans, Given two variables salary and credit score,
 use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */