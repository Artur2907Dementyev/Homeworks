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
        AudioTrack track1 = new AudioTrack("Song: Группа крови Zoi");
        AudioTrack track2 = new AudioTrack("Song: Engel Rammstein");
        Video video1 = new Video("Movie: WALL·E");

        player.addToPlaylist(track1, track2, video1);
        player.playAll();
    }
}
