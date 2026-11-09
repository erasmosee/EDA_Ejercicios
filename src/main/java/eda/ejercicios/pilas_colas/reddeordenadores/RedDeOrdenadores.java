package eda.ejercicios.pilas_colas.reddeordenadores;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RedDeOrdenadores {

    protected Boolean[][] adjMatrix;

    public int[] obtenerCostes() {
        int[] costes = new int[adjMatrix.length];

        int numNodos = adjMatrix.length;
        HashMap rutaRetorno = new HashMap<>();

        for (int nodo = 0; nodo < costes.length; nodo++) {
            System.out.println("nodo: " + nodo + " puesto a -1");
            costes[nodo] = -1;
        }

        Queue<Integer> cola = new LinkedList<>();
        costes[0] = 0;
        cola.offer(0);

        while (!cola.isEmpty()) {
            int actual = cola.poll();
            rutaRetorno.putIfAbsent(0, 0);
            for (int vecino = 0; vecino < numNodos; vecino++) {
                if (Boolean.TRUE.equals(adjMatrix[actual][vecino])) {
                    System.out.println(actual + " y " + vecino + " son vecinos");
                    // costes[vecino] = costes[actual] + 1;
                    rutaRetorno.putIfAbsent(vecino, actual);

                    cola.offer(vecino);
                }
            }
        }

        for (Integer nodo = 0; nodo < adjMatrix.length; nodo++) {
            System.out.println("nodo " + nodo + " apunta a " + rutaRetorno.get(nodo));
        }
        for (int nodo = 0; nodo < numNodos; nodo++) {
            if (rutaRetorno.get(nodo) == null) {
                continue; // No hay ruta desde el origen
            }
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

    public void iniciarMatriz() {
        adjMatrix = new Boolean[11][11];
        System.out.println("Inicio");

        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix.length; j++) {
                adjMatrix[i][j] = false;
            }
        }
        adjMatrix[0][2] = true;
        adjMatrix[0][3] = true;
        adjMatrix[1][8] = true;
        adjMatrix[1][9] = true;
        adjMatrix[2][4] = true;
        adjMatrix[3][7] = true;
        adjMatrix[3][10] = true;
        adjMatrix[4][5] = true;
        adjMatrix[5][1] = true;
        adjMatrix[5][7] = true;
        adjMatrix[7][10] = true;

        int contador = 0;
        for (int precio : obtenerCostes()) {
            // if (precio > 0) {
            System.out.println(contador + " - " + precio);
            // }
            contador++;

        }
        System.out.println("Fin");

    }
}