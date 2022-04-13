package day31_Constructions;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping, getNumberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int getNumberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.getNumberOfPepperoniTopping = getNumberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", getNumberOfPepperoniTopping=" + getNumberOfPepperoniTopping +
                '}';
    }

    public double calcCost(){
        double startingPrice = (size=='S')? 10 : (size=='M')? 12: 14;
        double totalPrice = (numberOfCheeseTopping+getNumberOfPepperoniTopping) *2;
        return totalPrice;
    }

}
