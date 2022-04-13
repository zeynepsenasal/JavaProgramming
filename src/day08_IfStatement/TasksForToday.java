package day08_IfStatement;

public class TasksForToday {
    public static void main(String[] args) {
        byte age = 8;
        boolean isEligible = age >=18;

        if(isEligible){
            System.out.println("John is Eligible to buy cigarettes.");
        }
        if(!isEligible){
            System.out.println("John is not Eligible to buy cigarettes.");
        }

        byte gradeLevel = 7;
        boolean elementarySchool = gradeLevel>=1 && gradeLevel<=5;
        boolean middleSchool = gradeLevel>=6 && gradeLevel<=8;
        boolean highSchool = gradeLevel>=9 && gradeLevel<=12;
        boolean college =  gradeLevel>= 13 && gradeLevel<=16;
        boolean gradSchool = !elementarySchool && !middleSchool && !highSchool && !college && gradeLevel<=18;

        if(elementarySchool){
            System.out.println("John is in the Elementary School");
        } else if(middleSchool) {
            System.out.println("John is in the Middle School");
        }else if(highSchool){
            System.out.println("John is in the HighSchool");
        }else if(college){
            System.out.println("John is in the College");
        }else { System.out.println("John is in the GradSchool");
        }







    }
}
/*
Tasks:
	1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes

	2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18

	3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number

 */