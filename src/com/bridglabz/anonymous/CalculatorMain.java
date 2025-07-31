package com.bridglabz.anonymous;

public class CalculatorMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator() {
            @Override
            public void addition(int a, int b) {
                System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
            }


            @Override
            public void subtraction(int a, int b) {
                System.out.println("Difference of " + a + " and " + b + " is: " + (a - b));

            }

            @Override
            public void multiplication(int a, int b) {
                System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));

            }

            @Override
            public void division(int a, int b) {
                System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
            }
        };
        calculator.addition(10, 20);
        calculator.subtraction(20, 10);
        calculator.multiplication(10, 10);
        calculator.division(10, 2);
    }
}
//Anonymous inner class implements Interface