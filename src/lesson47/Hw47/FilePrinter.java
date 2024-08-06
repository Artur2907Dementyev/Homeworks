package lesson47.Hw47;

import lesson47.printer.Printer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FilePrinter implements Printer{
    @Override
public void print(double result) {
    try (FileWriter writer = new FileWriter("result.txt", true)) {
        writer.write(String.format("Ваш результат равен: %.2f%n", result));
    } catch (IOException exception) {
        System.err.println("Error writing to file: " + exception.getMessage());
    }
}

    public void backupTextProject(String content) {
        try (FileWriter writer = new FileWriter("backup.txt")) {
            writer.write(content);
        } catch (IOException exception) {
            System.err.println("Error creating backup: " + exception.getMessage());
        }
    }

    public void storeVoiceData(byte[] voiceData) {
        try (FileWriter writer = new FileWriter("voiceData.dat")) {
            writer.write(new String(voiceData));
        } catch (IOException exception) {
            System.err.println("Error storing voice data: " + exception.getMessage());
        }
    }

    public void saveHistory(List<OperationHistory> history) {
        try (FileWriter writer = new FileWriter("history.txt")) {
            for (OperationHistory operation : history) {
                writer.write(operation.toString() + "\n");
            }
        } catch (IOException exception) {
            System.err.println("Error saving history: " + exception.getMessage());
        }
    }

}
