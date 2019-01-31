package com.sample;

public class Calculator {

    public static void main(String [] args) {
        System.out.println("Addition result : " + addition(10, 20));
        System.out.println("Substraction result : " + addition(10, 20));
        System.out.println("Multiplication result : " + addition(10, 20));
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int substraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }
}
