package day41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        int[] arr ={1,2,3};

        try{
            System.out.println(arr[10]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println("Catch Block");
            System.exit(0); // use for stop execute the finally block
        }finally { // ALWAYS GET EXECUTED
            System.out.println("Finally Block");
        }




    }

}
