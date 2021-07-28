package com.saber.test.calculator;

public class Calculator {
    private static long sum(Integer num1, Integer num2) {
        return num1 + num2;
    }

    private static long sub(Integer num1, Integer num2) {
        return num1 - num2;
    }

    private static long mul(Integer num1, Integer num2) {
        return num1 * num2;
    }

    private static long div(Integer num1, Integer num2) {
        return num1 / num2;
    }

    public static long calculate(Integer num1, Integer num2, String op) {
        switch (op) {
            case "+":
            case "sum":
            case "plus":
            case "add":
                return sum(num1, num2);
            case "-":
            case "minus":
            case "sub":
                return sub(num1, num2);
            case "*":
            case "mul":
                return mul(num1, num2);
            case "div":
            case "/":
                return div(num1, num2);
            default:
                throw new IllegalArgumentException("operator is Wrong");
        }
    }
}
