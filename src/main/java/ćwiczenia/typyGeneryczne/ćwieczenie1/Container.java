package ćwiczenia.typyGeneryczne.ćwieczenie1;

public class Container<T> {

    private T[] privateArray;

    public T[] getPrivateArray() {
        return privateArray;
    }

    public void setPrivateArray(T[] privateArray) {
        this.privateArray = privateArray;
    }

    public void printPrivateArray() {
        for (T i : privateArray) {
            System.out.println(i);
        }
    }
}
