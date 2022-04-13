package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your username");
        String u = scan.next();
        System.out.println("enter your password");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("Logged In");
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println("Incorrect, please re-enter.");
                System.out.println("enter your username");
                u = scan.next();
                System.out.println("enter your password");
                p = scan.next();

                if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                    System.out.println("Logged In");
                    break;
                }

            }
            if (!(u.equals("Cydeo") && p.equals("Cydeo123"))) {
                System.err.println("Your account is locked");


            }


        }

    }
}

