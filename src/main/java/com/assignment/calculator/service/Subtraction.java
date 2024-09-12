package com.assignment.calculator.service;

public class Subtraction implements Calculation{
	@Override
    public Number calculation(Number num1, Number num2) {
        return num2.intValue() - num1.intValue();
    }
}
