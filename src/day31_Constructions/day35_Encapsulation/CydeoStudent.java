package day31_Constructions.day35_Encapsulation;

public class CydeoStudent {
    public String name;
    public char gender;
    public int age;
    public int batchNumber, groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName="CYDEO";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";
    }

    public static void printSchoolName() {
        System.out.println("Scool name: " + schoolName);
    }

    public static void printSecretCode() {
        System.out.println("Secret Code: " + secretCode);
    }

    public void attend(){
        System.out.println(name + " is attending to class");
    }

}
