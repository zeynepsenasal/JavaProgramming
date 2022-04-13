package day14_StringPractiseTasks2;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your e-mail");
        String eMail = scan.nextLine();

        int underScore = eMail.indexOf("_");
        int at = eMail.indexOf("@");
        int dot = eMail.indexOf(".");
        String name = eMail.substring(0,underScore);
        String lastName = eMail.substring(underScore+1,at);
        String domain = eMail.substring(at+1, dot);

        System.out.println("First Name: "+ name + "\nLast Name: " + lastName + "\nDomain: " +domain);
        scan.close();
    }
}
/*
 Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple

 */