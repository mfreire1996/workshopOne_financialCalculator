package com.ps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        //Calculator 2
//        System.out.print("Enter principal: ");
//        double principal2 = scanner.nextDouble();
//        if (principal2 <= 0){
//            System.out.println("Principle must be greater than 0");
//            System.exit(0);
//    }
//
//        System.out.print("Enter interest rate: ");
//        double interestRate = scanner.nextDouble();
//        if (interestRate <= 0){
//            System.out.println("Interest must be greater than 0");
//            System.exit(0);
//        }
//
//        System.out.print("Enter the amount of time: ");
//        int amountOfYears = scanner.nextInt();
//        if (amountOfYears <= 0){
//            System.out.println("Years must be greater than 0");
//            System.exit(0);
//        }
//
//        double annualInterestRate = interestRate / 100;
//        double futureValueFormula = principal2 * Math.pow((1 + annualInterestRate / 365), 365 * amountOfYears);
//
//        double interestEarned = futureValueFormula - principal2;
//
//        System.out.printf("Your future value: %.2f", futureValueFormula);
//        System.out.printf("\nInterest earned: %.2f", interestEarned);

//        End of Calc 2

        //Calculator 1

//        System.out.print("1. Enter principal: ");
//        double principal = scanner.nextDouble();
//        if (principal <= 0) {
//            System.out.println("Principle must be greater than 0");
//            System.exit(0);
//        }
//
//        System.out.print("2. Enter interest rate: ");
//        double interest = scanner.nextDouble();
//        if (interest <= 0) {
//            System.out.println("Interest must be greater than 0");
//            System.exit(0);
//        }
//
//        System.out.print("3. Enter loan length: ");
//        double loan = scanner.nextDouble();
//        if (loan <= 0){
//            System.out.println("Loan must be greater than 0");
//            System.exit(0);
//        }
//
//
//        double monthlyInterestRate = interest / 12 / 100;
//        double formula = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loan * 12) / (Math.pow(1 + monthlyInterestRate, loan * 12) -1));
//        double totalInterest = (formula * loan * 12) - principal;
//        //(m * n) - P
//
//        System.out.printf("Monthly payment: %.2f", formula);
//        System.out.printf("\nInterest payment: %.2f", totalInterest);

//        End of Calc 1

        }
    }