package day43_Abstraction.Car;

public final class Audi extends Car { //WE GIVE FINAL KEYWORD TO ENSURE THIS CLASS
    // WILL NEVER BE INHERITED
    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    public void start(){

    }

    public void autoPark(){
        System.out.println(getBrand() +getModel()+ " has autoPark feature");
    }

}
