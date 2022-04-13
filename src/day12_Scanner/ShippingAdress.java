package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();
        System.out.println("Enter your building number");
        String buildingNo = scan.next();

        scan.nextLine(); //MUST- TO GIVE IT AN ENTER

        System.out.println("Enter your street name");
        String street = scan.nextLine();
        System.out.println("Enter your city name");
        String city = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.nextLine();
        System.out.println("Enter your zipcode");
        String zipcode = scan.next();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNo = " + buildingNo);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipcode = " + zipcode);

        scan.close();


    }


}
