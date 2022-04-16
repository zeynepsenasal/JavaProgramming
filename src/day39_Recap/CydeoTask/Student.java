package day39_Recap.CydeoTask;

public class Student extends Person {
    private int studentID;
    private String fieldOfStudy;

    public int getStudentID() {
        return studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }


    public Student(String name, int age, char gender, int studentID, String fieldOfStudy) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
    }

    public void study(){
        System.out.println(getName() + " is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentID=" + studentID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
