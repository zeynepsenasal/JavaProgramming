package day17_While_DoWhile;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "AAABBBCCC";
        char ch = 'A';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar =str.charAt(i);
            if(ch==eachChar){ //if given ch is matching with the eachChar, then ch is appeared in the String
                frequency++;

            }
        }

        System.out.println(frequency);




    }
}
