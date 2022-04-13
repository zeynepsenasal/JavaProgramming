package day21_ForEachLoop;

public class ForEachLoopPractise {
    public static void main(String[] args) {
        String word[] = {"Java Programming", "Cydeo School", "Angry Birds","Wooden Spoon", "Early Birds"};

        for(String each : word){
            System.out.println(each.charAt(0) + ""+ each.charAt(each.length()-1));
        }


    }
}
