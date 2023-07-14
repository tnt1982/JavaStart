package cwiczenia.przetwarzaniekolekcji.cwiczenie2;

import java.util.List;
import java.util.Objects;

class MusicCollection {
    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", Song.Genre.POP),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", Song.Genre.POP)
        );

        sumLengthOfSongsForChosenGenre(songs, Song.Genre.POP);
        sumLengthOfSongsForChosenGenre(songs, Song.Genre.METAL);

        numberOfSongsForChosenArtist(songs, "Metallica");
        numberOfSongsForChosenArtist(songs, "Imagine Dragons");

        listOfSongsWithoutChosenGenre(songs, Song.Genre.POP);
        listOfSongsWithoutChosenGenre(songs, Song.Genre.METAL);
    }

    private static void sumLengthOfSongsForChosenGenre(List<Song> songs, Song.Genre genre) {
        int sumOfLength = songs
                .stream()
                .filter(song -> Objects.equals(song.getGenre(), genre))
                .mapToInt(Song::getLength)
                .sum();
        System.out.println("\nŁączny czas trwania piosenek " + genre + " na playliście (w sekundach): " + sumOfLength);
    }

    private static void numberOfSongsForChosenArtist(List<Song> songs, String artist) {
        long numberOfSongs = songs
                .stream()
                .filter(song -> Objects.equals(song.getArtist(), artist))
                .count();
        System.out.println("\nLiczba utworów artysty " + artist + " wynosi: " + numberOfSongs);
    }

    private static void listOfSongsWithoutChosenGenre(List<Song> songs, Song.Genre genre) {
        List<Song> listOfSongs = songs.stream()
                .filter(song -> !Objects.equals(song.getGenre(), genre))
                .distinct()
                .toList();
        System.out.println("\nLista utworów bez " + genre + ":");
        listOfSongs.forEach(System.out::println);
    }
}