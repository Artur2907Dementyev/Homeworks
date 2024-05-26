package lesson31.classwork2405;

import lesson31.classwork2405.example02.TabHistory;

import java.util.LinkedList;
import java.util.Queue;

public class Main01 {
    public static void main(String[] args) {
        TabHistory tabHistory = new TabHistory("https://www.google.com/");
        tabHistory.goToPage("https://www.google.com/search?q=java");
        tabHistory.goToPage("https://www.w3schools.com/java/");
        tabHistory.goToPage("https://www.w3schools.com/java/java_oop.asp");
        System.out.println(tabHistory.getCurrentPage());
        tabHistory.goBack();
        tabHistory.goBack();
        System.out.println(tabHistory.getCurrentPage());
        tabHistory.goToPage("https://www.oracle.com/java/technologies/downloads/");
        tabHistory.goBack();
        System.out.println(tabHistory.getCurrentPage());
        tabHistory.goForward();
        System.out.println(tabHistory.getCurrentPage());
    }
}
