package InterviewQuestions.Array;

public class CommonElements {
    public static void main(String[] args) {
        //PRINT COMMON ELEMENTS OF TWO ARRAY
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {2,4,5,7,10};


        for (int each:arr1) {
            for (int each2:arr2) {
                if(each==each2)
                    System.out.print(each + " ");
            }
        }
    }
}
