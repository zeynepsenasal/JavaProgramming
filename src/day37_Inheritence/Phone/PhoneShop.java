package day37_Inheritence.Phone;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "white");

        Samsung samsung= new Samsung("Galaxy S10", "6.5 inch", 800, "black");

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "grey");

        System.out.println(samsung);
        System.out.println(iphone);
        System.out.println(nokia);

        System.out.println("----------------------------");

        iphone.call(911);

        iphone.text(123456);

        iphone.faceTime("yahoo@gmail");

        System.out.println("---------------------------");

        nokia.call(12345598);
        nokia.text(9398438);
        nokia.selfDefence();











    }
}
