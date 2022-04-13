package day12_Scanner;

import java.util.Scanner;

public class ScannerPractise3_NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();
        System.out.println("Enter your programming language");
        String language = scan.nextLine();
        System.out.println("Enter your age");
        int age = scan.nextInt();

        scan.nextLine(); //captures the Enter key

        System.out.println("Enter your school name"); //before this nextLine, one more nextLine should be given
        String schoolName = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("language = " + language);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        scan.close();




    }
}
