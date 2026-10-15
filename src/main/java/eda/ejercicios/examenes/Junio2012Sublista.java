package eda.ejercicios.examenes;

import java.util.Objects;

public class Junio2012Sublista {

// 1. Sublista (2,5 puntos)
// Dadas 2 listas ordenadas ascendentemente, queremos hacer un subprograma que diga si los elementos de la primera lista están contenidos en la segunda lista, manteniendo el orden.
// Por ejemplo, L1 es sublista de L2, y L3 lo es de L4. Sin embargo, L5 no es sublista de L6, ni L7 de L8.
// Se deberá calcular el coste del algoritmo resultante, que se valorará (es decir, el coste del algoritmo es importante, cuanto más eficiente, mejor).
// Cada lista solo puede ser recorrida una sola vez.
// Para obtener la solución no se podrán usar los métodos de la clase SimpleLinkedList (excepto los que nosotros implementemos).
    public SimpleLinkedList<Integer> lista;

    public Junio2012Sublista() {
        lista = new SimpleLinkedList<>();
    }

    public void addToRear(Integer valor) {
        lista.addToRear(valor);
    }

    public boolean estaContenida(Junio2012Sublista listaGrande) {
        return lista.estaContenida(listaGrande.lista);
    }

    public class Node<T> {

        public T data;
        public Node<T> next;

        public Node(T dd) {
            data = dd;
            next = null;
        }
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

        public boolean estaContenida(SimpleLinkedList<Integer> listaGrande) {
            Node<Integer> currentLP = lista.getFirst();
            Node<Integer> currentLG = listaGrande.getFirst();
            boolean todoCorrecto = true;
            do {
                if (Objects.equals(currentLP.data, currentLG.data)) {
                    // Son iguales, avanzamos ambos current.
                    currentLP = currentLP.next;
                    currentLG = currentLG.next;
                } else if (currentLG.data < currentLP.data) {
                    // current de listaGrande es menor que current de listaPequena, avanzamos current de listaGrande.
                    currentLG = currentLG.next;
                } else {
                    // current de listaGrande es mayor que current de listaPequena, listaPequena no esta contenida en listaGrande.
                    todoCorrecto = false;
                }
            } while (todoCorrecto && currentLP.next != null && currentLG.next != null);

            return todoCorrecto;
        }
    }

}
