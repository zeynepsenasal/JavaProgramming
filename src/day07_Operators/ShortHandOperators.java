package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        //asignment: =
        int number = 100;
        System.out.println("number = " + number); //100

        number = 200; // updating the value
        System.out.println("number = " + number); //200

        String word = "Java Programming";
        System.out.println("word = " + word);
        word = "Wooden Spoon";
        System.out.println("word = " + word); //wooden spoon

        //Addition assignment:
        int x = 100;
        System.out.println("x = " + x);

       // x = x+ 200;
        x += 200; //adds the assignment
        System.out.println("x = " + x);

        String str = "Wooden";

        str += " Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;

        num1 += 5.5;
        System.out.println("num1 = " + num1); // 8.0

        double availableBalance = 1000.50;
        availableBalance += 300;
        System.out.println("availableBalance = " + availableBalance); // 1300.50;
        
        // withdrawing 500$

        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);

        // withdrawing 200$ and depositing 400$
        availableBalance += 200;
        availableBalance -= 400;

        System.out.println("availableBalance = " + availableBalance);

        double salary = 50000.5;
        salary *= 2;
        System.out.println("salary = " + salary);
        
        double num2 = 250.5;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("-------------------------------");

        double num3 = 100;
        num3 %= 3; //1
        System.out.println("num3 = " + num3);

        System.out.println("------------------------------------");

        int amount = 127;
        int quarters = 127/25;
        int cents = 127%25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        System.out.println("----------------------------------");

        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);
    }
}
