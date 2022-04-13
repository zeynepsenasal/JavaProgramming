package day36_Inheritence.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Lucy", "Husky", 'F', "large", 2, "white");

        dog.eat();
        dog.sleep();
        dog.drink();
        dog.bark();

        Cat cat = new Cat();

        Tiger tiger = new Tiger();

        tiger.setInfo("Khan", "British", 'M', "large", 2, "brown");

        tiger.sleep();
        tiger.eat();
        tiger.hunt();
        tiger.roar();

    }
}
