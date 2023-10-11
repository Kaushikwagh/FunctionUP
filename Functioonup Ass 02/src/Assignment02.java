/*
Q) Write a program in java that -
    1) Prompts the user to enter their name, age, and whether they are a student or not.
    2) It then reads the input using the Scanner class with appropriate data types (String, int, and boolean).
    3) Based on the user's age, it determines if they are an adult or a minor, and based on their student status,
       it provides a relevant message. (eg: You are eligible to be a student etc).
    Note: Try to use your own method / functions to print messages.
 */
import java.util.Scanner;

public class Assignment02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //  1) Prompts the user to enter their name, age, and whether they are a student or not.
        System.out.println("Your Name");
        String n = sc.nextLine();

        System.out.println("Your age," + n + ".");
        //  2) input using the Scanner class with appropriate data types (String, int, and boolean).
        int age = sc.nextInt();
        System.out.println("Hello," + n + " You are student true/false");
        boolean s = sc.nextBoolean();
        String x ;
        if (age >= 18) {
            x = "adult";
        } else {
            x = "minor";
        }
        //   3) Based on the user's age, it determines if they are an adult or a minor, and based on their student status,
        if (s) {
            System.out.println("Hi, " + n + "! student as a " + x + ".");
        }
        else {
            System.out.println("Hi, " + n + " You are " + x + ".");
        }
        sc.close(); // need to close Scanner Class
    }
}
