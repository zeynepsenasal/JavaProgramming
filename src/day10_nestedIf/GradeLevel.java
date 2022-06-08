package day10_nestedIf;

public class GradeLevel {
    public static void main(String[] args) {

        byte n = 5;
        String result;


        if (n >= 1 && n <= 18) {
            result = (n <= 5) ? "Elementary School" : (n <= 8) ? "Middle School"
                    : (n <= 12) ? "High School" : (n <= 16) ? "College" : "Grad School";

        } else {
            result = "Invalid grade level";
        }
        System.out.println(result);
    }

}
/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given
 */