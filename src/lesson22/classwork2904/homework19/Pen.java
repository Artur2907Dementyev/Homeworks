package lesson22.classwork2904.homework19;

public class Pen {
    private int inkAmount = 100;

    public Pen() {
        inkAmount = 100;
    }

    public int getInkAmount() {
        return inkAmount;
    }

    public void write(String text) {
        if (text.length() > inkAmount) {
            return;
        }
        for (int i = 0; i < text.length(); i++) {
        if (inkAmount == 0) {
            break;
        }
        System.out.println(text.charAt(i));
        inkAmount--;

    }
        System.out.println();

    }


}

