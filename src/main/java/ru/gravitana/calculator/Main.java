package ru.gravitana.calculator;

public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        double num2 = 2.5;

        System.out.println(num1 + " + " + num2 + " = " + Calculator.sum(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + Calculator.multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + Calculator.divide(num1, num2));
        System.out.println(num1 + " / " + 0 + " = " + Calculator.divide(num1, 0));
        System.out.println(num1 + " - " + num2 + " = " + Calculator.subtract(num1, num2));
    }
}