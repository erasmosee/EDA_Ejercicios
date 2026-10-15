package eda.ejercicios.enero2012;

@Deprecated
public class DoubleNode<T> {

    public T data;
    public DoubleNode<T> prev;
    public DoubleNode<T> next;

    public DoubleNode(T dd) {
        data = dd;
        next = null;
        prev = null;
    }
}
