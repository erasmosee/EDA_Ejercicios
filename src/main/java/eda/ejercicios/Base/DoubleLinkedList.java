package eda.ejercicios.Base;

public class DoubleLinkedList<T> {

    public DoubleNode<T> first;

    public DoubleLinkedList() {
        first = null;
    }

    //Determina si la lista está vacía
    public boolean isEmpty() {
        return first == null;
    }

    //Determina si la lista tiene un unico elemento
    public boolean isAlone() {
        return first == first.next;
    }

    public void actualizarFirst(DoubleNode<T> node) {
        first = node;
    }

    public void addToRear(T elem) {
        DoubleNode<T> nuevo = new DoubleNode<>(elem);

        if (first == null) {
            first = nuevo;
            return;
        }

        DoubleNode<T> ultimo = first;
        while (ultimo.next != null) {
            ultimo = ultimo.next;
        }

        ultimo.next = nuevo;
        nuevo.prev = ultimo;
    }

}
