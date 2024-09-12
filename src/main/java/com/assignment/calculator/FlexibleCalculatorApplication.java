package com.assignment.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assignment.calculator.entity.Operation;
import com.assignment.calculator.service.Calculator;

@SpringBootApplication
public class FlexibleCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlexibleCalculatorApplication.class, args);
		Calculator calculator = new Calculator();
		Number result = calculator.calculate(Operation.ADD, 2, 3); 

		
	}

}
