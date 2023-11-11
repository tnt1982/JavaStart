package cwiczenia.Wyjątki.Ćwiczenie2;

class Competition {
    private String name;
    private Participant[] participants;
    private int ageLimit;
    private int size;

    public Competition(String name, int maxParticipants, int ageLimit) {
        this.name = name;
        if (ageLimit < 0)
            throw new IllegalArgumentException("Limit wieku musi być większy od zera.");
        this.ageLimit = ageLimit;
        this.participants = new Participant[maxParticipants];
    }

    void addParticipant(Participant participant) {
        if (participant.getAge() < ageLimit)
            throw new AgeViolationException(ageLimit);
        if (participants.length == size)
            throw new MaxCompetitorsException(participants.length);
        participants[size] = participant;
        checkDuplicate(participant);
        size++;
    }

    private void checkDuplicate(Participant participant) {
        for (int i = 0; i < size; i++) {
            if (participants[i].getDocumentId().equals(participant.getDocumentId()))
                throw new DuplicateException(participant);
        }
    }

    boolean hasFreeSpots() {
        return size < participants.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Zawody ")
                .append(name)
                .append("\n")
                .append("Liczba uczestników: ").append(size);
        for (int i = 0; i < size; i++) {
            builder.append("\n");
            builder.append(" > ");
            builder.append(participants[i].toString());
        }
        return builder.toString();
    }
}