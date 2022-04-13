package day07_Operators.day13_StringPractiseTasks;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)");
        String split = scan.next();
        System.out.println("Number of people entered:");
        int people = scan.nextInt();
        System.out.println("enter check amount");
        double check = scan.nextDouble();
        System.out.println("How was the service quality?");
        String quality = scan.next();

        boolean valid = quality.equalsIgnoreCase("Poor") || quality.equalsIgnoreCase("Fair") ||
                quality.equalsIgnoreCase("Good") || quality.equalsIgnoreCase("Great") || quality.equalsIgnoreCase("Excellent")
                && (split.equalsIgnoreCase("Yes") || split.equalsIgnoreCase("No"));

        double tip = 0;

        if (split.equalsIgnoreCase("Yes")) {
            if (quality.equalsIgnoreCase("Poor")) {
                tip = check * 5 / 100;
                System.out.println("Number of people entered: " + people + "\nTotal to pay: " + (check + tip)
                        + "\nTotal tip: " + tip +
                        "\nTotal per person: " + (check + tip) / people +
                        "\nTip per person: " + tip / people);
            } else if (quality.equalsIgnoreCase("Fair")) {
                tip = check * 10 / 100;
                System.out.println("Number of people entered: " + people + "\nTotal to pay: " + (check + tip)
                        + "\nTotal tip: " + tip +
                        "\nTotal per person: " + (check + tip) / people +
                        "\nTip per person: " + tip / people);
            } else if (quality.equalsIgnoreCase("Good")) {
                tip = check * 15 / 100;
                System.out.println("Number of people entered: " + people + "\nTotal to pay: " + (check + tip)
                        + "\nTotal tip: " + tip +
                        "\nTotal per person: " + (check + tip) / people +
                        "\nTip per person: " + tip / people);
            } else if (quality.equalsIgnoreCase("Great")) {
                tip = check * 20 / 100;
                System.out.println("Number of people entered: " + people + "\nTotal to pay: " + (check + tip)
                        + "\nTotal tip: " + tip +
                        "\nTotal per person: " + (check + tip) / people +
                        "\nTip per person: " + tip / people);

            } else if (quality.equalsIgnoreCase("Excellent")) {
                tip = check * 25 / 100;
                System.out.println("Number of people entered: " + people + "\nTotal to pay: " + (check + tip)
                        + "\nTotal tip: " + tip +
                        "\nTotal per person: " + (check + tip) / people +
                        "\nTip per person: " + tip / people);

            }
        } else if (split.equalsIgnoreCase("No")) {
            if (quality.equalsIgnoreCase("Poor")) {
                tip = check * 5 / 100;
                System.out.println("Number of people entered: " + people + "\nTotal to pay: " + (check + tip)
                        + "\nTotal tip: " + tip);
            } else if (quality.equalsIgnoreCase("Fair")) {
                tip = check * 10 / 100;
                System.out.println("Number of people entered: " + people + "\nTotal to pay: " + (check + tip)
                        + "\nTotal tip: " + tip);
            } else if (quality.equalsIgnoreCase("Good")) {
                tip = check * 15 / 100;
                System.out.println("Number of people entered: " + people + "\nTotal to pay: " + (check + tip)
                        + "\nTotal tip: " + tip);
            } else if (quality.equalsIgnoreCase("Great")) {
                tip = check * 20 / 100;
                System.out.println("Number of people entered: " + people + "\nTotal to pay: " + (check + tip)
                        + "\nTotal tip: " + tip);

            } else if (quality.equalsIgnoreCase("Excellent")) {
                tip = check * 25 / 100;
                System.out.println("Number of people entered: " + people + "\nTotal to pay: " + (check + tip)
                        + "\nTotal tip: " + tip);
            }


        }

    }
}
/*
Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number)
	Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method

 */