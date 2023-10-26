public class Assignment_05 {

    //Problem 01 - Swapping two numbers
    static void swapNumbers(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("The value of variable after swap...|");
        System.out.println("Value of x is " + x);
        System.out.println("Value of y is " + y);

    }

    // Problem 02 - Finding the Maximum Element
    static int findMax(int []arr){
    int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > a) {
                a = arr[i];
            }
        }
        return a;
    }

    // Problem 03- Check if a Number is Prime
    static boolean isPrime(int n){
        if (n<=1){                                      // check if the input number is less than or equal to 1. If it is, return false because any number less than or equal to 1 is not prime.
            return false;
        }
        if (n<=3){
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {                 // Check if the input number is equal to 2. If it is, return true because 2 is a prime number.
            return false;                               // Numbers from 3 to the square root of the input number (inclusive) in increments of 2 (to avoid even divisors).
        }
        int i;
        for ( i = 2; i <= Math.sqrt(n); i++) {         // Math.sqrt is function  calculates the square root of the given number.
            if (n % i == 0) {                          // The n is divisible by a value other than 1 and same n
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        // Problem 1: Swapping Two Numbers
        // Write a Java program that defines a method called swapNumbers that takes two integer variables as input and swaps their values. Call this method from the main method and print the values of the variables before and after the swap

//        int x = 9, y = 5;
//        System.out.println("The value of variable before swap...|");
//        System.out.println("Value of x is " + x);
//        System.out.println("Value of y is " + y);
//
//        swapNumbers(x, y);

        // Problem 2: Finding the Maximum Element
        //Write a Java program that defines a method called findMax that takes an array of integers as input and returns the maximum element in the array. Call this method from the main method and print the maximum value.

//        int[] no = {20,54,89,32,62,63,73,90,101,165,3,53,189,134};
//        int max = findMax(no);
//        System.out.println("The maximum value: " + max);

        // Problem 3: Check if a Number is Prime
        //Write a Java program that defines a method called isPrime that takes an integer as input and returns a boolean value indicating whether the number is prime or not. A prime number is a positive integer greater than 1 that has no positive divisors other than 1 and itself. Call this method from the main method and print whether a given number is prime or not.
        // Meaning of problem 3 - determine whether a given integer is a prime number or not. It specifies that a prime number is a positive integer greater than 1 that has no positive divisors other than 1 and itself. Your program should return a boolean value, true if the number is prime, and false if it's not.

//        int a = 3;
//
//        if (isPrime(a)) {
//            System.out.println(a + " is a prime number.");
//        } else {
//            System.out.println(a + " is not a prime number.");
//        }


    }
}

