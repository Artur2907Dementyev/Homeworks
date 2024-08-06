package lesson47.calculator;

import lesson47.operator.Operator;
import lesson47.printer.Printer;

import static lesson47.operator.Operator.*;

public class MathCalculator implements Calculator {

    private final Printer printer;

    public MathCalculator(Printer consolePrinter) {
        this.printer = consolePrinter;
    }

    public void calculate(double first, double second, Operator operator) {
        double result = 0.0;

        switch (operator) {
            case SUM -> result = first + second;
            case SUBTRACTION -> result = first - second;
            case DIVIDE -> result = first / second;
            case MULTIPLY -> result = first * second;
        }

        printer.print(result);

    }
}
