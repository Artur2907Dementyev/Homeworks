package lesson47.Main;


import lesson47.calculator.MathCalculator;
import lesson47.parser.StringParser;
import lesson47.printer.FilePrinter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FilePrinter filePrinter = new FilePrinter();
        MathCalculator mathCalculator = new MathCalculator(filePrinter);
        Scanner scanner = new Scanner(System.in);
        StringParser stringParser = new StringParser(mathCalculator, scanner);

        stringParser.parse();

        scanner.close();
    }

}
