package eda.ejercicios.Base;

public class Node<T> {

    public T data;
    public Node<T> next;

    public Node(T dd) {
        data = dd;
        next = null;
    }
    public T getData(){
        return this.data;
    }
    
}

