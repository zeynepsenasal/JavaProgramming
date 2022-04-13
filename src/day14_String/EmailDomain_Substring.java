package day14_String;

public class EmailDomain_Substring {
    public static void main(String[] args) {
        String email = "Cydeo.Schoo@gmail.com";

        int beginningIndex = email.indexOf("@") +1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println(domain);

        System.out.println("----------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";

        String s1 = str1.substring(0, 10+1); //Java is fun
        System.out.println(s1);

        int beg = str1.lastIndexOf("J");
        int end = str1.lastIndexOf(",");

        String s2 = str1.substring(beg, end); //Java is cool












    }
}
