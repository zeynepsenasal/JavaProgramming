package day43_Abstraction.Car;

public class CarShop {
    public static void main(String[] args) {
      //  Car car1 = new Car("Cydeo", "Batch", "white", 25,200);
        //Car Class is ABSTRACT, so we cannot create objects. (abstract class is not concrete)

        Honda honda= new Honda("Accord", "Black",2019, 5000);

        Audi audi= new Audi("Q7", "white", 2020, 15000);

        Tesla tesla= new Tesla("Model13","grey",2021, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("------------------------------");

        honda.setColor("grey");
        audi.setColor("black");



    }
}
