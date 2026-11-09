package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

        }
        public double getTotalPay() {
            return this.payRate * this.hoursWorked;

        }
        public double getRegularHours () {
            return this.hoursWorked;
        }
        public double getOvertimeHours() {
            return this.hoursWorked - 40;
        }
}
