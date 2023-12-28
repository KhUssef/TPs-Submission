
import java.util.ArrayList;
import java.util.Collections;

public class tp2ex4 {
}
class Song {
    private String title;
    private Artist artist;
    private int songLengthInSeconds;

    public Song(String title, Artist artist, int songLengthInSeconds) {
        this.title = title;
        this.artist = artist;
        this.songLengthInSeconds = songLengthInSeconds;
    }

    public void playSong(){
        System.out.println("listening to "+title+" by "+artist.getArtistName());
    }

    public int getSongLength() {
        return songLengthInSeconds;
    }
    public void show(){
        System.out.println("song name :"+title+" by "+artist.getArtistName()+"\nIt is "+songLengthInSeconds+" seconds long");
    }
}

class Album {
    private String albumTitle;
    private ArrayList<Song> songs;

    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
        this.songs = new ArrayList<>();
    }
    public String getAlbumTitle(){
        return albumTitle;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public void listAllSongs() {
        for (Song song : songs) {
            song.show();
        }
    }
}
class Artist {
    private String artistName;
    private ArrayList<Album> albums;

    public Artist(String artistName) {
        this.artistName = artistName;
        this.albums = new ArrayList<>();
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void deleteAlbum(Album album) {
        albums.remove(album);
    }

    public void listAllAlbums() {
        for (Album album : albums) {
            System.out.println("album "+album.getAlbumTitle());
        }
    }
    public String getArtistName(){
        return artistName;
    }
}

interface User {
    void listen(Song song);
    void addToPlaylist(Song song);
}

class FreeUser implements User {
    private Playlist playlist;

    public FreeUser() {
        this.playlist = new Playlist();
    }

    public void listen(Song song) {
        song.playSong();
    }

    public void addToPlaylist(Song song) {
        playlist.addSong(song);
    }
}

class PremiumUser implements User {
    private Playlist playlist;

    public PremiumUser() {
        this.playlist = new Playlist();
    }

    @Override
    public void listen(Song song) {
        song.playSong();
    }

    @Override
    public void addToPlaylist(Song song) {
        playlist.addSong(song);
    }
}
class Playlist {
    private ArrayList<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public void shuffleSongs() {
        Collections.shuffle(songs);
    }
}
