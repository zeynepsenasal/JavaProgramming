package day12_Scanner;

import java.util.Scanner;

public class ScannerPractise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1-7: ");
        int num = scan.nextInt();

        String result = "";

        if(num>=1 && num<=7){
            switch (num){
                case 1:
                    result = "Monday"; break;
                case 2:
                    result = "Tuesday"; break;
                case 3:
                    result = "Wednesday"; break;
                case 4:
                    result = "Thursday"; break;
                case 5:
                    result = "Friday"; break;
                case 6:
                    result = "Saturday"; break;
                case 7:
                    result = "Sunday"; break;
            }

        }else {
            result = "Invalid";
        }

        System.out.println(result);

        scan.close();









    }
}
