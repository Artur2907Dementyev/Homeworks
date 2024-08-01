package lesson46.Hw46;

public interface Playable {
    void play();

    default void printInfo() {
        System.out.println("This is the executable file.");
    }
}

