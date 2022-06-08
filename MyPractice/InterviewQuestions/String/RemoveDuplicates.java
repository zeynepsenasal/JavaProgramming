package InterviewQuestions.String;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aaabbbcccd";

        String result ="";

        for (int i = 0; i < str.length() ; i++) {
            String eachChar = str.charAt(i) +"";
            if(!result.contains(eachChar)){
                result += eachChar;
            }
        }
        System.out.println("result = " + result);




    }
}
