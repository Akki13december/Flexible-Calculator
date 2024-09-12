package com.assignment.calculator.service;

public class Modulus implements Calculation {
	@Override
    public Number calculation(Number num1, Number num2) {
        return num1.doubleValue() % num2.doubleValue();
    }
}
