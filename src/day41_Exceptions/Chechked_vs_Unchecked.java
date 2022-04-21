package day41_Exceptions;

import day39_Recap.CydeoTask.Student;

import java.util.Locale;

public class Chechked_vs_Unchecked {
    public static void main(String[] args) {
        //UNCHECKED EXCEPTIONS:
        int a=10;
        int b= 0;

       // System.out.println(a/b); --> unchecked exception, it occurs in the runtime

        char[] chars = {1,2,3};

       // System.out.println(chars[99]);--> unchecked exception, it occurs in the runtime

        Student student= null;

       // System.out.println(student.getName());
        // student.study();

        String str = null;

       // System.out.println(str.toLowerCase();


        //--------------------------------------------
        // CHECKED EXCEPTIONS

        System.out.println("Hello");

      //  Thread.sleep(300); --> REQUIRES IMMIDIATE ATTENTION

        System.out.println("Cydeo");







    }
}
