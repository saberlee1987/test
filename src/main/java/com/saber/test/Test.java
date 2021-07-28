package com.saber.test;

import com.saber.test.calculator.Calculator;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(Calculator.calculate(10, 20, "+"));
        System.out.println(Calculator.calculate(10, 20, "*"));
        System.out.println(Calculator.calculate(50, 20, "-"));
    }
}

