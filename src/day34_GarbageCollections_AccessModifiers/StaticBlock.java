package day34_GarbageCollections_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main Method");


    }

    static { //runs before anything, and only runs for 1 time, cannot run more than one time
        System.out.println("Static Block");
    }
    static { //runs before anything, and only runs for 1 time
        System.out.println("Static Block2");
    }

    static { //runs before anything, and only runs for 1 time
        System.out.println("Static Block3");
    }





}
