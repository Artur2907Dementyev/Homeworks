package lesson18.classwork1904;

public class MainCat {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catName = cat.name;
        System.out.println("Name: " + catName);

        System.out.println("Color: " + cat.color);
        System.out.println("Age: " + cat.age);


        System.out.println("\n ======================== \n");

        Cat cat1 = new Cat("Max");

        System.out.println("Color cat1: " +cat1.color);
        System.out.println("Name cat1: " +cat1.name);
        System.out.println("\n ======================== \n");

        Cat cat2 = new Cat("Diamond", "red", 5);
        cat2.whoAmI();

        Cat cat3 = new Cat("Kartos","black", 9);
        cat3.whoAmI();
    }
}
