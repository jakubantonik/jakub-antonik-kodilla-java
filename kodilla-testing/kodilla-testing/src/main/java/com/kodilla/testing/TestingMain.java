package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator simpleCalculator = new Calculator();


        int result1 = simpleCalculator.AddAToB(5,5);
        int result2 = simpleCalculator.SubtractAFromB(10, 3);
        System.out.println(result1);
        System.out.println(result2);

    }
}