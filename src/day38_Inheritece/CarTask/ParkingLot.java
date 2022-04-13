package day38_Inheritece.CarTask;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 1999, 1500, "grey", 3000);

        Tesla tesla = new Tesla("Model S", 2019, 35000, "white", 2500);

        BMW bmw = new BMW("X5", 2020, 5000, "black", 300);

        toyota.start();
        bmw.start();
        tesla.start();


    }
}
