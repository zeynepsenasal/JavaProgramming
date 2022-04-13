package day34_GarbageCollections_AccessModifiers;

public class StaticMembers {
    // a class can be static ONLY IF that class is in a nested class and its an inner class
 static class class1{

    }

    public static int num =100;

    public static void method() {

    }
    static {

    }

}
class A{ //outer class, outer class cannot be static!
   static class B{ //inner class, can be static; because it belongs to another class
    public static void method1(){

    }
    }
}

class C{
    public static void main(String[] args) {
        A.B.method1();
    }
}
