package day08_IfStatement;

public class NumberOfDays {
    int number = 5;
    boolean has28Days = number == 2;
    boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
    boolean has31Days = !has28Days && !has30Days;


}
