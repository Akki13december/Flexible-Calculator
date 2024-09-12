package com.assignment.calculator.service;

	import java.util.HashMap;
	import java.util.Map;
	
	import com.assignment.calculator.entity.Operation;
	
	public class Calculator {
	    private final Map<Operation, Calculation> operations = new HashMap<>();
	    
	    public Calculator() {
	        operations.put(Operation.ADD, new Addition());
	        operations.put(Operation.SUBTRACT, new Subtraction());
	        operations.put(Operation.MULTIPLY, new Multiplication());
	        operations.put(Operation.DIVIDE, new Division());
	    }
	
	    public Number calculate(Operation op, Number num1, Number num2) {
	    	Calculation operation = operations.get(op);
	        if (operation == null) {
	            throw new UnsupportedOperationException("This operation is not supported by the calculator");
	        }
	        return operation.calculation(num1, num2);
	    }
	
	    public void addNewOperation(Operation opType, Calculation operation) {
	        operations.put(opType, operation);
	    }
	
	    public Number chainingNumber(Number initialAssignedValue, Map<Operation, Number> chainingOperations) {
	        Number result = initialAssignedValue;
	        for (Map.Entry<Operation, Number> entry : chainingOperations.entrySet()) {
	            result = calculate(entry.getKey(), result, entry.getValue());
	        }
	        return result;
	    }
	}

