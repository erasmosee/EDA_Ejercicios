package eda.ejercicios.Base;

public class SimpleLinkedList<T> {

    public Node<T> first;

    public SimpleLinkedList() {
        first = null;
    }

    public Node<T> getFirst() {
        return first;
    }

    //Determina si la lista está vacía
    public boolean isEmpty() {
        return first == null;
    }

    //Determina si la lista tiene un unico elemento
    public boolean isAlone() {
        return first == first.next;
    }

    public void actualizarFirst(Node<T> node) {
        first = node;
    }

    public void addToRear(T elem) {
        Node<T> nuevo = new Node<>(elem);

        if (first == null) {
            first = nuevo;
            return;
        }

        Node<T> ultimo = first;
        while (ultimo.next != null) {
            ultimo = ultimo.next;
        }
        ultimo.next = nuevo;
    }

}
