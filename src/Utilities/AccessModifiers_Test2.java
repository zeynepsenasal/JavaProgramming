package Utilities;
import day34_GarbageCollections_AccessModifiers.AccessModifiers;
public class AccessModifiers_Test2 {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        //System.out.println(AccessModifiers.defaultData); - default is not visible outside package!
        //System.out.println(AccessModifiers.privateData); - private is not visible outside the class!

        AccessModifiers.method1();
        // AccessModifiers.method2(); default cannot be used outside the package
        // AccessModifiers.method3(); private cannot be used outside the class or package
    }
}
