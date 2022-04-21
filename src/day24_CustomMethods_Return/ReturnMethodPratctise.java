package day24_CustomMethods_Return;

public class ReturnMethodPratctise {
    public static void main(String[] args) {
    int maxNumber = max(10,30);

        System.out.println(maxNumber);

    }

    public static int max(int a, int b){
        int result = 0;
        if(a>b){
            result=a;
        }else{
            result=b;
        }
        return result; //exiting the method, returming the value
    }













}
