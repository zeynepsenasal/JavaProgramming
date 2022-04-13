package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {
        byte a = 100;
        short b = a; // short b = (byte)a

        int c = b; // (int)b
        long d = c; // (long)c

        float e = d; // (float)d
        double f = e; // (double)d
        //---------------------

        int x = 55;
        short y = (short)x;
        System.out.println(x + " : " + y);

        long j = 100000000;
        short k = (short)j;

        System.out.println(j+" : "+k);

        double l = 2.5;
        float m = (float) l;
        }
    }

/*
Primitives:

	double > float > long > int > short > byte
		smaller primitives can be directly assigned to larger primitive type
	larger ptimitives can NOT be directly assigned to smaller primitive types
	(need to be casted manually)
 */