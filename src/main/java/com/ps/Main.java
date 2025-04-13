package com.ps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Calculator 2
        System.out.print("Enter principal: ");
        double principal2 = scanner.nextDouble();

        System.out.print("Enter interest rate: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter the amount of time: ");
        int amountOfYears = scanner.nextInt();

        double annualInterestRate = interestRate / 100;
        double futureValueFormula = principal2 * Math.pow((1 + annualInterestRate / 365), 365 * amountOfYears);

        double interestEarned = futureValueFormula - principal2;

        System.out.printf("Your future value: %.2f", futureValueFormula);
        System.out.printf("\nInterest earned: %.2f", interestEarned);

        //Calculator 1

//        System.out.print("1. Enter principal: ");
//        double principal = scanner.nextDouble();
//
//        System.out.print("2. Enter interest rate: ");
//        double interest = scanner.nextDouble();
//
//        System.out.print("3. Enter loan length: ");
//        double loan = scanner.nextDouble();
//
//
//        double monthlyInterestRate = interest / 12 / 100;
//        double formula = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loan * 12) / (Math.pow(1 + monthlyInterestRate, loan * 12) -1));
//        double totalInterest = (formula * loan * 12) - principal;
//        //(m * n) - P
//
//        System.out.printf("Monthly payment: %.2f", formula);
//        System.out.printf("\nInterest payment: %.2f", totalInterest);

    }
}