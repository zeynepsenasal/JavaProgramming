package day42_Exceptions;

public class DisadvantagesOfThrowsKeyword {


    public static void main(String[] args){

        System.out.println("Hello");

     //   sleep(2.5); //throws

        System.out.println("Hello Cydeo");
        System.out.println("----------------------------------------");
        System.out.println("Hello");

        MorningWorkOut.sleep(25); //try&catch
        System.out.println("Hello World");

    }








    public static void sleep(double seconds) throws InterruptedException {


        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}