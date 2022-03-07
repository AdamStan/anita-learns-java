package com.anita.lesson1;

public class Task1A {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("We want to add 2 numbers and print the result");
            return;
        }

        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            System.out.println("a + b = " + (a + b));
        } catch (NumberFormatException ex) {
            System.out.println("We got two arguments, at least one is not a number");
        }

    }
}
