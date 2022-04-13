package day31_Constructions;


public class PersonObjects {
    public static void main(String[] args) {
        Person person1 = new Person("Zeynep", 'F', 23);

        Person person2 = new Person("Sarah", 'F', 25);

        person2.age=30;

        System.out.println(person1);
        System.out.println(person2);
    }

}
