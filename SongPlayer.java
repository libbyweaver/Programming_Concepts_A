package MusicStreaming;

import java.util.Scanner;

public class SongPlayer {

    public static void main(String[] args) {
        List songList = new List();
        Scanner scanner = new Scanner (System.in);

        int choice;
        do {
            System.out.println("Please Select An Option:");
            System.out.println("To see the list of songs press 1");
            System.out.println("To add a song press 2");
            System.out.println("To remove a song press 3");
            System.out.println("To see songs over a certain number of plays press 4");

            choice = scanner.nextInt();

            switch (choice) {
            
            case 1:
                songList.printSongs();
                break;
                
            case 2:
                songList.addSong();
                break;

            case 3:
                songList.removeSong();
                break;

            case 4:
                songList.showplayCount();
                break;
            }
        } while (choice != 5);

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
