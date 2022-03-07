package com.anita.lesson1;

public class Task1B {
    public static void main(String[] args) {
        double result = 0.0;

        for (String s : args) {
            try {
                result += Double.parseDouble(s);
            } catch (Exception ex) {
                System.out.println("The parameter " + s + "  is not a number");
            }
        }
        System.out.println("The result of adding N numbers: " + result);
    }
}
