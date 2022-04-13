package day14_StringPractiseTasks2;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an account number");
        String accountNumber = scan.nextLine();

        if(accountNumber.length()==7||accountNumber.length()==10) {

            if (accountNumber.charAt(0) == '2') {
                boolean valid = accountNumber.length() == 7;
                if(valid){
                    System.out.println("valid");
                }
            } else if (accountNumber.charAt(0) == '5') {
                boolean valid = accountNumber.length() == 10;
                if(valid){
                    System.out.println("valid");
                }
            } else {
                System.out.println("Invalid Account Number");

            }
        }else {
            System.out.println("Invalid Account Number");
        }
        scan.close();

    }
}
/*
Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
 */