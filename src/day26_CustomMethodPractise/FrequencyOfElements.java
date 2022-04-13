package day26_CustomMethodPractise;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr1 = {1,1,3,4,5};
        int n = frequencyOfElement(arr1,1);
        System.out.println(n);
    }



    //Create a method that passes two parameters: an integer array and an Integer element.
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each: array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }
    //Create a method that passes two parameters: a double array and a double element.
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each: array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each: array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (int each: array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }



}
/*
	1. Create a class named FrequencyOfElement:
			1.1 Create a method that passes two parameters: an integer array and an Integer element. The method returns the frequency of the given integer element from the integer array

			1.2 Create a method that passes two parameters: a double array and a double element. The method returns the frequency of the given integer from the array

			1.3 Create a method that passes two parameters: a char array and a char element. The method returns the frequency of the given char element from the char array

			1.4 Create a method that passes two parameters: a String array and a String element. The method returns the frequency of the given String element from the String array
 */
