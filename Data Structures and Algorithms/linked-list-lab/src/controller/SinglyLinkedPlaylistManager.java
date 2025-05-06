package controller;

import model.Song;

public class SinglyLinkedPlaylistManager {
    class Node {
        Song song; //Holds the data for each node, which in this case is a Song object.
        Node next; //A reference to the next node in the list, allowing traversal forward.

        Node(Song song) {
            this.song = song;
            this.next = null;
        }
    }
    private Node head;
    private Node current;

    public SinglyLinkedPlaylistManager() {
        head = null;
        current = null;
    }

    // Method to add a song to the playlist
    public void addFavoriteSong(Song newSong) {
        if (isDuplicate(newSong)) {
            System.out.println("Song already exists in the playlist.");
            return;
        }
        Node newNode = new Node(newSong);

        if (head == null) {
            head = newNode;
            current = head;
            System.out.println(newSong.getTitle() + " added to the playlist.");
            return;
        }

        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

        System.out.println(newSong.getTitle() + " added to the playlist.");
    }

    private boolean isDuplicate(Song song) {
        Node current = head;
        while (current != null) {
            if (current.song.getTitle().equals(song.getTitle()) && current.song.getArtist().equals(song.getArtist())) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Method to remove a song from the playlist based on the given index
    public void removeFavoriteSong(int index) {
        if (index < 1) {
            System.out.println("Invalid index." );
            return;
        }
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        if (index == 1) {
            System.out.println("Removed song: " + head.song.getTitle());
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        int count = 1;
        while (current != null && count <= index - 1) {
            previous = current;
            current = current.next;
            count++;
        } 

        if (current == null) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.println("Removed song: " + current.song.getTitle());
        previous.next = current.next;
        current.next = null;

    }

    // Method to display all songs with index
    public void displayFavoriteSongs() {

        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        int index = 1;
        Node current = head;
        while (current != null) {
            System.out.println(index + ". " + current.song.getTitle() + " by " + current.song.getArtist() +
                    " (" + current.song.getDuration() + " seconds, " + current.song.getGenre() + ")");
            index++;
            current = current.next;
        }
    }

    // Method to play the next song in the playlist
    public void playNextFavoriteSong() {
        if (current == null) {
            if (head == null) {
                System.out.println("Playlist is empty.");
            } else {
                current = head;
                System.out.println("Now playing: " + current.song.getTitle() + " by " + current.song.getArtist() +
                        " (" + current.song.getDuration() + " seconds, " + current.song.getGenre() + ")");
            }
            return;
        }

        if (current.next == null) {
            System.out.println("No next song in the playlist.");
            return;
        } else {
            current = current.next;
        }

        System.out.println("Now playing: " + current.song.getTitle() + " by " + current.song.getArtist() +
                " (" + current.song.getDuration() + " seconds, " + current.song.getGenre() + ")");

    }

    // Method to play the previous song in the playlist
    public void playPreviousFavoriteSong() {
        if (head == null || current == null) {
            System.out.println("Playlist is empty or no song is currently selected.");
            return;
        }
        
        // Check if current is pointing to the first song
        if (current == head) {
            System.out.println("No previous song in the playlist. Currently at the first song.");
            return;
        }
        
        // Initialize a temporary node to start from the head
        Node temp = head;
        
        // Traverse the list to find the node just before current
        while (temp != null && temp.next != current) {
            temp = temp.next;
        }
        
        // Set current to the previous song (temp)
        current = temp;
        
        // Print the current song details
        System.out.println("Now playing: " + current.song.getTitle() + " by " + current.song.getArtist() +
                " (" + current.song.getDuration() + " seconds, " + current.song.getGenre() + ")");
    }

    // Method to start playing from the first song in the playlist
    public void setCurrentToFirst() {
        current = head;
        if (current != null) {
            System.out.println("Now playing: " + current.song);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    // Check if playlist is empty
    public boolean isEmpty() {
        return head == null;
    }
}