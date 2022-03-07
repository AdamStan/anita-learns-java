package com.anita.lesson1.task3;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    private static Department department;
    static {
        Employee emp1 = new Employee(1, "Adam", "Stan");
        Employee emp2 = new Employee(2, "Adam2", "Stan");
        Employee emp3 = new Employee(3, "Adam3", "Stan");
        Employee emp4 = new Employee(4, "Adam4", "Stan");
        department = new Department(1, "ALotOfAdams");
        department.getEmployees().add(emp1);
        department.getEmployees().add(emp2);
        department.getEmployees().add(emp3);
        department.getEmployees().add(emp4);
    }

    public static void main(String[] args) {
        System.out.println(department);
        printEmployees();
        Scanner sc = new Scanner(System.in);
        printMenu();
        while(sc.hasNext()) {
            String answer = sc.next();
            switch (answer) {
                case "1" -> {
                    addEmployee(sc);
                    printEmployees();
                }
                case "q" -> {
                    System.out.println("The end");
                    System.exit(0);
                }
                default -> System.out.println("wrong input");
            }
            printMenu();
        }
    }

    static void printEmployees() {
        System.out.println("EMPLOYEES");
        department.getEmployees().forEach(System.out::println);
    }

    static void printMenu() {
        System.out.println("What do you want to do?");
        System.out.println("(1) Add employee");
        System.out.println("(q) Quit");
    }

    static void addEmployee(Scanner sc) {
        System.out.println("Employee's name");
        String name = sc.next();
        System.out.println("Employee's last name");
        String lastName = sc.next();
        int id = department.getEmployees().get(department.getEmployees().size() - 1).getId() + 1;
        Employee emp = new Employee(id, name, lastName);
        department.getEmployees().add(emp);
    }
}
