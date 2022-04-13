package day30_CustomClasses;

import java.util.ArrayList;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 1;
        dog1.size ="small";
        dog1.gender = 'F';
        dog1.color = "white";

        Dog dog2 = new Dog();

        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 3;
        dog2.size ="big";
        dog2.gender = 'M';
        dog2.color = "black";

        System.out.println(dog1);
        System.out.println(dog2);

        Dog dog3 = new Dog();

        dog3.setInfo("Jack", "German", 5, 'F', "Large", "brown");

        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

    Dog dog4 = new Dog();
    Dog dog5 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");
        System.out.println("--------------------------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();

        for (Dog each: dogs) {
            if(each.gender=='F'){
                femaleDogs.add(each);
            }else{
                maleDogs.add(each);
            }
        }

        System.out.println("maleDogs = " + maleDogs);
        System.out.println("femaleDogs = " + femaleDogs);

    }
}
