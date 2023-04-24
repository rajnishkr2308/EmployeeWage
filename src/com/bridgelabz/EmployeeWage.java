package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage Program");

        int attendance =(int) Math.round(Math.random());

        if (attendance == 1){
            System.out.println("employee is present");
        }
        else {
            System.out.println("employee is absent");
        }
    }
}
