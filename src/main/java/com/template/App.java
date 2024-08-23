package com.template;

import java.util.ArrayList;
import java.util.List;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        // TODO: Implement this method
        return a + b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        // TODO: Implement this method
        return false;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
        // TODO: Implement this method
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        // TODO: Implement this method
        if (n > 0) {
            return n * factorial(n - 1);
        }
        else if (n == 0) {
            return 1;
        }
        return 1;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        // TODO: Implement this method
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        // TODO: Implement this method
        String result = "";
        int i = input.length()-1;

        while (i >= 0) {
            char letra = input.charAt(i);
            result += letra;
            i -= 1;
        }
        return result;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        int divisores = 0;
        for(int i = number;i>0;i--) {
            if (number % i == 0) {
                divisores++;
            }
        }
        if(divisores == 2){
            return true;
        }
        return false;

    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        // TODO: Implement this method
        int min = array[0];
        for (int element : array) {

            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        // TODO: Implement this method
        int sum = 0;
        for (int element: array) {
            sum += element;

        }
        return sum;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        // TODO: Implement this method
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
}
