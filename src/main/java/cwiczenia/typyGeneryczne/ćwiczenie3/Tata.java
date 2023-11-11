package cwiczenia.typyGeneryczne.ćwiczenie3;

public class Tata<T>{

    private T t;

    public Tata(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void printTata() {
        System.out.println(t);
    }
}
