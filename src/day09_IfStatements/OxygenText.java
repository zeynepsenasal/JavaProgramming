package day09_IfStatements;

public class OxygenText<level> {
    public static void main(String[] args) {
        int level = 70;

        if (level > 90) {
            System.out.println("Above 90 - Tank is Full");
        } else if (level > 80) {
            System.out.println("Above 80 - Still Okay");
        } else if (level > 70) {
            System.out.println("Above 70 - Don't go Too Far");
        } else if (level > 60) {
            System.out.println("Above 60 - Start to head back");
        } else if (level > 50) {
            System.out.println("Above 50 - Be careful now you at %50");
        } else {
            System.out.println("DANGER");
        }
    }
}
/*

4. Create a class called OxygenTank. You are diving in the ocean.
Your oxygen tank has a certain level (number) and you must print a message
 based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */