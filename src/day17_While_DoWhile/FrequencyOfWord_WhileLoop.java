package day17_While_DoWhile;

import java.util.Locale;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str = "Java Java Java";

        int frequency=0;

        while (str.contains("Java")){
            str = str.replaceFirst("Java", "");
            frequency++;
        }

        System.out.println(frequency);

        System.out.println("------------------------------------------");

        String sentence = "Cat cat cat cat dog dog cat cat";
        sentence = sentence.toLowerCase();
        int countCat = 0;

        while(sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println(countCat);

    }
}
