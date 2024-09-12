package com.assignment.calculator.service;

public class Division implements Calculation{
    @Override
    public Number calculation(Number num1, Number num2) {
        if (num2.intValue() == 0) throw new IllegalArgumentException("Division by zero is not allowed");
        return num1.intValue() / num2.intValue();
    }
}
