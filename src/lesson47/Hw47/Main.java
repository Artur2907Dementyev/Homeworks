package lesson47.Hw47;

import lesson47.parser.StringParser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FilePrinter filePrinter = new FilePrinter();
        MathCalculator mathCalculator = new MathCalculator(filePrinter);
        Scanner scanner = new Scanner(System.in);
        StringParser stringParser = new StringParser(mathCalculator, scanner);

        stringParser.parse();

        filePrinter.saveHistory(mathCalculator.getHistory());

        filePrinter.backupTextProject("This is the content of the text project.");

        byte[] voiceData = "This is some voice data.".getBytes();
        filePrinter.storeVoiceData(voiceData);

        scanner.close();
    }
}
