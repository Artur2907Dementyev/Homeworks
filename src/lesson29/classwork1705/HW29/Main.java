package lesson29.classwork1705.HW29;

public class Main {
    public static void main(String[] args) {
        Girya girya1 = new Girya("Iron", "Gray", 36);
        Girya girya2 = new Girya("Steel", "Silver", 44);

        System.out.println("Girya 1: " + girya1);
        System.out.println("Girya 2: " + girya2);

        int comparisonResult = girya1.compareTo(girya2);
        if (comparisonResult > 0) {
            System.out.println("Girya 1 is heavier.");
        } else if (comparisonResult < 0) {
            System.out.println("Girya 2 is heavier.");
        } else {
            System.out.println("Both giryas have the same weight.");
        }
    }
}


