package day43_Abstraction.Car;

public class Honda extends Car {
    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    //ABSTRACT METHODS MUST BE COMPLETED IN CHILD CLASS, OTHERWISE IT WILL GIVE COMPILER ERROR
    public void start(){
        System.out.println("Twist the key to ignition");
    }

}
