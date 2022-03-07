package com.anita.lesson1;

import java.util.Scanner;

public class Task2 {
    public static long factorialRecursive(long n) {
        if (n <= 1) {
            return 1;
        }
        return factorialRecursive(n - 1) * n;
    }

    public static long factorialIterate(long n) {
        long result = 1;
        for (long i = n; i > 1; i--) {
            result = result * i;
        }
        return result;
    }

    public static long factorialIterate2(long n) {
        long result = 1;
        for (long i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }



    public static void main(String[] args) {
//        System.out.println("The result recursive + " + factorialRecursive(10));
//        System.out.println("The result iterate + " + factorialIterate(10));
//        System.out.println("The result iterate2 + " + factorialIterate2(10));

        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number");
        while(!sc.hasNextLong()) {
            System.out.println("Give me a NUMBER!");
            sc.next();
        }
        long n = sc.nextLong();
        System.out.println("The result for " + n + " is: " + factorialRecursive(n));
    }
}
