package day39_Recap.Shape;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name){
        if(name==null){
            System.err.println("Name cannot be null");
            System.exit(1); // 1: something is wrong
        }
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid Name");
            System.exit(1); // 1: something is wrong
        }

        this.name=name;
    }

    public Shape(String name){
        setName(name);
    }

    public double area(){ //we are returning 0 because it will be differ from class to class
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
