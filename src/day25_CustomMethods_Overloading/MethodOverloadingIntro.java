package day25_CustomMethods_Overloading;

public class MethodOverloadingIntro {
    public static void main(String[] args) {
        int[] intArray = {5,4,7,8,1,-1};

        double[] doubleArray = {9.2, 2.5, 5.6, 7.8};

        char[] charArray = {'d', 'b', 'c', 'a'};

    }

    public static int sumOfNumbers(int num1, int num2){
        return num1 + num2;
    }
    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static int sumOfNumbers(int num1, int num2, int num3, int num4){
        return sumOfNumbers(num1, num2, num3) + num4;
    }

    public static double sumOfNumbers(double num1, double num2){
        return num1 + num2;
    }
    public static double sumOfNumbers(double num1, double num2, double num3){
        return sumOfNumbers(num1,num2)+num3;
    }


    }


