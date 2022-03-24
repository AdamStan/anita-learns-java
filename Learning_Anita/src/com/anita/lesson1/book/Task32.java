package com.anita.lesson1.book;

import java.util.Scanner;

public class Task32 {
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me temperature in celsius!");

        while(!scanner.hasNextDouble()) {
            System.out.println("Give me a number!");
            scanner.next();
        }

        double tempInCelsius = scanner.nextDouble();
        double tempInFahrenheit = celsiusToFahrenheit(tempInCelsius);
        System.out.println(tempInCelsius + " C = " + tempInFahrenheit + " F");
    }
}
