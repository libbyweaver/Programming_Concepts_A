package MusicStreaming;

public class Song {

    private String artist;
    private String title;
    private int playCount;

    public Song(String title, String artist, int playCount) {
        this.artist = artist;
        this.title = title;
        this.playCount = playCount;
    }

    public Song() {
    }

    public String getartist() {
        return artist;
    }

    public String gettitle() {
        return title;
    }

    public int getplayCount() {
        return playCount;
    }

    public void setartist(String artist) {
        this.artist = artist;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public void setplayCount(int playCount) {
        this.playCount = playCount;
    }

    public void printSongs() {
    }

    public void addSong() {
    }

    public void removeSong() {
    }
}
