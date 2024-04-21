package lesson18.classwork1904;

public class MainDog {
    public static void main(String[] args) {
        Dog dog = new Dog("bim", 5);

        String info = dog.whoAmI();

        System.out.println(info);

        dog.run();
        dog.run();
        dog.run();

        System.out.println(dog.whoAmI());
    }
}
