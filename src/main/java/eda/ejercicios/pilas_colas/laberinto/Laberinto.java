package eda.ejercicios.pilas_colas.laberinto;

import java.util.Stack;

public class Laberinto {
    private int[][] laberinto;

    private static class Coordenada {
        private final int x;
        private final int y;

        public Coordenada(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public boolean Atravesable() {
        int totalFilas = this.laberinto.length;
        int totalColumnas = this.laberinto[0].length;

        Stack<Coordenada> stack = new Stack<>();
        boolean[][] posicionVisitada = new boolean[totalFilas][totalColumnas];
        Coordenada inicio = new Coordenada(0, 0);
        Coordenada salida = new Coordenada(totalFilas - 1, totalColumnas - 1);
        stack.push(inicio);
        posicionVisitada[inicio.x][inicio.y] = true;

        while (!stack.isEmpty()) {
            Coordenada actual = stack.pop();
            if (actual.x == salida.x && actual.y == salida.y) {
                return true;
            }
            int[] dfila = { 0, 1, 0, -1 };
            int[] dcol = { -1, 0, 1, 0 };

            for (int i = 0; i < 4; i++) {
                int nuevaFila = actual.x + dfila[i];
                int nuevaCol = actual.x + dcol[i];
                if (nuevaFila >= 0 && nuevaCol >= 0 && nuevaFila < totalFilas && nuevaCol < totalColumnas) {
                    if (laberinto[nuevaFila][nuevaCol] == 1 && !posicionVisitada[nuevaFila][nuevaCol]) {
                        stack.push(new Coordenada(nuevaFila, nuevaCol));
                        posicionVisitada[nuevaFila][nuevaCol] = true;
                    }
                }
            }
        }
        return false;
    }
}
