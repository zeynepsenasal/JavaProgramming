package day42_Exceptions;

class FadyException extends RuntimeException{

    public FadyException(){
        System.out.println("Time for a short break");
    }

    public FadyException(String message){
        super(message);
    }
}

class NoBreakException extends Exception{

}

public class CustomExceptions  {
    public static void main(String[] args) {
        throw new FadyException("Its time for a lunch break");
    }
}
