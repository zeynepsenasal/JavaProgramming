package day21_ForEachLoop;

public class Inıtials{
    public static void main(String[] args) {

        String[] names = {"Java Programming", "Wooden Spoon", "Hello World",
                "Selenium Automation", "Database Testing"};

        for (String each: names) {
            String initial = each.charAt(0) + "." + each.charAt(each.indexOf(" ")+1);

            System.out.println(initial);

        }













    }
}
