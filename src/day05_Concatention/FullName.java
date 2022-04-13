package day05_Concatention;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Tamara";
        String lastName = "Watson";
        String fullName = firstName + " " + lastName;
        int age = 23;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        int salary = 3000;

        System.out.println("fullName = " + fullName);
        System.out.println("Full name of the person is " +fullName + ".");
        System.out.println(fullName + " is " + age + " years old.");

        //FullName is JobTitle, works at CompanyName and fullName's salary is ..
        System.out.println(fullName + " is " + jobTitle + ", works at "
                + companyName + " and " + fullName + "'s salary is $ " + salary );
    }
}
