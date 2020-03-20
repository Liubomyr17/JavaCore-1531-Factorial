package com.company;

/*

1531. Level 15 Lection 12. Factorial
Write a method that calculates factorial - the product of all numbers from 1 to the entered number including it.
Calculation example: 4! = factorial (4) = 1 * 2 * 3 * 4
Output Example: 24
1. Enter from the console a number less than or equal to 150.
2. Implement the factorial function.
3. If the entered number is less than 0, then print 0.
0! = 1

Requirements:
1. The program should read data from the keyboard.
2. The program should display the factorial of the entered number.
3. The factorial method should return a string representation of the factorial of the number passed to it as a parameter.
4. The factorial method must accept one parameter of type int.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        if (n < 0) {
            return "0";
        } else if (n == 0) {
            return "1";
        } else {
            return mathFactorial(BigInteger.valueOf(n)).toString();
        }

    }

    public static BigInteger mathFactorial(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return n;
        }

        return n.multiply(mathFactorial(n.subtract(BigInteger.ONE)));
    }
}



