package day06_PrimitiveTypeCastings.day10_nestedIf;

import com.sun.security.jgss.GSSUtil;

public class GradeReport2 {
    public static void main(String[] args) {
        int score = 95;
        String result = "";

        if(score>=0 && score<=100){
            if(score>=90){
                result = "Excellent";
            }else if(score>=80){
                result = "Great";
            }else if(score>=70){
                result = "Good";
            }else if(score>=60){
                result ="Passed";
            }else{
                result = "Failed";
            }

        }else{
            result = "Invalid Score";
        }

        System.out.println(result);

        System.out.println("-----------------------------------");

        //ternaries only

        int r = 85;

        String result2 =(r>=0 && r<=100)? (r>=90)? "Excellent" :(r>=80)? "Great"
                :(r>=70)? "Good" :(r>=60)? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result2);



















    }




}
