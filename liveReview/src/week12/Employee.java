package week12;

public class Employee {
    public String name, jobTitle;
    public int ID;
    public double salary;

    public Employee(){
        //no parameter Constructor
    }

    public Employee(String name, String jobTitle, int ID, double salary){
        this.name=name; //geting a name from the constructor and assignining it
        // to the field of the object that will be created
        this.jobTitle=jobTitle;
        this.ID=ID;
        this.salary=salary;
    }

    public String asString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                '}';
    }
}
