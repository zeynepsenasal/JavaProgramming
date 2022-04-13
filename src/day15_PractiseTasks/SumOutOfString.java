package day15_PractiseTasks;

public class SumOutOfString {
    public static void main(String[] args) {
        String str = "A1B2C3";

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if(eachChar>='0' && eachChar<='9'){
                sum += eachChar-48;
            }
//To convert char to number: !!!IMPORTANT
//						             	   '0' - 48   ==> 0
//						             	   '1' - 48   ==> 1
//						             	   		...
        }

        System.out.println(sum);

    }
}
/*
Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop

 */