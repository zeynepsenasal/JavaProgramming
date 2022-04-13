package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = -25;

        int a = 5;
        ++a; //pre increment: increase the value by 1 right away
        System.out.println("a = " + a); //6

        --a; // pre decrement: decreases the value by 1
        System.out.println(a);
        System.out.println("-----------------------------");

        int b = 100;

        System.out.println(++b); //pre increment increase the value by 1 IMMIDIATELY

        int c= 100;
        System.out.println(c++); //post increment: first passes the current value, then increases; increases the value by 1 IN THE NEXT STEP
        System.out.println(c); // 101

        System.out.println("----------------------------------------");

        int x = 200;
        System.out.println(--x); // pre decrement : 199 decreases the value RIGHT AWAY


        int y = 200;
        System.out.println(y--); // post decrement: it passes the current value,
        // it increases the value in the NEXT STEP
        System.out.println(y); //199

        System.out.println("---------------------------------------");
        int z = 45;
        System.out.println(++z); //46
        System.out.println(z++); //45
        System.out.println(z); //46

        int q = 30;
        System.out.println(--q); //29
        System.out.println(q--); // 29 (because we decreased before)
        System.out.println(q); //28


    }
}
