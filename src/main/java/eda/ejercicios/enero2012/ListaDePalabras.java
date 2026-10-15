package eda.ejercicios.enero2012;

import eda.ejercicios.Base.DoubleLinkedList;
import eda.ejercicios.Base.DoubleNode;
import eda.ejercicios.Base.Node;
import eda.ejercicios.Base.SimpleLinkedList;

public class ListaDePalabras extends DoubleLinkedList<String> {

    public SimpleLinkedList<String> obtenerContexto(String pal, Integer n) {
        SimpleLinkedList<String> listaSalida = new SimpleLinkedList<>();
        DoubleNode<String> dCurrent = first;
        boolean flagSalir = false;
        do {
            if (dCurrent.data.equals(pal) && !flagSalir) {
                int contador = n;
                while (dCurrent.prev != null && contador > 0) {
                    dCurrent = dCurrent.prev;
                    contador--;
                }

                Node<String> sCurrent = new Node<>(dCurrent.data);
                listaSalida.actualizarFirst(sCurrent);

                for (int i = contador; i < n * 2; i++) {
                    if (dCurrent.next != null) {
                        Node<String> nextNodo = new Node<>(dCurrent.next.data);
                        sCurrent.next = nextNodo;
                        sCurrent = sCurrent.next;
                        dCurrent = dCurrent.next;
                    }
                }
                flagSalir = true;
            }
            if (dCurrent.next != null) {
                dCurrent = dCurrent.next;
            }

        } while (dCurrent.next != null);

        // PRE: La palabra “pal” se encuentra en la lista
        // PRE: n >= 0
        //
        // POST: Devuelve una lista que contiene la palabra buscada junto con
        // las “n” palabras anteriores y posteriores a “pal”
        // En caso de que la palabra “pal” aparezca varias veces, se tendrá
        // en cuenta únicamente la primera aparición
        // En caso de que no haya n palabras delante o detrás de “pal”
        // se devolverán solamente las que hay
        return listaSalida;
    }

}
