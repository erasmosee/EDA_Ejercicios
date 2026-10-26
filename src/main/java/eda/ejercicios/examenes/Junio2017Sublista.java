package eda.ejercicios.examenes;

import java.util.Objects;

import eda.ejercicios.Base.Node;

public class Junio2017Sublista {

    public SimpleLinkedList<Integer> lista;

    public Junio2017Sublista() {
        lista = new SimpleLinkedList<>();
    }

    public Integer compareTo(Node<Integer> NodoA, Node<Integer> NodoB) {
        return NodoA.data - NodoB.data;
    }

    public void addToRear(Integer valor) {
        lista.addToRear(valor);
    }
   public SimpleLinkedList<Integer> getLista() {
        return this.lista;
    }

    public boolean subLista(SimpleLinkedList<Integer> subLista) {
        return lista.estaContenida(subLista);

    }

    public class SimpleLinkedList<T> {

        public Node<T> first;

        public SimpleLinkedList() {
            first = null;
        }

        public Node<T> getFirst() {
            return first;
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

        public boolean estaContenida(SimpleLinkedList<Integer> subLista) {
            // Postcondición: true si “subLista” está contenida y false si no
            boolean retorno = true;
            //Necesitaremos dos punteros
            Node<Integer> currentLP = subLista.getFirst();
            Node<Integer> currentLG = lista.getFirst();

            while (retorno && currentLG != null && currentLP != null) {
                if (currentLG.data > currentLP.data) {
                    retorno = false;
                }/* KO: Nodo de lista grande es mayor que nodo de lista pequeña */
                if (currentLG.data < currentLP.data) {
                }/* KO: Nodo de lista grande es mayor que nodo de lista pequeña */
                if (Objects.equals(currentLP.data, currentLG.data)) {
                    // Nodo de lista grande igual que nodo de lista pequeña (OK)
                    currentLP = currentLP.next;
                }
                currentLG = currentLG.next;
            }
            return retorno && currentLP == null;
        }
    }
}
