package ReplitTasks.OOP;

import java.util.Scanner;

public class AbstractionTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dog dog = new Dog(in.next(), in.nextInt(), in.next());
        Dog dog2 = new Dog(in.next(), in.nextInt(), in.next());
        System.out.println(dog);
        System.out.println(dog.equals(dog2));

in.close();


    }
    public abstract static class Animal{
        private String name;
        private int age;

        public Animal(String name, int age){
            setName(name);
            setAge(age);
        }

        public abstract void getAgeInHumanYears();


        public void setName(String name){
            this.name=name;
        }
        public void setAge(int age){
            this.age=age;
        }

        public int getAge(){
            return age;
        }
        public String getName(){
            return name;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static class Dog extends Animal{
        public String  breed;
        public int humanYears;

        public Dog(String name, int age, String breed){
            super(name, age);
            this.breed=breed;

        }


        public void getAgeInHumanYears(){
            if(getAge()==2){
                setAge(getAge()*11);
            }else{
                setAge(22 + ((getAge()-2) * 5));
            }
        }

       public boolean equals(Dog dog, Dog dog2){
            if(dog.getName().equals(dog2.getName()) && dog.getAge()==dog.getAge() && dog.breed.equals(dog2.breed)){
                return true;
            }else{
                return false;
            }
       }

        public String toString() {
            return "Dog{" +
                    "name=: " + getName() + '\'' +
                    ", B    reed: " + breed +
                    ", Age in calendar years: " + getAge() +
                    ", Age in human years: " + humanYears +
                    '}';
        }


    }

}
