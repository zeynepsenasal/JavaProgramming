package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str = "123";

        int num = Integer.parseInt(str);

        System.out.println(num+1); //124
        System.out.println(str+1); // 1231

        String str2 = "20.4";
        double num2 = Double.parseDouble(str2);

        System.out.println(num2+1); //21.4

        System.out.println("------------------------------");

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("------------------------------");

        String str3 = "true";

        String str4 = "maybe";

        boolean a = Boolean.parseBoolean(str3);
        System.out.println(a);

        boolean b = Boolean.parseBoolean(str4);
        System.out.println(b);

        System.out.println("------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2); //Integer
        int y = Integer.valueOf(s2);// Integer

        System.out.println(x);
        System.out.println(y);

        String s3 = "1.5";
        Double z = Double.valueOf(s3);// Double

        System.out.println(z);

        System.out.println("-----------------------------------------------------");
        //is Digit?
        char ch1 = '0';

        boolean r2 = Character.isDigit(ch1);

        System.out.println(r2);
        //is Letter?
        char ch2 = 'f';

        boolean r3 = Character.isLetter(ch1);

        System.out.println(r3);

        //is Special Character?
        char ch3 = 'f';

        boolean r4 = !Character.isLetterOrDigit(ch3);

        System.out.println(r4);

        //is Upper Case?
        boolean r5 = Character.isUpperCase(ch3);
        //is Lower Case?
        boolean r6 = Character.isLowerCase(ch3);

        System.out.println("-----------------------------------------------------");
        
        String word = "12anbckjd23456ls9";
        
        int sum = 0;

        for (char each: word.toCharArray()) {
            if(Character.isDigit(each)){
            sum += Integer.parseInt(each +"");
            }
        }

        System.out.println("sum: " +sum);













    }
}
