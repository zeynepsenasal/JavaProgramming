package InterviewQuestions.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyOfSingleChar {
    public static void main(String[] args) {
        String str3 = "AAABBBCDDDDDDD";

        char ch = 'D';

        int frequency = 0;

        for (int i = 0; i < str3.length(); i++) {
            char eachchar = str3.charAt(i);
            if(ch == eachchar){
                frequency++;
            }



        }
        System.out.println("frequency = " + frequency);

        //2. solution

        String[] arr = str3.split("");
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        int fre = Collections.frequency(list, "D");
        System.out.println("fre = " + fre);
    }
}
