package cwiczenia.stream.cwiczenie2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Match {

    public static void main(String[] args) {

        Stream<FootballMatch> matchStream = createStream();

        System.out.println("Wszystkie mecze:");
        printAllResultsSorted(matchStream);

        System.out.println(">>>" + "\nWszystkie spotkania Polski:");
        matchStream = createStream();
        printResultsWithTeam(matchStream, "Polska").forEach(System.out::println);

        matchStream = createStream();
        System.out.println(">>>" + "\nLiczba drużyn biorących udział w rozgrywkach: " + countDistinctTeam(matchStream));

        matchStream = createStream();
        System.out.println(">>>" + "\nSuma strzelonych bramek: " +  countAllGoals(matchStream));


    }

    private static int countAllGoals(Stream<FootballMatch> matchStream) {
        return matchStream
                .map(FootballMatch::getMatchGoals)
                .mapToInt(Integer::intValue)
                .sum();
    }

    private static long countDistinctTeam(Stream<FootballMatch> matchStream) {
        return matchStream
                .map(FootballMatch::getTeamNames)
                .flatMap(Arrays::stream)
                .distinct()
                .count();
    }

    private static void printAllResultsSorted(Stream<FootballMatch> matchStream) {
        matchStream
                .sorted((m1, m2) -> -Integer.compare(m1.getHostGoal(), m2.getHostGoal()))
                .forEach(System.out::println);
    }

    private static List<FootballMatch> printResultsWithTeam(Stream<FootballMatch> matchStream, String team) {
        return matchStream.filter(m -> m.getHost().equals(team) || m.getGuest().equals(team))
                .collect(Collectors.toList());
    }

    private static Stream<FootballMatch> createStream() {
        return Stream.of(
                new FootballMatch("Polska", "Niemcy", 3, 0),
                new FootballMatch("Brazylia", "Włochy", 0, 1),
                new FootballMatch("Rosja", "Gruzja", 2, 1),
                new FootballMatch("USA", "Francja", 0, 4),
                new FootballMatch("Columbia", "Indie", 2, 0),
                new FootballMatch("Anglia", "Francja", 1, 1),
                new FootballMatch("Argentyna", "Polska", 0, 5)
        );
    }
}
