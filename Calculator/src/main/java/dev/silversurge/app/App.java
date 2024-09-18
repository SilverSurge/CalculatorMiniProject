package dev.silversurge.app;

import dev.silversurge.calculator.Calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();
        int option;

        while (true) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("0. Close Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Factorial");
            System.out.println("7. Natural Log");
            System.out.println("8. Power");

            System.out.print("Select Option: ");
            option = scanner.nextInt();

            if (option == 0) {
                System.out.println("Closing Program...");
                break;
            }

            double num1, num2;

            switch (option) {
                case 1: // Addition
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.add(num1, num2));
                    break;

                case 2: // Subtraction
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.subtract(num1, num2));
                    break;

                case 3: // Multiplication
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.multiply(num1, num2));
                    break;

                case 4: // Division
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    try {
                        System.out.println("Result: " + calculator.divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5: // Square Root
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    try {
                        System.out.println("Result: " + calculator.squareRoot(num1));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 6: // Factorial
                    System.out.print("Enter a positive integer: ");
                    int num = scanner.nextInt();
                    try {
                        System.out.println("Result: " + calculator.factorial(num));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 7: // Natural Log
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    try {
                        System.out.println("Result: " + calculator.naturalLog(num1));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 8: // Power
                    System.out.print("Enter the base and exponent: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.power(num1, num2));
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}