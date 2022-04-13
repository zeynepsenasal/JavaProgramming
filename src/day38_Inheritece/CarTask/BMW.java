package day38_Inheritece.CarTask;

public class BMW extends Car{
    public BMW(String model, int year, double price, String color, double miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand + " " + model + " is breaks down");
    }

    public void racing(){
        System.out.println(brand + " " + model + " is racing");
    }


}
