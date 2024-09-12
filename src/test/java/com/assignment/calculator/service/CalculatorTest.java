package com.assignment.calculator.service;

import org.junit.jupiter.api.Test;

import com.assignment.calculator.entity.Operation;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashMap;
import java.util.Map;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.calculate(Operation.ADD, 2, 3));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate(Operation.DIVIDE, 5, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    @Test
    void testChaining() {
        Map<Operation, Number> operations = new LinkedHashMap<>();
        operations.put(Operation.ADD, 3);
        operations.put(Operation.MULTIPLY, 2);
        assertEquals(16, calculator.chainingNumber(5, operations));
    }

    @Test
    void testUnsupportedOperation() {
        assertThrows(UnsupportedOperationException.class, () -> {
            calculator.calculate(Operation.MODULUS, 10, 2);
        }, "UnsupportedOperationException should be thrown for unsupported operations");
    }
}
