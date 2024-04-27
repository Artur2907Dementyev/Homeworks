package lesson19.classwork2204.HW;

public class Pen {
    private int inkAmount;

    public Pen() {
        this.inkAmount = 100;
    }

    public void write(String text) {
        int inkRequired = text.length();

        if (inkAmount >= inkRequired) {
            System.out.println(text);
            inkAmount -= inkRequired;
        } else {
            System.out.println("Not enough ink to write the entire text.");
        }
    }

    public void refill() {
        inkAmount = 100;
        System.out.println("Pen refilled. Ink amount set to 100.");
    }

    public void checkInk() {
        System.out.println("Ink amount remaining: " + inkAmount);
    }

    public static void main(String[] args) {
        Pen myPen = new Pen();

        myPen.write("Hello, world!");

        myPen.checkInk();

        myPen.refill();

        myPen.write("my day is beautiful and sunny. I love that everyone is friendly and we all stay friends.");

        myPen.checkInk();
    }
}
