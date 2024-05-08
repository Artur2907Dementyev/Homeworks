package consultation_12.animals;

public class SuperCat extends Animal{
    public SuperCat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("SuperCat meow!");
    }

    public void fly() {
        System.out.println("Super cat want flying!");
    }
}
