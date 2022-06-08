package ReplitTasks.OOP;

import com.sun.jdi.Value;

import java.util.Scanner;

public class ValueTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Value v = new Value(in.nextInt());
        System.out.println(v.getVal());
        System.out.println(v.wasModified());
        v.setVal(in.nextInt());
        System.out.println(v.getVal());
        System.out.println(v.wasModified());
in.close();
    }
    public static class Value{

        private int val;
        private boolean modified;

        public Value() {
        }

        public Value(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            if(!(this.val==val)){
                this.val = val;
                this.modified=true;
            }

        }

        public boolean wasModified() {
            return modified;
        }

        public void setModified(boolean modified) {
            this.modified = modified;
        }
    }
}
