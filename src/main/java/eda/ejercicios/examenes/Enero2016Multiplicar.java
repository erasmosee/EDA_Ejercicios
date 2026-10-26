package eda.ejercicios.examenes;

import eda.ejercicios.Base.Node;

/**
 * Multiplicar lista (2,5 puntos)
 *
 * L: {5,7,2}
 *
 * Dada una lista circular donde se accede al último elemento de la lista, se
 * pide implementar el siguiente método:
 *
 * public Node<T> { String data; Node<T> next; }
 *
 * public class Lista<T> { Node<T> last; public void multiplicar(Integer n) {
 *
 * pre: n >= 1
 *
 * post: la * lista ha sido modificada y contiene cada elemento de la lista
 * inicial repetido “n” veces
 *
 * Dada la lista del ejemplo anterior, la llamada a multiplicar(2) obtendría
 * como resultado la siguiente lista:
 *
 * L:{5,5,7,7,2,2}
 *
 * a) Implementar el método multiplicar
 *
 * b) Calcular el coste del algoritmo, de manera razonada
 */
public class Enero2016Multiplicar {

    public class Lista<T> {

        Node<T> last;

        public void multiplicar(Integer n) {
            if (last == null || n <= 1) {
                return; // Lista vacía o n=1 no modifica nada
            }

            Node<T> current = last.next; // Empezamos en el primer elemento (last.next)
            Node<T> finOriginal = last;  // Guardamos cuál era el último nodo inicial

            do {
                Node<T> siguiente = current.next; // Guardamos el siguiente nodo original

                // Insertamos (n - 1) copias entre 'current' y 'siguiente'
                for (int i = 1; i < n; i++) {
                    Node<T> nuevo = new Node<>(current.data);

                    current.next = nuevo;
                    nuevo.next = siguiente;
                    current = nuevo; // Avanzamos al nodo recién insertado
                }

                // Si el nodo actual que acabamos de duplicar era el 'last' original,
                // actualizamos 'last' para que apunte a la última copia creada.
                if (siguiente == finOriginal.next && current.next == finOriginal.next) {
                    last = current;
                }

                current = siguiente; // Avanzamos al siguiente nodo de la lista original
            } while (current != finOriginal.next);
        }
    }
}
