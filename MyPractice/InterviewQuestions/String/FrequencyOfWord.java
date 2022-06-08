package InterviewQuestions.String;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "JavaJavaJava";
        String word= "Java";
        int frequency=0;


        for (int i = 0; i <= str.length()-word.length(); i++) { //büyük eşittir vermek lazım
            String eachWord= str.substring(i, i+word.length());
            if(eachWord.equals(word)){
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);



    }
}
