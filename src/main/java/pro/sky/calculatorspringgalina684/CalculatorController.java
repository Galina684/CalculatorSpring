package pro.sky.calculatorspringgalina684;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorServiceImpl;

    public CalculatorController(CalculatorService calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @RequestMapping(value = {"/", "/calculator"})
    public String Welcome() {
        return calculatorServiceImpl.Welcome();
    }

    @GetMapping(path = "/calculator/plus")
    public int calculatePlus(@RequestParam("num1") int numOne, @RequestParam("num2") int numTwo) {
        return calculatorServiceImpl.calculatePlus(numOne, numTwo);
    }

    @GetMapping(path = "/calculator/minus")
    public int calculateMinus(@RequestParam("num1") int numOne, @RequestParam("num2") int numTwo) {
        return calculatorServiceImpl.calculateMinus(numOne, numTwo);
    }

    @GetMapping(path = "/calculator/multiply")
    public int calculateMultiply(@RequestParam("num1") int numOne, @RequestParam("num2") int numTwo) {
        return calculatorServiceImpl.calculateMultiply(numOne, numTwo);
    }


    @GetMapping(path = "/calculator/divide")
    public int calculateDivide(@RequestParam("num1") int numOne, @RequestParam("num2") int numTwo) {
        return calculatorServiceImpl.calculateDivide(numOne, numTwo);
    }
}
