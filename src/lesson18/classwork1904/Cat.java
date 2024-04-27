package lesson18.classwork1904;

public class Cat {
    String name;
    String color;
    int age;

    public Cat() {

    }

    public Cat(String catName) {
        name = catName;
    }

    public Cat(String catName, String color) {
        name = catName;
        this.color = color;
    }

    public Cat(String name,String color, int age) {
        this(name, color);
        this.age = age;
    }

    public  void sleep() {
        System.out.println("Im sleep!");
    }

    void run() {
        System.out.println("Im running!");
    }
    void sayMeow() {
        System.out.println("Meow!");
    }

    public void whoAmI() {
        System.out.println("Iam Cat " + name + ", my age: " + age + ", my color: " +color);
    }
}