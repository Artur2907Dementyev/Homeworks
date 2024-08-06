package lesson47.Hw47;

import lesson47.calculator.Calculator;
import lesson47.operator.Operator;
import lesson47.printer.Printer;

import java.util.ArrayList;
import java.util.List;

public class MathCalculator implements Calculator {
    private final Printer printer;
    private final List<OperationHistory> history;

    public MathCalculator(Printer consolePrinter) {
        this.printer = consolePrinter;
        this.history = new ArrayList<>();
    }

    public void calculate(double first, double second, Operator operator) {
        double result = 0.0;

        switch (operator) {
            case SUM -> result = first + second;
            case SUBTRACTION -> result = first - second;
            case DIVIDE -> {
                if (second != 0) {
                    result = first / second;
                } else {
                    printer.print(Double.parseDouble("Error: Division by zero"));
                    return;
                }
            }
            case MULTIPLY -> result = first * second;
        }

        history.add(new OperationHistory(first, second, operator.toString(), result));
        printer.print(result);
    }

    public List<OperationHistory> getHistory() {
        return history;
    }
}
