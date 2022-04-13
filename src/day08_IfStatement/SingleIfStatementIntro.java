package day08_IfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number = 301;

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber;
        if (evenNumber) {
            System.out.println(number + " is even number"); //not printed because its false
        }
        if (!evenNumber) { //!:not even number (the opposite)
            System.out.println(number + " is odd number");
        }
        //SINGLE IF STATEMENT can be used  creating condition for 1 possible outcome

        System.out.println("--------------------------------------------");
        int n = 200;
        if(n > 0){
            System.out.println(n + " is positive");
        }
        if(n<0){
            System.out.println(n + " is negative"); //not printed because its false
        }
        if(n == 0){
            System.out.println(n + " is zero"); //not printed because its false
        }


    }
}
