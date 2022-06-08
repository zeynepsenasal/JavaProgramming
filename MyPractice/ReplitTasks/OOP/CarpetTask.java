package ReplitTasks.OOP;

import day32_Constructions.Carpet;

import java.util.Scanner;

public class CarpetTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Carpet c = new Carpet();
        System.out.println(c.totalPrice);

        Carpet c2 = new Carpet(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextBoolean());
        System.out.println(c2.totalPrice);
in.close();
    }
    public static class Carpet{
        public double width, length, unitPrice, totalPrice;
        public boolean isPersian;

        public Carpet() {
            length = 300;
            width= 300;
            totalPrice=200;
            isPersian=false;
            unitPrice=0;
        }

        public Carpet(double width, double length, double unitPrice, boolean isPersian) {
            this.width = width;
            this.length = length;
            this.unitPrice = unitPrice;
            this.isPersian = isPersian;
            totalPrice = unitPrice*(width+length);
            if(isPersian){
                totalPrice +=200;
            }
        }
    }
}
