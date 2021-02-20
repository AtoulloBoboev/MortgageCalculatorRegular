package com.codewithatoullo;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;

        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();
        int numberOfPayments = period * MONTH_IN_YEAR;

        double mortgage = principal * (monthlyInterest * (Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Monthly payment: " + result);
    }
}
