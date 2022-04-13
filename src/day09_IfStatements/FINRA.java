package day09_IfStatements;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FINRA {
    public static void main(String[] args) {
        int number = 30;
        boolean finra = (number%3 == 0) && (number%5 ==0);
        boolean fin = number%3 ==0 && !finra;
        boolean ra = number%5 ==0 && !finra;


        if(fin){
            System.out.println("FIN");
        }else if(ra){
            System.out.println("RA");
        }else if(finra){
            System.out.println("FINRA");
        }else {
            System.out.println("ERROR");
        }

    }
}
/*
Create a class called FINRA, Write a function which prints out the number.
 but for number which is a multiple of 3, print "FIN" instead of the number and
 for number which is a multiple of 5, print "RA" instead of the number.
 and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3
            output:
                      FIN

                number = 10
            output:
                RA

                number = 15
            output:
                FINRA

 */