package day37_Inheritence.ScrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, int ID, double salary,
                        String companyName) {
        super(name, age, gender, "Product Owner", ID, salary, companyName);
    }

}
