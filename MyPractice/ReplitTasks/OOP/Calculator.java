package ReplitTasks.OOP;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int one = in.nextInt();
        int two = in.nextInt();
        Calc a = new Calc();
        a.setX(one);
        a.setY(two);
        a.plus();
        System.out.println(a.getResult());
        a.minus();
        System.out.println(a.getResult());
in.close();

    }

    public static class Calc{

        private String name;
        private int x, y, result;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }


        public void plus(){
          this.result= x+y;
        }

        public void minus(){
            this.result= x-y;
        }

    }
}


