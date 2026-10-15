package eda.ejercicios.enero2012;

import eda.ejercicios.Base.Node;
import eda.ejercicios.Base.SimpleLinkedList;

public class PruebasEnero2012 {


    public static void probar(ListaDePalabras palabras, String palabra, int n) {
        SimpleLinkedList<String> resultado = palabras.obtenerContexto(palabra, n);
        System.out.println("n=" + n + " | obtenido: " + mostrar(resultado));
    }

    public static String mostrar(SimpleLinkedList<String> lista) {
        StringBuilder resultado = new StringBuilder();
        Node<String> actual = lista.first;

        while (actual != null) {
            if (resultado.length() > 0) {
                resultado.append(" -> ");
            }
            resultado.append(actual.data);
            actual = actual.next;
        }

        return resultado.toString();
    }
}
