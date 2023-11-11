package cwiczenia.typyGeneryczne.ćwiczenie3;

public class Dzieci <V, T, J>{

    private V v;
    private T t;
    private J j;

    public Dzieci(V v, T t, J j) {
        this.v = v;
        this.t = t;
        this.j = j;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public J getJ() {
        return j;
    }

    public void setJ(J j) {
        this.j = j;
    }

    public void printDzieci() {
        System.out.println(v + " " + t + " " + j);
    }
}
