package InterviewQuestions.String;

import java.util.Arrays;

public class Anagram_String {

    public static boolean isAnagram(String word1, String word2) {

        word1= word1.toLowerCase();
        word2= word2.toLowerCase();

        char[] ch1 = word1.toCharArray();
        char[] ch2= word2.toCharArray();

        boolean anagram;

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);


    }
}
