package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age = 19;
        String citizen = "USA";
        boolean isEligible = age >= 18 && citizen == "USA";

        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("-------------------------");

        String name2= "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 4000;

        boolean isEligible2 = creditScore >= 700 && age2>= 21 && income >= 800;

        System.out.println(name2 + " is eligible for loan: " + isEligible2);

        System.out.println("----------------------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age3 >=18 && (gender =='M' || gender == 'F');

        System.out.println("--------------------------------------------");

        String name4 = "Zeynep";
        String countryOfBirth = "Germany";
        boolean mariedToAUSCitizen = false;
        boolean isEligible4 = countryOfBirth == "USA" || mariedToAUSCitizen == true;

        System.out.println("Zeynep is eligible to be a US Citizen: " + isEligible4 );

        System.out.println("----------------------------------");

        String student = "Anna";
        double GPA = 3.5;
        int familyIncome = 10_0000;
        boolean isEligible5 = GPA >= 3.5 || familyIncome <= 1000000;

        System.out.println(student + " is Eligible to get a scolarship: " + isEligible5);





    }
}
