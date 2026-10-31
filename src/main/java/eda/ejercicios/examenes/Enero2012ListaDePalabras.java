package eda.ejercicios.examenes;

public class Enero2012ListaDePalabras {

    public static class Node<T> {

        public T data;
        public Node<T> next;

        public Node(T dd) {
            data = dd;
            next = null;
        }
    }

    public static class DoubleNode<T> {

        public T data;
        public DoubleNode<T> next;
        public DoubleNode<T> prev;

        public DoubleNode(T dd) {
            data = dd;
            next = null;
            prev = null;
        }
    }

    public static class DoubleLinkedList<T> {

        public DoubleNode<T> first;

        public DoubleLinkedList() {
            this.first = null;
        }

    }

    public static class SimpleLinkedList<T> {

        public Node<T> first;

        public SimpleLinkedList() {
            this.first = null;
        }

    }

    public class ListaDePalabras extends DoubleLinkedList<String> {

        public SimpleLinkedList<String> obtenerContexto(String pal, Integer n) {
            DoubleNode<String> current = first;
            SimpleLinkedList<String> listaRetorno = new SimpleLinkedList<>();
            while (current != null) {
                if (!pal.equals(current.data)) {current = current.next;} else {
                    //pal localizado, procedemos a ir al contexto -n con respecto a pal
                    for (int i = 0; i < n; i++) {if (current.prev != null) {current = current.prev;}}
                    //En este punto estamos en el primer elemento del contexto.
                    Node<String> currentSanterior = new Node<>(current.data);
                    for (int i = 0; i <= (n * 2); i++) {
                        if (current != null) {
                            Node<String> currentS = new Node<>(current.data);

                            if (listaRetorno.first == null) {listaRetorno.first = currentS;
                            } else {currentSanterior.next = currentS;}
                            current = current.next;
                            currentSanterior = currentS;
                        }
                    }
                    return listaRetorno;
                }
            }
            return null;
        }
    }

}
