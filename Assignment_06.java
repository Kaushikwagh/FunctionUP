
public class Assignment_06 {

    // problem 01
    public static int stringToNumber(String str) {
        //TODO: Convert str into a number
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    // problem 02
    public static int sum(int[] arr) {
        int sum = 0;
        for (int no : arr) {
            if (no > 0) {
                sum += no;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Problem 01 - https://www.codewars.com/kata/544675c6f971f7399a000e79/train/java
        // String to integer

//        String a = "1234";
//        int n1 = stringToNumber(a);
//        System.out.println(n1);
//
//        String b = "605";
//        int n2 = stringToNumber(b);
//        System.out.println(n2);
//
//        String c = "1405";
//        int n3 = stringToNumber(c);
//        System.out.println(n3);
//
//        String d = "-7";
//        int n4 = stringToNumber(d);
//        System.out.println(n4);

        // Method 2 - Simple way to convert string to integer using Integer.parseInt(is used to parse the string str and convert it into an int. )

//        String a = "1234";
//        String b = "605";
//        String c = "1405";
//        String d = "-7";
//        int n1 = Integer.parseInt(a);
//        int n2 = Integer.parseInt(b);
//        int n3 = Integer.parseInt(c);
//        int n4 = Integer.parseInt(d);
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
//        System.out.println(n4);

        // Problem 02- https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java
        // Sum of positive
        // You get an array of numbers, return the sum of all of the positives ones.
        //Example [1,-4,7,12] => 1 + 7 + 12 = 20
        //Note: if there is nothing to sum, the sum is default to 0.
        //ARRAYS-FUNDAMENTALS


//        int[] n = {1, -4, 7, 12};
//        int res = sum(n);
//        System.out.println("Sum of positive numbers: " + res);


        // problem 3 - Is it even? - https://www.codewars.com/kata/555a67db74814aa4ee0001b5/train/java

        // In this Kata we are passing a number (n) into a function.
        //Your code will determine if the number passed is even (or not).
        //The function needs to return either a true or false.
        //Numbers may be positive or negative, integers or floats.
        //Floats with decimal part non equal to zero are considered UNeven for this kata.

        // comment out 1
//        Number nc = new Number();
//
//        printIsEven(nc, 4.0);
//        printIsEven(nc, 7.0);
//        printIsEven(nc, 4.5);
//    }
//
//    public static void printIsEven(Number nc, double num) {
//        boolean isEven = nc.isEven(num);
//        System.out.println(num + " is even: " + isEven);
    }
}

    // problem 3
    // comment out 2

//class Number {
//
//    public boolean isEven(double n) {
//        return n % 2 == 0;
//    }
//}











