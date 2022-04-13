package day11_Switch_Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        int n = 3;
        String word = "";

        switch (n){
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
            default:
                word = "Invalid Number";

        }
        System.out.println(n + " = " + word);






    }

}
