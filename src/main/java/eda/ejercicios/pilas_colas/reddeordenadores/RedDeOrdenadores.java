package eda.ejercicios.pilas_colas.reddeordenadores;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RedDeOrdenadores {

    protected Boolean[][] adjMatrix;

    public int[] obtenerCostes() {
        int[] costes = new int[adjMatrix.length];
        HashMap rutaRetorno = new HashMap<>();
        Queue<Integer> cola = new LinkedList<>();

        cola.offer(0);

        while (!cola.isEmpty()) {
            int actual = cola.poll();
            for (int vecino = 0; vecino < adjMatrix.length; vecino++) {
                if (adjMatrix[actual][vecino]) {
                    rutaRetorno.putIfAbsent(vecino, actual);
                    cola.offer(vecino);
                }
            }
        }

        for (Integer nodo = 0; nodo < adjMatrix.length; nodo++) {
            System.out.println("nodo " + nodo + " apunta a " + rutaRetorno.get(nodo));
        }
        for (int nodo = 0; nodo < adjMatrix.length; nodo++) {
     
            int nodoActual = nodo;
            int precioRuta = 0;
            while (nodoActual != 0) {
                if (rutaRetorno.get(nodoActual) != null) {
                    System.out.print("de nodo " + nodoActual + " saltamos ");

                    nodoActual = (int) rutaRetorno.get(nodoActual);
                    System.out.print("a nodo " + nodoActual);

                    precioRuta++;
                    System.out.println(" y el precio se incremente a " + precioRuta);
                } else {
                    break;
                }
            }
            costes[nodo] = precioRuta;
        }

        return costes;
    }

    public Boolean[][] iniciarMatriz() {
        adjMatrix = new Boolean[11][11];
        System.out.println("Inicio");

        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix.length; j++) {
                adjMatrix[i][j] = false;
            }
        }

        return adjMatrix;
    }
}