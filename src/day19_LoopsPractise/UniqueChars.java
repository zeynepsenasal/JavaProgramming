package day19_LoopsPractise;

public class UniqueChars {
    public static void main(String[] args) {
        String str = "aaabbbcccdee";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                result += ch;
            }

        }
        System.out.println("Unique Character is " +result);


    }
}
