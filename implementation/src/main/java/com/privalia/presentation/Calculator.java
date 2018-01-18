package com.privalia.presentation;

public class Calculator implements ICalculator{
    public int add(int a, int b) {
        return a+b;
    }

    public int subs(int a, int b) {
        return a-b;
    }

    public int mul(int a, int b) {
        return a*b;
    }

    public int div(int a, int b) {
        return a/b;
    }
}
