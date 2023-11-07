package pro.sky.calculatorspringgalina684;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculatorspringgalina684.exception.DivideByZeroException;
import pro.sky.calculatorspringgalina684.service.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest {

    CalculatorServiceImpl calculatorTest = new CalculatorServiceImpl();
    private static final int POZITVE_VALUE = 10;
    private static final int NEGATIVE_VALUY = -5;
    private static final int ZERO = 0;
    public static Stream<Arguments> minusCases(){
        return Stream.of(
                Arguments.of(POZITVE_VALUE, POZITVE_VALUE, POZITVE_VALUE-POZITVE_VALUE),
                Arguments.of(ZERO, POZITVE_VALUE,ZERO-POZITVE_VALUE),
                Arguments.of(NEGATIVE_VALUY,POZITVE_VALUE,NEGATIVE_VALUY-POZITVE_VALUE)
        );
    }

    @Test
    void calculatePlus() {
        int result = calculatorTest.calculatePlus(POZITVE_VALUE, POZITVE_VALUE);
        assertEquals(POZITVE_VALUE + POZITVE_VALUE, result);
    }



    @ParameterizedTest
    @MethodSource("minusCases")
    void calculateMinus(int num1, int num2, int expected ) {
        int result = calculatorTest.calculateMinus(num1,num2);
        assertEquals(expected, result);
    }


    @Test
    void divideZero(){
        assertThrows(DivideByZeroException.class, () -> calculatorTest.calculateDivide(POZITVE_VALUE, ZERO));
    }
}
