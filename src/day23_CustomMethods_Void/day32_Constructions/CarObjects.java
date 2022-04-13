package day23_CustomMethods_Void.day32_Constructions;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");

        Car car2 = new Car("Honda", "Accord");

        Car car3 = new Car("BMW", "200", 1998);

        Car car4 = new Car("Honda", "Bloom", 2005, 10000, "white");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

    }
}
