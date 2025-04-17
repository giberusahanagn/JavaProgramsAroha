package com.aroha;

import java.util.Scanner;

public class FourDigitProgram {

    // Method to check if a number is a 4-digit number
    private static boolean isFourDigit(double number) {
        return number >= 1000 && number <= 9999;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1;
        double number2;
        String operator = null;
        double result = 0;

        // Input first 4-digit number
        while (true) {
            System.out.print("Enter 1st 4-digit number: ");
            number1 = scanner.nextDouble();
            if (isFourDigit(number1)) {
                break;
            } else {
                System.err.println("Invalid! Please enter a 4-digit number.");
            }
        }

        // Input second 4-digit number
        while (true) {
            System.out.print("Enter 2nd 4-digit number: ");
            number2 = scanner.nextDouble();
            if (isFourDigit(number2)) {
                break;
            } else {
                System.err.println("Invalid! Please enter a 4-digit number.");
            }
        }

        scanner.nextLine(); // Clear the newline character from the buffer

        // Input valid operator using regex
        while (true && number2!=number1) {
            System.out.print("Enter an operator (+, -, *, /): ");
            operator = scanner.nextLine();
            if (operator.matches("[+\\-*/]")) {
                break;
            } else {
                System.err.println("Invalid operator. Please enter only one of +, -, *, /");
            }
        }

        // Perform the operation
        switch (operator.charAt(0)) {
            case '+':
                result = number1 + number2;
                System.out.println("Addition: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Subtraction: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Multiplication: " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Division: " + result);
                } else {
                    System.err.println("Error: Division by zero is not allowed.");
                }
                break;
        }

        scanner.close();
    }
}
