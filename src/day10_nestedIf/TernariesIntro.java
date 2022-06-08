package day10_nestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 100;

        if(n%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

        System.out.println("-----------------------------");
        String result1 = (n%2==0)? "Even" : "Odd" ;

        System.out.println(result1);

        System.out.println("-----------------------------");
        int age = 23;

       String result2 = (age>=21)? "Eligible" : "Not Eligible";
        System.out.println(result2);

        System.out.println("-----------------------------");

        int number = 100;

      String result3 =  (number>0)? "Positive" :(number<0)? "Negative" : "Zero";

        System.out.println(result3);




    }
}
