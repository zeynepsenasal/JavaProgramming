package day37_Inheritence.Phone;

public class Nokia extends Phone{
    public Nokia( String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefence(){
        System.out.println("You can use the " + brand +" " + model + " as self defence tool");
    }
}