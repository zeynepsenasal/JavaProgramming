package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Josh";
        int age = 38;
        String citizen = "USA";
        boolean isEligible = age>=21 && citizen == "USA";

        if(isEligible){
            System.out.println("Eligible"); //True, it is printed
        }
        if(!isEligible){
            System.out.println("Not Eligible"); //False, not printed
        }
    }

}
