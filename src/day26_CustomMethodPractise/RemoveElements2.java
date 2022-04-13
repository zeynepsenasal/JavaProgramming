package day26_CustomMethodPractise;

import Utilities.ArraysUtility;

public class RemoveElements2 {

    public static int[] removeElement(int[] array, int index){
        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if(i != index){
                ArraysUtility.addElement(result,array[i]);
            }

        }
        return result;
    }
}
