package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String str[] = {"Zeynep", "Ahmet", "Ahmet", "Ali", "Can", "Bilal", "Bilal", "Onur"};

        for(String each:str){
            int count = 0;

            for(String word : str){
                if(word==each){
                    count ++;
                }
            }
            if(count==1){
                System.out.println(each);

            }
        }
    }





}
