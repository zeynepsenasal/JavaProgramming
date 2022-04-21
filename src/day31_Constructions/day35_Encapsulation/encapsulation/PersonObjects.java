package day31_Constructions.day35_Encapsulation.encapsulation;

public class PersonObjects {
    public static void main(String[] args) {
        Person person1 = new Person();

        // person.name = "Daniel" not working because we dont access the private variable

        person1.setName("Daniel");
        person1.setAge(12);

        System.out.println(person1.getName() + "'s age is: " + person1.getName());


    }
}
