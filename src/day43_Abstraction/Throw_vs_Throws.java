package day43_Abstraction;

import java.util.Scanner;

public class Throw_vs_Throws {
    public static void main(String[] args) {
        System.out.println("Enter your score: ");
        int score= new Scanner(System.in).nextInt();

        if(score<0|| score>100){
            throw new RuntimeException("Invalid Score" + score);
        }
        if(score>=90){
            System.out.println("A");
        }else if(score>=80){
            System.out.println("B");
        }



    }

    public static void method1 () throws InterruptedException{
        Thread.sleep(5000);
    }

}
