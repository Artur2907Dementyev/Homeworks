package lesson46.Hw46;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    private List<Playable> playlist = new ArrayList<>();

    public void addToPlaylist(Playable... items) {
        for (Playable item : items) {
            playlist.add(item);
        }
    }

    public void playAll() {
        for (Playable item : playlist) {
            item.printInfo();
            item.play();
        }
    }

    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        AudioTrack track1 = new AudioTrack("Song 1");
        AudioTrack track2 = new AudioTrack("Song 2");
        Video video1 = new Video("Movie 1");

        player.addToPlaylist(track1, track2, video1);
        player.playAll();
    }
}
