package com.anita.lesson1.book;

public class Task22 {

    public static void main(String[] args) {
        String day, date, month, year;
        day = "Wednesday";
        date = "16";
        month = "march";
        year = "2022";

        printDateInAmericanFormat(day, date, month, year);
        // czwartek, 18 sierpnia 2016
        System.out.println("Format european");
        System.out.println(day + ", " + date + " " + month + " " + year);
    }

    /**
     * Prints a date in format: czwartek, sierpień 18, 2016.
     */
    static void printDateInAmericanFormat(String day, String date, String month, String year) {
        System.out.println("Format americana");
        System.out.println(day + ", " + month + " " + date + ", " + year + ".");
    }


}
