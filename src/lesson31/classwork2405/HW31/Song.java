package lesson31.classwork2405.HW31;

import java.util.ArrayList;
import java.util.List;

public class Song {

    private String title;
    private String artist;
    private int durationSeconds;

    public Song(String title, String artist, int durationSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }

    @Override
    public String toString() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return artist + " - " + title + " (" + minutes + ":" + (seconds) + ")";
    }
}

class Playlist {
    private List<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public List<Song> getListeningQueue() {
        return songs;
    }

    public List<Song> getReverseListeningQueue() {
        List<Song> reversedSongs = new ArrayList<>(songs);
        java.util.Collections.reverse(reversedSongs);
        return reversedSongs;
    }

    public List<Song> getShuffledListeningQueue() {
        List<Song> shuffledSongs = new ArrayList<>(songs);
        java.util.Collections.shuffle(shuffledSongs);
        return shuffledSongs;
    }

    public static void main(String[] args) {
        Song song1 = new Song("Kino", "Группа Крови", 235);
        Song song2 = new Song("Rammstein", "Sonne", 230);
        Song song3 = new Song("Sabaton", "The Red Baron", 202);
        Song song4 = new Song("DVRST","Endless Love" ,179);
        Song song5 = new Song("Chirs Keya","Hotlines" ,202);
        Song song6 = new Song("Tokomi Tosimo","" ,165);

        Playlist myPlaylist = new Playlist();
        myPlaylist.addSong(song1);
        myPlaylist.addSong(song2);
        myPlaylist.addSong(song3);
        myPlaylist.addSong(song4);
        myPlaylist.addSong(song5);
        myPlaylist.addSong(song6);

        System.out.println("Listening Queue:");
        for (Song song : myPlaylist.getListeningQueue()) {
            System.out.println(song);
        }

        System.out.println("\nReverse Listening Queue:");
        for (Song song : myPlaylist.getReverseListeningQueue()) {
            System.out.println(song);
        }

        System.out.println("\nShuffled Listening Queue:");
        for (Song song : myPlaylist.getShuffledListeningQueue()) {
            System.out.println(song);
        }
    }
}
