package day17_While_DoWhile;

import java.util.Scanner;

public class MarryMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer = scan.next();

        while (!(answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("no"))){
            System.out.println("invalid answer, please re-enter");
            answer = scan.next();
        }

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Congrats");
        }else if(answer.equalsIgnoreCase("no")){
            System.out.println("Goodbye");
        }
        scan.close();

    }
}
