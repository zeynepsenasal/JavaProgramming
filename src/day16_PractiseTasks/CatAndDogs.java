package day16_PractiseTasks;

public class CatAndDogs {
    public static void main(String[] args) {
        String str = "caT dog dogG cAt".toLowerCase();
        int frequencyOfCats = 0;
        int frequencyofDogs = 0;

        for (int i = 0; i <= str.length()-3; i++) {
            String cat = str.substring(i, i+3);
            String dog = str.substring(i, i+3);

            if(cat.equals("cat")){
                frequencyOfCats++;
            }
            if(dog.equals("dog")){
                frequencyofDogs++;
            }
        }

        if(frequencyOfCats==frequencyofDogs){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
/*
 write a program to print true if the string "cat" and "dog"
 appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true

 */