package InterviewQuestions.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] nums= {1,2,3,4,5,6,7,8,9};


        int[] reverse = new int[nums.length];

        for (int i = nums.length-1, j=0; i >=0 ; i--, j++) {
            reverse[i]= nums[j];
        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("------------------------------------------");
        //SECOND SOLUTION (returns as string)
        int[] nums2= {1,2,3,4,5,6,7,8,9};
        int x= nums2.length;

        while (x>0){
            //--x
            System.out.print(nums2[--x] + " ");
        }

    }
}
