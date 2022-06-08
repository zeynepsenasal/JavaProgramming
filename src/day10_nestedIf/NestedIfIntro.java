package day10_nestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 400;
        if (score >= 0 && score <= 100) { //if the score is valid
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");}
            }else{ //if the score is not valid
                System.out.println("Invalid Score");

        }
        System.out.println("--------------------------------");

        int age = 25;
        boolean hasID = true;

        if(hasID) { //if the person has ID
            if (age >= 21) { //if the person is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            } else { //if the person iss less than 21 years old
                System.out.println("Not eligible to buy alcohol");
            }
        }else { //iif the person has not an ID
            System.out.println("You must have an ID to buy an Alcohol");

        }

        System.out.println("-----------------------------------");

        int number = 7;

        if(number>=1 && number<=7){ //if the number is valid
            if(number==1){
            System.out.println("Monday");
            }else if(number==2){
                System.out.println("Tuesday");
            }else if(number==3){
                System.out.println("Wednesday");
            }else if(number==4){
                System.out.println("Thursday");
            }else if(number==5){
                System.out.println("Friday");
            }else if(number==6){
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }

        }else { //if the number is not valid
            System.out.println("Invalid Number");

        }






    }
}