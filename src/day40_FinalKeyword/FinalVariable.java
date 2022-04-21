package day40_FinalKeyword;

public class FinalVariable {

    final String birthday;

    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }

    public static void main(String[] args) {

        final double pi = 3.14; //cannot be changed, cannot be re-assigned


       // pi =7.14;

        FinalVariable obj= new FinalVariable("2.4.1998");

        System.out.println(obj.birthday);

       // obj.birthday="June"; cannot be reassigned





    }
}
