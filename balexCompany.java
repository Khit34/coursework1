/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khit
 */ 
//Declaring the class balexCompany
class balexCompany {
    private double basePay;
    private int hoursWorked;

    public  balexCompany(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }
    //declaring the method to be used "calculatePay"
    public String calculatePay() {
        //checking for the basePay
        if (basePay < 8.00) {
            return "Error: Base pay is below the minimum wage.";
        }
        if (hoursWorked > 60) {
            return "Error: Hours worked exceed the maximum allowed hours.";
        }

        //Checking if the hoursWorked exceed 60 hours or not
        int overtimeHours = Math.max(0, hoursWorked - 40);
        int regularHours = Math.min(hoursWorked, 40);
        double totalPay = (regularHours * basePay) + (overtimeHours * basePay * 1.5);
        return String.format("Total pay for %d hours at $%.2f per hour is: $%.2f", hoursWorked, basePay, totalPay);
    }

    public static void main(String[] args) {
          balexCompany[] employees = {
            new  balexCompany(7.50, 35),
            new balexCompany(8.20, 47),
            new  balexCompany(10.00, 73)
        };

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i + 1) + ": " + employees[i].calculatePay());
        }
    }
}
