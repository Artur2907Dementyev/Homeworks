package lesson20.classwork2404.example01;

public class Main {
    public static void main(String[] args) {
        Human mihail = new Human("Mihail", 28);
        Human olga = new Human("Olga", 27);

        System.out.println(mihail.getName());
        System.out.println(olga.getName());
        System.out.println("Species: " + mihail.species);
    }
}
