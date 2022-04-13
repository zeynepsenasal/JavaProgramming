package day15_PractiseTasks;

public class CharacterDivide {
    public static void main(String[] args) {
        String str = "mn@#123Ab!";

        String digits = "";
        String letters = "";
        String chars = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='0'&& ch<='9'){
                digits += ch;
            }else if((ch>='A'&& ch<='Z') ||(ch>='a'&& ch<='z')){
                letters += ch;
            }else{
                chars += ch;
            }

        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special Chars: " + chars);


    }
}
/*
write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */