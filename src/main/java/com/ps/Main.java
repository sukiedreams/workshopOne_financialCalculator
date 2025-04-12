package com.ps;
import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1) Mortgage Calculator.");
        System.out.println("2) CD's Future Value.");
        System.out.println("3) Annuity Present Value.");
        System.out.println("Which Calculator would you like to use?");
        int givenCommand = scanner.nextInt();

        switch(givenCommand){
            case 1:
                System.out.println("Enter the amount of the loan: ");
                double loan = scanner.nextDouble();

                System.out.println("Enter your Annual Interest Rate in decimal form please.");
                float annualInterestRate = scanner.nextFloat();

                System.out.println("Enter the Length of Loan in years");
                int years = scanner.nextInt();

                float monthlyRate = annualInterestRate / 12;
                int numberOfPayments = years * 12;
                double paymentPlan = loan * (monthlyRate * (Math.pow(1 + monthlyRate, numberOfPayments))) /
                        ((Math.pow(1 + monthlyRate, numberOfPayments)) - 1);

                System.out.println("Your monthly payment is: $" + paymentPlan);

            case 2:
                System.out.println("Enter the Initial Deposit amount: ");
                double initialDesposit = scanner.nextDouble();

                System.out.println("Enter the Annual Interest Rate in decimal form please: ");
                double annualRate = scanner.nextDouble();

                System.out.println("Enter the Number of Years: ");
                int numberOfYears = scanner.nextInt();

                double futureValue = initialDesposit * Math.pow(1 + (annualRate / 365), 365 * numberOfYears);

                System.out.printf("CD future value is: " + futureValue);
        }
    }
}