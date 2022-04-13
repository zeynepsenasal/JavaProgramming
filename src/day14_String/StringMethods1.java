package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "             batch 25        ";
        str1 = str1.trim(); // batch 25

        System.out.println(str1); //returns the String without unused (white) spaces

        String str2 = "Cydeo School";

       int n1 = str2.indexOf("h");
       int n2 = str2.indexOf("o");
       int n3 = str2.indexOf("ool");

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);

        String str3 = "Java Programming Language";

        int n4 = str3.indexOf("a "); // second a
        int n5 = str3.indexOf("amm"); // third a
        int n6 = str3.indexOf("an"); // fourth a

        System.out.println("n6 = " + n6);

        int n7 = str3.indexOf("g "); // second g

        System.out.println("----------------------------------");

        String s = "Java Nava Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        //int seventhA = s.indexOf("a o");
        int seventhA = s.lastIndexOf("a ");



    }
}
