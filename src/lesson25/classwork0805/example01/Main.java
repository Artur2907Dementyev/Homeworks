package lesson25.classwork0805.example01;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Richard", 4);
        Cat pet2 = new Cat("Vasya", 3);

        dog.voice();
        dog.pet();
        dog.feed();
        dog.cleanUp();
        dog.goForAWalk();

        pet2.voice();
        pet2.pet();
        pet2.feed();
        pet2.cleanUp();
    }
}
