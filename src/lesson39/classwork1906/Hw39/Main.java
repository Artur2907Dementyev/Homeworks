package lesson39.classwork1906.Hw39;

import java.util.Scanner;

public class Main {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("What do you want to put in the Message? ");
    String input = scanner.nextLine();

    if (input.equals("line")) {
        Message<String> message = new Message<>();
        System.out.println("Enter the string:");
        message.setMessage(scanner.nextLine());
        System.out.println("You entered a string " + message.getMessage());
    } else if (input.equals("number")) {
        Message<Integer> message = new Message<>();
        System.out.println("Enter the number:");
        try {
            message.setMessage(Integer.parseInt(scanner.nextLine()));
        } catch (NumberFormatException e) {
            System.err.println("Invalid number entered!");
        }
        System.out.println("You entered a number" + message.getMessage());
    } else {
        System.err.println("Invalid input!");
    }
}
}

class Message<T> {
    private T message;

    public Message() { }

    public T getMessage() { return message; }

    public void setMessage(T message) { this.message = message; }
}
