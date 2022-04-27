package day43_Abstraction.Car;

public abstract class Car {
    private final String brand, model;
    private String color;
    private int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);
        if(year<1886){
            throw new  RuntimeException("Invalid year " +year);
        }
        this.year = year;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        if(price<1886){
            throw new  RuntimeException("Invalid price" + price);
        }
        this.price = price;

    }

    public void stop(){
        System.out.println("Press the brake");
    }

    public abstract void start(); //ABSTRACT METHOD, MENT TO BE OVERRIDEN
    //CANNOT BE FINAL, STATIC, PRIVATE


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
