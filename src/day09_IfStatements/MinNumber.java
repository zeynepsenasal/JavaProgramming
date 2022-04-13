package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 200;
        boolean n1isMin = n1 < n2;
        boolean n2isMin = n1 > n2;
        boolean equal = n1 == n2;

        if (n1isMin) { // if n1 is minimum number
            System.out.println(n1 + " is minimum number.");
        }
        if (n2isMin) { //if n2 is minimum
            System.out.println(n2 + " is minimum number");
        }
        if (equal) {
            System.out.println(n1 + " is equal to " + n2);
        }
    }
}
