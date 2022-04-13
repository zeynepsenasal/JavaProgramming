package day14_String;

public class StringMethods3_Substring {
    public static void main(String[] args) {
        // substring, beginning index, finishing index.

        String word = "Cydeo School";
        String str1 = word.substring(0, 4+1); //Cydeo
        System.out.println(str1);//Cydeo
        String str3 = word.substring(6); //School
        System.out.println(str3);

        String word2 = "Java Programming Language";

        String s1 = word2.substring(0, word.indexOf(" ")); //"Java"
        String s2= word2.substring(word.indexOf(" ")+1, word.lastIndexOf(" ")); // "Programming
        String s3 = word2.substring(word.lastIndexOf(" ")+1);//Language

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);









    }
}
