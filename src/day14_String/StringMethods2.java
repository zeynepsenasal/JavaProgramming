package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Phyton");
        
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");

        System.out.println("email = " + email);

        String sentence = "Java Java Phyton Phyton C# C# Phyton Phyton";
        String sentence2 = sentence.replace("Phyton ", "");

        System.out.println("sentence = " + sentence);

        String s = "Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");
        
        String result = "Java, Java, Java";
        result = result.replaceFirst("Java", "Phyton"); //replacing first data
        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java"); //first C#
        String result3 = result2.replaceFirst(" C#", " Java");//second C#



    }
}
