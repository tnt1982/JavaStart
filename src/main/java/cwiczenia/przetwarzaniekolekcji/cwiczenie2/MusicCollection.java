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

        System.out.println("Łączny czas trwania piosenek " + " na playliście (w sekundach): "
                + sumLengthOfSongsForChosenGenre(songs, Song.Genre.POP));
    }

    private static int sumLengthOfSongsForChosenGenre(List<Song> songs, Song.Genre genre) {
        return songs
                .stream()
                .filter(song -> Objects.equals(song.getGenre(), genre))
                .map(song -> song.getLength())
                .mapToInt(Integer::intValue)
                .sum();
    }


}
