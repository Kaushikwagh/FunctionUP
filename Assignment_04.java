//loops and the modulo operator

import java.util.Scanner;

public class Assignment_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Problem 01 -Simple While Loop
        //Write a program that uses a `while` loop to print numbers from 1 to 5.

        /*
        System.out.println("Using loop");
        int i = 1;
        while (i<=5){
            System.out.println(i);
            i++;
        }
         */

        // Problem 02 - Simple For Loop
        //Create a program that uses a `for` loop to print the even numbers from 2 to 10.

        /*
        int n = 10;
        for (int i =2; i<=n; i+=2) {
            System.out.println(i);
        }
         */

        //Problem 3: Simple Do-While Loop
        //Write a program that uses a `do-while` loop to repeatedly ask the user for a number until they enter 0.
        // After the loop, print the sum of all the entered numbers.

        /*
        int sum=0;
        int n;
        do{
            System.out.println("Enter the number");
            n = sc.nextInt();
            sum += n;
        }while(n !=0);
        int a = sum;
        System.out.println("sum of all the entered numbers is :" + a);
         */

        //Problem 4: Break Statement
        //Modify the previous program with a `while` loop to stop asking for numbers if the user enters a negative number.
        //Calculate and print the sum of all non-negative numbers entered.

        /*
        int sum = 0;
        int n;

        System.out.println("Enter negative number");
        n = sc.nextInt();
        while(n>=0){
            sum += n;
            System.out.println("Enter another negative number");
            n = sc.nextInt();
        }
        int a = sum;
        System.out.println("The sum of all non-negative numbers :" +a);
         */

        //Problem 5: Modulo Operator
        //Write a program that asks the user for an integer and checks if it's even or odd
        //using the modulo operator (%). Display whether the number is even or odd.
        //These problems are designed to introduce beginners to loops and the modulo operator in a simple
        //and straightforward manner.

        /*
        System.out.print("Enter integer ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
         */


    }
}
