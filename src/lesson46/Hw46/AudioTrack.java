package lesson46.Hw46;

public class AudioTrack implements Playable{
    private String title;

    public AudioTrack(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing an audio track: " + title);
    }

    @Override
    public void printInfo() {
        System.out.println("Audio track: " + title);
    }
}

