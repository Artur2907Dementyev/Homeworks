package lesson23.classwork0305.HW;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + ".");
    }
}
