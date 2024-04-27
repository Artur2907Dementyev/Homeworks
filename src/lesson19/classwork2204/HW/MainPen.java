package lesson19.classwork2204.HW;

public class MainPen {
    public static void main(String[] args) {
        Pen myPen = new Pen();

        // Write some text
        myPen.write("Hello, world!");

        // Check ink amount
        myPen.checkInk();

        // Refill the pen
        myPen.refill();

        // Write more text
        myPen.write("my day is beautiful and sunny. I love that everyone is friendly and we all stay friends." + "\n");

        // Check ink amount again
        myPen.checkInk();
    }
}
