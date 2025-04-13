package com.ps;
import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1) Mortgage Calculator.");
        System.out.println("2) CD's Future Value.");
        System.out.println("Which Calculator would you like to use?");
        int givenCommand = scanner.nextInt();
        // a menu to choose which calculator the user would li

        switch(givenCommand){
            case 1:
                System.out.println("Enter the amount of the loan: ");
                double loan = scanner.nextDouble();

                System.out.println("Enter your Annual Interest Rate in decimal form please.");
                float annualInterestRate = scanner.nextFloat();

                System.out.println("Enter the Length of Loan in years");
                int years = scanner.nextInt();
                // to enter each requested amount from the user so it can get the final answer.

                float monthlyRate = annualInterestRate / 12;      // the monthly interest rate, the given annual interest rate divided by the 12 months.
                int numberOfPayments = years * 12;               // payment plan is 12 months, 1 year. so the 12 months * the amount of years the loan length is.
                double paymentPlan = loan * (monthlyRate * (Math.pow(1 + monthlyRate, numberOfPayments))) /
                        ((Math.pow(1 + monthlyRate, numberOfPayments)) - 1);
                // Following the formula: M=P×(i*(1+i)^n / ((1+i)^n)-1), and having as a double because it'll be a large number and could be a decimal.

                System.out.println("Your monthly payment is: $" + paymentPlan);
                // print final answer.
                break;

            case 2:
                System.out.println("Enter the Initial Deposit amount: ");
                double initialDeposit = scanner.nextDouble();
                // double since the deposit amount could be large.

                System.out.println("Enter the Annual Interest Rate in decimal form please: ");
                double annualRate = scanner.nextDouble();
                // I used a double here because it can still be used for manipulating decimals numbers.

                System.out.println("Enter the Number of Years: ");
                int numberOfYears = scanner.nextInt();
                // int for years since it's not a large number.

                double futureValue = initialDeposit * Math.pow(1 + (annualRate / 365), 365 * numberOfYears);
                // Following the formula: FV = P × (1 + (r / 365))^(365 × t), and having as a double because it'll be a large number and could be a decimal.

                System.out.printf("CD future value is: " + futureValue);
                // Printing the final answer using printf so that it prints formatted strings using various format specifiers.
                break;
        }
    }
}