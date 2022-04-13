package day21_practisetasks;

public class CommonElements {
    public static void main(String[] args) {
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
/*
 Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */