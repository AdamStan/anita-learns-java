package com.anita.lesson1.task3;

public class Task3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Adam", "Stan");
        Employee emp2 = new Employee(2, "Adam2", "Stan");
        Employee emp3 = new Employee(3, "Adam3", "Stan");
        Employee emp4 = new Employee(4, "Adam4", "Stan");
        Department department = new Department(1, "ALotOfAdams");
        department.getEmployees().add(emp1);
        department.getEmployees().add(emp2);
        department.getEmployees().add(emp3);
        department.getEmployees().add(emp4);
        // first
        System.out.println(department);
        for(Employee emp : department.getEmployees()) {
            System.out.println(emp);
        }
        // second
        System.out.println(department);
        department.getEmployees().forEach(emp -> {
            System.out.println(emp);
        });
        // third
        System.out.println(department);
        department.getEmployees().forEach(System.out::println);
    }
}
