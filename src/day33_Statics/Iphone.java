package day33_Statics;

public class Iphone {

    public static String brand = "Apple";
    public String model;
    public double price;
    public static String OS = "IOS";
    public String color;
    public String size;
    public static String madeIn = "Chine";
    public static boolean hasBattery=true;
    public static boolean hasTouchScreen =true;
    public static boolean hasFacetime=true;


    public static void printOperatingSystem(){
        System.out.println(OS);
    }


    // public static void printModelAndPrice(){
    //    System.out.println(model+" : "+price); // static methods does not accept instances
    //  }


    public void method1(){
        System.out.println(model+" : "+price);
        System.out.println(OS);
    }
}
