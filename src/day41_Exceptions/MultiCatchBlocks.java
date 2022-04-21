package day41_Exceptions;

import day39_Recap.CydeoTask.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {

        Employee employee= null;

        try {
            System.out.println(employee.getSalary());
        }catch (IndexOutOfBoundsException e){
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Second Catch Block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third Catch Block");
            e.printStackTrace();
        }







    }


}
