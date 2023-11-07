package pro.sky.calculatorspringgalina684.service;

import org.springframework.stereotype.Service;
import pro.sky.calculatorspringgalina684.exception.DivideByZeroException;
import pro.sky.calculatorspringgalina684.service.CalculatorService;


@Service
public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public String Welcome() {
        return "Добро пожаловать в калькулятор!";
    }


    @Override
    public int calculatePlus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int calculateMinus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int calculateMultiply(int num1, int num2) {
        return num1 * num2;

    }

    @Override
    public int calculateDivide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivideByZeroException ("На ноль делить нельзя");
        } else {
            return num1 / num2;
        }
    }
}
