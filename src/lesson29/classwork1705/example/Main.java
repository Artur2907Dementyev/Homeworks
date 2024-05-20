package lesson29.classwork1705.example;

public class Main {
    public static void main(String[] args) {
        Box<Cat> box = new Box<>();
        Box<Dog> dogBox = new Box<>();

        Cat cat = new Cat();
        box.put(cat);

        System.out.println(box);

        Cat myCat = box.take();

        System.out.println(box);
        System.out.println(cat == myCat);
    }
}
