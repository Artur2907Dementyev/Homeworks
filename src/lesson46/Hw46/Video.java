package lesson46.Hw46;

public class Video implements Playable {
    private String title;

    public Video(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
    }

    @Override
    public void printInfo() {
        System.out.println("Video: " + title);
    }
}
