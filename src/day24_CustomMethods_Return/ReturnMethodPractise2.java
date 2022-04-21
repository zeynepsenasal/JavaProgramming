package day24_CustomMethods_Return;

public class ReturnMethodPractise2 {
    public static void main(String[] args) {

        String str1 = grade(80);


    }

public static String grade(int score) {

    String result = "";
    if (score < 0 || score > 100) {
        result = "Invalid";

    } else {

        result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
    }
    System.out.println(result);


    return result;
}








}
