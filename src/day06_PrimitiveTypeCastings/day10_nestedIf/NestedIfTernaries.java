package day06_PrimitiveTypeCastings.day10_nestedIf;

public class NestedIfTernaries {
    public static void main(String[] args) {
        int s = 400;

        String result = (s>=0 && s<=100)? (s>=60)? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result);





    }
}
