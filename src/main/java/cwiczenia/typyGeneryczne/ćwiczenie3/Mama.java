package cwiczenia.typyGeneryczne.ćwiczenie3;

public class Mama<T> {

    private T t;

    public Mama(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void printMama() {
        System.out.println(t);
    }
}
