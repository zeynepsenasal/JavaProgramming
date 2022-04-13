package day16_PractiseTasks;

public class FrequencyOfWords {
    public static void main(String[] args) {
        String str = "Java Java";
        int frequency = 0;

        for (int i = 0; i <= str.length()-4; i++) {
            String str2 = str.substring(i, i+4);
            if(str2.equalsIgnoreCase("Java")){
                frequency++;
            }
        }
        System.out.println(frequency);

    }
}
/*
 write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */
