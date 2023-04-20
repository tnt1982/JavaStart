package cwiczenia.kolejki.cwiczenie1;

public enum Priority {
    LOW(1),
    MODERATE(2),
    HIGH(3);

    public int rank;

    Priority(int rank) {
        this.rank = rank;
    }
}
