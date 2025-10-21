package com.pluralsight;

public class Employee {
    //Store and calculate payroll
    private String employeeID;
    private  String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    //derived getters
    public double getTotalPay(){
       double getTotalPay() = payRate * hoursWorked;
        return getTotalPay();
    }
    public double getRegularHours(){

        return getRegularHours();
    }
    public double getOverTimeHours(){
         double getOverTimeHours() = hoursWorked - getRegularHours();
        return getOverTimeHours();
    }
}
