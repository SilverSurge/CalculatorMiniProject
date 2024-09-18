package dev.silversurge.calculator;

public class Calculator {

    // Addition
    public Double add(Double num1, Double num2) {
        return num1 + num2;
    }

    // Subtraction
    public Double subtract(Double num1, Double num2) {
        return num1 - num2;
    }

    // Multiplication
    public Double multiply(Double num1, Double num2) {
        return num1 * num2;
    }

    // Division
    public Double divide(Double num1, Double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    // Square Root
    public Double squareRoot(Double num) throws ArithmeticException {
        if (num < 0) {
            throw new ArithmeticException("Square root of negative number is not allowed.");
        }
        return Math.sqrt(num);
    }

    // Factorial (using recursion)
    public Long factorial(Integer num) throws ArithmeticException {
        if (num < 0) {
            throw new ArithmeticException("Factorial of negative number is not allowed.");
        } else if (num == 0 || num == 1) {
            return 1L;
        } else {
            return num * factorial(num - 1);
        }
    }

    // Natural Log (ln)
    public Double naturalLog(Double num) throws ArithmeticException {
        if (num <= 0) {
            throw new ArithmeticException("Natural log of non-positive numbers is not allowed.");
        }
        return Math.log(num);
    }

    // Power Function
    public Double power(Double base, Double exponent) {
        return Math.pow(base, exponent);
    }
}

