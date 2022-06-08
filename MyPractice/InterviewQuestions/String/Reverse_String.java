package InterviewQuestions.String;

public class Reverse_String {
    public static void main(String[] args) {

        String word = "Cybertek School";

        String reverse = "";

        //SOLUTION 1
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+=word.charAt(i) +"";
        }
        System.out.println(reverse);



    }
}
