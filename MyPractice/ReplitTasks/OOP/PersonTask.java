package ReplitTasks.OOP;

import java.util.Scanner;

public class PersonTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person person = new Person();
        System.out.println(person.getFirstName());
        System.out.println(person.getAge());
        person.setAge(in.nextInt());
        System.out.println(person.getAge());

        Person person2 = new Person(in.next(), in.next(), in.nextInt());
        System.out.println(person2.getLastName());
        System.out.println(person2.toString());
in.close();

    }
    public static class Person{
        private String  firstName, lastName;
        private int age;


        public Person() {
            this.firstName = "undefined";
            this.lastName = "undefined";
            this.age = -1;
        }

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;

        }

        @Override
        public String toString() {
            return firstName + " | "+ lastName + " | " + age;
        }
    }
}
