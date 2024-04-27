package consultation_09.staticInitBlock;

import java.util.Arrays;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println("До вызова конструктора класса: " + Arrays.toString(StaticBlock.getStrings()));


        StaticBlock sb = new StaticBlock();

        System.out.println("\n =============================== \n");

//        StaticBlocks sb1 = new StaticBlocks();
//        System.out.println(sb.getTitle());
//        System.out.println(sb.getCapacity());

        System.out.println("После вызова конструктора класса: " + Arrays.toString(StaticBlock.getStrings()));

        StaticBlock.printInfo();
        sb.showInfo();

        System.out.println("value counter: " + StaticBlock.counter);
    }
}
