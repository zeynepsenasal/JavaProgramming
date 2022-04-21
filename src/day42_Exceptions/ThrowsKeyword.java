package day42_Exceptions;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {
        //throws --> ONLY FOR CHECKED EXCEPTIONS

        System.out.println("--------------Test 1 Started----------------");

        System.out.println("Hello");
        Thread.sleep(200);
        System.out.println("Cydeo");


        System.out.println("--------------Test 1 Completed----------------");

        System.out.println("--------------Test 2 Started----------------");

        System.out.println("Hello");
        Thread.sleep(200);
        System.out.println("Batch 25");

        System.out.println("--------------Test 2 Completed----------------");
    }
}
