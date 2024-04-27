package lesson20.classwork2404.example03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();

        if (Library.bookIsAvailable(bookName)) {
            System.out.println();
            Book book = Library.takeBook(bookName);
            System.out.println("You are reading book "
            + book.getTitle() + " by " + book.getAuthorName());

            Library.returnBook(book);
        }else {
            System.out.println("We don't have that book");
        }
    }
}
