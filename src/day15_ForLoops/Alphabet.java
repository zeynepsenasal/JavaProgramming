package day15_ForLoops;

public class Alphabet {
    public static void main(String[] args) {

        // A~Z : 65...90 (according to the char table)

        for(char i = 65; i<=90; i++){ //i is representing 65, 66, 67 in ascii table
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("----------------------------------------");

        for(char i = 'A'; i<='Z'; i++){ //i is representing A, B, C, D..
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("----------------------------------------");

         // Z~~A
        for(char i = 'Z'; i>= 'A'; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("----------------------------------------");

        for(char i=90; i>=65; i--){
            System.out.print(i+ " ");
        }

        System.out.println();

        System.out.println("----------------------------------------");

        //a~z : 97-122

        for(char i = 97; i<=122; i++){
            System.out.print(i+ " ");
        }
        System.out.println();

        System.out.println("----------------------------------------");


        for(char i = 'a'; i<='z'; i++){
            System.out.print(i+  " ");
        }

        System.out.println();

        System.out.println("----------------------------------------");

        for(char i = 'z'; i>='a'; i--){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("----------------------------------------");

        for(char i =122; i>=97; i--){
            System.out.print(i+ " ");
        }




    }
}
