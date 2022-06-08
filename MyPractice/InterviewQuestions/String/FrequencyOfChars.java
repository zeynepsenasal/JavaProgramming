package InterviewQuestions.String;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {

        // 2 ÇÖZÜM VAR : 1- FOR LOOP / 2- COLLECTIONS

        //FIRST SOLUTION
        String str = "aaabbbccc"; //result should be "a3b3c3"

        String result ="";

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            int count=0; //BUNU BURAYA DEĞİL YUKARIYA KOYUNCA SONUÇ FARKLI ÇIKIYOR!!
            for (int j = 0; j < str.length() ; j++) {
                char ch2 = str.charAt(j);
                if(ch1==ch2){
                    count++;
                }
            }
           if(result.contains(ch1 +"")){
               continue;
           }
           result+=ch1;
           result+=count;

        }
        System.out.println("result = " + result);




        // SECOND SOLUTION - COLLECTIONS
        String str2 = "aaabbbccc"; //result should be "a3b3c3"
        String result2 ="";

      String[] arr=  str2.split("");

        for (String each : arr) {
            int frequency= Collections.frequency(Arrays.asList(arr),each);
            if(!result2.contains(each)){
                result2+=each;
                result2+=frequency;
            }

        }
        System.out.println("result2 = " + result2);


    }
}
