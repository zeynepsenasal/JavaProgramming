package day04_Variables;
/*
variable naming rules:
       1. MUST be unique
       2. camelCase
       3. Can Not start with digits
       4. starts with lower case letters
       5. Can Not be Java Reserved words
       6. Can Not have special characters other than _ and $
       7. readable, understandable
 */
public class PrimitivesIntro {
    // age is 38
    public static void main(String[] args) {
        byte age = 38;
      //  weight 160 pounds
        // byte weight = 160 ; // 160 is out of byte' range
        short weight = 160 ; // 160 is within the range of short

     // salary: 10000000$
        // short salary = 10000000 ; // 10000000 is out of short' range
      int salary = 10000000; // int is the preferred data type for  integer numbers (to 2 billions)

        // int asset = 999999999999 ; 999999999999 is out of int's range
      long asset = 3_333_333_333l;

      double PI = 3.14; // for decimal numbers (preferred)

        // # char name = '..'
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        boolean isEmployeed = true;
        boolean isMarried = false;
        boolean result = 100 > 300;
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        // sequence of characters: String ".."

        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";
        System.out.println("name = " + name);


    }
}
