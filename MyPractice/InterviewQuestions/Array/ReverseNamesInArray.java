package InterviewQuestions.Array;

public class ReverseNamesInArray {
    public static void main(String[] args) {

        String[] names = {"Java Programming", "Wooden Spoon", "Hello World",
                "Selenium Automation", "Database Testing"};

        for (String each : names) {
            String reversed="";
            for (int i = each.length()-1; i >0 ; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);

        }

    }
}
