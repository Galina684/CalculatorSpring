package pro.sky.calculatorspringgalina684.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculatorspringgalina684.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorServiceImpl;

    public CalculatorController(CalculatorService calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    private String showCalculator(int num1, int num2, char action, int result) {
        return String.format("%d %c %d = %d", num1, action, num2, result);
    }

    @GetMapping
    public String Welcome() {
        return calculatorServiceImpl.Welcome();
    }

    @GetMapping(path = "/plus")
    public String calculatePlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = calculatorServiceImpl.calculatePlus(num1, num2);
        return showCalculator(num1, num2, '+', result);
    }

    @GetMapping(path = "/minus")
    public String calculateMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = calculatorServiceImpl.calculateMinus(num1, num2);
        return showCalculator(num1, num2, '-', result);
    }

    @GetMapping(path = "/multiply")
    public String calculateMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = calculatorServiceImpl.calculateMultiply(num1, num2);
        return showCalculator(num1, num2, '*', result);
    }


    @GetMapping(path = "/divide")
    public String calculateDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя";
        }
        int result = calculatorServiceImpl.calculateDivide(num1, num2);
        return showCalculator(num1, num2, '/', result);
    }
}
