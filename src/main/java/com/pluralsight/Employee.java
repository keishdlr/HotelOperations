package com.pluralsight;

public class Employee {
    //Store and calculate payroll
    private String employeeID;
    private  String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double totalPay;

    //derived getters
    public double totalPay(){
        totalPay = payRate * hoursWorked;
        return totalPay();
    }
    public double regularHours(){

        return regularHours();
    }
    public double overTimeHours(){

        return overTimeHours();
    }
}
