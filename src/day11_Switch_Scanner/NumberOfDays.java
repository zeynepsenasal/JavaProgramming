package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int number = 2;
        int year = 2020;
        String result= "";

        if (number >= 1 && number <= 12) {

            switch (number) {
                case 2:
                    result = (year%4==0)? "28 Days" : "29 Days";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30 Days";
                    break;
                default:
                    result ="31 Days";


            }
        } else {
            System.out.println("Invalid Number");
        }

        System.out.println(result);
    }
}
