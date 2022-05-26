package day52_Map_FunctionalInterface;

//lambda: () -> {}

public class Test {
    public static void main(String[] args) {
        //create a function that can display if the num is odd
        MyFirstFunctionalInterface oddOrEvenNumber= (n) -> {
            if(n%2==0){
                System.out.println(n+ " is even number");
            }else{
                System.out.println(n+ " is odd number");
            }
        };

        oddOrEvenNumber.apply(20);

        MyFirstFunctionalInterface eligibleToBuyAlcohol = (age) -> {
            if(age>=18){
                System.out.println("You are eligible to buy Alcohol");
            }else{
                System.out.println("You are eligible to buy Alcohol");
            }

        };

        eligibleToBuyAlcohol.apply(17);

        MyFirstFunctionalInterface cubeOfNumber = (n) -> {System.out.println(n*n*n);};

        cubeOfNumber.apply(3);

    }
}
