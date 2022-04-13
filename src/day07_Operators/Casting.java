package day07_Operators;

public class Casting {
    public static void main(String[] args) {
        float averageScore = 20.5F;
        byte num1 = (byte)averageScore; // explicit casting (casting larger primitve type to smaller one)
        System.out.println("num1 = " + num1);
        short num2 = (short) averageScore;
        int num3 = (int)averageScore;
        int num4 = (short)averageScore; // can be like this because short is smaller
        float num5 = averageScore; //there is no casting
        double num6 = averageScore; //implicit casting (no need to do anything,
        // it is done automatically)

        //implicit casting: casting smaller type to larger
        //explicit casting: casting the larger to smaller

        System.out.println("result1" + 0 + 1);

        long a = 30L;
        long b = (short)a;
        System.out.println("b = " + b);
        System.out.println((int)(10/3.0));

    }
}
/*
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
 */