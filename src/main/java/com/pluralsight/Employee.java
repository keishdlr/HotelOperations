package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private String department;
    private double payRate;
    private double hoursWorked;
    private int employeeId;
    private String name;
    private double startTime;

    //the constructor to help us create an employee
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    //getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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
    public double getTotalPay() {

        //calculate regular and overtime pay assuming 1.5 the pay rate for overtime.
        //that was not in the instructions
        double regularPay = this.getRegularHours() * this.getPayRate();
        double overTimePay = this.getOvertimeHours() * this.getPayRate() * 1.5;

        return regularPay + overTimePay;
    }

    public double getRegularHours() {

        if( this.getHoursWorked() > 40){
            return 40;
        }

        return this.getHoursWorked();
    }

    public double getOvertimeHours() {
        if( this.getHoursWorked() > 40){
            return this.getHoursWorked() - 40;
        }
        return 0;
    }

    //punch-in method to capture start time
    //I need to store this so I can use it's value in punch-out
    public void punchIn(double time){
            this.startTime = time;
    }

    public void punchOut(double time){
            this.hoursWorked += time - this.startTime;
    }
    //overloaded punch in and punch out methods
    public void punchIn(){
        LocalDateTime now = LocalDateTime.now();
        double currentTime = now.getHour() + (now.getMinute() / 60.0);
        System.out.println(currentTime);
    }

    public void punchOut(){
        LocalDateTime now = LocalDateTime.now();
        double currentTime = now.getHour() + (now.getMinute() / 60.0);
        System.out.println(currentTime);
    }

    public void punchTimeCard(double punchInTime, double punchOutTime){
            this.punchIn(punchInTime);
             this.punchOut(punchOutTime);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "ID = " + employeeId +
                ", name = '" + name + '\'' +
                ", department = '" + department + '\'' +
                ", payRate = " + payRate +
                ", hoursWorked = " + hoursWorked +
                ", totalPay = " + getTotalPay() +
                '}';
    }
}


