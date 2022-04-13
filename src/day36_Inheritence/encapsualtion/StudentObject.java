package day36_Inheritence.encapsualtion;

public class StudentObject {
    public static void main(String[] args) {
        Student student1 = new Student("Daniel", 13, 'M', 'Z', "MIT");

        student1.setAge(39);
        System.out.println(student1);
    }
}
