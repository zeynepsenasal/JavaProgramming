package day18_NestedLoop.day24_CustomMethods_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        String str = "Java";

        String result = reverse(str); //return method allowed re-use the method
        System.out.println(result);
        if(str.equalsIgnoreCase(result)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }




    }


    public static String reverse(String str) { //return method used, not void.
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        return reverse; //MUST
    }











}
