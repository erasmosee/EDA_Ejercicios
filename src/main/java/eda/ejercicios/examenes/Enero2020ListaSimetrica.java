package eda.ejercicios.examenes;

public class Enero2020ListaSimetrica {
    public SimpleLinkedList<Integer> lista;

    public class Node<T> {

        public T data;
        public Node<T> next;
    }

    public class DoubleNode<T> {

        public T data;
        public DoubleNode<T> next;
        public DoubleNode<T> prev;
    }

    public class SimpleLinkedList<T> {

        public Node<Integer> first;
    }

    public class MiDoubleLinkedList<T> {

        public DoubleNode<T> first;

        public void obtenerListaSimetrica(SimpleLinkedList l) {
            Node<T> currentS = l.first;
            while (currentS != null) {
                DoubleNode<T> currentDp = new DoubleNode<>();
                currentDp.data = currentS.data;
                DoubleNode<T> currentDn = new DoubleNode<>();
                currentDn.data = (T) (Integer) (0 - (Integer) currentS.data);

                currentDn.prev = currentDp;
                currentDp.next = currentDn;
                if (first == null) {
                    first = currentDn;
                    first.next = currentDp;
                    first.next.prev = first;
                } else {
                    first.prev.next = currentDp;
                    first.prev = currentDn;
                    first = first.prev;
                }
                currentS = currentS.next;
            }
        }
    }
}
