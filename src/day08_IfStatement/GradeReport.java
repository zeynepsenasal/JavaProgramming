package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
        System.out.println(true == !false); //true
        System.out.println(!true != false); //false
        System.out.println(false == !true); //true

        //-----------------------------------------
        int score = 85;

        boolean a = score >= 90 && score < 100;
        boolean b = score >= 80 && score <= 89;
        //boolean b = score >= 80 && score <=89;
        boolean c = score >= 70 && score <= 79;
        // !a && !b && score>=70;
        boolean d = !a && !b && !c && score >= 60;
        boolean f = !a && !b && !c && !d && score >= 0;

        if (a) {
            System.out.println("Excellent");

        }
        if (b) {
            System.out.println("Great");
        }
        if (c) {
            System.out.println("Good");
        }
        if (d) {
            System.out.println("Bad");
        }
        if (f) {
            System.out.println("Failed");
        }
    }
}
/*
90 ~ 100 = excellent
80 ~ 89 = great
70 ~ 79 = good
60 ~ 69 = bad
0 ~ 59 = Failed
 */