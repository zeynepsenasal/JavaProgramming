package day19_LoopsPractise;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aaabbbcccd";
        String result = "";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length() ; i++) {
                char each = str.charAt(i);
                if(ch == each){
                    count++;
                }
            }
            if(result.contains("" + ch)){ //AVOIDING DUPLICATION BY SKIPPING
                continue;
            }

            result += ch;
            result += count;

        }



        System.out.println(result);




    }
}
