package week20;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapExampleWithClassObject {
    public static void main(String[] args) {
        Map<String,Object> cydeo = new LinkedHashMap<>();

        Employee empOne = new Employee();
        empOne.setInfo("Steven","King","AD_PRES",24000,90);

        cydeo.put("empOne",empOne);

        Employee empTwo = new Employee();
        empTwo.setInfo("Neena","Kochar","AD_VP",17000,90);

        cydeo.put("empTwo",empTwo);

        Employee empThree = new Employee();
        empTwo.setInfo("Lex","De Haan","AD_VP",17000,90);

        cydeo.put("empThree",empThree);


        //  System.out.println("cydeo = " + cydeo);

        //Find Nina's salary and verify it is as expected

        double expectedSalary=0;

        for (Object eachEmployee : cydeo.entrySet()) {
            Employee employee =(Employee) cydeo.get(eachEmployee);

            if(employee.getFirst_name().equals("Neena")){
                expectedSalary=employee.getSalary();
            }

        }

        if(expectedSalary==17000){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }


        for (Object eachEmployee : cydeo.entrySet()) {
            Employee employee =(Employee) cydeo.get(eachEmployee);

            if(employee.getFirst_name().equals("Steven")){
                employee.setSalary(40000);
            }

        }




    }
}
