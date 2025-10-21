package com.pluralsight;

import java.util.Scanner;

public class Employee {
    //Store and calculate payroll
    private int employeeID;
    private  String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    Scanner myScanner = new Scanner(System.in);

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //derived getters
    public double getTotalPay(){
        double getTotalPay = payRate * hoursWorked;
        return getTotalPay();
    }
    // max hours worked 40
    public double getRegularHours(){
        return Math.min (hoursWorked, 40);
    }
    public double getOverTimeHours(){
         double getOverTimeHours = hoursWorked - getRegularHours();
        return getOverTimeHours();
    }
    public double punchIn(){

        System.out.println("What time are you punchingIn");
        double punchIn = myScanner.nextDouble();
        System.out.println("You signed in at " + punchIn);
        return punchIn;
    }
    public double punchOut(){
        System.out.println("What time are you punchingIN");
        double punchOut = myScanner.nextDouble();
        System.out.println("You signed out at " + punchOut);
        hoursWorked = punchOut - punchIn();
        return punchOut;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "ID = " + employeeID +
                ", name = '" + name + '\'' +
                ", department = '" + department + '\'' +
                ", payRate = " + payRate +
                ", hoursWorked = " + hoursWorked +
                '}';
    }
}
