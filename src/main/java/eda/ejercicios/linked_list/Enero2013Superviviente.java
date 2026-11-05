package eda.ejercicios.linked_list;

public class Enero2013Superviviente {

    public DoubleLinkedList<Integer> lista;

    public class DoubleNode<T> {

        public T data;
        public DoubleNode<T> prev;
        public DoubleNode<T> next;
    }

    public class DoubleLinkedList<T> {

        public DoubleNode<T> first;

        public T obtenerSuperviviente(Integer salto) {
            DoubleNode<T> superviviente = first;
            while (superviviente != superviviente.next) {
                for (int i = 0; i < salto; i++) {
                    superviviente = superviviente.next;
                }
                superviviente.prev.next = superviviente.next;
                superviviente.next.prev = superviviente.prev;
                superviviente = superviviente.next;
            }
            return superviviente.data;
        }
    }

}
