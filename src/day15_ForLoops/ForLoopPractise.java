package day15_ForLoops;

public class ForLoopPractise {
    public static void main(String[] args) {

        for(int i = 15; i<=45; i++){
            System.out.print(i + " ");
        }

        System.out.println("-----------------------------------");

        for(int i = 100; i>=50; i--){ // 100, 99, 98 .... 50
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("------------------------------------------");

        //print all the even numbers between 1~55

        for(int i =1; i<=55; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("------------------------------------------");

        //print all the even numbers between 1~55

        for(int i = 2; i<=55; i += 2){
            System.out.print(i + " ");
        }

        int opt = 1;

        switch (opt){
            case 1 :
                System.out.println("true");
            default:
                System.out.println("false");
        }











    }
}
