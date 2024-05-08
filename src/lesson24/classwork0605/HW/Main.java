package lesson24.classwork0605.HW;

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();

        pen1.write("Hello, World!");
        pen2.write("My day is wonderful and sunny");

        pen1.checkInk();
        pen2.checkInk();
        System.out.println("pen2 was refiled");
        pen2.refill();
        pen2.checkInk();

        System.out.println("\n==== toString ==========\n");

        System.out.println("Pen 1: " + pen1);
        System.out.println("Pen 2: " + pen2);

        System.out.println("\n==== hashCode ==========\n");
        System.out.println("Pen 1 hash code: " + pen1.hashCode());
        System.out.println("Pen 2 hash code: " + pen2.hashCode());

        System.out.println("\n==== equals ==========\n");
        System.out.println("Are pens equal? " + pen1.equals(pen2));
    }

}
