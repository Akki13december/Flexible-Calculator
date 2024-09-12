package com.assignment.calculator.service;

	public class Multiplication implements Calculation{
	    @Override
	    public Number calculation(Number num1, Number num2) {
	        return num1.intValue() * num2.intValue();
	    }
	}
