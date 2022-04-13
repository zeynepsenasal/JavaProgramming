package day37_Inheritence.AnimalTask;

public class Animal {
    public String name, breed;
    public char gender;
    public String size;
    public int age;
    public String color;

    public Animal(String name, String breed, char gender, String size, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void move(){
        System.out.println(name+ " is moving");
    }



}
