package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your gender");
        String gender = input.next();
        input.nextLine();
        System.out.println("Enter your fullName");
        String fullName = input.nextLine();
        System.out.println("Enter your phone number");
        long phoneNumber = input.nextLong();
        System.out.println("Enter your zipcode");
        int zipcode = input.nextInt();
        input.nextLine();
        System.out.println("Enter your school name");
        String school = input.nextLine();
        System.out.println("Enter your city name");
        String city = input.nextLine();
        System.out.println("Enter your state name");
        String state = input.next();
        System.out.println("Enter your building number");
        int buildingNo = input.nextInt();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("zipcode = " + zipcode);
        System.out.println("school = " + school);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("buildingNo = " + buildingNo);

        input.close();









    }


}
/*
	1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int)
			2. Enter your gender (String- One word ONLY)
			3. Enter your full name (String- Multiple words)
			4. Enter your phone number (long)
			5. Enter your zip code (int)
			6. Enter your School name (String- Can be Multiple words)
			7. Enter your city name (String- Can be Multiple words)
			8. Enter your state name (String- One word ONLY)
			9. Enter your building number (int)
 */