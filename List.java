package MusicStreaming;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
    
public class List {

private ArrayList<Song> songs = new ArrayList<Song>();

public List() {
        songs.add(new Song("better off", "Ariana Grande", 140668461));
        songs.add(new Song("Streets", "Doja Cat", 956143304));
        songs.add(new Song("Low", "SZA", 223771570));
        songs.add(new Song("Crew Love", "Drake", 326163366));
        songs.add(new Song("G.O.M.D", "J.Cole", 63615388));
        songs.add(new Song("White Noise", "Disclosure", 84906452));
        songs.add(new Song("Escapism", "RAYE", 684972182));
        songs.add(new Song("Foreplay", "Jalen Santoy", 217782490));
        songs.add(new Song("Happier than Ever", "Billie Eilish", 1195914370));
        songs.add(new Song("Party in the U.S.A.", "Miley Cyrus", 1420203830));
}

public void printSongs() { // Feature 3: Pring a list of the songs stored
        for (Song printSong : songs) {
            System.out.println("Title: " + printSong.gettitle() + ",  Artist: " + printSong.getartist() + ",  Playcount: " + printSong.getplayCount());
        }
}

public void addSong() { // Feature 1: Add a new song to the list of songs
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("What is the name of the song that you would like to add?");
            String Title = scanner.nextLine();

            System.out.println("What is the name of the artist?");
            String Artist = scanner.nextLine();

            System.out.println("What is the play count of the song?");
            int playCount = scanner.nextInt();

            Song newSong = new Song(Title, Artist, playCount);

            songs.add(newSong);
        }
}

public void removeSong() { // Feature 2 : Remove a song from the list of songs
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("What is the name of the song that you would like to remove?");
            String removeSongName = scanner.nextLine();
   
            System.out.println("What is the name of the artist you want to remove?");
            String removeArtistName = scanner.nextLine();
   
            Iterator<Song> iterator = songs.iterator();
            boolean songRemoved = false;
   
            while (iterator.hasNext()) {
                Song removeSong = iterator.next();
   
                if (removeSong.getartist().equals(removeArtistName) && removeSong.gettitle().equals(removeSongName)) {
                    iterator.remove();
                    songRemoved = true;
                    System.out.println("This song has been removed successfully.");
                    break;
                }
            }

            if (!songRemoved) {
                System.out.println("The song you wish to remove is not on the list.");
            }
        }
}

public void showplayCount() {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Insert a minimum playcount");
        int playcount = scanner.nextInt();
        System.out.println("Here is a list of songs with over " + playcount + " plays");
        
        if (playcount >= 0 && playcount < 99999999) {
            for (Song song : songs) {
                if (song.getplayCount() > playcount) {
                    System.out.println("Title: " + song.gettitle() + ", Artist: " + song.getartist() + ", Playcount: " + song.getplayCount());
                }
            }
        } else {
            System.out.println("Invalid play count. Please enter a positive number less than 99999999.");
        }
    } catch (Exception e) {
        System.out.println("An unexpected error occurred: " + e.getMessage());
    }
}
}
