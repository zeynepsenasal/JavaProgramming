package day15_ForLoops;

public class EvenNumber {
    public static void main(String[] args) {

        int total = 0;

        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                total += i;
            }
        }
        System.out.println(total);

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i%2!=0){
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
/*
 Write a program that can return the sum of even numbers between 1 to 100
 */