package eda.ejercicios.colas;

import java.util.LinkedList;
import java.util.Queue;

public class Cafeteria {
    Queue<Queue<Integer>> cola = null;

    public void insertar(Integer elem) {
        if (cola == null) {
            cola = new LinkedList<Queue<Integer>>();
        }
        boolean colocado = false;
        for (int i = 0; i < cola.size(); i++) {
            Queue<Integer> grupo = cola.poll();
            if (mismoGrupo(grupo.peek(), elem)) {
                grupo.offer(elem);
                colocado = true;
            }
            cola.offer(grupo);
        }
        if (!colocado) {
            Queue<Integer> grupoNuevo = new LinkedList<Integer>();
            grupoNuevo.offer(elem);
            cola.offer(grupoNuevo);
        }
    }

    public boolean mismoGrupo(int p1, int p2) {
        return true;
    }

    public Integer borrar() {
        Integer retorno = cola.peek().poll();
        if (cola.peek().isEmpty()) {
            cola.poll();
        }
        return retorno;
    }
}
