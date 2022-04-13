package day18_NestedLoop.day24_CustomMethods_Return;

public class ReturnStatement {
    public static void main(String[] args) {
        nameOfDay(10);

    }

    public static void nameOfDay(int number) {

        if (number > 7 && number < 1) {
            System.out.println("Invalid");
            return; // exits the nameOfDay method
        }
        switch (number) {
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

        }


    }

}
