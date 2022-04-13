package day05_Concatention;

public class ShippingAdress {
    public static void main(String[] args) {
        String name = "James King",
                buildingNumber = "121B",
                streetName ="Jones Dr",
                city = "McLean",
                state = "WA",
                zipCode = "22013A";
        System.out.println("name = " + name);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state );

    }


}
