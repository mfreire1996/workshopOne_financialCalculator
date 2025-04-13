package com.ps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("1. Enter principal: ");
        double principal = scanner.nextDouble();

        System.out.print("2. Enter interest rate: ");
        double interest = scanner.nextDouble();

        System.out.print("3. Enter loan length: ");
        double loan = scanner.nextDouble();


        double monthlyInterestRate = interest / 12 / 100;
        double formula = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loan * 12) / (Math.pow(1 + monthlyInterestRate, loan * 12) -1));
        double totalInterest = (formula * loan * 12) - principal;
        //(m * n) - P

        System.out.printf("Monthly payment: %.2f", formula);
        System.out.printf("\nInterest payment: %.2f", totalInterest);
        
    }
}