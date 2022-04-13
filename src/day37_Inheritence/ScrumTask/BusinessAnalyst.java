package day37_Inheritence.ScrumTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", ID, salary, companyName);
    }
    public void analyze(){
        System.out.println(jobTitle + " " + name + " is analyzing documents");
    }
}
