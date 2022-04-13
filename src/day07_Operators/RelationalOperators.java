package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >, >=, <, <=

        boolean result1= 20 > 40;
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150; //true
        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100; // true
        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500; //false
        System.out.println("result4 = " + result4);

        int creditscore = 745;
        boolean isEligibileforLoan = creditscore >= 720;

        int score = 59;
        boolean hasFailed = score <= 59;
        System.out.println("hasFailed = " + hasFailed);

        int x = 100;
        int y = 200;
        boolean equal = x == y; //false

        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Guy"; //false
        System.out.println("result8 = " + result8);

        boolean result9 = "A" == "a"; //false
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java"; //true
        boolean result11 = "Java" == "Java     "; //false

        System.out.println("-----------------------------------");
        boolean result12 = 100 != 200; //true
        System.out.println("result12 = " + result12);



    }
}
