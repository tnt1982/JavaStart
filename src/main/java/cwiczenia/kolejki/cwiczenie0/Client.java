package cwiczenia.kolejki.cwiczenie0;

public class Client implements Comparable<Client> {

    private String nickname;
    private int ordersNumber;

    public Client(String nickname, int ordersNumber) {
        this.nickname = nickname;
        this.ordersNumber = ordersNumber;
    }

    public int getOrdersNumber() {
        return ordersNumber;
    }

    public void setOrdersNumber(int ordersNumber) {
        this.ordersNumber = ordersNumber;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return nickname + ": " + ordersNumber;
    }

    @Override
    public int compareTo(Client c) {
        return -Integer.compare(ordersNumber, c.ordersNumber);
    }
}
