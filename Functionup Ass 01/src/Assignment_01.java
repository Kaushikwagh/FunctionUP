/*
Q1. Write a program for calculators in java which performs
    addition, subtraction, multiplication and division of any two numbers.
    Take user input using Scanner class and print the results of every calculation.
 */
import java.util.Scanner;

public class Assignment_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program for Calculator");

        System.out.println("First Number");
        float a = sc.nextInt();

        System.out.println("Second Number");
        float b = sc.nextInt();

        float c = a + b ;
        float d = a - b ;
        float e = a * b ;
        float f = a / b ;

        System.out.println("Results of every calculation.");
        System.out.println("Add: " + c);
        System.out.println("Sub: " + d);
        System.out.println("Multi: " + e);
        System.out.println("Div: " + f);
    }
}
