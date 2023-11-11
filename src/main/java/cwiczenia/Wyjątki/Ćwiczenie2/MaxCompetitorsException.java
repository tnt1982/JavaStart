package cwiczenia.Wyjątki.Ćwiczenie2;

public class MaxCompetitorsException extends RuntimeException {

    private final int maxCompetitor;

    public MaxCompetitorsException(int maxCompetitor) {
        this.maxCompetitor = maxCompetitor;
    }

    public int getMaxCompetitor() {
        return maxCompetitor;
    }
}
