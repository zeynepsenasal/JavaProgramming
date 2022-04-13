package day34_GarbageCollections_AccessModifiers;

public class Construcor_vs_StaticBlock {
    static {
        System.out.println("Static Block");
    }

    public Construcor_vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Construcor_vs_StaticBlock();
        new Construcor_vs_StaticBlock();
        new Construcor_vs_StaticBlock();
        new Construcor_vs_StaticBlock();

    }

}
