package cwiczenia.stream.cwiczenie2;

import java.sql.PreparedStatement;
import java.util.Objects;

public class FootballMatch {

    private String host;
    private String guest;
    private int hostGoal;
    private int guestGoal;

    public FootballMatch(String host, String guest, int hostGoal, int guestGoal) {
        this.host = host;
        this.guest = guest;
        this.hostGoal = hostGoal;
        this.guestGoal = guestGoal;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public int getHostGoal() {
        return hostGoal;
    }

    public void setHostGoal(int hostGoal) {
        this.hostGoal = hostGoal;
    }

    public int getGuestGoal() {
        return guestGoal;
    }

    public void setGuestGoal(int guestGoal) {
        this.guestGoal = guestGoal;
    }

    @Override
    public String toString() {
        return host + " - " + guest + " (" + hostGoal + ":" + guestGoal + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FootballMatch that)) return false;
        return hostGoal == that.hostGoal && guestGoal == that.guestGoal && Objects.equals(host, that.host) && Objects.equals(guest, that.guest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, guest, hostGoal, guestGoal);
    }

    public String[] getTeamNames() {
        return new String[] {host, guest};
    }

    public int getMatchGoals() {
        return hostGoal + guestGoal;
    }
}