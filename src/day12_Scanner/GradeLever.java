package day12_Scanner;

public class GradeLever {
    public static void main(String[] args) {
        int age = 18;
        String result = "";

        if(age>=1 && age<=18){
            switch (age){
                case 6:
                    result = "Middle School"; break;
                case 7:
                    result = "Middle School"; break;
                case 8:
                    result = "Middle School"; break;
                case 9:
                    result = "High School"; break;
                case 10:
                    result = "High School"; break;
                case 11:
                    result = "High School"; break;
                case 12:
                    result = "Middle School"; break;
                case 13:
                    result = "College"; break;
                case 14:
                    result = "College"; break;
                case 15:
                    result = "College"; break;
                case 16:
                    result = "College"; break;
                case 17:
                    result = "Grad School"; break;
                case 18:
                    result = "Grad School"; break;
                default:
                    result = "Elementary School"; break;
            }


        }else {
            result = "Invalid";
        }

        System.out.println(result);




    }
}
/*
Create a class called GradeLevel, Given a number(byte) grade level determine and print which
school type someone is in.
                grade level and types are:
                        1-5: Elementary school
                        6-8: Middle school
                        9-12: High school
                        13-16: College
                        17-18: Grad School

                        For Any Other grade: Invalid grade level given

                Note:
                    Solution 1: Use switch statement
                    Solution 2: use if & switch both
 */