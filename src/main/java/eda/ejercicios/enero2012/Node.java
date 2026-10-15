package eda.ejercicios.enero2012;

public class Node<T> {

    public T data;
    public Node<T> next;

    public Node(T dd) {
        data = dd;
        next = null;
    }
}
