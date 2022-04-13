package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(10);

        ageOfPerson(1998);

        printNumbers(10, 15);

    }

    //create a function that can display the number is odd or even
    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println(number + "is even number");
        }else{
            System.out.println(number + "is odd number");
        }
    }

    // create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){

        int age = 2022 - birthYear;

        System.out.println("Your age is " + age);

    }

    //create a function that can display the numbers between X and Y

    public  static void printNumbers(int X, int Y){
        for (int i = X; i <= Y; i++) {
            System.out.println(i);
        }
    }


}
