package InterviewQuestions.String;

import java.util.*;

public class UniqueChars {
    public static void main(String[] args) {

        String str ="cdsaacBddeff";

        String result = "";

        for(int i=0; i< str.length();i++){
            int count =0;
            char ch1= str.charAt(i);

            for(int j=0; j< str.length();j++){
                char ch2= str.charAt(j);

                if(ch1==ch2){
                    count++;
                }
            }

            if(count==1){
                result+=ch1;
            }



        }

        System.out.println(result);

        String str2 ="cdsaacBddeff";

       String[] split= str2.split("");

      //  Set<String> set = new HashSet<>(Arrays.asList(split));
        List<String> list = new ArrayList<>(Arrays.asList(split));

        for (String each : list) {
            int frequency = Collections.frequency(Arrays.asList(split), each);

            if(frequency==1){
                System.out.print(each + " ");
            }

        }




    }
}