package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        int number = 8;

        switch (number){
            case 1:
                System.out.println("Monday");
                break;//exits the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break; //exits the switch after executing the case block
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }
// DK: 2:26!!


    }
}
