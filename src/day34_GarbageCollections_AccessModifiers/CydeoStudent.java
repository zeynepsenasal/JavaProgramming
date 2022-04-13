package day34_GarbageCollections_AccessModifiers;

public class CydeoStudent {

    public String name;
    public static String schoolName;

    public CydeoStudent(String name){
        this.name = name;
        schoolName= "Cydeo";
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' + "School Name='" +schoolName + '\''+
                '}';
    }
}

class CydeoStudentObject{
    public static void main(String[] args) {
        CydeoStudent cydeoStudent1 = new CydeoStudent("Jimmy");
        CydeoStudent cydeoStudent2 = new CydeoStudent("Karen");

        System.out.println(cydeoStudent1);
        System.out.println(cydeoStudent2);
    }

}
