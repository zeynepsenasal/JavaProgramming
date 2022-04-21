package day39_Recap.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Developer developer = new Developer("Ahmet", 23, 'M',1234, "Developer", 2000);

        Tester tester=new Tester("Zeynep", 24, 'F', 2345, "SDET", 1500);

        Teacher teacher=new Teacher("Muhtar", 28, 'M', 1293, "Teacher", 3000);

        Student student= new Student("Ayşe", 21, 'F', 2728, "Cyber Security");

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(student);


        developer.setAge(29);
        System.out.println(developer.getAge());

        System.out.println(developer);
        System.out.println("-----------------------------------------------");
        developer.work();
        teacher.work();
        tester.work();
        tester.sleep();
        developer.eat();



    }
}
