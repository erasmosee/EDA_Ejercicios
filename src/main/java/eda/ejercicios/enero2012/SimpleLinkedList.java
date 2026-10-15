package eda.ejercicios.enero2012;

public class SimpleLinkedList<T> {

    Node<T> first;

    public SimpleLinkedList() {
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

    public void actualizarFirst(Node<T> node) {
        first = node;
    }


}
