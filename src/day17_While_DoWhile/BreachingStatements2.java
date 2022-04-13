package day17_While_DoWhile;

public class BreachingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E' ; i++) {
            if (i == 'C') {
                continue; //SKIPS THE STATEMENT, break for exciting; continue for skipping
            }
            System.out.println();
        }

        System.out.println("----------------------------------");
        //print all even numbers 1~100
        for (int i = 1; i < 100; i++) {
            if(i%2!=0){
                continue;
            }
            System.out.print(i+ " ");
        }


        System.out.println();
        System.out.println("----------------------------------");
        //print all odd numbers 1~100
        for (int i = 1; i <100 ; i++) {
            if(i%2==0){
                continue;
            }
            System.out.print(i+ " ");
        }
        
        
        
        
        
    }
}
