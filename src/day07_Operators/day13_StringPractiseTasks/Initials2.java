package day07_Operators.day13_StringPractiseTasks;

import java.util.Scanner;

public class Initials2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your first name");
        String firstName = scan.nextLine();

        System.out.println("Enter your lastname");
        String lastName = scan.nextLine();

        String f = ("" + firstName.charAt(0)).toUpperCase();
        String l = ("" + lastName.charAt(0)).toUpperCase();

        System.out.println(f + "." + l);









    }




}
