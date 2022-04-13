package day38_Inheritece.CarTask;

import day38_Inheritece.CarTask.Car;

public class Toyota extends Car {

    public Toyota(String model, int year, double price, String color, double miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is reliable");
    }




}
