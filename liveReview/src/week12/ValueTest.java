package week12;

public class ValueTest {
    public static void main(String[] args) {
        Value value=new Value();
        System.out.println(value.calledMethod); //false
        value.setValue(5); //method is called
        System.out.println(value.calledMethod); //true


    }
}
