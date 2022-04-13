package day18_NestedLoop.day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("Zeynep", "Saltık");
        domain("zeynep@gmail.com");

        String [] emails = {"zeynep@hotmail.com", "ali@gmail.com", "veli@yahoo.com"};

        for (String email:emails) {
            domain(email);
        }

        month(5);
        day(6);

    }



    //Create a method that can display the initials of the person
    public static void initials(String name, String surname){
        System.out.println(name.charAt(0) + "." + surname.charAt(0));

    }

    //Create a method that can display the domain of the email
    public static void domain(String email){
        String domain = email.substring(email.indexOf('@')+1, email.lastIndexOf('.'));
        System.out.println(domain);
    }

    //Create a method that can display the name of the month based on the given number to the method
    public static void month(int number){
        switch (number){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
            default:
                System.out.println("Invalid");

        }
    }

    //Create a method that can print the name of the day based on the given number to the method
    public static void day(int number){
        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");

        }
    }





    }




/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
 */