//Based On If Else Statement

import java.util.Scanner;

public class Assignment_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Problem 1: Simple If-Else Statement
        // Write a program that asks the user for their age using `Scanner`.
        // If the age is greater than or equal to 18, print "You are an adult." Otherwise, print "You are a minor."

        /*
        System.out.println("Enter your age");
        int a = sc.nextInt();

        if (a >= 18) {
            System.out.println ("You are an adult");
        }
        else {
            System.out.println("You are a minor");
        }
         */

        // Problem 2: If-Else If-Else Block
        //Create a program that takes an integer input from the user and determines if it's positive,
        //negative, or zero. Display an appropriate message.

        /*
        int a ;
        System.out.println("Enter integer");
        a = sc.nextInt();

        if(a>0){
            System.out.println("the number is positive.");
        } else if (a<0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero");
        }
         */

        //Problem 3: Logical Operators
        //Write a program that prompts the user for a number.
        //Check if the number is both even and greater than 10.
        //If both conditions are met, print "The number is even and greater than 10."

        /*
        int a ;
        System.out.println("Enter a number");
        a = sc.nextInt();

        if(a % 2 == 0 && a > 10){
            System.out.println("The number is both even and greater than 10");
        } else {
            System.out.println("Both conditions not met");
        }
         */

        //Problem 4: Comparing Strings
        //Ask the user to enter their favorite color using `Scanner`. If the input is "blue," print "Blue is a cool color." Otherwise, print "Your favorite color is nice too!"
        //These problems introduce the basics of decision-making in code, including if-else statements, logical operators, and string comparisons, making them suitable for beginners.

        // Method 1
        /*
        System.out.print("Enter your favorite color");
        String color = sc.next();

        if (color.equalsIgnoreCase("blue")) {
            System.out.println("Blue is a cool color.");
        } else {
            System.out.println("Your favorite color is nice too!");
        }

         */

        //Method 2
        /*
        System.out.print("Enter your favorite color: ");
        String color = new Scanner(System.in).next();

        System.out.println(color.equalsIgnoreCase("blue") ? "Blue is a cool color." : "Your favorite color is nice too!");
         */


    }
}
