package testExample;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class TestCalculator {
	
	Calculator calculator = new Calculator();

	@Test
    void Should_add_two_numbers_and_return_result() {
        
        int expectedResult = 2 + 3;
        int actualResult = calculator.add(2, 3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void Should_substract_two_numbers_and_return_result() {
       
        int expectedResult = 2 - 3;
        int actualResult = calculator.sub(2, 3);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void Should_multiply_two_numbers_and_return_result() {
       
        int expectedResult = 2 * 3;
        int actualResult = calculator.multiply(2, 3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void Should_divide_two_numbers_and_return_result() {
       
        float expectedResult = (float) 2 / 3;
        float actualResult = calculator.divide(2, 3);
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(2, 0);
        });

 

    }
}
