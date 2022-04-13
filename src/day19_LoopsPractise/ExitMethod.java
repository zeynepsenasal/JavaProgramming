package day19_LoopsPractise;

public class ExitMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            if (i== 3){
                // break; terminates the loop
                // continue; //terminates the current iteration of the loop BY SKIPPING
                System.exit(0); // terminates everything, ends the program
            }
                System.out.println(i);
            }
        System.out.println("wooden spoon");
    }
}
