package pro.sky.calculatorspringgalina684;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplTest {

    CalculatorServiceImpl calculatorTest = new CalculatorServiceImpl();

    @Test
    public void WelcomeTest() {

        assertEquals(calculatorTest.Welcome(), "Добро пожаловать в калькулятор!");
    }

    @Test
    public void calculatePlusTest() {
        assertEquals(calculatorTest.calculatePlus(10, 20), 30);
    }

    @Test
    public void calculateMinusTest() {
        assertEquals(calculatorTest.calculateMinus(50, 40), 10);
    }

    @Test
    public void calculateMultiplyTest() {
        assertEquals(calculatorTest.calculateMultiply(5, 8), 40);
    }

    @Test
    public void calculateDivideTest() {
        assertEquals(calculatorTest.calculateDivide(30, 3), 10);
    }

}
