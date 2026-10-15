package eda.ejercicios.examenes;

public class Junio2012Sublista {

// 1. Sublista (2,5 puntos)
// Dadas 2 listas ordenadas ascendentemente, queremos hacer un subprograma que diga si los elementos de la primera lista están contenidos en la segunda lista, manteniendo el orden.
// Por ejemplo, L1 es sublista de L2, y L3 lo es de L4. Sin embargo, L5 no es sublista de L6, ni L7 de L8.
// Se deberá calcular el coste del algoritmo resultante, que se valorará (es decir, el coste del algoritmo es importante, cuanto más eficiente, mejor).
// Cada lista solo puede ser recorrida una sola vez.
// Para obtener la solución no se podrán usar los métodos de la clase SimpleLinkedList (excepto los que nosotros implementemos).
    public SimpleLinkedList<Integer> ListaPequeña;

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
    }

    public boolean estaContenida(SimpleLinkedList<Integer> ListaGrande) {

        return true;
    }

}
